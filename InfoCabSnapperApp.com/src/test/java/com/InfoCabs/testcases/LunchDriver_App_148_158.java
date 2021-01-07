package com.InfoCabs.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class LunchDriver_App_148_158 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 21)
	@Parameters({ "PhoneNum", "Pwd", "CommonLocator" })
	public void Test_LoginPage_Allow_user_to_LoginWith_valid_credential_21(String PhoneNum, String Pwd,
			String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PhoneNum);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(Pwd);

		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Add a Pickup Point");
		} else {
			System.out.println("Test:21, User are not able to login may be some issue");
		}
	}

	@Test(priority = 150)
	public void Test_LunchDriver_App_PushCustomer_App_to_BackGround_150() {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		// driver.runAppInBackground(Duration.ZERO);
		// driver.runAppInBackground(Duration.ofSeconds(2));

	}

	@Test(priority = 151)
	@Parameters({ "Rider_AppPackage", "Rider_AppActivity" })
	public void Test_LunchDriver_App_LunchNewDriver_App_151(String Rider_AppPackage, String Rider_AppActivity) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		driver.startActivity(new Activity(Rider_AppPackage, Rider_AppActivity));
		System.out.println("Rider app are open");

	}

	@Test(priority = 152)
	public void Test_LunchDriver_IMEI_Alert_Notification_152() {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement L4 = driver.findElement(By.id("android:id/button1"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
		L4.click();

	}

	@Test(priority = 153)
	@Parameters({ "Rider_PWD" })
	public void Test_LunchDriver_App_LogintoRiderApp_153(String Rider_PWD) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id("com.infosun.infocabs:id/button_infocabs"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id("com.infosun.infocabs:id/spinner_username"));
		L4.click();
		HelperMethods.waitForPageLoaded();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Tony Stark\"));").click();
		Thread.sleep(2000);
		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id("com.infosun.infocabs:id/edit_password"));
		L3.sendKeys(Rider_PWD);
		HelperMethods.waitForPageLoaded();
		WebElement L5 = driver.findElement(By.id("com.infosun.infocabs:id/button_login"));
		HelperMethods.waitForElementToBeClickable(L5);
		L5.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 154)
	@Parameters({ "AppPackage" })
	public void Test_LunchDriver_App_PushDriver_intoBackground_154(String AppPackage) {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		System.out.println("Driver are pushed into background");

	}

	@Test(priority = 155)
	@Parameters({ "AppPackage" })
	public void Test_LunchDriver_App_Backto_CustomerApp_155(String AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Again back into the Customer app");

	}

	@Test(priority = 156)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_LunchDriver_App_EnterDropofAddress_Cab_156(String CommonLocator, String DropoffAddress) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm")));
		L1.click();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_destination"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "et_destination")));
		L2.click();
		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "et_place_predict"));
		L3.sendKeys(DropoffAddress);
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "text_view_address"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "text_view_address")));
		L4.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 157)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_LunchDriver_App_ClickOnBookNow_Button_Cab_157(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L5 = driver.findElement(By.id(CommonLocator + "btn_book_now"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_book_now")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L5.click();

	}

	@Test(priority = 158)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_LunchDriver_App_ClickOnBookConfirmButton_158(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		HelperMethods.waitForPageLoaded();
		WebElement L6 = driver.findElement(By.id(CommonLocator + "btn_confirm_book"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm_book")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L6.click();

	}

	@Test(priority = 159)
	@Parameters({ "Rider_AppPackage" })
	public void Test_LunchDriver_App_Push_CustomerApp_toBackground_and_start_RiderApp_159(String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 160)
	@Parameters({ "AppPackage" })
	public void Test_LunchDriver_App_AcceptCustomer_ride_160(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		HelperMethods.waitForElementToBeClickable(L7);
		L7.click();
		HelperMethods.waitForPageLoaded();

		// for job wait
		// WebElement L8 =
		// driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		// L8.click();

	}

	@Test(priority = 161)
	@Parameters({ "AppPackage" })
	public void Test_LunchDriver_App_Push_Rider_toBackground_and_start_CustomerApp_161(String AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);;
		//driver.closeApp();
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

}
