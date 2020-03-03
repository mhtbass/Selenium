package com.saha.test.Education.base;

import com.saha.test.Education.page.HomePage;
import com.saha.test.Education.page.LoginPage;
import com.saha.test.Education.page.android.AndroidHomePage;
import com.saha.test.Education.page.android.AndroidLoginPage;
import com.saha.test.Education.page.ios.IOSHomePage;
import com.saha.test.Education.page.ios.IOSLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class PageFactory {

	private static PageFactory instance = null;

	ThreadLocal<AppiumDriver<MobileElement>> driver = new ThreadLocal<AppiumDriver<MobileElement>>();
	private PageFactory() {

	}

	public <T> T createPage(Class<T> pageType) {
		AppiumDriver<MobileElement> appiumDriver = driver.get();
		if (appiumDriver instanceof AndroidDriver) {
			AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>)appiumDriver;
			if(pageType.isAssignableFrom(LoginPage.class)){
				return (T) new AndroidLoginPage(androidDriver);
			}else if(pageType.isAssignableFrom(HomePage.class)){
				return (T) new AndroidHomePage(androidDriver);
			}
			
		} else if (appiumDriver instanceof IOSDriver) {
			IOSDriver<MobileElement> iosDriver = (IOSDriver<MobileElement>)appiumDriver;
			if(pageType.isAssignableFrom(LoginPage.class)){
				return (T) new IOSLoginPage(iosDriver);
			}else if(pageType.isAssignableFrom(HomePage.class)){
				return (T) new IOSHomePage(iosDriver);
			}
		}
		return null;
		}
	
	public void setDriver(AppiumDriver<MobileElement> driver) {
		this.driver.set(driver);
	}

	public static PageFactory getInstance() {
		if (instance == null) {
			instance = new PageFactory();
		}
		return instance;
	}

}
