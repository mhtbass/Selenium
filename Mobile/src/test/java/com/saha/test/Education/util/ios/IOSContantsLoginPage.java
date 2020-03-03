package com.saha.test.Education.util.ios;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IOSContantsLoginPage extends SahaBTIOSConstants {
	
	public IOSContantsLoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By USERNAME = By.xpath("//XCUIElementTypeApplication[@name='Kitapyurdu']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
	public By PASSWORD = By.xpath("//XCUIElementTypeApplication[@name='Kitapyurdu']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField");
	public By LOGIN_BUTTON = By.xpath("//XCUIElementTypeButton[@name='Giriş']");
	public By REGISTER = By.id(""); 
	public By SKIP = By.id("");
	public By MENUBUTTON = By.id("");
	public By HESABIM = By.xpath("//XCUIElementTypeApplication[@name='Kitapyurdu']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton");


}
