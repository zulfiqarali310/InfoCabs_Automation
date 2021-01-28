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

public class BookingVehiclePage_TestCases_136_147 extends TestBase{
	
	HelperMethods HelpMethod = new HelperMethods();


	@Test(priority = 136)
	@Parameters("CommonLocator")
	public void Test_BookingVehiclePage_HangOns_Text_arePresent_136(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Hang on!");

		} else {
			System.out.println("Test:136, Hang on text are not present");
		}
	}

	@Test(priority = 137)
	@Parameters("CommonLocator_ClassView")
	public void Test_BookingVehiclePage_We_areSendingCab_Text_arePresent_137(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver
				.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='We are sending you a cab…']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "We are sending you a cab…");

		} else {
			System.out.println("Test:137, We are sending you a cab text are not present");
		}
	}

	@Test(priority = 138)
	@Parameters("CommonLocator")
	public void Test_BookingVehiclePage_CancleRide_Button_Text_arePresent_138(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_cancel_ride"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Cancel Ride");
			Thread.sleep(1000);
			L1.click();
			Thread.sleep(4000);
			driver.hideKeyboard();

		} else {
			System.out.println("Test:136, Hang on text are not present");
		}
	}
	


	@Test(priority = 139)
	@Parameters({ "CommonLocator", "DropoffAddress", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_CancleRide_afterwaiting_60Sec_139(String CommonLocator, String DropoffAddress,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
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
	
	@Test(priority = 140)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_BookingVehiclePage_ClickOnBookNow_Button_Cab_140(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L5 = driver.findElement(By.id(CommonLocator + "btn_book_now"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_book_now")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L5.click();

	}

	@Test(priority = 141)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_BookingVehiclePage_ClickOnBookConfirmButton_141(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 142)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_waitfor_OneMinute__1stime_Text_arePresent_142(String CommonLocator,
			String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonLocator + "container_queue")));
		System.out.println("Wait are done1");
	}

	@Test(priority = 143)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_Youare_at_Number_Text_arePresent_143(String CommonLocator,
			String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver
				.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='You are at number ']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You are at number ");

		} else {
			System.out.println("Test:143,  text are not present");
		}
	}

	@Test(priority = 144)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_One_Number_Text_arePresent_144(String CommonLocator,
			String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_queue_number"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "1");

		} else {
			System.out.println("Test:144,  text are not present");
		}
	}

	@Test(priority = 145)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_in_Queue_Text_arePresent_145(String CommonLocator,
			String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver
				.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text=' in queue']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, " in queue");

		} else {
			System.out.println("Test:145,  text are not present");
		}
	}

	@Test(priority = 146)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_Pleasewait_Text_arePresent_146(String CommonLocator,
			String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver
				.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Please wait while we assign you a cab']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Please wait while we assign you a cab");

		} else {
			System.out.println("Test:146,  text are not present");
		}
	}

	@Test(priority = 147)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_iLL_Wait_Text_arePresent_147(String CommonLocator,
			String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "ignore_queue"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "I'll wait");
			HelperMethods.waitForElementToBeClickable(L1);
			L1.click();

		} else {
			System.out.println("Test:147,  text are not present");
		}
	}

	@Test(priority = 148)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_waitfor_OneMinute_Text_arePresent_148(String CommonLocator,
			String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CommonLocator + "container_queue")));
		System.out.println("Wait are done1");
	}

	@Test(priority = 149)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_BookingVehiclePage_CancleRide_Button_And_Text_arePresent_149(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "cancel_queue"));
		HelperMethods.waitForPageLoaded();
		if (L1.isDisplayed()) {
			String Get_text6 = L1.getText();
			Assert.assertEquals(Get_text6, "Cancel Ride");
			HelperMethods.waitForElementToBeClickable(L1);
			L1.click();
			Thread.sleep(4000);
			driver.hideKeyboard();

		} else {
			System.out.println("Test:149, cancle ride button are not present");
		}
	}

}
