/*
 * Copyright 2002-2017 by Geminisoft Co,ltd..
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Geminisoft Co,ltd. ("Confidential Information").
 */
/**
 * 1. FileName	: HttpClientUtil.java
 * 2. Package	: com.gemiso.nrcs.util.common
 * 3. Comments	:	
 * 4. Author	: projeong
 * 5. DateTime	: 2017. 5. 7. 오후 3:48:57
 * 6. History	:
 * -----------------------------------------------------------------
 *	Date		 |	Name			|	Comment
 * -------------  -----------------   ------------------------------
 * 2017. 5. 7.		 | projeong			|	Create Date
 * -----------------------------------------------------------------
 */
package com.gemiso.zodiac.util.common;

import org.apache.commons.httpclient.HttpClient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/*
 * 1. Class name	: 
 * 2. File name		: HttpClientUtil.java
 * 3. Package name	: com.gemiso.nrcs.util.common
 * 4. Creater name	: projeong
 * 5. Create DTM	: 2017. 5. 7. 오후 3:48:57
 */
/**
 * <PRE>
 * 1. Description
 *		
 * </PRE>
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;

/**
 * @author 이준성
 *
 */
public class HttpClientService {

	private String url;
	private static final String USER_AGENT = "Mozilla/5.0";
	private final static String METHOD_POST = "POST";
	private final static String METHOD_GET = "GET";
	private final static String CHARSET = "EUC-KR";
	private final static int DEFAULT_TIME = 1000;

	public HttpClientService(String url) {

		this.url = url;

	}

	public String HttpURLConnectionUtil() {

		String returnVal = "";

		HttpURLConnection con = null;

		BufferedReader br = null;

		try {

			URL tempCon = new URL(url);
			con = (HttpURLConnection) tempCon.openConnection();
			// 메소드 방식설정
			con.setRequestMethod("POST");
			// 헤더 설정
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			con.connect();

			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isr);
			String temp = null;
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			con.disconnect();

		}

		return returnVal;
	}

	@SuppressWarnings("unused")
	private static void sendGET(String url) throws IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();

		HttpGet httpGet = new HttpGet(url);
		httpGet.addHeader("User-Agent", USER_AGENT);
		CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

		System.out.println("GET Response Status:: " + httpResponse.getStatusLine().getStatusCode());

		BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));

		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = reader.readLine()) != null) {
			response.append(inputLine);
		}
		reader.close();

		// print result
		System.out.println(response.toString());
		httpClient.close();
	}

	@SuppressWarnings("unused")
	private static void sendPOST(String url) throws IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("User-Agent", USER_AGENT);

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("test", "testname"));

		HttpEntity postParams = new UrlEncodedFormEntity(urlParameters);
		httpPost.setEntity(postParams);

		CloseableHttpResponse httpResponse = httpClient.execute(httpPost);

		BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));

		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = reader.readLine()) != null) {
			response.append(inputLine);
		}
		reader.close();

		// print result
		System.out.println(response.toString());
		httpClient.close();

	}

	private void createHttpClient(String endPoint, Map<String, String> params, String method, String charset) throws Exception {
		HttpClientBuilder builder = HttpClientBuilder.create();
		RequestConfig config = RequestConfig.custom().setConnectTimeout(DEFAULT_TIME * 3).setConnectionRequestTimeout(DEFAULT_TIME * 5).setSocketTimeout(DEFAULT_TIME * 5).build();
		builder.setDefaultRequestConfig(config);
		builder.setUserAgent("Apache-HttpClient ^^");

		CloseableHttpClient hc = builder.build();
		CloseableHttpResponse httpResponse = null;

		try {
			httpResponse = method.equals(METHOD_POST) ? hc.execute(post(endPoint, params, charset)) : hc.execute(get(endPoint, params, charset));
			// Result
			System.out.println("Http status : " + httpResponse.getStatusLine());
			HttpEntity httpEntity = httpResponse.getEntity();
			if (httpEntity != null) {
				ContentType contentType = ContentType.getOrDefault(httpEntity);
				System.out.println("Content type : " + contentType.getCharset());
				System.out.println(EntityUtils.toString(httpEntity));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			hc.close();
			if (httpResponse != null)
				httpResponse.close();
		}
	}

	// POST
	private HttpPost post(String endPoint, Map<String, String> params, String charset) throws Exception {
		// Creating HTTP Post
		HttpPost httpPost = new HttpPost(endPoint);

		// Building post parameters
		List<NameValuePair> nameValue = new ArrayList<NameValuePair>(params.size());
		for (String key : params.keySet()) {
			nameValue.add(new BasicNameValuePair(key, params.get(key)));
		}
		System.out.println("Parameters : " + nameValue.toString());

		// Url Encoding the POST parameters
		httpPost.setEntity(new UrlEncodedFormEntity(nameValue, charset));
		return httpPost;
	}

	// GET
	private HttpGet get(String endPoint, Map<String, String> paramPairs, String charset) throws Exception {
		// Building get parameters
		int index = 0;
		for (Iterator<String> i = paramPairs.keySet().iterator(); i.hasNext(); index++) {
			Object key = i.next();
			endPoint += index == 0 ? "?" : "&";
			endPoint += key + "=" + paramPairs.get(key);
		}
		System.out.println("Parameters : " + endPoint);
		// Creating HTTP Get
		HttpGet httpGet = new HttpGet(endPoint);
		return httpGet;
	}

	public static void main(String args[]) {

		// HttpRequest 생성시에 인자로 요청을 보낼 주소를 적으면 된다.
		HttpClientService hr = new HttpClientService("");
		hr.HttpURLConnectionUtil();

	}

}