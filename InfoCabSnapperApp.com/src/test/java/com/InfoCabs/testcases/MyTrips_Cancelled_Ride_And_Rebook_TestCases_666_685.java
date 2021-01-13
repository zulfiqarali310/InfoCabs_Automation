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

public class MyTrips_Cancelled_Ride_And_Rebook_TestCases_666_685 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	/*@Test(priority = 21)
	@Parameters({ "PhoneNum", "Pwd", "CommonLocator" })
	public void Test_LoginPage_Allow_user_to_LoginWith_valid_credential_21(String PhoneNum, String Pwd,
			String CommonLocator) throws InterruptedException {

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

	@Test(priority = 666)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_EnterDropofAddress_Cab_666(String CommonLocator,
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

	@Test(priority = 667)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_ClickOnBookNow_Button_Cab_667(String CommonLocator,
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

	@Test(priority = 668)
	@Parameters({ "CommonLocator", "CommonLocator_Class_Relative_View" })
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Select_CeditCard_FromDrop_668(String CommonLocator,
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

	@Test(priority = 669)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_ClickOnBookConfirmButton_669(String CommonLocator,
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

	@Test(priority = 670)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_CancleRide_Button_Text_arePresent_670(String CommonLocator)
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
			System.out.println("Test:670, Hang on text are not present");
		}
	}

	@Test(priority = 671)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_MyTrips_Cancelled_Rides_ClickOn_SideMenu_Button_671(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L5 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L5.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 672)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_ClickOn_SideMenu__MyTrips_Button_672(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='My Trips']"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='My Trips']")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L2.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 673)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_check_MyTrips_Text_673(String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='My Trips']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "My Trips");
		} else {
			System.out.println("Test:673, My Trips text are not present");
		}

	}

	@Test(priority = 674)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Check_for_PastRide_text_674(String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Past']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Past");
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//" + CommonLocator_ClassView + "[@text='Past']")));
			L1.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Test:674, Past Text are not avalible");
		}

	}

	@Test(priority = 675)
	@Parameters("CommonLocator_Class_Relative_View")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Check_for_index1_CancelRide_Option_675(
			String CommonLocator_Class_Relative_View) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.xpath("//" + CommonLocator_Class_Relative_View + "[@index='0']"))
				.isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 676)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_CheckPickoff_Address_676(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripStart")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 677)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_CheckDropOff_Address_677(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripEnd")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 678)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Date_and_Time_678(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripTime")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 679)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Check_for_Cancelled_Text_and_Button_679(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvTripPrice"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Cancelled");
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tvTripPrice")));
			L1.click();

		} else {
			System.out.println("Test:679, Cancelled text are not present");
		}
	}

	@Test(priority = 680)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_check_for_BackButton_680(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_back")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 681)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Check_for_TripDetails_Text_681(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_heading"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Trip Details");

		} else {
			System.out.println("Test:681, Trip Details text are not present");
		}
	}

	@Test(priority = 682)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Check_for_Your_Ride_was_cancelled_Text_682(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_ride_driver"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Your ride was cancelled");

		} else {
			System.out.println("Test:682, Your ride was cancelled text are not present");
		}
	}

	@Test(priority = 683)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Check_for_StartingAddress_Text_683(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripStart")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 684)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Check_for_EndAddress_Text_684(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripEnd")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 685)
	@Parameters("CommonLocator")
	public void Test_MyTrips_Cancelled_Ride_And_Rebook_Check_for_Rebook_Text_and_Button_685(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btnRebook"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Rebook");
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btnRebook")));
			L1.click();

		} else {
			System.out.println("Test:685, Rebook text are not present");
		}
	}

}
