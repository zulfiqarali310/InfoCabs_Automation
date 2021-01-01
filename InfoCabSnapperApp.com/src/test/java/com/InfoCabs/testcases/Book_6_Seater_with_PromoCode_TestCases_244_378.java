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

public class Book_6_Seater_with_PromoCode_TestCases_244_378 extends TestBase{
	
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

	@Test(priority = 344)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_with_PromoCode_EnterDropofAddress_Cab_344(String CommonLocator, String DropoffAddress) {
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

	@Test(priority = 345)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Book_6_Seater_with_PromoCode_ClickOnBookNow_Button_Cab_345(String CommonLocator_ClassView, String DropoffAddress)
			throws InterruptedException {
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

	@Test(priority = 346)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_6_Seater_Text_arePresent_346(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "6 Seater");
			System.out.println("6 Seater Car is Availble you can book it");

		} else {
			System.out.println("Test:346, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 347)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_with_PromoCode_ClickOnBookNow_Button_Cab_347(String CommonLocator, String DropoffAddress)
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
	
	@Test(priority = 348)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_With_PrmoCode_ClickOn_AddPrmoCode_Button_Cab_348(String CommonLocator,
			String DropoffAddress) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_promo"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "et_promo")));
		L1.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 349)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_CrossButton_is_present_349(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_close")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 350)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_EnterPromoCode_Text_arePresent_350(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "location_title"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter a promo code");

		} else {
			System.out.println("Test:350, Enter a promo code text are not present");
		}
	}

	@Test(priority = 351)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_EnterPromoCode_Text_arePresent_351(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Activate Promo Code");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm")));
			L1.click();
		} else {
			System.out.println("Test:351, Activate Promo Code text are not present");
		}
	}

	@Test(priority = 352)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_EnterPrmocodeFirst_Validation_Text_arePresent_352(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter promo code first");

		} else {
			System.out.println("Test:352, Enter promo code first text are not present");
		}
	}

	@Test(priority = 353)
	@Parameters({ "CommonLocator", "InvalidPromoCode" })
	public void Test_Book_6_Seater_with_PromoCode_Enter_InvalidPromocode_chk_Validation_353(String CommonLocator,
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

	@Test(priority = 354)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_InvalidPromoCode_Validation_Text_arePresent_354(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You have entered an invalid code. Please check the spellings again.");

		} else {
			System.out.println(
					"Test:354, You have entered an invalid code. Please check the spellings again. text are not present");
		}
	}

	@Test(priority = 355)
	@Parameters({ "CommonLocator", "validPromoCode" })
	public void Test_Book_6_Seater_with_PromoCode_Enter_validPromocode_chk_Validation_355(String CommonLocator,
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

	@Test(priority = 356)
	@Parameters("CommonLocator")
	public void Test_BBook_6_Seater_with_PromoCode_validPromoCode_Validation_Text_arePresent_356(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Hurrah!, You saved 5.0% on this ride");

		} else {
			System.out.println("Test:356, Valid PromoCode text are not present");
		}
	}
	@Test(priority = 357)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_6_Seater_with_PromoCode_SuccessMessage_Code_357(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Promo Code Applied']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Promo Code Applied");

		} else {
			System.out.println("Test:357, Promo Code Applied text are not present");
		}
	}

	@Test(priority = 358)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_PromoCode_Text_Validation_358(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "promo_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "'QATester'    5.0% off");

		} else {
			System.out.println("Test:358, 'QATester'    5.0% off PromoCode text are not present");
		}
	}
	
	@Test(priority = 359)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_Without_Discount_Price_359(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_price_discount")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}
	
	@Test(priority = 360)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_With_DiscountPrice_360(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_price")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}
	

	@Test(priority = 361)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_6_Seater_with_PromoCode_ClickOnBookConfirmButton_361(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 362)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_Push_CustomerApp_toBackground_and_start_RiderApp_362(
			String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}
	
	@Test(priority = 363)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_Refresh_RiderApp_363(String Rider_AppPackage) throws InterruptedException {
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

	}

	@Test(priority = 364)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_AcceptCustomer_ride_365(String AppPackage) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 365)
	@Parameters({ "AppPackage" })
	public void Test_BBook_6_Seater_with_PromoCode_ClickOnWait_ride_365(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 366)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_Push_Rider_toBackground_and_start_CustomerApp_366(String AppPackage)
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

	@Test(priority = 367)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_weHave_Sent_Text_arePresent_367(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "We have sent you a cab.");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:367, We have sent you a cab text are not present");
		}
	}

	@Test(priority = 368)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_Push_CustomerApp_toBackground_and_start_RiderApp_368(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(6000);

	}
	
	@Test(priority = 369)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_ClickOnPOB_Button_ride_369(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}
	
	@Test(priority = 370)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_Push_Rider_toBackground_and_start_CustomerApp_371(String AppPackage)
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

	@Test(priority = 371)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_You_arein_yourway_Text_arePresent_371(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You are on your way.");
			Thread.sleep(5000);

		} else {
			System.out.println("Test:372, You are on your way. text are not present");
		}
	}
	
	@Test(priority = 372)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_CS_App_Push_CustomerApp_toBackground_and_start_RiderApp_372(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(2000);

	}

	@Test(priority = 373)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_ClickOnSTC_ride_373(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 374)
	@Parameters({ "AppPackage" })
	public void Test_SBook_6_Seater_with_PromoCode_ClickOn_Clear_ride_374(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 375)
	@Parameters({ "AppPackage" })
	public void Test_Book_6_Seater_with_PromoCode_Push_Rider_toBackground_and_start_CustomerApp_375(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}
	
	@Test(priority = 376)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_6_Seater_with_PromoCode_Rate_your_ride_Text_arePresent_376(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Rate your ride']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rate your ride");

		} else {
			System.out.println("Test:376, Rate your ride text are not present");
		}
	}
	
	@Test(priority = 377)
	@Parameters({ "CommonLocator", "Feedback" })
	public void Test_Book_6_Seater_with_PromoCode_Feedback_Field_arePresent_377(String CommonLocator, String Feedback) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_feedback"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Feedback);

	}

	@Test(priority = 378)
	@Parameters("CommonLocator")
	public void Test_Book_6_Seater_with_PromoCode_SubmitFeedback_ButtonAndText_378(String CommonLocator) {
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
