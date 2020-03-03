package com.saha.test.Education.page.ios;




import com.saha.test.Education.base.PageFactory;
import com.saha.test.Education.page.HomePage;
import com.saha.test.Education.util.ios.IOSContantsHomePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class IOSHomePage extends IOSContantsHomePage implements HomePage
{

	public IOSHomePage(IOSDriver<MobileElement> driver) {
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
