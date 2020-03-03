package com.saha.test.Education.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;



import java.util.Properties;
import java.util.Set;

import com.saha.test.Education.base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ReadProperties {
	
	static Properties userProperties;

	static {
		userProperties = new Properties();
		try {
			InputStream propertiesStream = BaseTest.class.getClassLoader().getResourceAsStream("user.properties");
			userProperties.load(propertiesStream);
			propertiesStream.close();
			Set<Entry<Object, Object>> entrySet = userProperties.entrySet();
			for (Entry<Object, Object> entry : entrySet) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
			propertiesStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getUserNumber() {
		String phoneNumber = userProperties.getProperty(BaseTest.currentPhone.trim() + "_NUMBER");
		System.out.println("Phone number at properties file: " + phoneNumber);
		return phoneNumber;
	}
	
	public static String getUserPassword() {
		String phonePassword = userProperties.getProperty(BaseTest.currentPhone.trim() + "_PASSWORD");
		System.out.println("Phone password at properties file: " + phonePassword);
		return phonePassword;
	}
	
	public static String getUserUsername() {
		String phoneUsername = userProperties.getProperty(BaseTest.currentPhone.trim() + "_USERNAME");
		System.out.println("Phone username at properties file: " + phoneUsername);
		return phoneUsername;
	}
	
	public static String getPhoneNumberForLogin(AppiumDriver currentDriver) {
		String phoneNumber = getUserNumber();
		if (currentDriver instanceof AndroidDriver) {
			phoneNumber = phoneNumber.substring(1);
		}
		return phoneNumber;
	}

}
