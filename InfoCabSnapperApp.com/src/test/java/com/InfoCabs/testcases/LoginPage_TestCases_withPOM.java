package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.InfoCabs.common.TestBase;
import com.InfoCabs.locators.LoginPage_Locators;
import com.InfoCabs.common.HelperMethods;

import io.appium.java_client.MobileElement;

public class LoginPage_TestCases_withPOM extends TestBase {
	LoginPage_Locators loginpage;
	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 1)
	public void Device_Alerts_Permission() {

		loginpage = new LoginPage_Locators(driver);
		loginpage.AllowDevice_Access();
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 2)
	public void Location_Alerts_Permission() {

		loginpage = new LoginPage_Locators(driver);
		loginpage.AllowDevice_Access();
	}

	@Test(priority = 3)
	public void Test_ImageLogo_and_Text() {
		boolean ImageLogo = driver.findElement(By.id("com.infocabs.expresscars:id/iv_logo")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 4)
	public void Test_PhoneIcon() {
		boolean ImageLogo = driver.findElement(By.id("com.infocabs.expresscars:id/iconPhone")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 5)
	public void Test_FlagIcon() {
		boolean ImageLogo = driver.findElement(By.id("com.infocabs.expresscars:id/ivFlag")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 6)
	public void Test_PasswordVisiblity_icon() {
		boolean ImageLogo = driver.findElement(By.id("com.infocabs.expresscars:id/text_input_end_icon")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 7)
	public void Test_Welcome_Text() {
		loginpage = new LoginPage_Locators(driver);
		String Actualtext = loginpage.verifying_WelcomeText_is_Present();
		Assert.assertEquals(Actualtext, "Welcome Back!");

	}

	@Test(priority = 8)
	public void Test_Continue_Text() {
		loginpage = new LoginPage_Locators(driver);
		String Actualtext = loginpage.verifying_ContinueText_is_Present();
		Assert.assertEquals(Actualtext, "Please login to continue");
	}

	@Test(priority = 9)
	public void Test_PhoneNumber_Text() {
		loginpage = new LoginPage_Locators(driver);
		String Actualtext = loginpage.PhoneNumber_Text();
		Assert.assertEquals(Actualtext, "Phone Number");
	}

	@Test(priority = 10)
	public void Test_Country_Code_is_Present() {
		loginpage = new LoginPage_Locators(driver);
		String Actualtext = loginpage.Country_Code();
		Assert.assertEquals(Actualtext, "+92");
	}

	@Test(priority = 11)
	public void Test_ForgotPhone_Number_Text() {
		loginpage = new LoginPage_Locators(driver);
		String Actualtext = loginpage.ForgotPhoneNumber_Text();
		Assert.assertEquals(Actualtext, "Forgot phone number?");
	}

	@Test(priority = 12)
	public void Test_ForgotPassword_Text() {
		loginpage = new LoginPage_Locators(driver);
		String Actualtext = loginpage.ForgotPassword_Text();
		Assert.assertEquals(Actualtext, "Forgot password?");
	}

	@Test(priority = 13)
	public void Test_NewUser_Text() {
		loginpage = new LoginPage_Locators(driver);
		String Actualtext = loginpage.NewUser_Text();
		Assert.assertEquals(Actualtext, "New User?");
	}

	@Test(priority = 14)
	public void Test_SignUP_Text() {
		loginpage = new LoginPage_Locators(driver);
		String Actualtext = loginpage.SignUP_Text();
		Assert.assertEquals(Actualtext, "Sign up for new account");
	}

	@Test(priority = 15)
	public void Test_PhoneNumber_RequiredErrorMessage() {
		loginpage = new LoginPage_Locators(driver);
		loginpage.clickOnloginButton();
		String Actualtext = loginpage.PhoneNumber_requiredText();
		Assert.assertEquals(Actualtext, "Enter phone number");

	}

	@Test(priority = 16)
	@Parameters("Invalid_PhoneNum")
	public void Test_ValidPhoneNumber_RequirdErrorMessage(String Invalid_PhoneNum) {
		loginpage = new LoginPage_Locators(driver);
		loginpage.typePhoneNumber(Invalid_PhoneNum);
		String Actualtext = loginpage.Enter_validPhoneNumber();
		Assert.assertEquals(Actualtext, "Enter valid phone number");
		loginpage.clearPhonenumber();

	}
	@Test(priority = 17)
	@Parameters("PhoneNum")
	public void Test_for_PasswordRequired_error_Message(String PhoneNum) {
		loginpage = new LoginPage_Locators(driver);
		loginpage.typePhoneNumber(PhoneNum);
		loginpage.clickOnloginButton();
		String Actualtext = loginpage.EnterPassword_Text();
		Assert.assertEquals(Actualtext, "Enter password");
		loginpage.clearPhonenumber();

	}

	@Test(priority = 18)
	@Parameters({ "PhoneNum", "Invalid_Pwd" })
	public void Test_for_PasswordValidaion_error_Message(String PhoneNum, String Invalid_Pwd) {
		loginpage = new LoginPage_Locators(driver);
		loginpage.typePhoneNumber(PhoneNum);
		loginpage.typePassword(Invalid_Pwd);
		loginpage.clickOnloginButton();
		String Actualtext = loginpage.EnterPassword_Validation_Text();
		Assert.assertEquals(Actualtext, "Minimum 8 characters required");
		loginpage.clearPhonenumber();
		loginpage.clearpassword();

	}

	@Test(priority = 19)
	@Parameters("Pwd")
	public void Test_PasswordView_eyeIcon_MakePassword_Visisble(String Pwd) {
		loginpage = new LoginPage_Locators(driver);
		loginpage.typePassword(Pwd);
		loginpage.clickOnPasswordVisibleicon();
		String Actualtext = loginpage.Test_EnterPasswordVisible();
		Assert.assertEquals(Actualtext, Pwd);
		loginpage.clearpassword();

	}

	@Test(priority = 20)
	@Parameters({ "PhoneNum", "Pwd" })
	public void LogintoApp(String PhoneNum, String Pwd) {

		loginpage = new LoginPage_Locators(driver);
		loginpage.typePhoneNumber(PhoneNum);
		loginpage.typePassword(Pwd);
		loginpage.clickOnloginButton();

	}

	@Test(priority = 21)
	public void LogOut_User() {

		loginpage = new LoginPage_Locators(driver);
		loginpage.clickOnSiderButton();
		loginpage.clickOnLogOutButton();
		loginpage.clickOnLogOut_Yes_Button();

	}

	

}
