package com.saha.test.Education.page.android;


import com.saha.test.Education.base.PageFactory;
import com.saha.test.Education.page.HomePage;


import com.saha.test.Education.util.android.AndroidContantsHomePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static com.saha.test.Education.base.BasePageAndroidPhones.DEFAULT_WAIT;

public class AndroidHomePage extends AndroidContantsHomePage implements HomePage
{

	public AndroidHomePage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public boolean isHomePage() {
		return isExist(DEFAULT_WAIT, BALANCE);
	}



	@Override
	public boolean checkTotalBalance(String balance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkName(String name) {
		// TODO Auto-generated method stub
		return false;
	}


}
