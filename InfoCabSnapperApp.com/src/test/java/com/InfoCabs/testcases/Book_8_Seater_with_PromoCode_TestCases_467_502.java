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

public class Book_8_Seater_with_PromoCode_TestCases_467_502 extends TestBase {

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

	@Test(priority = 467)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_8_Seater_with_PromoCode_EnterDropofAddress_Cab_467(String CommonLocator,
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

	@Test(priority = 468)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Book_8_Seater_with_PromoCode_ClickOnBookNow_Button_Cab_468(String CommonLocator_ClassView,
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

	@Test(priority = 469)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Book_8_Seater_with_PromoCode_Moveto_8_Seater_469(String CommonLocator_ClassView,
			String DropoffAddress) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		Thread.sleep(4000);
		Dimension elementSize = driver.manage().window().getSize();
		System.out.println(elementSize);

		Double ScreenEndhight = elementSize.getHeight() * 0.9;
		int Anchor = ScreenEndhight.intValue();
		System.out.println(Anchor);

		Double ScreenWidthStart = elementSize.getWidth() * 0.99;
		int scrollStart = ScreenWidthStart.intValue();

		Double ScreenWidthEnd = elementSize.getWidth() * 0.1;
		int scrollEnd = ScreenWidthEnd.intValue();

		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStart, Anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(scrollEnd, Anchor))
				.release().perform();
		Thread.sleep(3000);

	}

	@Test(priority = 470)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_8_Seater_Text_arePresent_470(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "8 Seater");
			System.out.println("8 Seater Car is Availble you can book it");

		} else {
			System.out.println("Test:447, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 471)
	@Parameters({ "CommonLocator", })
	public void Test_Book_8_Seater_with_PromoCode_ClickOnBookNow_Button_Cab_471(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		System.out.println(driver.findElements(By.id(CommonLocator + "btn_book_now")).size());
		Thread.sleep(2000);
		// wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator +
		// "btn_book_now")));
		driver.findElements(By.id(CommonLocator+ "btn_book_now")).get(1).click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 472)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_8_Seater_With_PrmoCode_ClickOn_AddPrmoCode_Button_Cab_472(String CommonLocator,
			String DropoffAddress) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_promo"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "et_promo")));
		L1.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 473)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_CrossButton_is_present_473(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_close")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 474)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_EnterPromoCode_Text_arePresent_474(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "location_title"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter a promo code");

		} else {
			System.out.println("Test:474, Enter a promo code text are not present");
		}
	}

	@Test(priority = 475)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_EnterPromoCode_Text_arePresent_475(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Activate Promo Code");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm")));
			L1.click();
		} else {
			System.out.println("Test:475, Activate Promo Code text are not present");
		}
	}

	@Test(priority = 476)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_EnterPrmocodeFirst_Validation_Text_arePresent_476(
			String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter promo code first");

		} else {
			System.out.println("Test:476, Enter promo code first text are not present");
		}
	}

	@Test(priority = 477)
	@Parameters({ "CommonLocator", "InvalidPromoCode" })
	public void Test_Book_8_Seater_with_PromoCode_Enter_InvalidPromocode_chk_Validation_477(String CommonLocator,
			String InvalidPromoCode) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_promo"));
		L1.sendKeys(InvalidPromoCode);
		Thread.sleep(3000);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm")));
		L2.click();
		Thread.sleep(3000);
	}

	@Test(priority = 478)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_InvalidPromoCode_Validation_Text_arePresent_478(
			String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You have entered an invalid code. Please check the spellings again.");

		} else {
			System.out.println(
					"Test:478, You have entered an invalid code. Please check the spellings again. text are not present");
		}
	}

	@Test(priority = 479)
	@Parameters({ "CommonLocator", "validPromoCode" })
	public void Test_Book_8_Seater_with_PromoCode_Enter_validPromocode_chk_Validation_479(String CommonLocator,
			String validPromoCode) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_promo"));
		L1.clear();
		Thread.sleep(3000);
		L1.sendKeys(validPromoCode);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm")));
		L2.click();
	}

	@Test(priority = 480)
	@Parameters("CommonLocator")
	public void Test_BBook_8_Seater_with_PromoCode_validPromoCode_Validation_Text_arePresent_480(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Hurrah!, You saved 5.0% on this ride");

		} else {
			System.out.println("Test:480, Valid PromoCode text are not present");
		}
	}

	@Test(priority = 481)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_8_Seater_with_PromoCode_SuccessMessage_Code_481(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Promo Code Applied']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Promo Code Applied");

		} else {
			System.out.println("Test:481, Promo Code Applied text are not present");
		}
	}

	@Test(priority = 482)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_PromoCode_Text_Validation_482(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "promo_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "'QATester'    5.0% off");

		} else {
			System.out.println("Test:482, 'QATester'    5.0% off PromoCode text are not present");
		}
	}

	@Test(priority = 483)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_Without_Discount_Price_483(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_price_discount")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 484)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_With_DiscountPrice_484(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_price")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 484)
	@Parameters({ "CommonLocator", "CommonLocator_Class_Relative_View" })
	public void Test_Book_8_Seater_with_PromoCode_Select_Cash_FromDrop_484(String CommonLocator,
			String CommonLocator_Class_Relative_View) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "sv_payments"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "sv_payments")));
		L1.click();
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_Class_Relative_View + "[@index='0']"));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//" + CommonLocator_Class_Relative_View + "[@index='0']")));
		L2.click();

	}

	@Test(priority = 485)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_8_Seater_with_PromoCode_ClickOnBookConfirmButton_485(String CommonLocator,
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

	@Test(priority = 486)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_Push_CustomerApp_toBackground_and_start_RiderApp_486(
			String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 488)
	@Parameters({ "AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_AcceptCustomer_ride_488(String AppPackage)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 489)
	@Parameters({ "AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_Push_Rider_toBackground_and_start_CustomerApp_489(String AppPackage)
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

	@Test(priority = 490)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_weHave_Sent_Text_arePresent_490(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "We have sent you a cab.");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:490, We have sent you a cab text are not present");
		}
	}

	@Test(priority = 491)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_Push_CustomerApp_toBackground_and_start_RiderApp_491(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(6000);

	}

	@Test(priority = 492)
	@Parameters({ "AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_ClickOnWait_ride_492(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 493)
	@Parameters({ "AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_ClickOnPOB_Button_ride_493(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 494)
	@Parameters({ "AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_Push_Rider_toBackground_and_start_CustomerApp_494(String AppPackage)
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

	@Test(priority = 495)
	@Parameters("CommonLocator")
	public void Test_Book_8_With_PrmoCode_You_arein_yourway_Text_arePresent_495(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You are on your way.");
			Thread.sleep(5000);

		} else {
			System.out.println("Test:495, You are on your way. text are not present");
		}
	}

	@Test(priority = 496)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_CS_App_Push_CustomerApp_toBackground_and_start_RiderApp_496(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(2000);

	}

	@Test(priority = 497)
	@Parameters({ "AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_ClickOnSTC_ride_497(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 498)
	@Parameters({ "AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_ClickOn_Clear_ride_498(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 499)
	@Parameters({ "AppPackage" })
	public void Test_Book_8_Seater_with_PromoCode_Push_Rider_toBackground_and_start_CustomerApp_499(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 500)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_8_Seater_with_PromoCode_Rate_your_ride_Text_arePresent_500(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Rate your ride']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rate your ride");

		} else {
			System.out.println("Test:500, Rate your ride text are not present");
		}
	}

	@Test(priority = 501)
	@Parameters({ "CommonLocator", "Feedback" })
	public void Test_Book_8_Seater_with_PromoCode_Feedback_Field_arePresent_501(String CommonLocator, String Feedback) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_feedback"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Feedback);

	}

	@Test(priority = 502)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_PromoCode_SubmitFeedback_ButtonAndText_502(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_submit_feedback"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Submit Feedback");
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:378, Submit Feedback text are not present");
		}
	}

}
