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

public class BookingAcceptedPage_On_CS_App_158_180 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 158)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_weHave_Sent_Text_arePresent_158(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			HelperMethods.waitForPageLoaded();
			driver.hideKeyboard();
			Assert.assertEquals(Get_text1, "We have sent you a cab.");

		} else {
			System.out.println("Test:157, We have sent you a cab text are not present");
		}
	}

	@Test(priority = 159)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_RiderImage_is_present_159(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_car")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 160)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_RiderName_is_present_160(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_driver_name")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 161)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_RiderRating_is_present_161(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "rb_driver_rating")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 162)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_Car_name_is_present_162(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "car_name")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 163)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_Car_numberplate_is_present_163(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_plate_num")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 164)
	@Parameters("CommonLocator_ClassView")
	public void Test_BookingAcceptedPage_On_CS_App_Distance_Text_arePresent_164(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Distance']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Distance");

		} else {
			System.out.println("Test:164, Distance text are not present");
		}
	}

	@Test(priority = 165)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_DitanceinNumber_is_present_165(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_distance")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 166)
	@Parameters("CommonLocator_ClassView")
	public void Test_BookingAcceptedPage_On_CS_App_Price_Text_arePresent_166(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Price']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Price");

		} else {
			System.out.println("Test:163, Price text are not present");
		}
	}

	@Test(priority = 167)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_PriceNumber_is_present_167(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_price")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 168)
	@Parameters("CommonLocator_ClassView")
	public void Test_BookingAcceptedPage_On_CS_App_ETA_Text_arePresent_168(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='ETA']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "ETA");

		} else {
			System.out.println("Test:168, ETA text are not present");
		}
	}

	@Test(priority = 169)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_ETA_Number_is_present_169(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_eta")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 170)
	@Parameters("CommonLocator_ClassView")
	public void Test_BookingAcceptedPage_On_CS_App_Payment_Text_arePresent_170(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Payment']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Payment");

		} else {
			System.out.println("Test:170, Payment text are not present");
		}
	}

	@Test(priority = 171)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_Paymentmethod_is_present_171(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_payment")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 172)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_ClikOn_CallRide_Button_and_Text_arePresent_172(
			String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_call_driver"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Call Driver");
			L1.click();

		} else {
			System.out.println("Test:172, We have sent you a cab text are not present");
		}
	}

	@Test(priority = 173)
	@Parameters({ "CommonLocator", "AppPackage" })
	public void Test_BookingAcceptedPage_On_CS_App_Backto_CSApp_from_PhoneDialpad_173(String CommonLocator,
			String AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
	}

	@Test(priority = 174)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_ClikOn_Cancel_Button_and_Text_arePresent_174(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_cancel_ride"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Cancel ride");
			L1.click();

		} else {
			System.out.println("Test:174, Cancel ride text are not present");
		}
	}

	@Test(priority = 175)
	@Parameters({ "Rider_AppPackage" })
	public void Test_BookingAcceptedPage_On_CS_App_Push_CustomerApp_toBackground_and_start_RiderApp_175(
			String Rider_AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();
		Thread.sleep(6000);

	}

	@Test(priority = 176)
	@Parameters({ "AppPackage" })
	public void Test_BookingAcceptedPage_On_CS_App_Push_Rider_toBackground_and_start_CustomerApp_176(String AppPackage)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		// driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		Thread.sleep(2000);
		System.out.println("Customer App are open again to perform action on accepted job screen");

	}

	@Test(priority = 177)
	@Parameters("CommonLocator")
	public void Test_BookingAcceptedPage_On_CS_App_Alert_cancel_Text_arePresent_177(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_text"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(CommonLocator + "tv_text")));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Your ride was cancelled.");
		} else {
			System.out.println("Your ride was cancelled. ride text are not present");
		}

		WebElement L2 = driver.findElement(By.id(CommonLocator + "tv_accept"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(CommonLocator + "tv_accept")));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1,
					"The operator probably couldn’t find an available vehicle or something came up.");
		} else {
			System.out.println(
					"The operator probably couldn’t find an available vehicle or something came up. ride text are not present");
		}
		WebElement L3 = driver.findElement(By.id(CommonLocator + "close"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(CommonLocator + "close")));
		if (L3.isDisplayed()) {
			L3.click();

		} else {
			System.out.println("close button may not be avalible");
		}
	}

}
