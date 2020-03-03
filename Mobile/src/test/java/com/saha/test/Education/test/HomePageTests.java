package com.saha.test.Education.test;

import com.saha.test.Education.base.BaseTest;
import com.saha.test.Education.base.PageFactory;
import com.saha.test.Education.page.HomePage;
import org.junit.Assert;
import org.junit.Test;



public class HomePageTests extends BaseTest {

	@Test
	public void CheckTotalBalance() {
		HomePage homePage = PageFactory.getInstance().createPage(HomePage.class);
		Assert.assertTrue("HomePage görüntülenemedi.", homePage.isHomePage());
		Assert.assertTrue("HomePage görüntülenemedi.", homePage.checkTotalBalance(""));
		
	}
	
	@Test
	public void CheckName() {
		HomePage homePage = PageFactory.getInstance().createPage(HomePage.class);
		Assert.assertTrue("HomePage görüntülenemedi.", homePage.isHomePage());
		Assert.assertTrue("HomePage görüntülenemedi.", homePage.checkName(""));
		
	}
}
