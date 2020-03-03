package com.saha.test.Education.util.ios;

import com.saha.test.Education.base.BasePage;
import org.openqa.selenium.By;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SahaBTIOSConstants extends BasePage {
	
		public SahaBTIOSConstants(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		//KEYBOARD
		public By KEYBOARDSEARCH = By.id("Ara");
		public By KEYBOARDRETURN = By.id("Return");
		
		//GENERAL ID
		public By BTTNTAMAM = By.id("Tamam");
		public By BTTNHAYIR = By.name("Hayır");
		public By BTTNEVET = By.name("Evet");
		public By UIACollectionCell = By.className("UIACollectionCell");
		public By UIAStaticText = By.className("UIAStaticText");
		public By UIATableCell = By.className("UIATableCell");
		public By UIATextField = By.className("UIATextField");
		public By UIASecureTextField = By.className("UIASecureTextField");
		public By UIAButton = By.className("UIAButton");
		public By UIAScrollView = By.className("UIAScrollView");
		
}
