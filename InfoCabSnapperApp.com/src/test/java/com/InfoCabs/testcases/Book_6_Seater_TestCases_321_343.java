package com.InfoCabs.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Book_6_Seater_TestCases_321_343 extends TestBase {

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
		WebDriverWait wait = new WebDriverWait(driver, 40);
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
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"15Dvr73\"));").click();
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


	@Test(priority = 155)
	@Parameters({ "AppPackage" })
	public void Test_LunchDriver_App_Backto_CustomerApp_155(String AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Again back into the Customer app");

	}

	@Test(priority = 321)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_EnterDropofAddress_Cab_321(String CommonLocator, String DropoffAddress) {
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

	@Test(priority = 322)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Book_6_Seater_ClickOnBookNow_Button_Cab_322(String CommonLocator_ClassView, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		Thread.sleep(4000);
		Dimension elementSize = driver.manage().window().getSize();
		System.out.println(elementSize);

		Double ScreenEndhight = elementSize.getHeight() * 0.9;
		int Anchor = ScreenEndhight.intValue();
		System.out.println(Anchor);

		Double ScreenWidthStart = elementSize.getWidth() * 0.88;
		int scrollStart = ScreenWidthStart.intValue();

		Double ScreenWidthEnd = elementSize.getWidth() * 0.2;
		int scrollEnd = ScreenWidthEnd.intValue();

		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStart, Anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(scrollEnd, Anchor))
				.release().perform();
		Thread.sleep(3000);

	}

	@Test(priority = 323)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_6_Seater_Text_arePresent_323(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "6 Seater");
			System.out.println("6 Seater Car is Availble you can book it");

		} else {
			System.out.println("Test:113, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 324)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_ClickOnBookNow_Button_Cab_324(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
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

	@Test(priority = 325)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Book_6_Seater_Select_Cash_FromDrop_325(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "sv_payments"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "sv_payments")));
		L1.click();
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Cash']"));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//" + CommonLocator_ClassView + "[@text='Cash']")));
		L2.click();

	}

	@Test(priority = 326)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_ClickOnBookConfirmButton_326(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 327)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_Push_CustomerApp_toBackground_and_start_RiderApp_327(String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 328)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_AcceptCustomer_ride_328(String AppPackage) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}


	@Test(priority = 329)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_Push_Rider_toBackground_and_start_CustomerApp_329(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		//driver.resetApp();
		HelperMethods.waitForPageLoaded();
		driver.closeApp();
		Thread.sleep(5000);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 330)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_weHave_Sent_Text_arePresent_330(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "We have sent you a cab.");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:309, We have sent you a cab text are not present");
		}
	}
	

	@Test(priority = 331)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_Push_CustomerApp_toBackground_and_start_RiderApp_331(String Rider_AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(6000);

	}
	
	@Test(priority = 332)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_ClickOnWait_ride_332(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 333)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_ClickOnPOB_Button_ride_333(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 334)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_Push_Rider_toBackground_and_start_CustomerApp_334(String AppPackage)
			throws InterruptedException {
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		//driver.resetApp();
		HelperMethods.waitForPageLoaded();
		driver.closeApp();
		Thread.sleep(5000);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 335)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_You_arein_yourway_Text_arePresent_335(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You are on your way.");
			Thread.sleep(5000);

		} else {
			System.out.println("Test:313, You are on your way. text are not present");
		}
	}

	@Test(priority = 336)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_CS_App_Push_CustomerApp_toBackground_and_start_RiderApp_336(String Rider_AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(2000);

	}

	@Test(priority = 337)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_ClickOnSTC_ride_337(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 338)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_ClickOn_Clear_ride_338(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 339)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_Push_Rider_toBackground_and_start_CustomerApp_339(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 340)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_6_Seater_Rate_your_ride_Text_arePresent_340(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Rate your ride']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rate your ride");

		} else {
			System.out.println("Test:318, Rate your ride text are not present");
		}
	}

	@Test(priority = 341)
	@Parameters({ "CommonLocator", "Feedback" })
	public void Test_BBook_6_Seater_Feedback_Field_arePresent_341(String CommonLocator, String Feedback) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_feedback"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Feedback);

	}

	@Test(priority = 342)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_SubmitFeedback_ButtonAndText_342(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_submit_feedback"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Submit Feedback");
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:320, Submit Feedback text are not present");
		}
	}

}
