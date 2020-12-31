package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;
import com.InfoCabs.locators.ForgotPhoneNumber_Locators;
import com.InfoCabs.locators.LoginPage_Locators;

public class ForgotPhoneNumberPage_TestCases_23_32 extends TestBase {
	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 23)
	@Parameters("CommonLocator")
	public void Test_ForgotPhoneNumber_Button_is_clickable_On_LoginPage_23(String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_forgot_phone"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Forgot Phone Number?");
		} else {
			System.out.println("Test:23, On Forgot PhoneNumber screen are faild");
		}

	}

	@Test(priority = 24)
	@Parameters("CommonLocator")
	public void Test_ForgotPhoneNumberPage_Logo_24(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_logo")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 25)
	@Parameters("CommonLocator")
	public void Test_ForgotPhoneNumberPage_Forgot_Phone_Number_Text_25(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Forgot Phone Number?");
		} else {
			System.out.println("Test:25, On Forgot PhoneNumber screen are faild");
		}

	}

	@Test(priority = 26)
	@Parameters("CommonLocator")
	public void Test_ForgotPhoneNumberPage_Enter_Register_Email_Text_26(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_login"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter your registered email address to get your phone number.");
		} else {
			System.out.println("Test:26, On Forgot PhoneNumber screen are faild");
		}
	}

	@Test(priority = 27)
	@Parameters("CommonLocator")
	public void Test_ForgotPhoneNumberPage_To_ClickOn_SendButton_without_Entering_Email_27(String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_reset"));
		HelperMethods.waitForElementToBeClickable(L1);
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Send");

		} else {
			System.out.println("Test:27, Button inside text are not availble");
		}
		L1.click();
		HelperMethods.waitForElementToBeClickable(L1);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Email address is required");

		} else {
			System.out.println("Test:27, Email required text error message are not displayed");
		}

	}

	@Test(priority = 28)
	@Parameters({ "CommonLocator", "Invalid_email" })
	public void Test_ForgotPhoneNumberPage_Email_Validation_28(String CommonLocator, String Invalid_email) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_email"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_email);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_reset"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter valid Email address");
			L1.clear();

		} else {
			System.out.println("Test:28, Email validation text error message are not displayed");
		}

	}

	@Test(priority = 29)
	@Parameters({ "CommonLocator", "NotRegister_email" })
	public void Test_ForgotPhoneNumberPage_Email_Not_Link_Validation_ErrorMessage_29(String CommonLocator,
			String NotRegister_email) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_email"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(NotRegister_email);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_reset"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Email address is not registered");
			L1.clear();

		} else {
			System.out.println("Test:29, Email Not Link validation are not displayed");
		}

	}

	@Test(priority = 30)
	@Parameters({ "CommonLocator", "valid_email" })
	public void Test_ForgotPhoneNumberPage_ValidEmail_are_accepted_and_SendMessage_30(String CommonLocator,
			String valid_email) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_email"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(valid_email);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_reset"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "title"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Message Sent");

		} else {
			System.out.println("Test:30, Message send Success Message are not displayed");
		}

		WebElement L4 = driver.findElement(By.id(CommonLocator + "description"));
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "SMS send successfully at 009xxxxxx78");

		} else {
			System.out.println("Test:30, Message send Success Message are not displayed");
		}

	}

	@Test(priority = 31)
	@Parameters({ "CommonLocator" })
	public void Test_ForgotPhoneNumberPage_verify_ResendMessageButton_is_working_31(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "btnResend"));
		HelperMethods.waitForElementToBeClickable(L3);

		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Resend");
			L3.click();

		} else {
			System.out.println("Test:31, Resend Button are Not Avalible");
		}

	}

	@Test(priority = 32)
	@Parameters({ "CommonLocator" })
	public void Test_ForgotPhoneNumberPage_Message_SendCross_Button_BringBack_User_toLoginPage_32(
			String CommonLocator) {

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
			System.out.println("Test:32, User are back on Login Screen");
		}

	}

}
