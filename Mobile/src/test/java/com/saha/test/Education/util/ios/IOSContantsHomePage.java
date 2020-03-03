package com.saha.test.Education.util.ios;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IOSContantsHomePage extends SahaBTIOSConstants {
	
	public IOSContantsHomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By MENUBUTTON = By.id("Yukarı git");
	public By HESABIM = By.id("com.mobisoft.kitapyurdu:id/link_user");
	public By BALANCE = By.id("");
	public By CAMPAIGN_BANNER = By.id("");
	public By NEAREST_MERCHANTS = By.id("");
	public By WALLET = By.id("");
	public By HISTORY_TRANSACTIONS = By.id("");

}
