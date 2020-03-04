package com.garantibbva.page;

import com.garantibbva.base.BasePage;
import com.garantibbva.constans.ConstansLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(String username , String password){
        sendKeys(By.id(ConstansLoginPage.EMAILIN),username);
        sendKeys(By.id(ConstansLoginPage.PASSIN),password);
        return this;
    }

    public void loginClick() {
        click(By.className(ConstansLoginPage.SIGNBUTTON));
    }
}
