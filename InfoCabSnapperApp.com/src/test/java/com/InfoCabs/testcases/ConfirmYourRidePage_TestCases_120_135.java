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

public class ConfirmYourRidePage_TestCases_120_135 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 120)
	@Parameters({ "CommonLocator" })
	public void Test_ConfirmYourRidePage_Confirmride_Text_120(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.hideKeyboard();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Confirm your ride");

		} else {
			System.out.println("Test:120, Confirm your ride Screen have some issue");
		}
	}

	@Test(priority = 121)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_Notification_Icon_121(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_notif")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 122)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_Pickup_Icon_122(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_pick")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 123)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_Dropoff_Icon_123(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_drop")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 124)
	@Parameters({ "CommonLocator", "PickUpAddress" })
	public void Test_ConfirmYourRidePage_PickUpAddress_Verification_Text_124(String CommonLocator,
			String PickUpAddress) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_pick"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, PickUpAddress);

		} else {
			System.out.println("Test:124, Pick Up Address are not equal");
		}
	}

	@Test(priority = 125)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_ConfirmYourRidePage_DropoffAddress_Verification_Text_125(String CommonLocator,
			String DropoffAddress) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_destination"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, DropoffAddress);

		} else {
			System.out.println("Test:125, Dropoff Address are not equal");
		}
	}

	@Test(priority = 126)
	@Parameters({ "CommonLocator" })
	public void Test_ConfirmYourRidePage_AddNotes_Text_Verification_126(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_notes"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add a note for the driver");

		} else {
			System.out.println("Test:126, Add Notes are text verification");
		}
	}

	@Test(priority = 127)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_CarImage_arePresent_127(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_car")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 127)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_SaloonCar_Text_arePresent_127(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Saloon");

		} else {
			System.out.println("Test:127, Saloon text are not present");
		}
	}

	@Test(priority = 128)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_EstimatedFares_Text_arePresent_128(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_hint"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Estimated fare");

		} else {
			System.out.println("Test:128, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 129)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_FaresValue_inNumbers_129(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean Icon = driver.findElement(By.id(CommonLocator + "tv_price")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 130)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_AddPromocode_Text_arePresent_130(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_promo"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add Promo Code");

		} else {
			System.out.println("Test:130, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 131)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_Paymentmethod_icon_arePresent_131(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_pay")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 132)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_Cash_Text_arePresent_132(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_cash"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Cash");

		} else {
			System.out.println("Test:132, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 133)
	@Parameters("CommonLocator")
	public void Test_ConfirmYourRidePage_LetsGo_Button_Text_arePresent_133(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm_book"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Let's Go!");

		} else {
			System.out.println("Test:133, Choose a vehicle Screen Lets Go Button have some issue");
		}
	}

	@Test(priority = 134)
	@Parameters({ "CommonLocator", "DriverNote" })
	public void Test_ConfirmYourRidePage_AddNote_toTheDriver_134(String CommonLocator, String DriverNote) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_notes"));

		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add a note for the driver");
			L1.click();
			HelperMethods.waitForPageLoaded();
			driver.hideKeyboard();
			L1.sendKeys(DriverNote);

		} else {
			System.out.println("Test:134, Note Can not be added to the driver");
		}
	}

	@Test(priority = 135)
	@Parameters({ "CommonLocator" })
	public void Test_MConfirmYourRidePage_ClickOn_LetsGo_Button_135(String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm_book"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		Thread.sleep(10000);
	}


}
