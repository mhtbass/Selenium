package com.saha.test.Education.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;

public abstract class BasePage  {
	protected AppiumDriver<MobileElement> driver;
	public static final int DEFAULT_WAIT = 30;
	public BasePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	/**
	 * Click komutunu lokasyona göre işletir, click metodunun çalışmadığı
	 * durumlarda kullanılabilir.
	 * @param seconds : Element'in aranma süresini belirler.
	 * @param elementBy : Ulaşılmak istenen elementin attribute değeri.
	 */
	public void getLocationClick(int seconds, By elementBy) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
		driver.tap(1, element, 1);
	}
	
	/**
	 * Ulaşılmak istenilen WebElement'i döndürür.
	 * @param seconds: Element'in aranma süresini belirler.
	 * @param elementBy: Ulaşılmak istenen elementin attribute değeri.
	 * @return
	 */
	public WebElement waitForElement(int seconds, By elementBy) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		return wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
	}
	
	/**
	 * Ulaşılmak istenilen MobileElement'i döndürür.
	 * @param seconds: Element'in aranma süresini belirler.
	 * @param elementBy: Ulaşılmak istenen elementin attribute değeri.
	 * @return
	 */
	public MobileElement waitForMobileElement(int seconds, By elementBy) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
	}

	/**
	 * Ulaşılmak istenilen WebElement'leri liste şeklinde döndürür.
	 * @param seconds: Element'in aranma süresini belirler.
	 * @param elementBy: Ulaşılmak istenen elementin attribute değeri.
	 * @return
	 */
	public List<WebElement> waitForElements(int seconds, By elementBy) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementBy));
	}

	/**
	 * Ulaşılmak istenilen WebElement'i döndürür.
	 * @param seconds : Element'in aranma süresini belirler.
	 * @param resourceId : Ulaşılmak istenen elementin id değeri string cinsinden.
	 * @return
	 */
	public WebElement waitForElementById(int seconds, String resourceId) {
		return waitForElement(seconds, By.id(resourceId));
	}


	public void waitForElement(int seconds, String resourceId) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(resourceId)));
	}
	
	/**
	 * Element'i bekler ve click işlemini gerçekleştirir.
	 * @param driver 
	 * @param byElement
	 * @param Seconds
	 */
	public void clickAndWaitForElement(By byElement, int Seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).click();

	}
	
	/**
	 * Element'i bekler ve click işlemini gerçekleştirir.
	 * @param driver 
	 * @param byElement
	 * @param Seconds"
	 */
	public void clickAndWaitForElement(By byElement) {
		WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).click();

	}
	
	/**
	 * Element'i bekler ve index e göre click işlemini gerçekleştirir.
	 * @param byElement
	 * @param seconds
	 * @param index
	 */
	public void clickAndWaitForElement(By byElement, int seconds, int index) {
		WebDriverWait wait = new WebDriverWait(driver, seconds, 1000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(byElement)).get(index).click();;
	}

	/**
	 * Textfield alanlarına text göndermeyi sağlar. İşlem sonrası 
	 * klavyeyi gizler.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 * @param text
	 */
	public void sendKeysAndWaitForElement(By byElement, int Seconds, String text) {
		WebElement element = waitForElement(Seconds, byElement);
		element.click();
		if(driver instanceof IOSDriver){
			element.clear();
			element.sendKeys(text);
			tryHideKeyboardIOS();
		}else{
			element.sendKeys(text);
			tryHideKeyboard();
		}
	}
	
	/**
	 * Textfield alanlarına text göndermeyi sağlar. İşlem sonrası 
	 * klavyeyi gizler.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 * @param text
	 */
	public void sendKeysAndWaitForElement(By byElement, String text) {
		WebElement element = waitForElement(DEFAULT_WAIT, byElement);
		element.click();
		if(driver instanceof IOSDriver){
			element.clear();
			element.sendKeys(text);
			tryHideKeyboardIOS();
		}else{
			element.sendKeys(text);
			tryHideKeyboard();
		}
	}
	
	/**
	 * Textfield alanlarına text göndermeyi sağlar, list halindeli elementleri index
	 * ile bulur. İşlem sonrası klavyeyi gizler.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 * @param text
	 * @param index : liste halindeki elementlerin index değeri.
	 */
	public void sendKeysAndWaitForElements(By byElement, int Seconds, String text, int index) {
		WebElement element = waitForElements(DEFAULT_WAIT, byElement).get(index);
		element.click();
		if(driver instanceof IOSDriver)
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Textfield alanlarına text göndermeyi sağlar. Klavyenin
	 * gizlenmemesi istenildiğinde kullanılır.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 * @param text
	 */
	public void sendKeysAndWaitForElementNotHideKeyboard(By byElement, int Seconds, String text) {
		WebElement element = waitForElement(DEFAULT_WAIT, byElement);
		element.click();
		if(driver instanceof IOSDriver)
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Textfield alanlarındaki değeri siler.
	 * @param driver
	 * @param byElement
	 * @param Seconds
	 */
	public void clearAndWaitForElement(By byElement, int Seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).clear();
	}

	/**
	 * Belirtilen saniye boyunca bir sonraki işleme kadar bekler.
	 * @param seconds
	 */
	public void waitSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Aldığı parametre sayısınca sola swipe eder.
	 * @param repeat
	 */
	public void swipeLeftMultiple(int repeat) {
		for (int i = 0; i < repeat; i++) {
			swipeLeftAccordingToPhoneSize();
			waitSeconds(1);
		}
	}

	/**
	 * Sola swipe eder. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeLeftAccordingToPhoneSize() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = (width * 60) / 100;
		int swipeEndWidth = (width * 5) / 100;
		int swipeStartHeight = height / 3, swipeEndHeight = height / 3;

//		System.out.println("height= " + height + " width= " + width);
//		System.out.println("start= " + swipeStartWidth + " end= " + swipeEndWidth);

		driver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

	}
	
	/**
	 * Sağa swipe eder. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeRightAccordingToPhoneSize() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = (width * 50) / 100;
		int swipeEndWidth = (width * 90) / 100;
		int swipeStartHeight = height / 3, swipeEndHeight = height / 3;

//		System.out.println("height= " + height + " width= " + width);
//		System.out.println("start= " + swipeStartWidth + " end= " + swipeEndWidth);

		driver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

	}
	
	/**
	 * Aşağıya swipe eder. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeDownAccordingToPhoneSize() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = width / 2, swipeEndWidth = width / 2;

		int swipeStartHeight = (height * 80) / 100;
		int swipeEndHeight = (height * 30) / 100;

		driver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

	}
	
	/**
	 * Yukarıya swipe eder. Telefon boyutundan bağımsız çalışır.
	 */
	public void swipeUpAccordingToPhoneSize() {

		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;

		int swipeStartWidth = width / 2, swipeEndWidth = width / 2;

		int swipeStartHeight = (height * 30) / 100;
		int swipeEndHeight = (height * 80) / 100;

		driver.swipe(swipeStartWidth, swipeStartHeight, swipeEndWidth, swipeEndHeight, 1000);

	}
	
	/**
	 * Combobox elementinden indexine göre seçim yapmayı sağlar.
	 * @param driver
	 * @param seconds
	 * @param index
	 * @param byElement
	 */
	public void selectElementFromCombobox(int seconds, int index, By byElement) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		Select oSelection = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(byElement)));
	    oSelection.selectByIndex(index);
	}

	/**
	 * Element bazlı swipe işlemi yapar.
	 * @param byElement
	 */
	public void swipeLeftById(By byElement){
		MobileElement element =(MobileElement)driver.findElement(byElement);
		element.swipe(SwipeElementDirection.LEFT, 400);
	}
	
	/**
	 * Default IOS HideKeyboard metodu her durumda doğru çalışmadığı 
	 * için geliştirilmiş metodtur. Default metodta ekranın ortasına
	 * tıklayıp klavyeyi kapatmakta fakat tıkladığı alanda buton
	 * veya textfield gibi bir element var ise onlara aksiyon sağladığı
	 * için işlem başarısız olmakta bu sebeple element bulunmayacağı 
	 * tahmin edilen noktaya göre klavye gizleme işlemi sağlanmıştır.
	 */
	public void tryHideKeyboardIOS(){
		try {
			Dimension d = driver.manage().window().getSize();
			int height = d.height;
			int width = d.width;
			
			driver.tap(2, width-1, height/2,  1);
		} catch (Exception e) {
		}
		
	}
	
	/**
	 * Appium default klavye gizleme işlemidir. Android
	 * platformunda stabil çalışırken IOS platformunda 
	 * stabil çalışmamaktadır.
	 */
	public void tryHideKeyboard(){
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
		}
		
	}
	
	/**
	 * Testin çalıştığı telefonun boyutlarını yazdıran metod.
	 */
	public void getPhoneSize(){
		Dimension d = driver.manage().window().getSize();
		int height = d.height;
		int width = d.width;
		System.out.println("height : "+ height+"\nwidth : "+ width);
	}
	
	/**
	 * Element'in varlığını kontrol eder, parametre ile belirtilen 
	 * süre boyunca elementi bulursa true bulamaz ise false döner
	 * bu sayede assertion kontrolü sağlanır. 
	 * @param seconds
	 * @param by
	 * @return
	 */
	public boolean isExist(int seconds,By by){
		try {
			waitForElement(seconds, by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Element'in attribute değerini konsol a basar.
	 * @param element
	 */
	public void foundedElement(WebElement element){
		System.out.println("Founded element ->"+element.toString().split("->")[1]);
	}
	
	/**
	 * Element'in text değerini döndürür.
	 * @param seconds
	 * @param by
	 * @return
	 */
	public String getText(int seconds,By by){
		return waitForElement(seconds, by).getText();
	}
	
	/**
	 * Element'in text değerini verilen değer ile karşılaştırır
	 * @param seconds
	 * @param by
	 * @return
	 */
	public boolean getTextIsEqual(int seconds, By by, String text){
		return waitForElement(seconds, by).getText().equals(text);
	}
	
}



