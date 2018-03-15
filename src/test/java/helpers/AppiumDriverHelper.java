package helpers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriverHelper {

	private static AppiumDriver<MobileElement> driver;

	public static AppiumDriver<MobileElement> getAppiumDriver(String plataform) throws MalformedURLException {

	
		if (driver == null) {
			if (plataform.equals("android")) {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5 API 23");
				cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Android");
				cap.setCapability(MobileCapabilityType.VERSION, "6.0");
				cap.setCapability("plataformName", "Android");
				cap.setCapability("app", new File("apk/app-android-calculator.apk"));
				driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			}
			else if (plataform.equals("ios")) {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
				cap.setCapability(MobileCapabilityType.BROWSER_NAME, "iOS");
				cap.setCapability(MobileCapabilityType.VERSION, "11.2");
				cap.setCapability(MobileCapabilityType.PLATFORM, "Mac");
				cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
				cap.setCapability(MobileCapabilityType.PLATFORM, "Mac");
				cap.setCapability("plataformName", "IOS");
				cap.setCapability("app", new File("app/SimpleCalculator.app"));
				driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
				
			}
			
		}
		return driver;
	}
}
