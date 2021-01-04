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
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Schedule_6_Seater_Cab_TestCases_401_439 extends TestBase {

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
	@Test(priority = 401)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_ScheduleRide_Button_401(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L5 = driver.findElement(By.id(CommonLocator + "tv_schedule"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_schedule")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L5.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 402)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Pick_Cale_Image_is_present_403(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_calender")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 403)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Pick_Time_Image_is_present_403(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 404)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_EnterDropofAddress_Cab_404(String CommonLocator, String DropoffAddress) {
		HelperMethods.waitForPageLoaded();
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
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

	@Test(priority = 405)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_PickUp_Date_Button_405(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_date"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Pickup Date");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_date")));
			L1.click();
		} else {
			System.out.println("Test:405, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 406)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Pick_Cale_CurrentYear_is_present_406(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_date_picker_year")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 407)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Pick_Cale_CurrentDate_is_present_407(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_date_picker_day")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 408)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_Cale_Cancel_Button_408(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "mdtp_cancel"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "CANCEL");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "mdtp_cancel")));
			L1.click();
		} else {
			System.out.println("Test:267, PickUp Date Calendar CANCEL button are not functional");
		}

	}

	@Test(priority = 409)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_PickUp_Date_On2ndTime_Button_409(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_date"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Pickup Date");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_date")));
			L1.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Test:409, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 410)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_Cale_OK_Button_410(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "mdtp_ok"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "OK");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "mdtp_ok")));
			L1.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Test:410, PickUp Date Calendar OK button are not functional, and date are not select");
		}

	}

	@Test(priority = 411)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_Time_Cancel_Button_411(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "mdtp_cancel"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "CANCEL");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "mdtp_cancel")));
			L1.click();
		} else {
			System.out.println("Test:411, PickUp Date Time Calendar CANCEL button are not functional");
		}

	}

	@Test(priority = 412)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_PickUpDate_are_Selected_412(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_date")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 413)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_PickUp_Time_Button_413(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_time"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Pickup Time");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_time")));
			L1.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Test:413, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 414)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_TimeDisplay_arePresent_414(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_time_display")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 415)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_check_30minuts_AdvanceTime_415(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "mdtp_time_picker_header"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "SELECT 30+ MINUTES LATER FROM NOW");
		} else {
			System.out.println("Test:277, SELECT 30+ MINUTES LATER FROM NOW text are not present");
		}

	}

	@Test(priority = 416)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_Time_Cancel_Button_416(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "mdtp_cancel"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "CANCEL");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "mdtp_cancel")));
			L1.click();
		} else {
			System.out.println("Test:416, PickUp Date Time CANCEL button are not functional");
		}

	}

	@Test(priority = 417)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_PickUp_Time_On2nd_Time_Button_417(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_time"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Pickup Time");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_time")));
			L1.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Test:417, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 418)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_Time_OK_Button_418(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "mdtp_ok"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "OK");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "mdtp_ok")));
			L1.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Test:419, PickUp Date Time OK button are not functional, and date are not select");
		}

	}

	@Test(priority = 419)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_Time_areSelected_419(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 420)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_SwipeTo_6Seater_420(String CommonLocator_ClassView, String DropoffAddress)
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

	@Test(priority = 421)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_6_Seater_Text_arePresent_421(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "6 Seater");
			System.out.println("6 Seater Car is Availble you can book it");

		} else {
			System.out.println("Test:421, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 422)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_ClickOnBookNow_Button_Cab_422(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 423)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_Time_and_Date_areSelected_423(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_date_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 424)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_ClickOnBookConfirmButton_424(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 425)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_Schedule_Screen_image_Tick_Icon_425(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "img")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 426)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_check_Your_Ride_ScheduleText_426(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_time_hint"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Your ride has been scheduled for");
		} else {
			System.out.println("Test:426, Your ride has been scheduled for text are not present");
		}

	}

	@Test(priority = 427)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_Schedule_Screen_Time_are_Selected_427(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 428)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_check_View_Your_Text_428(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_hint_trips")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);

		/*
		 * if (L1.isDisplayed()) { String Get_text1 = L1.getText();
		 * Assert.assertEquals(Get_text1, "View your scheduled rides at\r\n" +
		 * "Menu > My Trips"); } else { System.out.
		 * println("Test:286, View your scheduled rides at Menu > My Trips text are not present"
		 * ); }
		 */

	}

	@Test(priority = 429)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_Done_Button_429(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btnLaterDone"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Done");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btnLaterDone")));
			L1.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Test:429, Done Button are Not Working");
		}

	}

	@Test(priority = 430)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_SideMenu_Button_430(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 431)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_SideMenu__MyTrips_Button_431(String CommonLocator,
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

	@Test(priority = 432)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_Schedule_6_Seater_Cab_check_MyTrips_Text_432(String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='My Trips']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "My Trips");
		} else {
			System.out.println("Test:432, My Trips text are not present");
		}

	}

	@Test(priority = 433)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Done_Button_433(String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Upcoming']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Upcoming");
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//" + CommonLocator_ClassView + "[@text='Upcoming']")));
			L1.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Test:433, Upcoming Text are not avalible");
		}

	}

	@Test(priority = 434)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_UpComingRide_PickUp_Icon_434(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_pick")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 435)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_UpComingRide_DropOff_Icon_435(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_dest")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 436)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_UpComingRide_PickUp_Address_436(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripStart")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 437)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_UpComingRide_Dropoff_Address_437(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripEnd")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 438)
	@Parameters("CommonLocator")
	public void Test_Schedule_6_Seater_Cab_Check_UpComingRide_PickUp_Time_438(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripTime")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 439)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_Cancel_Button_439(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btnCancel"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "CANCEL");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btnCancel")));
			L1.click();
			Thread.sleep(3000);
			((AndroidDriver) driver).findElement(By.id("android:id/button1")).click();
			Thread.sleep(4000);
			// ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
			// driver.navigate().back();
			driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			HelperMethods.waitForPageLoaded();

		} else {
			System.out.println("Test:439, CANCEL Button are Not Working");
		}

	}


}
