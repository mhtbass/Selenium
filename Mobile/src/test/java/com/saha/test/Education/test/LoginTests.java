package com.saha.test.Education.test;

import com.saha.test.Education.base.BaseTest;
import com.saha.test.Education.base.PageFactory;
import com.saha.test.Education.page.HomePage;
import com.saha.test.Education.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;



public class LoginTests extends BaseTest {

	@Test
	public void Login() {
		HomePage homePage = PageFactory.getInstance().createPage(LoginPage.class).clickLeftMenu().ClickLoginButton().fillEmailOrPhone("sahabt@test.com").
				fillPassword("ahhae3Ee").clickLoginButton();

		
	}
	
}