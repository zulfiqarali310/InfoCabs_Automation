package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

public class ForgotPasswordPage_TestCases_33_41 extends TestBase {
	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 33)
	@Parameters("CommonLocator")
	public void Test_ForgotPhoneNumber_Button_is_clickable_On_LoginPage_33(String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_forgot_pass"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Forgot Password?");
		} else {
			System.out.println("Test:33, On Forgot Password screen text are not present");
		}

	}

	@Test(priority = 34)
	@Parameters("CommonLocator")
	public void Test_ForgotPasswordPage_Logo_34(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_logo")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 35)
	@Parameters("CommonLocator")
	public void Test_ForgotPasswordPage_Enter_Register_PhoneNumber_Text_35(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_login"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter your registered phone number to reset your password.");
		} else {
			System.out.println("Test:35, Not text are avalible it Forgot Password Screen");
		}
	}

	@Test(priority = 36)
	@Parameters("CommonLocator")
	public void Test_ForgotPasswordPage_To_Click_On_SubmitButton_without_Entering_PhoenNumber_36(String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_reset"));
		HelperMethods.waitForElementToBeClickable(L1);
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Submit");

		} else {
			System.out.println("Test:36, Button inside text are not availble");
		}
		L1.click();
		HelperMethods.waitForElementToBeClickable(L1);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Enter phone number");

		} else {
			System.out.println("Test:36, Phone Number required error message are not displayed");
		}

	}

	@Test(priority = 37)
	@Parameters({ "CommonLocator", "Invalid_PhoneNum" })
	public void Test_ForgotPasswordPage_PhoneNumber_Validation_ErrorMessage_37(String CommonLocator,
			String Invalid_PhoneNum) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_PhoneNum);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_reset"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter valid phone number (11 digit or more)");
			L1.clear();

		} else {
			System.out.println("Test:37, Phone Number validation text error message are not displayed");
		}

	}

	@Test(priority = 38)
	@Parameters({ "CommonLocator", "NotRegister_PhoneNum" })
	public void Test_ForgotPasswordPage_PhoneNumber_NotRegisterValidation_ErrorMessage_38(String CommonLocator,
			String NotRegister_PhoneNum) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(NotRegister_PhoneNum);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_reset"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Phone number is not registered");
			L1.clear();

		} else {
			System.out.println("Test:38, Phone Number validation text error message are not displayed");
		}

	}

	@Test(priority = 39)
	@Parameters({ "CommonLocator", "PhoneNum", "RecoverPwd"})
	public void Test_ForgotPasswordPage_Valid_PhoneNumber_are_accepted_and_SendMessage_39(String CommonLocator, String PhoneNum, String RecoverPwd) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PhoneNum);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_reset"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "title"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Email Sent");

		} else {
			System.out.println("Test:39, Message send Success Message are not displayed");
		}

		WebElement L4 = driver.findElement(By.id(CommonLocator + "description"));
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1,
					RecoverPwd);

		} else {
			System.out.println("Test:39, Message send Success Message are not displayed");
		}

	}

	@Test(priority = 40)
	@Parameters({ "CommonLocator" })
	public void Test_ForgotPasswordPage_ResendMessageButton_is_working_40(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btnResend"));
		HelperMethods.waitForElementToBeClickable(L1);

		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Resend");
			L1.click();

		} else {
			System.out.println("Test:40, Resend Button are Not Avalible");
		}

	}

	@Test(priority = 41)
	@Parameters({ "CommonLocator" })
	public void Test_ForgotPasswordPage_verify_Message_Cross_Button_UserBack_to_LoginPage_41(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_ok"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeVisible(L2);

		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Log In");
		} else {
			System.out.println("Test:41, User are back on Login Screen");
		}

	}

}
