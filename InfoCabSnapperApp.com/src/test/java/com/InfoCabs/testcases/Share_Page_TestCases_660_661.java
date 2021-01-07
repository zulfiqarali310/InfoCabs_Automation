package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Share_Page_TestCases_660_661 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 660)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Share_Page_ClickTO_Open_Share_Page_660(String CommonLocator, String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		L1.click();

		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Share']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='Share']")));
		L2.click();

	}

	@Test(priority = 661)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "AppPackage" })
	public void Test_Share_Page_check_ShareText_is_present_661(String CommonLocator, String CommonLocator_ClassView,
			String AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id("android:id/text1"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			// Assert.assertEquals(Get_text1, "Hey, I'm using CabSnapper, cool Taxi
			// application, Download and move to your destinations with CabSnapper.\r\n"
			// + "https://play.google.com/store/apps/details?id=com.infosun.csandroidx");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/text1")));
			L1.click();
			HelperMethods.waitForPageLoaded();
			Thread.sleep(4000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			HelperMethods.waitForPageLoaded();

		} else {
			System.out.println("Test:661, admin@hollywoodcars.co.uk email is not present");
		}

	}

}
