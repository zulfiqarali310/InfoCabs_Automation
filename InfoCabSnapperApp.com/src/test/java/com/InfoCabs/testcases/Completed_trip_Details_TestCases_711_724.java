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

public class Completed_trip_Details_TestCases_711_724 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 711)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_BackArrow_711(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_back")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 712)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_Trip_Details_Text_712(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_heading"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Trip Details");
		} else {
			System.out.println("Test:712, Trip Details text are not present");
		}
	}

	@Test(priority = 713)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_Your_Ride_with_Driver_713(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_ride_driver")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 714)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_Start_Address_714(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripStart")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 715)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_End_Address_715(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripEnd")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 716)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_DriverName_716(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "txtDriverName")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 717)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_CarNumber_717(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_car")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 718)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_CarRating_718(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "ratingBar")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 719)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_TV_Help_Text_719(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_help"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "I need help with this ride");
		} else {
			System.out.println("Test:719, I need help with this ride text are not present");
		}
	}

	@Test(priority = 720)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_ReBookButton_ButtonAndText_720(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btnRebook"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rebook");
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btnRebook")));
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:720, Rebook text are not present");
		}
	}

	@Test(priority = 721)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Completed_trip_Details_ClickOnBookNow_Button_Cab_721(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 722)
	@Parameters({ "CommonLocator", "CommonLocator_Class_Relative_View" })
	public void TestCompleted_trip_Details_Select_CeditCard_FromDrop_722(String CommonLocator,
			String CommonLocator_Class_Relative_View) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "sv_payments"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "sv_payments")));
		Thread.sleep(3000);
		L1.click();
		Thread.sleep(2000);

		WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_Class_Relative_View + "[@index='0']"));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//" + CommonLocator_Class_Relative_View + "[@index='0']")));
		L2.click();

	}

	@Test(priority = 723)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Completed_trip_Details_ClickOnBookConfirmButton_723(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 724)
	@Parameters("CommonLocator")
	public void Test_Completed_trip_Details_CancleRide_Button_Text_arePresent_724(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_cancel_ride"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Cancel Ride");
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_cancel_ride")));
			L1.click();

		} else {
			System.out.println("Test:724, Hang on text are not present");
		}
	}

}
