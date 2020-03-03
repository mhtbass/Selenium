package com.saha.test.Education.util.android;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidContantsLoginPage extends SahaBTAndroidContants {
	public AndroidContantsLoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	// BASE ID
		public String baseId = "-";
	
		public By USERNAME = By.id("com.mobisoft.kitapyurdu:id/orderList");
		public By PASSWORD = By.id("com.mobisoft.kitapyurdu:id/addressList");
		public By LOGIN_BUTTON = By.id("com.mobisoft.kitapyurdu:id/giftCard");
		public By REGISTER = By.id("btn_register"); 
		public By SKIP = By.id("button_skip");
	public By MENUBUTTON = By.id("Yukarı git");
	public By HESABIM = By.id("com.mobisoft.kitapyurdu:id/link_user");
	
}
