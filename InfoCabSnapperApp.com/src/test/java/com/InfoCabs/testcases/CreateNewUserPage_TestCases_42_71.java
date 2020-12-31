package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CreateNewUserPage_TestCases_42_71 extends TestBase {
	HelperMethods HelpMethod = new HelperMethods();


	
	@Test(priority = 42)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_LoginPage_NewUserAccount_Button_isWorking_42(String CommonLocator_ClassView) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver
				.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Sign up for new account']"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

	}
	/*@Test(priority = 43)
	@Parameters({ "CommonLocator_ForAlerts", "AppCommonPermision_TextS3" })
	public void Test_CreateNewUserPage_Device_Permission_Alerts_43(String CommonLocator_ForAlerts, String AppCommonPermision_TextS3) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator_ForAlerts + "permission_allow_button"));
		WebElement L2 = driver.findElement(By.id(CommonLocator_ForAlerts + "permission_message"));
		HelperMethods.waitForPageLoaded();
		try {
			if (L2.isDisplayed()) {
				String Get_text1 = L2.getText();
				//Assert.assertEquals(Get_text1, AppCommonPermision_TextS3);
				//L2.click();
			}
		} catch (Exception exp) {
			System.out.println("Test:42, Register Screen have some issue");
		}
	}*/
	@Test(priority = 44)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_Logo_44(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_logo")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 45)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_PhoneNumber_Icon_45(String CommonLocator) {
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iconPhone")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 46)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_CountryFlag_Icon_46(String CommonLocator) {
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "ivFlag")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 47)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_PasswordVisiblity_icon_47(String CommonLocator) {
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "text_input_end_icon")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 48)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_Welcome_Text_48(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Welcome Aboard!");
		} else {
			System.out.println("Test:47, Register Screen have some issue");
		}

	}

	@Test(priority = 49)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_Please_Signup_Continue_Text_49(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_login"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Please Sign up to continue");
		} else {
			System.out.println("Test:48, Register Screen have some issue");
		}

	}

	@Test(priority = 50)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_PhoneNumber_Text_50(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "hint_phone"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Phone Number");
		} else {
			System.out.println("Test:49, Register Screen have some issue");
		}
	}

	@Test(priority = 51)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_Country_Code_is_Present_51(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvCode"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "+92");
		} else {
			System.out.println("Test:50, Register Screen have some issue");
		}
	}

	@Test(priority = 52)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_AlreadyUser_Text_52(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "hint_register"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Already a User?");
		} else {
			System.out.println("Test:51, Register Screen have some issue");
		}
	}

	@Test(priority = 53)
	@Parameters("CommonLocator_ClassView")
	public void Test_CreateNewUserPage_LoginNow_Text_53(String CommonLocator_ClassView) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Login now']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Login now");
		} else {
			System.out.println("Test:52, Register Screen have some issue");
		}
	}

	@Test(priority = 54)
	@Parameters("CommonLocator")
	public void Test_CreateNewUserPage_SiginUpButton_Text_54(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeVisible(L1);

		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Signup");
		} else {
			System.out.println("Test:53, Register Screen have some issue");
		}
	}

	@Test(priority = 55)
	@Parameters({ "CommonLocator" })
	public void Test_CreateNewUserPage_NameRequired_errorMessage_55(String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		HelperMethods.waitForElementToBeVisible(L2);
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Enter full name");
		} else {
			System.out.println("Test:54, Register Screen having some issue with name required error message");
		}
	}

	@Test(priority = 56)
	@Parameters({ "Name", "CommonLocator" })
	public void Test_CreateNewUserPage_EnterValid_UserName_56(String Name, String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_name"));
		HelperMethods.waitForElementToBeVisible(L1);
		if (L1.isDisplayed()) {
			L1.sendKeys(Name);
		} else {
			System.out.println("Test:55, Name field are not avalible or some other issue");
		}
	}

	@Test(priority = 57)
	@Parameters({ "Name", "CommonLocator" })
	public void Test_CreateNewUserPage_PhoneNumber_Required_errorMessage_57(String Name, String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "error_phone"));
		HelperMethods.waitForElementToBeVisible(L2);
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Enter phone number");
		} else {
			System.out.println("Test:50, Register Screen having some issue with Phone Number required error Message");
		}
	}

	@Test(priority = 58)
	@Parameters({ "Invalid_PhoneNum", "CommonLocator" })
	public void Test_CreateNewUserPage_PhoneNumber_Invalid_errorMessage_58(String Invalid_PhoneNum,
			String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_PhoneNum);

		WebElement L3 = driver.findElement(By.id(CommonLocator + "error_phone"));
		HelperMethods.waitForElementToBeVisible(L3);
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter valid phone number");
			L1.clear();
		} else {
			System.out.println("Test:57, Phone Number validation have some issue");
		}
	}

	@Test(priority = 59)
	@Parameters({ "PhoneNum", "CommonLocator" })
	public void Test_CreateNewUserPage_EnterValid_PhoneNumber_59(String PhoneNum, String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		if (L1.isDisplayed()) {
			L1.sendKeys(PhoneNum);
		} else {
			System.out.println("Test:58, Phone Number field are not avalible or some other issue");
		}
	}

	@Test(priority = 60)
	@Parameters({ "CommonLocator" })
	public void Test_CreateNewUserPage_Email_Required_errorMessage_60(String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		HelperMethods.waitForElementToBeVisible(L2);
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Enter Email address");
		} else {
			System.out.println("Test:59, Register Screen having some issue with Email address required error Message");
		}
	}

	@Test(priority = 61)
	@Parameters({ "Invalid_email", "CommonLocator" })
	public void Test_CreateNewUserPage_Emailaddress_Invalid_errorMessage_61(String Invalid_email,
			String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_email"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_email);

	}

	@Test(priority = 62)
	@Parameters({ "CommonLocator_ClassView", "CommonLocator" })
	public void Test_CreateNewUserPage_Password_Required_errorMessage_62(String CommonLocator_ClassView,
			String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

		WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Enter password ']"));
		HelperMethods.waitForElementToBeVisible(L2);
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Enter password ");
		} else {
			System.out.println("Test:61, Register Screen having some issue with password required error Message");
		}
	}

	@Test(priority = 63)
	@Parameters({ "Invalid_Pwd", "CommonLocator" })
	public void Test_CreateNewUserPage_Enter_Invalid_Password_63(String Invalid_Pwd, String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_Pwd);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

	}

	@Test(priority = 64)
	@Parameters({ "CommonLocator" })
	public void Test_CreateNewUserPage_Email_vlidation_errorMessage_Text_64(String CommonLocator) {

		WebElement L2 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		HelperMethods.waitForElementToBeVisible(L2);
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Enter valid Email address");
		} else {
			System.out.println("Test:63, Register Screen having some issue with email validaion error Message");
		}
	}

	@Test(priority = 65)
	@Parameters({ "valid_email", "CommonLocator" })
	public void Test_CreateNewUserPage_Enter_Valid_Emailaddress_65(String valid_email, String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_email"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.clear();
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(valid_email);

	}

	@Test(priority = 66)
	@Parameters({ "CommonLocator" })
	public void Test_CreateNewUserPage_Password_vlidation_errorMessage_66(String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		HelperMethods.waitForElementToBeVisible(L2);
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Minimum 8 characters required");
		} else {
			System.out.println("Test:65, Register Screen having some issue with Password validaion error Message");
		}
	}

	@Test(priority = 67)
	@Parameters({ "Pwd", "CommonLocator" })
	public void Test_CreateNewUserPage_Valid_Password_inupt_67(String Pwd, String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.clear();
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Pwd);

	}

	@Test(priority = 68)
	@Parameters({ "Pwd", "CommonLocator" })
	public void Test_CreateNewUserPage_PasswordView_eyeIcon_MakePassword_Visisble_68(String Pwd,
			String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "text_input_end_icon"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, Pwd);
		} else {
			System.out.println("Test:67, Password view icon have some issue on register new user screen");
		}
	}

	@Test(priority = 69)
	@Parameters({ "CommonLocator" })
	public void Test_CreateNewUserPage_PhoneNumberAlready_registered_errorMessage_69(String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "error_phone"));
		HelperMethods.waitForElementToBeVisible(L3);
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Phone number is already registered!!");

		} else {
			System.out.println("Test:68, Register Screen having some issue with PhoneNumber validaion error Message");
		}
	}

	@Test(priority = 70)
	@Parameters({ "Change_PhoneNumber", "CommonLocator" })
	public void Test_CreateNewUserPage_EmailAlready_registered_errorMessage_70(String Change_PhoneNumber,
			String CommonLocator) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.clear();
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Change_PhoneNumber);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L2);
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		HelperMethods.waitForElementToBeVisible(L3);
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Email address is already registered!!");
		} else {
			System.out.println("Test:70, Register Screen having some issue with Email validaion error Message");
		}
	}

	@Test(priority = 71)
	@Parameters({ "CommonLocator_ClassView" })
	public void Test_CreateNewUserPage_To_ClickOn_LoginNow_Button_which_BringUser_User_to_Loginpage_71(String CommonLocator_ClassView) {

		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Login now']"));
		HelperMethods.waitForElementToBeVisible(L1);
		if (L1.isDisplayed()) {
			L1.click();
		} else {
			System.out.println("Test:71, Login Screen can not be displayed");
		}
	}

}
