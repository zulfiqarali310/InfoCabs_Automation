package com.InfoCabs.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Schedule_Saloon_Ride_263_299 extends TestBase {
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


	@Test(priority = 263)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_ClickOn_ScheduleRide_Button_263(String CommonLocator, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.hideKeyboard();
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

	@Test(priority = 264)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Pick_Cale_Image_is_present_264(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_calender")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 265)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Pick_Time_Image_is_present_265(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 266)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_EnterDropofAddress_Cab_266(String CommonLocator, String DropoffAddress) {
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

	@Test(priority = 267)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_ClickOn_PickUp_Date_Button_267(String CommonLocator, String DropoffAddress)
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
			System.out.println("Test:267, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 268)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Pick_Cale_CurrentYear_is_present_268(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_date_picker_year")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 269)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Pick_Cale_CurrentDate_is_present_269(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_date_picker_day")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 270)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Cale_Cancel_Button_270(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 271)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_ClickOn_PickUp_Date_On2ndTime_Button_271(String CommonLocator)
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
			System.out.println("Test:267, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 272)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Cale_OK_Button_272(String CommonLocator) throws InterruptedException {
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
			System.out.println("Test:272, PickUp Date Calendar OK button are not functional, and date are not select");
		}

	}

	@Test(priority = 273)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Time_Cancel_Button_273(String CommonLocator, String DropoffAddress)
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
			System.out.println("Test:273, PickUp Date Time Calendar CANCEL button are not functional");
		}

	}

	@Test(priority = 274)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_PickUpDate_are_Selected_274(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_date")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 275)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_ClickOn_PickUp_Time_Button_275(String CommonLocator)
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
			System.out.println("Test:275, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 276)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_TimeDisplay_arePresent_276(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "mdtp_time_display")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 277)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_check_30minuts_AdvanceTime_277(String CommonLocator)
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

	@Test(priority = 278)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Time_Cancel_Button_278(String CommonLocator, String DropoffAddress)
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
			System.out.println("Test:278, PickUp Date Time CANCEL button are not functional");
		}

	}

	@Test(priority = 279)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_ClickOn_PickUp_Time_On2nd_Time_Button_279(String CommonLocator)
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
			System.out.println("Test:279, PickUp Date Calendar are not open");
		}

	}

	@Test(priority = 280)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Time_OK_Button_280(String CommonLocator) throws InterruptedException {
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
			System.out.println("Test:280, PickUp Date Time OK button are not functional, and date are not select");
		}

	}

	@Test(priority = 281)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_Time_areSelected_281(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 282)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_ClickOnBookNow_Button_Cab_282(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 283)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_Time_and_Date_areSelected_283(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_date_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 284)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_ClickOnBookConfirmButton_284(String CommonLocator, String DropoffAddress)
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
		Thread.sleep(4000);
		driver.hideKeyboard();

	}

	@Test(priority = 285)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_Schedule_Screen_image_Tick_Icon_285(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "img")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 286)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_check_Your_Ride_ScheduleText_286(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_time_hint"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Your ride has been scheduled for");
		} else {
			System.out.println("Test:286, Your ride has been scheduled for text are not present");
		}

	}

	@Test(priority = 287)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_Schedule_Screen_Time_are_Selected_287(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_time")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 288)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_check_View_Your_Text_288(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_hint_trips")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
		
		/*if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "View your scheduled rides at\r\n"
					+ "Menu > My Trips");
		} else {
			System.out.println("Test:286, View your scheduled rides at Menu > My Trips text are not present");
		}*/

	}

	@Test(priority = 289)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Done_Button_289(String CommonLocator) throws InterruptedException {
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
			System.out.println("Test:289, Done Button are Not Working");
		}

	}

	@Test(priority = 290)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Schedule_Saloon_Ride_ClickOn_SideMenu_Button_290(String CommonLocator, String DropoffAddress)
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
		Thread.sleep(4000);
		driver.hideKeyboard();

	}

	@Test(priority = 291)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Schedule_Saloon_Ride_ClickOn_SideMenu__MyTrips_Button_291(String CommonLocator,
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

	@Test(priority = 292)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_Schedule_Saloon_Ride_check_MyTrips_Text_292(String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='My Trips']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "My Trips");
		} else {
			System.out.println("Test:292, My Trips text are not present");
		}

	}

	@Test(priority = 293)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Done_Button_293(String CommonLocator_ClassView)
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
			System.out.println("Test:289, Upcoming Text are not avalible");
		}

	}

	@Test(priority = 294)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_UpComingRide_PickUp_Icon_294(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_pick")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 295)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_UpComingRide_DropOff_Icon_295(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_dest")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 296)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_UpComingRide_PickUp_Address_296(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripStart")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 297)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_UpComingRide_Dropoff_Address_297(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripEnd")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 298)
	@Parameters("CommonLocator")
	public void Test_Schedule_Saloon_Ride_Check_UpComingRide_PickUp_Time_298(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tvTripTime")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 299)
	@Parameters({ "CommonLocator" })
	public void Test_Schedule_Saloon_Ride_ClickOn_Cancel_Button_299(String CommonLocator) throws InterruptedException {
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
			//((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
			//driver.navigate().back();
			driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			HelperMethods.waitForPageLoaded();
			driver.hideKeyboard();
			
		} else { 
			System.out.println("Test:299, CANCEL Button are Not Working");
		}

	}

	

}
