package com.gemiso.zodiac.util.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

	public static String RestClientGet(String url) {

		String data = "";

		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			// HttpClient httpClient = HttpClientBuilder.create().build();
			//CloseableHttpClient httpClient = HttpClients.createDefault();

			//HttpGet getRequest = new HttpGet("http://localhost:8080/nrcs/cuesheet?sdate=20161201&edate=20170130");
			HttpGet getRequest = new HttpGet(url);
			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			while ((output = br.readLine()) != null) {
				data = output;
			}

			httpClient.getConnectionManager().shutdown();
			//httpClient.close();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

}
