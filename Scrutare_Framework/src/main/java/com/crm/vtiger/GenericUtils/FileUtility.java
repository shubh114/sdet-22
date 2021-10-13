package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileUtility {
/*
 * @author anupam
 */
/**
 * this method is used to read data from properties and return the value based on key specified
 * @param key
 * @return
 * @throws Throwable
 */
	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream file=new FileInputStream(IPathConstant.PROPEERTY_FILEPATH);
		Properties prop=new Properties();
		prop.load(file);
		return prop.getProperty(key);
}
	/**
	 * this method will return json value based on json key
	 * @param jsonkey
	 * @return
	 * @throws Throwable
	 */
	public String getDataFromJson(String jsonkey) throws Throwable {
		FileReader reader=new FileReader (IPathConstant.JSONFILEPATH) ;
		JSONParser parser=new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonObject = (JSONObject)object;
		 String value=jsonObject.get(jsonkey).toString();
		 return value;
}
}