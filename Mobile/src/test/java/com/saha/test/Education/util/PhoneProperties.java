package com.saha.test.Education.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;



import java.util.Properties;
import java.util.Set;

import com.saha.test.Education.base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PhoneProperties {
	
	static Properties phoneConstants;

	static {
		phoneConstants = new Properties();
		try {
			InputStream propertiesStream = BaseTest.class.getClassLoader().getResourceAsStream("phoneConstants.properties");
			phoneConstants.load(propertiesStream);
			propertiesStream.close();
			Set<Entry<Object, Object>> entrySet = phoneConstants.entrySet();
//			for (Entry<Object, Object> entry : entrySet) {
//				System.out.println(entry.getKey() + " - " + entry.getValue());
//			}
			propertiesStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String wifi() {
		String wifi = phoneConstants.getProperty(BaseTest.currentPhone.trim() + "_WIFI");
		return wifi;
	}
	
	public static String data() {
		String data = phoneConstants.getProperty(BaseTest.currentPhone.trim() + "_DATA");
		return data;
	}
	
	public static String camera() {
		String camera = phoneConstants.getProperty(BaseTest.currentPhone.trim() + "_CAMERA");
		return camera;
	}
	

}
