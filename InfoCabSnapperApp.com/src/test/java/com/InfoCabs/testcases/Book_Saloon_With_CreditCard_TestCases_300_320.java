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

public class Book_Saloon_With_CreditCard_TestCases_300_320 extends TestBase {

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

	@Test(priority = 300)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_Saloon_With_CreditCard_EnterDropofAddress_Cab_300(String CommonLocator,
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

	@Test(priority = 301)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_Saloon_With_CreditCard_ClickOnBookNow_Button_Cab_301(String CommonLocator,
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

	@Test(priority = 302)
	@Parameters({ "CommonLocator", "CommonLocator_Class_Relative_View" })
	public void Test_Book_Saloon_With_CreditCard_Select_CeditCard_FromDrop_302(String CommonLocator,
			String CommonLocator_Class_Relative_View) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "sv_payments"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "sv_payments")));
		Thread.sleep(3000);
		L1.click();
		Thread.sleep(2000);
		
		WebElement L2 = driver.findElement(By.xpath("//"+ CommonLocator_Class_Relative_View + "[@index='1']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//"+ CommonLocator_Class_Relative_View + "[@index='1']")));
		L2.click();

	}

	@Test(priority = 303)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_Saloon_With_CreditCard_ClickOnBookConfirmButton_303(String CommonLocator,
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

	@Test(priority = 304)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_Push_CustomerApp_toBackground_and_start_RiderApp_304(
			String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}

	/*@Test(priority = 305)

	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_Refresh_RiderApp_305(String Rider_AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.className("android.widget.ImageView"));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.ImageView")));
		Thread.sleep(2000);
		L7.click();
		WebElement L8 = driver.findElement(By.id("com.infosun.infocabs:id/title"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/title")));
		Thread.sleep(2000);
		L7.click();

	}*/

	@Test(priority = 306)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_AcceptCustomer_ride_306(String AppPackage)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 307)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_ClickOnWait_ride_307(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 308)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_Push_Rider_toBackground_and_start_CustomerApp_308(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		// driver.navigate().refresh();
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

	@Test(priority = 309)
	@Parameters("CommonLocator")
	public void Test_Book_Saloon_With_CreditCard_weHave_Sent_Text_arePresent_309(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "We have sent you a cab.");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:309, We have sent you a cab text are not present");
		}
	}

	@Test(priority = 310)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_Push_CustomerApp_toBackground_and_start_RiderApp_310(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(6000);

	}

	@Test(priority = 311)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_ClickOnPOB_Button_ride_311(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 312)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_Push_Rider_toBackground_and_start_CustomerApp_312(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		// driver.navigate().refresh();
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

	@Test(priority = 313)
	@Parameters("CommonLocator")
	public void Test_Book_Saloon_With_CreditCard_You_arein_yourway_Text_arePresent_313(String CommonLocator)
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

	@Test(priority = 314)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_CS_App_Push_CustomerApp_toBackground_and_start_RiderApp_315(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(2000);

	}

	@Test(priority = 315)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_ClickOnSTC_ride_315(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 316)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_ClickOn_Clear_ride_316(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}
	@Test(priority = 316)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_Closed_DriverApp_316(String AppPackage)
			throws InterruptedException {
		Thread.sleep(4000);
		HelperMethods.waitForPageLoaded();
		driver.closeApp();
		Thread.sleep(5000);
		driver.hideKeyboard();
		System.out.println("Driver are closed");

	}

	@Test(priority = 317)
	@Parameters({ "AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_start_CustomerApp_317(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 318)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_Saloon_With_CreditCard_Rate_your_ride_Text_arePresent_318(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Rate your ride']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rate your ride");

		} else {
			System.out.println("Test:318, Rate your ride text are not present");
		}
	}

	@Test(priority = 319)
	@Parameters({ "CommonLocator", "Feedback" })
	public void Test_Book_Saloon_With_CreditCard_Feedback_Field_arePresent319(String CommonLocator, String Feedback) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_feedback"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Feedback);

	}

	@Test(priority = 320)
	@Parameters("CommonLocator")
	public void Test_Book_Saloon_With_CreditCard_SubmitFeedback_ButtonAndText_320(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
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
	@Test(priority = 321)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_Saloon_With_CreditCard_With_CreditCards_Closed_DriverApp_321(String Rider_AppPackage)
			throws InterruptedException {
		Thread.sleep(4000);
		HelperMethods.waitForPageLoaded();
		//driver.activateApp(Rider_AppPackage);
		//Thread.sleep(5000);
		//driver.closeApp();
		//driver.hideKeyboard();
		//System.out.println("Driver are closed");

	}

}
