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

public class STC_And_FeedBack_Page_TestCases_218_232 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 218)
	@Parameters({ "Rider_AppPackage" })
	public void Test_STC_And_FeedBack_Page_CS_App_Push_CustomerApp_toBackground_and_start_RiderApp_218(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(2000);

	}

	@Test(priority = 219)
	@Parameters({ "AppPackage" })
	public void Test_STC_And_FeedBack_Page_ClickOnSTC_ride_219(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 220)
	@Parameters({ "AppPackage" })
	public void Test_STC_And_FeedBack_Page_ClickOn_Clear_ride_220(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 221)
	@Parameters({ "AppPackage" })
	public void Test_STC_And_FeedBack_Page_Push_Rider_toBackground_and_start_CustomerApp_221(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.launchApp();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 222)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_BackButton_is_present_222(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_back")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 223)
	@Parameters("CommonLocator_ClassView")
	public void Test_STC_And_FeedBack_Page_Rate_your_ride_Text_arePresent_223(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Rate your ride']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rate your ride");

		} else {
			System.out.println("Test:223, Rate your ride text are not present");
		}
	}

	@Test(priority = 224)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_Rate_Complete_ride_Text_arePresent_224(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Ride Complete");

		} else {
			System.out.println("Test:223, Ride Complete text are not present");
		}
	}

	@Test(priority = 225)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_Rate_your_ride_Text_arePresent_225(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_ride_driver")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 226)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_Driver_Imaget_arePresent_226(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_driver")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 227)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_DriverName_arePresent_227(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_driver_name")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 228)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_Driver_Rating_arePresent_228(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "rb_driver_rating")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 229)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_Share_App_Text_arePresent_229(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Recommend app to friends/family");

		} else {
			System.out.println("Test:229, Recommend app to friends/family text are not present");
		}
	}

	@Test(priority = 230)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_Share_App_Button_arePresent_230(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "snackbar_action"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "SHARE");
			L1.click();
			Thread.sleep(4000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			HelperMethods.waitForPageLoaded();

		} else {
			System.out.println("Test:230, Button and text are not present");
		}
	}

	@Test(priority = 231)
	@Parameters({ "CommonLocator", "Feedback" })
	public void Test_STC_And_FeedBack_Page_Feedback_Field_arePresent_231(String CommonLocator, String Feedback) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_feedback"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Feedback);

	}

	@Test(priority = 232)
	@Parameters("CommonLocator")
	public void Test_STC_And_FeedBack_Page_SubmitFeedback_ButtonAndText_232(String CommonLocator) {
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
