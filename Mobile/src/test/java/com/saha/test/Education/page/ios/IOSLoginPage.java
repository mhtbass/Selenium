package com.saha.test.Education.page.ios;




import com.saha.test.Education.base.PageFactory;
import com.saha.test.Education.page.HomePage;
import com.saha.test.Education.page.LoginPage;
import com.saha.test.Education.util.ios.IOSContantsLoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class IOSLoginPage extends IOSContantsLoginPage implements LoginPage
{

	public IOSLoginPage(IOSDriver<MobileElement> driver) {
		super(driver);
	}

	@Override
	public boolean isLoginPage() {
		return isExist(DEFAULT_WAIT, LOGIN_BUTTON);
	}

	@Override
	public LoginPage fillEmailOrPhone(String emailOrPhone) {
		sendKeysAndWaitForElement(USERNAME, emailOrPhone);
		return this;
	}

	@Override
	public LoginPage fillPassword(String password) {
		sendKeysAndWaitForElement(PASSWORD, password);
		return this;
	}

	@Override
	public HomePage clickLoginButton() {
		clickAndWaitForElement(LOGIN_BUTTON);
		waitSeconds(4);
		return PageFactory.getInstance().createPage(HomePage.class);
	}

	@Override
	public LoginPage clickLeftMenu(){
		waitSeconds(2);
		return this;
	}

	@Override
	public LoginPage ClickLoginButton(){
		clickAndWaitForElement(HESABIM);
		return this;
	}


	@Override
	public LoginPage clickSkipButton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginPage example() {


		return this;
	}

}
