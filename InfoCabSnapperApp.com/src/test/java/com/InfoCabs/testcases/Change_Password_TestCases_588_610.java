package com.InfoCabs.testcases;

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

public class Change_Password_TestCases_588_610 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 588)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Change_Password_Click_On_ChangePwd_Button_588(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Change Password']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Change Password");
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//" + CommonLocator_ClassView + "[@text='Change Password']")));
			L1.click();
		} else {
			System.out.println("Test:588, Change Password text are not present");
		}

	}

	@Test(priority = 589)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Change_Password_Click_On_Cross_Button_Icon_589(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_back"));
		WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Change Password']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "X");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "iv_back")));
			L1.click();
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//" + CommonLocator_ClassView + "[@text='Change Password']")));
			L2.click();

		} else {
			System.out.println("Test:589, Change Password Cross Button text are not present");
		}

	}

	@Test(priority = 590)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Change_Password_check_Change_Password_is_present_590(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Change Password");
		} else {
			System.out.println("Test:590, Change Password text are not present");
		}

	}

	@Test(priority = 591)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Change_Password_check_Current_Password_is_present_591(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_old_password"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Current Password");
		} else {
			System.out.println("Test:591, Current Password text are not present");
		}

	}

	@Test(priority = 592)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Change_Password_check_New_Password_is_present_592(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_new_password"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "New Password");
		} else {
			System.out.println("Test:592, New Password text are not present");
		}

	}

	@Test(priority = 593)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Change_Password_check_Confirm_Password_is_present_593(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_confirm_new_password"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Confirm Password");
		} else {
			System.out.println("Test:592, Confirm Password text are not present");
		}

	}

	@Test(priority = 594)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Change_Password_check_Change_Password_is_present_594(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Change password");
		} else {
			System.out.println("Test:594, Change password text are not present");
		}

	}

	@Test(priority = 595)
	@Parameters("CommonLocator")
	public void Test_Change_Password_To_Click_On_ChangePwdButton_without_Entering_Pwd_595(String CommonLocator) {

		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, "Old password is required");

		} else {
			System.out.println("Test:595, Old password is required error message are not displayed");
		}

	}

	@Test(priority = 596)
	@Parameters({ "CommonLocator", "Invalid_Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_check_Minimum_Validation_596(String CommonLocator,
			String Invalid_Pwd) throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_old_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Old password minimum Length 8");
			Thread.sleep(4000);
			L1.clear();

		} else {
			System.out.println("Test:596, Old password minimum Length 8 error message are not displayed");
		}

	}

	@Test(priority = 597)
	@Parameters({ "CommonLocator", "Incorrect_Pwd", "Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_check_IncorrectPWD_Validation_597(
			String CommonLocator, String Incorrect_Pwd, String Pwd) throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_old_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Incorrect_Pwd);

		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_new_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(Pwd);

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "et_confirm_new_password"));
		HelperMethods.waitForElementToBeVisible(L3);
		L3.sendKeys(Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L4 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L4.click();

		WebElement L5 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L5.isDisplayed()) {
			String Get_text1 = L5.getText();
			Assert.assertEquals(Get_text1, "Incorrect Current Password");
			Thread.sleep(4000);
			L1.clear();

		} else {
			System.out.println("Test:597, Incorrect Current Password error message are not displayed");
		}

	}

	@Test(priority = 598)
	@Parameters({ "CommonLocator", "Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_check_Same_PWD_Validation_598(String CommonLocator,
			String Pwd) throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_old_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "You can't set old password as new");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:598, You can't set old password as new error message are not displayed");
		}

	}

	@Test(priority = 599)
	@Parameters({ "CommonLocator", "Incorrect_Pwd", "Pwd" })
	public void Test_Change_Password_Clear_New_and_ConfirmPWD_599(String CommonLocator, String Incorrect_Pwd,
			String Pwd) throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_new_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.clear();

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "et_confirm_new_password"));
		HelperMethods.waitForElementToBeVisible(L3);
		L3.clear();

	}

	@Test(priority = 600)
	@Parameters({ "CommonLocator", "Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_check_NewPwd_requiredMsg_600(String CommonLocator,
			String Pwd) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "New password is required");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:600, New password is required error message are not displayed");
		}

	}

	@Test(priority = 601)
	@Parameters({ "CommonLocator", "Invalid_Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_check_Newpwd_Minimum_Validation_601(
			String CommonLocator, String Invalid_Pwd) throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_new_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "New password minimum Length 8");
			Thread.sleep(4000);
			L1.clear();

		} else {
			System.out.println("Test:601, New password minimum Length 8 error message are not displayed");
		}

	}

	@Test(priority = 602)
	@Parameters({ "CommonLocator", "Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_check_Confirmpwd_Minimum_Validation_602(
			String CommonLocator, String Pwd) throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_new_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Pwd);

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "New password not matching");
			Thread.sleep(4000);

		} else {
			System.out.println("Test:602, New password not matching error message are not displayed");
		}

	}

	@Test(priority = 603)
	@Parameters({ "CommonLocator", "Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_check_ConfirmPwd_requiredMsg_603(
			String CommonLocator, String Pwd) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Confirm password minimum Length 8");

		} else {
			System.out.println("Test:603, Confirm password minimum Length 8 error message are not displayed");
		}

	}

	@Test(priority = 604)
	@Parameters({ "CommonLocator", "Incorrect_Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_check_Confirmpwd_Notmached_Validation_604(
			String CommonLocator, String Incorrect_Pwd) throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_confirm_new_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Incorrect_Pwd);

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "New password not matching");

		} else {
			System.out.println("Test:602, New password not matching error message are not displayed");
		}

	}

	@Test(priority = 605)
	@Parameters({ "CommonLocator", "Incorrect_Pwd", "Pwd" })
	public void Test_Change_Password_Clear_New_and_ConfirmPWD_On2nd_time_605(String CommonLocator, String Incorrect_Pwd,
			String Pwd) throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_new_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.clear();

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "et_confirm_new_password"));
		HelperMethods.waitForElementToBeVisible(L3);
		L3.clear();

	}

	@Test(priority = 606)
	@Parameters({ "CommonLocator", "Change_Pwd", "Pwd" })
	public void Test_Change_Password_To_Click_On_ChangePwdButton_to_ChangePWD_606(String CommonLocator,
			String Change_Pwd, String Pwd) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_new_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(Change_Pwd);

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "et_confirm_new_password"));
		HelperMethods.waitForElementToBeVisible(L3);
		L3.sendKeys(Change_Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L4 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L4.click();

		WebElement L5 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		if (L5.isDisplayed()) {
			String Get_text1 = L5.getText();
			Assert.assertEquals(Get_text1, "Password updated successfully");
		} else {
			System.out.println("Test:597, Password updated successfully message are not displayed");
		}

	}

	@Test(priority = 607)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Change_Password_Go_Back_to_HomeScreen_and_Logout_607(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

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
			System.out.println("Test:607, User are not able to Logout may be some issue");
		}

	}

	@Test(priority = 608)
	@Parameters({ "PhoneNum", "Change_Pwd", "CommonLocator" })
	public void Test__Change_Password_Allow_user_to_LoginWith_ChangePWD_608(String PhoneNum, String Change_Pwd,
			String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PhoneNum);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(Change_Pwd);

		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Add a Pickup Point");
		} else {
			System.out.println("Test:608, User are not able to login may be some issue");
		}
	}

	@Test(priority = 609)
	@Parameters({ "Sidermenue_CommonText", "CommonLocator_ClassView", "CommonLocator" })
	public void Test_Change_Password_Go_Back_ChangePWD_page_609(String Sidermenue_CommonText,
			String CommonLocator_ClassView, String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		L1.click();
		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='My Profile']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='My Profile']")));
		L2.click();

		WebElement L3 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Change Password']"));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//" + CommonLocator_ClassView + "[@text='Change Password']")));
		L3.click();

	}
	
	@Test(priority = 610)
	@Parameters({ "CommonLocator", "Change_Pwd", "Pwd" })
	public void Test_Change_Password_Change_PWD_again_to_Orignal_610(
			String CommonLocator, String Change_Pwd, String Pwd) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_old_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Change_Pwd);

		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_new_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(Pwd);

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "et_confirm_new_password"));
		HelperMethods.waitForElementToBeVisible(L3);
		L3.sendKeys(Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L4 = driver.findElement(By.id(CommonLocator + "btn_change_password"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_change_password")));
		L4.click();

		WebElement L5 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		if (L5.isDisplayed()) {
			String Get_text1 = L5.getText();
			Assert.assertEquals(Get_text1, "Password updated successfully");
			HelperMethods.waitForPageLoaded();
			Thread.sleep(4000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			HelperMethods.waitForPageLoaded();
			Thread.sleep(4000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			HelperMethods.waitForPageLoaded();

		} else {
			System.out.println("Test:610, Password updated successfully message are not displayed");
		}

	}

}
