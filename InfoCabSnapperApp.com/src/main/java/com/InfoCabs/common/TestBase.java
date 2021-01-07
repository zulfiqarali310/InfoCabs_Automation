package com.InfoCabs.common;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static AndroidDriver<MobileElement> driver;
	static String UserDir = System.getProperty("user.dir");
	static String ApplicationPath = UserDir + "\\Apps\\Stage.apk";
	//public static String Rider_AppPackage="com.infosun.infocabs";
	//public static String Rider_AppActivity="com.infosun.infocabs.SplashActivity";

	@BeforeTest
	@Parameters({ "DeviceType", "DeviceVersion", "DeviceName", "DeviceUDID", "AppPackage", "AppActivity", "AppiumURL" })
	public void setup(String DeviceType, String DeviceVersion, String DeviceName, String DeviceUDID, String AppPackage,
			String AppActivity, String AppiumURL) {
		DesiredCapabilities cap = new DesiredCapabilities();

		try {
			cap.setCapability(CapabilityType.PLATFORM_NAME, DeviceType);
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, DeviceVersion);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceName);
			cap.setCapability(MobileCapabilityType.UDID, DeviceUDID);
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
			cap.setCapability(MobileCapabilityType.APP, ApplicationPath);
			cap.setCapability("appPackage", AppPackage);
			cap.setCapability("appActivity", AppActivity);
			cap.setCapability("autoAcceptAlerts", true);
			cap.setCapability("autoGrantPermissions", true);
			cap.setCapability("unicodeKeyboard", false);
			cap.setCapability("resetKeyboard", false);
			driver = new AndroidDriver<MobileElement>(new URL(AppiumURL), cap);

		} catch (Exception exp) {
			exp.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@AfterTest
	public void teardown() {

		//driver.quit();

	}

}
