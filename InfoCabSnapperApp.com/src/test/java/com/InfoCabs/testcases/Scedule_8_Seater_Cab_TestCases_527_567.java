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

public class Scedule_8_Seater_Cab_TestCases_527_567 extends TestBase {

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

	@Test(priority = 526)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_ScheduleRide_Button_526(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L1.click();
		WebElement L5 = driver.findElement(By.id(CommonLocator + "tv_schedule"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_schedule")));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		L5.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 527)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Pick_Cale_Image_is_present_527(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_calender")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 528)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Pick_Time_Image_is_present_528(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 529)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_8_Seater_Cab_EnterDropofAddress_Cab_529(String CommonLocator, String DropoffAddress) {
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

	@Test(priority = 530)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_PickUp_Date_Button_530(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 531)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Pick_Cale_CurrentYear_is_present_531(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_date_picker_year")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 532)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Pick_Cale_CurrentDate_is_present_532(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_date_picker_day")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 533)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_Cale_Cancel_Button_533(String CommonLocator, String DropoffAddress)
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
			System.out.println("Test:533, PickUp Date Calendar CANCEL button are not functional");
		}

	}

	@Test(priority = 534)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_PickUp_Date_On2ndTime_Button_534(String CommonLocator)
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
			System.out.println("Test:534, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 535)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_Cale_OK_Button_535(String CommonLocator)
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
			System.out.println("Test:535, PickUp Date Calendar OK button are not functional, and date are not select");
		}

	}

	@Test(priority = 536)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_Time_Cancel_Button_536(String CommonLocator, String DropoffAddress)
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
			System.out.println("Test:536, PickUp Date Time Calendar CANCEL button are not functional");
		}

	}

	@Test(priority = 537)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_PickUpDate_are_Selected_537(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_date")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 538)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_PickUp_Time_Button_538(String CommonLocator)
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
			System.out.println("Test:538, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 539)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_TimeDisplay_arePresent_539(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_time_display")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 540)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_check_30minuts_AdvanceTime_540(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "mdtp_time_picker_header"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "SELECT 30+ MINUTES LATER FROM NOW");
		} else {
			System.out.println("Test:540, SELECT 30+ MINUTES LATER FROM NOW text are not present");
		}

	}

	@Test(priority = 541)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_Time_Cancel_Button_541(String CommonLocator, String DropoffAddress)
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
			System.out.println("Test:541, PickUp Date Time CANCEL button are not functional");
		}

	}

	@Test(priority = 542)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_PickUp_Time_On2nd_Time_Button_542(String CommonLocator)
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
			System.out.println("Test:542, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 543)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_Time_OK_Button_543(String CommonLocator)
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
			System.out.println("Test:543, PickUp Date Time OK button are not functional, and date are not select");
		}

	}

	@Test(priority = 544)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_Time_areSelected_544(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 545)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Book_8_Seater_with_CreaditCards_Moveto_6Seater_545(String CommonLocator_ClassView,
			String DropoffAddress) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		Thread.sleep(4000);
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

	@Test(priority = 546)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Book_8_Seater_with_CreaditCards_Moveto_8_Seater_546(String CommonLocator_ClassView,
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

	@Test(priority = 547)
	@Parameters("CommonLocator")
	public void Test_Book_8_Seater_with_CreaditCards_8_Seater_Text_arePresent_547(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "8 Seater");
			System.out.println("8 Seater Car is Availble you can book it");

		} else {
			System.out.println("Test:547, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 548)
	@Parameters({ "CommonLocator" })
	public void Test_Book_8_Seater_with_CreaditCards_ClickOnBookNow_Button_Cab_548(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		System.out.println(driver.findElements(By.id(CommonLocator + "btn_book_now")).size());
		Thread.sleep(2000);
		// wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator +
		// "btn_book_now")));
		driver.findElements(By.id(CommonLocator + "btn_book_now")).get(1).click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 549)
	@Parameters({ "CommonLocator", "CommonLocator_Class_Relative_View" })
	public void Test_Book_8_Seater_with_CreaditCards_Select_Cash_FromDrop_549(String CommonLocator,
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


	@Test(priority = 551)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_Time_and_Date_areSelected_551(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_date_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 552)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_8_Seater_Cab_ClickOnBookConfirmButton_552(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 553)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_Schedule_Screen_image_Tick_Icon_553(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "img")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 554)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_check_Your_Ride_ScheduleText_554(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_time_hint"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Your ride has been scheduled for");
		} else {
			System.out.println("Test:554, Your ride has been scheduled for text are not present");
		}

	}

	@Test(priority = 555)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_Schedule_Screen_Time_are_Selected_555(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 556)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_check_View_Your_Text_556(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_hint_trips")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);

	}

	@Test(priority = 557)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_Done_Button_557(String CommonLocator) throws InterruptedException {
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
			System.out.println("Test:558, Done Button are Not Working");
		}

	}

	@Test(priority = 558)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_SideMenu_Button_558(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 559)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_SideMenu__MyTrips_Button_559(String CommonLocator,
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

	@Test(priority = 560)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_Schedule_8_Seater_Cab_check_MyTrips_Text_560(String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='My Trips']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "My Trips");
		} else {
			System.out.println("Test:560, My Trips text are not present");
		}

	}

	@Test(priority = 561)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_Schedule_8_Seater_Cab_ClickOn_Done_Button_561(String CommonLocator_ClassView)
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
			System.out.println("Test:561, Upcoming Text are not avalible");
		}

	}

	@Test(priority = 562)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_UpComingRide_PickUp_Icon_562(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_pick")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 563)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_UpComingRide_DropOff_Icon_563(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_dest")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 564)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_UpComingRide_PickUp_Address_564(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripStart")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 565)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_UpComingRide_Dropoff_Address_565(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripEnd")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 566)
	@Parameters("CommonLocator")
	public void Test_Schedule_8_Seater_Cab_Check_UpComingRide_PickUp_Time_566(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripTime")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 567)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_6_Seater_Cab_ClickOn_Cancel_Button_567(String CommonLocator) throws InterruptedException {
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
			System.out.println("Test:567, CANCEL Button are Not Working");
		}

	}

}
