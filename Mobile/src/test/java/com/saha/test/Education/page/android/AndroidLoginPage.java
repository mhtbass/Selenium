package com.saha.test.Education.page.android;




import com.saha.test.Education.base.PageFactory;
import com.saha.test.Education.page.HomePage;
import com.saha.test.Education.page.LoginPage;
import com.saha.test.Education.util.android.AndroidContantsLoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidLoginPage extends AndroidContantsLoginPage implements LoginPage
{

	public AndroidLoginPage(AndroidDriver<MobileElement> driver) {
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
	public LoginPage clickLeftMenu(){
			clickAndWaitForElement(MENUBUTTON);

      return this;
	}

	@Override
	public LoginPage ClickLoginButton(){
		clickAndWaitForElement(HESABIM);
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
	public LoginPage clickSkipButton() {
		clickAndWaitForElement(SKIP);
		return this;
	}

	@Override
	public LoginPage example(){
		waitSeconds(5);
		return this;
	}

}
