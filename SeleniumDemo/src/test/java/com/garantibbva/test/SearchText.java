package com.garantibbva.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Muhammed BAŞ
 */

public class SearchText
{
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","properties/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        wait=new WebDriverWait(driver,60);
        driver.navigate().to("https://www.n11.com");
        // driver.manage().window().maximize();  /* Chrome Düzenleme */

    }

    @Test
    public void googleSearch() throws InterruptedException {

        click(By.className("btnSignUp"));
        sendKeys(By.id("firstName"),"Muhammed"); // name
        sendKeys(By.id("lastName"),"BAŞ"); // lastname
        sendKeys(By.id("registrationEmail"),"deneme@hotmail.com"); // email
        sendKeys(By.id("registrationPassword"),"123123123"); // pass
        sendKeys(By.id("passwordAgain"),"123123123"); // pass again
        click(By.id("phoneNumber"));
        sendKeys(By.id("phoneNumber"),"353533535"); // pass again
        click(By.className("genderArea"));

        selectDate(By.id("birthDay"),"12");
        selectDate(By.id("birthMonth"),"12");
        selectDate(By.id("birthYear"),"1996");

        click(By.className("buyerAgreement"));
        click(By.className("smsAndCampaign"));

    }

    @After
    public void after(){
        //driver.quit();
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
    }

    public void submit(By by){
        findElement(by).submit();
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();

    }

    public void selectDate(By by,String datestring){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        Select date = new Select(findElement(by));
        date.selectByValue(datestring);


    }


}
