package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CreateNewUserPage_TestCases_72_82 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 73)
	@Parameters({ "PhoneNum", "Pwd", "CommonLocator" })
	public void Test_Login_to_Application_withNew_credentials_73(String PhoneNum, String Pwd, String CommonLocator) throws InterruptedException {

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
		// HelperMethods.waitForPageLoaded();
		// String L4 =
		// driver.findElement(By.className("android.widget.Toast[1]")).getText();
		// System.out.println(L4);

	}

	@Test(priority = 74)
	@Parameters({ "Name", "valid_email", "CommonLocator" })
	public void Test_CreateNewuserPage_Enter_Valid_Username_And_Email_toRegisterNew_User_74(String Name,
			String valid_email, String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_name"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Name);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_email"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(valid_email);

		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_register"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
	}

	@Test(priority = 75)
	@Parameters("CommonLocator")
	public void Test_CreateNewuserPage_VerifiyPin_Screen_Logo_75(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_logo")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 76)
	@Parameters("CommonLocator")
	public void Test_CreateNewuserPage_VerifyPin_Screen_Verify_Text_76(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Verify Pin");
		} else {
			System.out.println("Test:75, Verify Screen have some issue");
		}

	}

	@Test(priority = 77)
	@Parameters("CommonLocator")
	public void Test_CreateNewuserPage_VerifyPin_Screen_PleaseEnter_Text_77(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_login"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Please enter the one-time pin we just sent to your phone number");
		} else {
			System.out.println("Test:76, Verify Screen have some issue");
		}

	}

	@Test(priority = 78)
	@Parameters("CommonLocator")
	public void Test_CreateNewuserPage_VerifyPin_Screen_Didntget_Text_78(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "hint_register"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Didn't get it?");
		} else {
			System.out.println("Test:77, Verify Screen have some issue");
		}
	}

	/*@Test(priority = 79)
	@Parameters("CommonLocator")
	public void Test_CreateNewuserPage_VerifyPin_Screen_ResendButton_Text_79(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_resend"));
		HelperMethods.waitForElementToBeVisible(L1);
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Resend Pin");
		} else {
			System.out.println("Test:78, Verify Screen have some issue");
		}
	}

	@Test(priority = 80)
	@Parameters("CommonLocator")
	public void Test_CreateNewuserPage_VerifyPin_Screen_After_Text_80(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_after"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "after");
		} else {
			System.out.println("Test:79, Verify Screen have some issue");
		}
	}

	@Test(priority = 81)
	@Parameters("CommonLocator")
	public void Test_CreateNewuserPage_VerifyPin_Screen_Counter_Text_81(String CommonLocator) {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_counter"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			System.out.println(Get_text1);
			Assert.assertEquals(Get_text1, "00:54");

		} else {
			System.out.println("Test:80, Verify Screen have some issue");
		}
	}

	@Test(priority = 82)
	@Parameters("CommonLocator")
	public void Test_CreateNewuserPage_VerifyPin_Screen_VerifyButton_Text_82(String CommonLocator)
			throws InterruptedException {
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_verify"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Verify");

		} else {
			Thread.sleep(60000);
			WebElement L2 = driver.findElement(By.id(CommonLocator + "tv_resend"));
			HelperMethods.waitForElementToBeClickable(L2);
			L1.click();
			System.out.println("Test:82, Verify Screen have some issue and user are unable to login");
		}

	}

	/*
	 * @Test(priority = 83)
	 * 
	 * @Parameters("CommonLocator") public void
	 * ClickOn_VerifyButton_without_Entering_PinCode(String CommonLocator) {
	 * 
	 * WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_verify"));
	 * HelperMethods.waitForElementToBeClickable(L1); L1.click(); WebElement L2 =
	 * driver.findElement(By.id(CommonLocator + "textinput_error")); if
	 * (L2.isDisplayed()) { String Get_text1 = L2.getText();
	 * Assert.assertEquals(Get_text1, "Enter 6 digit pin");
	 * 
	 * } else { System.out.println("Test:82, Verify Screen have some issue"); }
	 * 
	 * }
	 * 
	 * @Test(priority = 84)
	 * 
	 * @Parameters({ "InavlidPin", "CommonLocator" }) public void
	 * Check_for_Invalid_PinCode_onVerifyScreen(String InavlidPin, String
	 * CommonLocator) {
	 * 
	 * WebElement L1 = driver.findElement(By.id(CommonLocator + "et_pin"));
	 * HelperMethods.waitForElementToBeVisible(L1); L1.sendKeys(InavlidPin);
	 * WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_verify"));
	 * HelperMethods.waitForElementToBeClickable(L2); L2.click(); WebElement L3 =
	 * driver.findElement(By.id(CommonLocator + "textinput_error")); if
	 * (L3.isDisplayed()) { String Get_text1 = L3.getText();
	 * Assert.assertEquals(Get_text1, "Enter Valid Pin."); L1.clear();
	 * 
	 * } else { System.out.println("Test:83, Verify Screen have some issue"); }
	 * 
	 * }
	 * 
	 * @Test(priority = 85)
	 * 
	 * @Parameters("CommonLocator") public void
	 * ClickOn_ResendButton_onVerifyPin_Screen(String CommonLocator) {
	 * 
	 * WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_resend"));
	 * HelperMethods.waitForElementToBeClickable(L1); L1.click(); WebElement L2 =
	 * driver.findElement(By.id(CommonLocator + "snackbar_text")); if
	 * (L2.isDisplayed()) { String Get_text1 = L2.getText(); //
	 * Assert.assertEquals(Get_text1, "You can request a new cod after 34 seconds");
	 * System.out.println(Get_text1);
	 * 
	 * } else { System.out.println("Test:84, Verify Screen have some issue"); }
	 * 
	 * }
	 * 
	 * @Test(priority = 86)
	 * 
	 * @Parameters("CommonLocator") public void
	 * Waitfor_ResendPinButton_onVerifyPin_Screen(String CommonLocator) throws
	 * InterruptedException {
	 * 
	 * HelperMethods.waitForPageLoaded(); WebElement L1 =
	 * driver.findElement(By.id(CommonLocator + "tv_resend"));
	 * HelperMethods.waitForElementToBeClickable(L1); Thread.sleep(50000); if
	 * (L1.isEnabled()) { L1.click();
	 * 
	 * } else { System.out.println("Test:85, Verify Screen have some issue"); }
	 * 
	 * }
	 */

}
