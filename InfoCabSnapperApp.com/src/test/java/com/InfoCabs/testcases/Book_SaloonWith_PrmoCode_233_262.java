package com.InfoCabs.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

public class Book_SaloonWith_PrmoCode_233_262 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	
	@Test(priority = 233)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_SaloonWith_PrmoCode_EnterDropofAddress_Cab_234(String CommonLocator, String DropoffAddress) {
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

	@Test(priority = 234)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_SaloonWith_PrmoCode_ClickOnBookNow_Button_Cab_234(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 235)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_SaloonWith_PrmoCode_ClickOn_AddPrmoCode_Button_Cab_235(String CommonLocator,
			String DropoffAddress) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_promo"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "et_promo")));
		L1.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 236)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_CrossButton_is_present_236(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_close")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 237)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_EnterPromoCode_Text_arePresent_237(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "location_title"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter a promo code");

		} else {
			System.out.println("Test:237, Enter a promo code text are not present");
		}
	}

	@Test(priority = 238)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_EnterPromoCode_Text_arePresent_238(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Activate Promo Code");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm")));
			L1.click();
		} else {
			System.out.println("Test:238, Activate Promo Code text are not present");
		}
	}

	@Test(priority = 239)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_EnterPrmocodeFirst_Validation_Text_arePresent_239(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter promo code first");

		} else {
			System.out.println("Test:239, Enter promo code first text are not present");
		}
	}

	@Test(priority = 240)
	@Parameters({ "CommonLocator", "InvalidPromoCode" })
	public void Test_Book_SaloonWith_PrmoCode_Enter_InvalidPromocode_chk_Validation_240(String CommonLocator,
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

	@Test(priority = 241)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_InvalidPromoCode_Validation_Text_arePresent_241(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You have entered an invalid code. Please check the spellings again.");

		} else {
			System.out.println(
					"Test:241, You have entered an invalid code. Please check the spellings again. text are not present");
		}
	}

	@Test(priority = 242)
	@Parameters({ "CommonLocator", "validPromoCode" })
	public void Test_Book_SaloonWith_PrmoCode_Enter_validPromocode_chk_Validation_242(String CommonLocator,
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

	@Test(priority = 243)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_validPromoCode_Validation_Text_arePresent_243(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_promo_result"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Hurrah!, You saved 5.0% on this ride");

		} else {
			System.out.println("Test:241, Valid PromoCode text are not present");
		}
	}
	@Test(priority = 244)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_SaloonWith_PrmoCode_SuccessMessage_Code_244(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Promo Code Applied']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Promo Code Applied");

		} else {
			System.out.println("Test:241, Promo Code Applied text are not present");
		}
	}

	@Test(priority = 245)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_PromoCode_Text_Validation_245(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "promo_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "'QATester'    5.0% off");

		} else {
			System.out.println("Test:241, 'QATester'    5.0% off PromoCode text are not present");
		}
	}
	
	@Test(priority = 246)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_Without_Discount_Price_246(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_price_discount")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}
	
	@Test(priority = 247)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_With_DiscountPrice_247(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_price")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}
	
	

	@Test(priority = 248)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_SaloonWith_PrmoCode_ClickOnBookConfirmButton_248(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 249)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_Push_CustomerApp_toBackground_and_start_RiderApp_249(
			String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}
	
	@Test(priority = 250)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_Refresh_RiderApp_250(String Rider_AppPackage) throws InterruptedException {
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

	@Test(priority = 251)
	@Parameters({ "AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_AcceptCustomer_ride_251(String AppPackage) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 252)
	@Parameters({ "AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_ClickOnWait_ride_252(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 253)
	@Parameters({ "AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_Push_Rider_toBackground_and_start_CustomerApp_253(String AppPackage)
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

	@Test(priority = 254)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_weHave_Sent_Text_arePresent_254(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "We have sent you a cab.");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:254, We have sent you a cab text are not present");
		}
	}

	@Test(priority = 255)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_Push_CustomerApp_toBackground_and_start_RiderApp_255(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(6000);

	}
	
	@Test(priority = 256)
	@Parameters({ "AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_ClickOnPOB_Button_ride_256(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}
	
	@Test(priority = 257)
	@Parameters({ "AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_Push_Rider_toBackground_and_start_CustomerApp_257(String AppPackage)
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

	@Test(priority = 258)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_You_arein_yourway_Text_arePresent_258(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You are on your way.");
			Thread.sleep(5000);

		} else {
			System.out.println("Test:189, You are on your way. text are not present");
		}
	}
	
	@Test(priority = 259)
	@Parameters({ "Rider_AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_CS_App_Push_CustomerApp_toBackground_and_start_RiderApp_259(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(2000);

	}

	@Test(priority = 260)
	@Parameters({ "AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_ClickOnSTC_ride_260(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 261)
	@Parameters({ "AppPackage" })
	public void Test_STC_And_FeedBack_Page_ClickOn_Clear_ride_261(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 262)
	@Parameters({ "AppPackage" })
	public void Test_Book_SaloonWith_PrmoCode_Push_Rider_toBackground_and_start_CustomerApp_262(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}
	
	@Test(priority = 263)
	@Parameters("CommonLocator_ClassView")
	public void Test_Book_SaloonWith_PrmoCode_Rate_your_ride_Text_arePresent_263(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Rate your ride']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rate your ride");

		} else {
			System.out.println("Test:263, Rate your ride text are not present");
		}
	}
	
	@Test(priority = 264)
	@Parameters({ "CommonLocator", "Feedback" })
	public void Test_Book_SaloonWith_PrmoCode_Feedback_Field_arePresent_264(String CommonLocator, String Feedback) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_feedback"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Feedback);

	}

	@Test(priority = 265)
	@Parameters("CommonLocator")
	public void Test_Book_SaloonWith_PrmoCode_SubmitFeedback_ButtonAndText_265(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_submit_feedback"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Submit Feedback");
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:232, Submit Feedback text are not present");
		}
	}

}
