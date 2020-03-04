package com.garantibbva.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Muhammed BAŞ 04/03/2020
 */

public class BaseTest
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
        driver.navigate().to("https://www.hepsiburada.com");


    }

    @Test
    public void baseTest() {

        overElement(By.className("links-global"));

        // Assert Fail deneme
        // Assert.assertFalse("Ürün görüntülendi.", findElement(By.className("links-global")).isDisplayed());

        click(By.id("login"));
        sendKeys(By.id("email"),"denemee1233@hotmail.com");
        sendKeys(By.id("password"),"123123123");
        click(By.className("form-actions"));

        Assert.assertEquals(getText(By.className("user-name")),"deneme deneme"); // check login name

        /*
        try{

            findElement(By.id("links-global")).isDisplayed();

        }catch (Exception e){
            Assert.fail("Element Görüntülenmedi");

        }*/


    }

    @After
    public void after(){
        driver.quit();
    }

    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();

    }

    public void overElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();

    }

    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return findElement(by).getText();
    }

}
