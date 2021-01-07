package com.InfoCabs.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Book_6_Seater_With_CreditCards_TestCases_379_401 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	/*@Test(priority = 21)
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
	}*/
	@Test(priority = 379)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_With_CreditCards_EnterDropofAddress_Cab_379(String CommonLocator,
			String DropoffAddress) {
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

	@Test(priority = 380)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Book_6_Seater_With_CreditCards_ClickOnBookNow_Button_Cab_380(String CommonLocator_ClassView,
			String DropoffAddress) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		Thread.sleep(3000);
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

	@Test(priority = 381)
	@Parameters("CommonLocator")
	public void Test_BBook_6_Seater_With_CreditCards_6_Seater_Text_arePresent_381(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "6 Seater");
			System.out.println("6 Seater Car is Availble you can book it");

		} else {
			System.out.println("Test:381, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 382)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_With_CreditCards_ClickOnBookNow_Button_Cab_382(String CommonLocator,
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

	@Test(priority = 383)
	@Parameters({ "CommonLocator", "CommonLocator_Class_Relative_View" })
	public void Test_Book_6_Seater_With_CreditCards_Select_Cash_FromDrop_383(String CommonLocator,
			String CommonLocator_Class_Relative_View) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "sv_payments"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "sv_payments")));
		Thread.sleep(3000);
		L1.click();
		Thread.sleep(2000);
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.xpath("//"+ CommonLocator_Class_Relative_View + "[@index='1']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//"+ CommonLocator_Class_Relative_View + "[@index='1']")));
		L2.click();

	}

	@Test(priority = 384)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_With_CreditCards_ClickOnBookConfirmButton_384(String CommonLocator,
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

	@Test(priority = 385)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_Push_CustomerApp_toBackground_and_start_RiderApp_385(
			String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}


	@Test(priority = 387)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_AcceptCustomer_ride_387(String AppPackage)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 387)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_Push_Rider_toBackground_and_start_CustomerApp_387(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		// driver.resetApp();
		HelperMethods.waitForPageLoaded();
		driver.closeApp();
		Thread.sleep(5000);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 388)
	@Parameters("CommonLocator")
	public void Test_BBook_6_Seater_With_CreditCards_weHave_Sent_Text_arePresent_388(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "We have sent you a cab.");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:390, We have sent you a cab text are not present");
		}
	}

	@Test(priority = 389)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_Push_CustomerApp_toBackground_and_start_RiderApp_389(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(6000);

	}

	@Test(priority = 390)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_ClickOnWait_ride_390(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 391)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_ClickOnPOB_Button_ride_391(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 392)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_Push_Rider_toBackground_and_start_CustomerApp_392(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		// driver.resetApp();
		HelperMethods.waitForPageLoaded();
		driver.closeApp();
		Thread.sleep(5000);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 393)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_With_CreditCards_You_arein_yourway_Text_arePresent_393(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You are on your way.");
			Thread.sleep(5000);

		} else {
			System.out.println("Test:394, You are on your way. text are not present");
		}
	}

	@Test(priority = 394)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_CS_App_Push_CustomerApp_toBackground_and_start_RiderApp_394(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(2000);

	}

	@Test(priority = 395)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_ClickOnSTC_ride_395(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 396)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_ClickOn_Clear_ride_396(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 397)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_Rider_toBackground_and_start_CustomerApp_397(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 398)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_6_Seater_With_CreditCards_Rate_your_ride_Text_arePresent_398(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Rate your ride']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rate your ride");

		} else {
			System.out.println("Test:318, Rate your ride text are not present");
		}
	}

	@Test(priority = 399)
	@Parameters({ "CommonLocator", "Feedback" })
	public void Test_Book_6_Seater_With_CreditCards_Feedback_Field_arePresent_399(String CommonLocator,
			String Feedback) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_feedback"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Feedback);

	}

	@Test(priority = 400)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_With_CreditCards_SubmitFeedback_ButtonAndText_400(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_submit_feedback"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Submit Feedback");
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:401, Submit Feedback text are not present");
		}
	}

	@Test(priority = 401)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_With_CreditCards_Closed_DriverApp_401(String Rider_AppPackage)
			throws InterruptedException {
		Thread.sleep(4000);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		Thread.sleep(5000);
		driver.closeApp();
		driver.hideKeyboard();
		System.out.println("Driver are closed");

	}

}
