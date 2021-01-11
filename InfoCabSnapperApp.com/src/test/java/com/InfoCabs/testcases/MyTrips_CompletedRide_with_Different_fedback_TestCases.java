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

import io.appium.java_client.android.Activity;

public class MyTrips_CompletedRide_with_Different_fedback_TestCases extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 686)
	@Parameters({ "Rider_AppPackage", "Rider_AppActivity" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_LunchNewDriver_App_686(String Rider_AppPackage,
			String Rider_AppActivity) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		driver.startActivity(new Activity(Rider_AppPackage, Rider_AppActivity));
		System.out.println("Rider app are open");

	}

	/*
	 * @Test(priority = 687) public void
	 * Test_LunchDriver_IMEI_Alert_Notification_687() {
	 * HelperMethods.waitForPageLoaded(); WebDriverWait wait = new
	 * WebDriverWait(driver, 10); WebElement L4 =
	 * driver.findElement(By.id("android:id/button1"));
	 * wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1"
	 * ))); L4.click();
	 * 
	 * }
	 */

	@Test(priority = 688)
	@Parameters({ "Rider_PWD" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_LogintoRiderApp_688(String Rider_PWD)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id("com.infosun.infocabs:id/button_infocabs"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id("com.infosun.infocabs:id/spinner_username"));
		L4.click();
		HelperMethods.waitForPageLoaded();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Tony Stark\"));")
				.click();
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

	@Test(priority = 689)
	@Parameters({ "AppPackage" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_Backto_CustomerApp_689(String AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Again back into the Customer app");

	}

	@Test(priority = 690)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_ClickOnBookNow_Button_Cab_690(String CommonLocator,
			String DropoffAddress) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L5 = driver.findElement(By.id(CommonLocator + "btn_book_now"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_book_now")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L5.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 691)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_ClickOnBookConfirmButton_691(String CommonLocator,
			String DropoffAddress) throws InterruptedException {
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

	@Test(priority = 692)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_Push_CustomerApp_toBackground_and_start_RiderApp_692(
			String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 693)
	@Parameters({ "AppPackage" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_AcceptCustomer_ride_693(String AppPackage)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 694)
	@Parameters({ "AppPackage" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_ClickOnWait_ride_694(String AppPackage)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		Thread.sleep(3000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 695)
	@Parameters({ "AppPackage" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_ClickOnPOB_Button_ride_695(String AppPackage)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 696)
	@Parameters({ "AppPackage" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_ClickOnSTC_ride_696(String AppPackage)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		Thread.sleep(3000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 697)
	@Parameters({ "AppPackage" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_ClickOn_Clear_ride_697(String AppPackage)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		Thread.sleep(3000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 698)
	@Parameters({ "AppPackage" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_start_CustomerApp_698(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 699)
	@Parameters("CommonLocator_ClassView")
	public void Test_MyTrips_CompletedRide_with_Different_fedback_Rate_your_ride_Text_arePresent_699(
			String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Rate your ride']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rate your ride");

		} else {
			System.out.println("Test:699, Rate your ride text are not present");
		}
	}

	@Test(priority = 700)
	@Parameters({ "CommonLocator", "Feedback" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_Feedback_Field_arePresent_700(String CommonLocator,
			String Feedback) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_feedback"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Feedback);

	}

	@Test(priority = 701)
	@Parameters("CommonLocator")
	public void Test_MyTrips_CompletedRide_with_Different_fedback_SubmitFeedback_ButtonAndText_701(
			String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_submit_feedback"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Submit Feedback");
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:701, Submit Feedback text are not present");
		}
	}

	@Test(priority = 702)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_ClickOn_SideMenu_Button_702(String CommonLocator,
			String DropoffAddress) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L5 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L5.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 703)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_MyTrips_CompletedRide_with_Different_fedback_ClickOn_SideMenu__MyTrips_Button_703(
			String CommonLocator, String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='My Trips']"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='My Trips']")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L2.click();
		HelperMethods.waitForPageLoaded();

	}

}
