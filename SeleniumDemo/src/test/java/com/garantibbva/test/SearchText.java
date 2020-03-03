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
        driver.navigate().to("https://www.google.com.tr");
        // driver.manage().window().maximize();  /* Chrome Düzenleme */

    }

    @Test
    public void googleSearch() throws InterruptedException {

        sendKeys(By.name("q"),"Muhammed BAŞ");
        //submit(By.name("q"));
        click(By.cssSelector("li[data-view-type='1']"));

    }

    @After
    public void after(){
        //driver.quit();
    }

    public WebElement findElement(By by){

        return driver.findElement(by);
    }

    public void sendKeys(By by,String text){

        findElement(by).sendKeys(text);
    }

    public void submit(By by){
        findElement(by).submit();
    }

    public void click(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).click();

    }


}
