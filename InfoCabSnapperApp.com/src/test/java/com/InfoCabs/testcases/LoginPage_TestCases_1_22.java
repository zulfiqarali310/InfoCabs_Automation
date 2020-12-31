 package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;
import com.InfoCabs.locators.LoginPage_Locators;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LoginPage_TestCases_1_22 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	/*@Test(priority = 1)
	@Parameters({ "CommonLocator_ForAlerts", "AppCommonPermision_TextS1" })
	public void Test_Before_LoginPage_Device_Permission_Alert_1(String CommonLocator_ForAlerts,
			String AppCommonPermision_TextS1) {

		WebElement L1 = driver.findElement(By.id(CommonLocator_ForAlerts + "permission_allow_button"));
		WebElement L2 = driver.findElement(By.id(CommonLocator_ForAlerts + "permission_message"));
		HelperMethods.waitForPageLoaded();
		try {
			if (L2.isDisplayed()) {
				String Get_text1 = L2.getText();
				Assert.assertEquals(Get_text1, AppCommonPermision_TextS1);
				L2.click();
			}
		} catch (Exception exp) {
			System.out.println("Test:1, Screen=1 Locators are not properly get or may be someother issue");
		}
	}

	@Test(priority = 2)
	@Parameters({ "CommonLocator_ForAlerts", "AppCommonPermision_TextS2" })
	public void Test_Before_LoginPage_Device_Permission_Alert_2(String CommonLocator_ForAlerts,
			String AppCommonPermision_TextS2) {

		WebElement L1 = driver.findElement(By.id(CommonLocator_ForAlerts + "permission_allow_button"));
		WebElement L2 = driver.findElement(By.id(CommonLocator_ForAlerts + "permission_message"));
		HelperMethods.waitForPageLoaded();
		try {
			if (L2.isDisplayed()) {
				String Get_text1 = L2.getText();
				Assert.assertEquals(Get_text1, AppCommonPermision_TextS2);
				L2.click();
			}
		} catch (Exception exp) {
			System.out.println("Test:2, Screen=2 Locators are not properly get or may be someother issue");
		}
	}*/

	@Test(priority = 3)
	@Parameters("CommonLocator")
	public void Test_LoginPage_Logo_3(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_logo")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 4)
	@Parameters("CommonLocator")
	public void Test_LoginPage_PhoneNumber_Icon_4(String CommonLocator) {
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iconPhone")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 5)
	@Parameters("CommonLocator")
	public void Test_LoginPage_CountryFlag_Icon_5(String CommonLocator) {
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "ivFlag")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 6)
	@Parameters("CommonLocator")
	public void Test_LoginPage_PasswordVisiblity_icon_6(String CommonLocator) {
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "text_input_end_icon")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 7)
	@Parameters("CommonLocator")
	public void Test_LoginPage_Welcome_Text_7(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Welcome Back!");
		} else {
			System.out.println("Test:7, Screen=3 Locators are not properly get or may be someother issue");
		}

	}

	@Test(priority = 8)
	@Parameters("CommonLocator")
	public void Test_LoginPage_Continue_Text_8(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_login"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Please login to continue");
		} else {
			System.out.println("Test:8, Screen=3 Locators are not properly get or may be someother issue");
		}

	}

	@Test(priority = 9)
	@Parameters("CommonLocator")
	public void Test_LoginPage_PhoneNumber_Text_9(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "hint_phone"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Phone Number");
		} else {
			System.out.println("Test:9, Screen=3 Locators are not properly get or may be someother issue");
		}
	}

	@Test(priority = 10)
	@Parameters("CommonLocator")
	public void Test_LoginPage_Country_Code_is_Present_10(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvCode"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "+92");
		} else {
			System.out.println("Test:10, Screen=3 Locators are not properly get or may be someother issue");
		}
	}

	@Test(priority = 11)
	@Parameters("CommonLocator")
	public void Test_LoginPage_ForgotPhone_Number_Text_11(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_forgot_phone"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Forgot phone number?");
		} else {
			System.out.println("Test:11, Screen=3 Locators are not properly get or may be someother issue");
		}
	}

	@Test(priority = 12)
	@Parameters("CommonLocator")
	public void Test_LoginPage_ForgotPassword_Text_12(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_forgot_pass"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Forgot password?");
		} else {
			System.out.println("Test:12, Screen=3 Locators are not properly get or may be someother issue");
		}

	}

	@Test(priority = 13)
	@Parameters("CommonLocator")
	public void Test_LoginPage_NewUser_Text_13(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "hint_register"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "New User?");
		} else {
			System.out.println("Test:13, Screen=3 Locators are not properly get or may be someother issue");
		}
	}

	@Test(priority = 14)
	@Parameters("CommonLocator_ClassView")
	public void Test_LoginPage_SignUP_Text_14(String CommonLocator_ClassView) {
		WebElement L1 = driver
				.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Sign up for new account']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Sign up for new account");
		} else {
			System.out.println("Test:14, Screen=3 Locators are not properly get or may be someother issue");
		}
	}

	@Test(priority = 15)
	@Parameters("CommonLocator")
	public void Test_LoginPage_PhoneNumber_RequiredErrorMessage_15(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "error_phone"));
		HelperMethods.waitForElementToBeVisible(L2);
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Enter phone number");
		} else {
			System.out.println("Test:15, Screen=3 Locators are not properly get or may be someother issue");
		}

	}

	@Test(priority = 16)
	@Parameters({ "Invalid_PhoneNum", "CommonLocator" })
	public void Test_LoginPage_PhoneNumber_ValidationErrorMessage_16(String Invalid_PhoneNum, String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_PhoneNum);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L1);
		L2.click();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "error_phone"));
		HelperMethods.waitForElementToBeVisible(L3);
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter valid phone number");
			L1.clear();
		} else {
			System.out.println("Test:16, Screen=3 Locators are not properly get or may be someother issue");
		}

	}

	@Test(priority = 17)
	@Parameters({ "PhoneNum", "CommonLocator" })
	public void Test_LoginPage_PasswordRequired_error_Message_17(String PhoneNum, String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PhoneNum);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		HelperMethods.waitForElementToBeVisible(L3);
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter password ");
			L1.clear();
		} else {
			System.out.println("Test:17, Screen=3 Locators are not properly get or may be someother issue");
		}

	}

	@Test(priority = 18)
	@Parameters({ "PhoneNum", "Invalid_Pwd", "CommonLocator" })
	public void Test_LoginPage__Password_ValidationErrorMessage_18(String PhoneNum, String Invalid_Pwd,
			String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PhoneNum);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(Invalid_Pwd);

		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		HelperMethods.waitForElementToBeVisible(L4);
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Minimum 8 characters required");
			L1.clear();
			L2.clear();
		} else {
			System.out.println("Test:18, Screen=3 Locators are not properly get or may be someother issue");
		}

	}

	@Test(priority = 19)
	@Parameters({ "PhoneNum", "Incorrect_Pwd", "CommonLocator" })
	public void Test_LoginPage_IcorrectPassword_Validation_19(String PhoneNum, String Incorrect_Pwd,
			String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PhoneNum);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(Incorrect_Pwd);

		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		HelperMethods.waitForElementToBeVisible(L4);
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Invalid password. Try correct password");
			System.out.println(Get_text1);
			L1.clear();
			L2.clear();
		} else {
			System.out.println("Test:19, Screen=3 Locators are not properly get or may be someother issue");
		}

	}

	@Test(priority = 20)
	@Parameters({ "Pwd", "CommonLocator" })
	public void Test_LoginPage_PasswordView_eyeIcon_MakePassword_Visisble_20(String Pwd, String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Pwd);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "text_input_end_icon"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, Pwd);
			L1.clear();
		} else {
			System.out.println("Test:20, Screen=3 Locators are not properly get or may be someother issue");
		}
	}

	@Test(priority = 21)
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
	}

	@Test(priority = 22)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_User_Logout_from_Application_22(String CommonLocator, String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Logout']"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "tv_accept"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeVisible(L4);

		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Log In");
		} else {
			System.out.println("Test:22, User are not able to Logout may be some issue");
		}

	}

}
