package com.garantibbva.test;

import com.garantibbva.base.BaseTest;
import com.garantibbva.constans.ConstansLoginPage;
import com.garantibbva.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @Before
    public void before() {
        loginPage = new LoginPage(getWebDriver());

    }

    @Test
    public void loginTest() {

        loginPage.login(ConstansLoginPage.EMAIL, ConstansLoginPage.PASSWORD).loginClick();

    }

    @After
    public void after(){
        tearDown();

    }

}
