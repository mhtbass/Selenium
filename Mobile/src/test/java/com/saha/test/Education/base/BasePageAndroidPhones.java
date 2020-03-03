package com.saha.test.Education.base;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public abstract class BasePageAndroidPhones extends BasePage {
	public BasePageAndroidPhones(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static final int DEFAULT_WAIT = 30;
	
//	public NetworkConnectionSetting networkConnection(){
//		return ((AndroidDriver)driver).getNetworkConnection();
//	}
//	
//	public boolean wifiIsEnabled(){
//		return networkConnection().wifiEnabled();
//	}
//	
//	public void openWifi(){
//		if(!wifiIsEnabled()){
//			networkConnection().setWifi(true);
//		}
//	}
//	
//	public void closeWifi() {
//		if(wifiIsEnabled()){
//			networkConnection().setWifi(false);
//		}
//	}
//	
//	public boolean dataIsEnabled(){
//		return networkConnection().dataEnabled();
//	}
//	
//	public void openData(){
//		if(!dataIsEnabled()){
//			networkConnection().setData(true);
//		}
//	}
//	
//	public void closeData() {
//		if(dataIsEnabled()){
//			networkConnection().setData(false);
//		}
//	}
//	
//	public boolean airplaneModeIsEnabled(){
//		return networkConnection().airplaneModeEnabled();
//	}
//	
//	public void openAirplaneMode(){
//		if(!airplaneModeIsEnabled()){
//			networkConnection().setAirplaneMode(true);
//		}
//	}
//	
//	public void closeAirplaneMode() {
//		if(airplaneModeIsEnabled()){
//			networkConnection().setAirplaneMode(false);
//		}
//	}
//	
//	public void openNotifications(){
//		((AndroidDriver)driver).openNotifications();
//	}
}



