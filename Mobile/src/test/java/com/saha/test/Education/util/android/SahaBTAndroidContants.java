package com.saha.test.Education.util.android;
import com.saha.test.Education.base.BasePageAndroidPhones;
import com.saha.test.Education.util.PhoneProperties;
import org.openqa.selenium.By;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SahaBTAndroidContants extends BasePageAndroidPhones {
	public SahaBTAndroidContants(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	// BASE ID
	public String baseId = "-";
	
	//GENERAL ID
	public By BTTNTAMAM = By.name("Tamam");
	public By BTTNHAYIR = By.name("Hayır");
	public By BTTNEVET = By.name("Evet");
	
	
	// PHONES ID
	// BU CONSTANTLAR TELEFON BAZLI DEĞİŞKEN OLUP phoneConstants.properties 
	// Dosyasında tanımlanmaktadırlar. Eksik olan her telefon için tanımlanması
	// gerekmektedir.
	
	public By WIFI = By.name(PhoneProperties.wifi());
	public By DATA = By.name(PhoneProperties.data());
	public By CAMERA = By.name(PhoneProperties.camera());
}
