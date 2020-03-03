package com.saha.test.Education.base;

import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseTest {
	public static String currentPhone = "LG_G4";
	public static String currentPhoneType = "GALAXY_S5";
	public static String APPPACKAGE = "com.mobisoft.kitapyurdu";
	public static String APPACTIVITY = "com.mobisoft.kitapyurdu.main.SplashActivity";
	public static String BROWSER_NAME = "device";
	protected AppiumDriver<MobileElement> driver;

	boolean localAndroid =true;
	@Before
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		if (StringUtils.isEmpty(System.getProperty("key"))) {
			if (localAndroid) {
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
				//capabilities.setCapability(MobileCapabilityType.VERSION, "5.1");
				capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
				capabilities.setCapability("avd", "Pixel_22_API_27");
				capabilities.setCapability("appPackage", APPPACKAGE);
				capabilities.setCapability("appActivity", APPACTIVITY);
				capabilities.setCapability("automationName", "uiautomator2");
				capabilities.setCapability("unicodeKeyboard", "true");
				capabilities.setCapability("resetKeyboard", "true");
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			} else {
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.3");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "IPHONE_6S");
				capabilities.setCapability("bundleId", "com.kitapyurdu.kitapyurdu");
				capabilities.setCapability("noReset", true);
				capabilities.setCapability("fullReset", false);
//				capabilities.setCapability(MobileCapabilityType.APP, "/Users/testinium/Downloads/resignedByKahyalar.ipa");
				capabilities.setCapability("udid", "1e5cdbbadc4a7dc3e4389298330bad5c587904d5");

				driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			}

		} else {
			String hubURL = "http://hub.testinium.io/wd/hub";
			currentPhoneType = System.getProperty("browser");
			if (System.getProperty("platform").equals("ANDROID")) {
				capabilities.setCapability(CapabilityType.PLATFORM, Platform.ANDROID);
				capabilities.setCapability("key", System.getProperty("key"));
				capabilities.setCapability("appPackage", APPPACKAGE);
				capabilities.setCapability("appActivity", APPACTIVITY);
				capabilities.setCapability("unicodeKeyboard", "true");
				capabilities.setCapability("resetKeyboard", "true");
				driver = new AndroidDriver<MobileElement>(new URL(hubURL), capabilities);
			} else {
				capabilities.setCapability("key", System.getProperty("key"));
				capabilities.setCapability("noReset", true);
				capabilities.setCapability("fullReset", false);
				capabilities.setCapability("waitForAppScript", "$.delay(3000);");
				capabilities.setCapability("bundleId", "com.kitapyurdu.kitapyurdu");
				capabilities.setCapability("automationName", "XCUITest");
				driver = new IOSDriver<MobileElement>(new URL(hubURL), capabilities);
			}
		}
//		setCurrentPhone();
		PageFactory.getInstance().setDriver(driver);
	}

//	private void setCurrentPhone() {
//		Map<String, Object> obj = (Map<String, Object>) driver.getCapabilities().getCapability("desired");
//		for (Entry s : obj.entrySet()) {
//			System.out.println("'" + s.getKey() + "' - '" + s.getValue() + "'");
//			if (s.getKey().equals("deviceName")) {
//				currentPhone = String.valueOf(s.getValue());
//				break;
//			}
//		}
//	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
