package com.gemiso.zodiac.util.common;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtil {

	@SuppressWarnings("unchecked")
	public static String stringArrayToStringJsonArray(String[] content, String root_object, String object) {
		
		String str = "";
		
		if (content != null && content.length > 0) {

			JSONObject jsonObject = new JSONObject();

			JSONArray mentArray = new JSONArray();

			JSONObject mentInfo = new JSONObject();

			for (int i = 0; i < content.length; i++) {

				mentInfo = new JSONObject();
				mentInfo.put(object, content[i]);
				mentArray.add(mentInfo);
			}

			jsonObject.put(root_object, mentArray);

			str = jsonObject.toJSONString();
		}
		
		return str;
	}
	
	public static String[] jsonToString(String json, String root_object, String object) {

		String[] ctts = null;

		try {

			if (json != null && !"".equals(json)) {

				JSONParser jsonParser = new JSONParser();

				JSONObject jsonObject = (JSONObject) jsonParser.parse(json);
				JSONArray jsonArray = (JSONArray) jsonObject.get(root_object);

				if (jsonArray != null && jsonArray.size() > 0) {
					ctts = new String[jsonArray.size()];
					for (int i = 0; i < jsonArray.size(); i++) {
						JSONObject Object = (JSONObject) jsonArray.get(i);
						ctts[i] = (String) Object.get(object);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

		return ctts;
	}
	
}
