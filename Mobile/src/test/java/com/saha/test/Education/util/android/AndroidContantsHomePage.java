package com.saha.test.Education.util.android;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidContantsHomePage extends SahaBTAndroidContants {
	public AndroidContantsHomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	// BASE ID
		public String baseId = "-";
	
		public By NAME_FIELD = By.id(""); 
		public By BALANCE = By.id("");
		public By CAMPAIGN_BANNER = By.id("");
		public By NEAREST_MERCHANTS = By.id("");
		public By WALLET = By.id("");
		public By HISTORY_TRANSACTIONS = By.id("");

	
}
