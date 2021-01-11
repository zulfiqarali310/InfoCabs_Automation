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

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class POB_Page_TestCases_181_217 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 181)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_POB_Page_EnterDropofAddress_Cab_181(String CommonLocator, String DropoffAddress) {
		HelperMethods.waitForPageLoaded();
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

	@Test(priority = 182)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_POB_Page_ClickOnBookNow_Button_Cab_182(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 183)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_POB_Page_ClickOnBookConfirmButton_183(String CommonLocator, String DropoffAddress)
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

	@Test(priority = 184)
	@Parameters({ "Rider_AppPackage" })
	public void Test_POB_Page_Push_CustomerApp_toBackground_and_start_RiderApp_184(String Rider_AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.runAppInBackground(Duration.ZERO);
		HelperMethods.waitForPageLoaded();
		driver.activateApp(Rider_AppPackage);
		System.out.println("Rider app are open again");
		HelperMethods.waitForPageLoaded();

	}

	/*@Test(priority = 185)
	@Parameters({ "Rider_AppPackage" })
	public void Test_POB_Page_Refresh_RiderApp_185(String Rider_AppPackage) throws InterruptedException {
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

	}*/

	@Test(priority = 186)
	@Parameters({ "AppPackage" })
	public void Test_POB_Page_AcceptCustomer_ride_188(String AppPackage) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_accept"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_accept")));
		Thread.sleep(4000);
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 187)
	@Parameters({ "AppPackage" })
	public void Test_POB_Page_ClickOnWait_ride_187(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 188)
	@Parameters({ "AppPackage" })
	public void Test_POB_Page_ClickOnPOB_Button_ride_188(String AppPackage) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L7 = driver.findElement(By.id("com.infosun.infocabs:id/button_jobUpdate"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.infosun.infocabs:id/button_jobUpdate")));
		L7.click();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 189)
	@Parameters({ "AppPackage" })
	public void Test_POB_Page_Push_Rider_toBackground_and_start_CustomerApp_189(String AppPackage)
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

	@Test(priority = 190)
	@Parameters("CommonLocator")
	public void Test_POB_Page_You_arein_yourway_Text_arePresent_190(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_head"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "You are on your way.");

		} else {
			System.out.println("Test:190, You are on your way. text are not present");
		}
	}

	@Test(priority = 191)
	@Parameters("CommonLocator")
	public void Test_POB_Page_RiderImage_is_present_191(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_driver")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 192)
	@Parameters("CommonLocator")
	public void Test_POB_Page_RiderName_is_present_192(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_driver_name")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 193)
	@Parameters("CommonLocator")
	public void Test_POB_Page_RiderRating_is_present_193(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "rb_driver_rating")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 194)
	@Parameters("CommonLocator")
	public void Test_POB_Page_Car_name_is_present_194(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "car_name")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 195)
	@Parameters("CommonLocator")
	public void Test_POB_Page_Car_numberplate_is_present_195(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_plate_num")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 196)
	@Parameters("CommonLocator_ClassView")
	public void Test_POB_Page_car_name_Distance_Text_arePresent_196(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Distance']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Distance");

		} else {
			System.out.println("Test:196, Distance text are not present");
		}
	}

	@Test(priority = 197)
	@Parameters("CommonLocator")
	public void Test_POB_Page_car_name_DitanceinNumber_is_present_197(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_distance")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 198)
	@Parameters("CommonLocator_ClassView")
	public void Test_POB_Page_car_name_Price_Text_arePresent_198(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Price']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Price");

		} else {
			System.out.println("Test:198, Price text are not present");
		}
	}

	@Test(priority = 199)
	@Parameters("CommonLocator")
	public void Test_POB_Page_car_name_PriceNumber_is_present_199(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_price")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 200)
	@Parameters("CommonLocator_ClassView")
	public void Test_POB_Page_car_name_ETA_Text_arePresent_200(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='ETA']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "ETA");

		} else {
			System.out.println("Test:200, ETA text are not present");
		}
	}

	@Test(priority = 201)
	@Parameters("CommonLocator")
	public void Test_POB_Page_car_name_ETA_Number_is_present_201(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_eta")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 202)
	@Parameters("CommonLocator_ClassView")
	public void Test_POB_Page_car_name_Payment_Text_arePresent_202(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Payment']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Payment");

		} else {
			System.out.println("Test:202, Payment text are not present");
		}
	}

	@Test(priority = 203)
	@Parameters("CommonLocator")
	public void Test_POB_Page_On_CS_App_Paymentmethod_is_present_203(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "tv_payment")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 204)
	@Parameters("CommonLocator")
	public void Test_POB_Page_On_CS_App_ClikOn_ShareRide_Button_and_Text_arePresent_204(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_call_driver"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Share ride");
			L1.click();
			HelperMethods.waitForPageLoaded();
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			HelperMethods.waitForPageLoaded();

		} else {
			System.out.println("Test:204, Share ride button are not avalible");
		}
	}

	@Test(priority = 205)
	@Parameters("CommonLocator")
	public void Test_POB_Page_On_CS_App_ClikOn_I_Needto_MakeaCall_Button_and_Text_arePresent_205(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_cancel_ride"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "I need to make a call");
			L1.click();
			HelperMethods.waitForPageLoaded();
			Thread.sleep(3000);

		} else {
			System.out.println("Test:206, I need to make a call ride button are not avalible");
		}
	}

	@Test(priority = 206)
	@Parameters("CommonLocator")
	public void Test_POB_Page_On_CS_App_I_Needto_MakeaCall_Alert_and_button_areWorking_206(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_close"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "iv_close")));
		L1.click();
		Thread.sleep(2000);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "tv_cancel_ride"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_cancel_ride")));
		L2.click();

	}

	@Test(priority = 207)
	@Parameters("CommonLocator")
	public void Test_POB_Page_car_name_I_Needtomake_aCall_Text_arePresent_207(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "I need to make a call");

		} else {
			System.out.println("Test:208, I need to make a call text are not present");
		}
	}

	@Test(priority = 208)
	@Parameters("CommonLocator")
	public void Test_POB_Page_On_CS_App_ContactOperator_Icon_is_present_208(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "img_operator")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 209)
	@Parameters("CommonLocator")
	public void Test_POB_Page_car_name_Contact_Operator_Text_arePresent_209(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_driver_title"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Contact Operator");

		} else {
			System.out.println("Test:209, Contact Operator text are not present");
		}
	}

	@Test(priority = 210)
	@Parameters("CommonLocator_ClassView")
	public void Test_POB_Page_car_name_Contact_Operator_2nd_Text_arePresent_210(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Contact Operator']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Contact Operator");

		} else {
			System.out.println("Test:210, Contact Operator 2nd text are not present");
		}
	}

	@Test(priority = 211)
	@Parameters("CommonLocator")
	public void Test_POB_Page_On_CS_App_EmergencyContact_Icon_is_present_211(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "img_alert")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 212)
	@Parameters("CommonLocator")
	public void Test_POB_Page_car_name_Emergency_Text_arePresent_212(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_alert"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Emergency");

		} else {
			System.out.println("Test:212, Emergency text are not present");
		}
	}

	@Test(priority = 213)
	@Parameters("CommonLocator_ClassView")
	public void Test_POB_Page_car_name_Contact_Text_arePresent_213(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Contact']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Contact");

		} else {
			System.out.println("Test:213, Contact text are not present");
		}
	}

	@Test(priority = 214)
	@Parameters("CommonLocator")
	public void Test_POB_Page_ClickOn_Contact_Operator__214(String CommonLocator) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "container_driver_contact"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "container_driver_contact")));
		L1.click();
		Thread.sleep(3000);

	}

	@Test(priority = 215)
	@Parameters({ "CommonLocator", "AppPackage" })
	public void Test_POB_Page_On_CS_App_Backto_CSApp_from_PhoneDialpad_215(String CommonLocator, String AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
	}

	@Test(priority = 216)
	@Parameters("CommonLocator")
	public void Test_POB_Page_On_CS_App_Now_Try_Emergency_Contact_OpenAlert_Again_216(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_cancel_ride"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_cancel_ride")));
		L1.click();
		Thread.sleep(4000);

	}

	@Test(priority = 217)
	@Parameters("CommonLocator")
	public void Test_POB_Page_On_CS_App_Now_Try_Emergency_Contact_217(String CommonLocator)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "container_emergency_contact"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "container_emergency_contact")));
		L2.click();
		Thread.sleep(3000);
		System.out.println("216 work fine");

	}

	@Test(priority = 218)
	@Parameters({ "CommonLocator", "AppPackage" })
	public void Test_POB_Page_On_CS_App_Backto_CSApp_from_PhoneDialpadOn_2ndtime_218(String CommonLocator,
			String AppPackage) {
		HelperMethods.waitForPageLoaded();
		driver.activateApp(AppPackage);
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
	}

}
