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

public class Check_Remeber_Feature_TestCases_754_768 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 754)
	@Parameters({ "PhoneNum", "Pwd", "CommonLocator" })
	public void Test_Check_Remeber_Featur_Allow_user_to_LoginWith_valid_credential_754(String PhoneNum, String Pwd,
			String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PhoneNum);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_password"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(Pwd);

		WebElement L5 = driver.findElement(By.id(CommonLocator + "cbRemember"));
		HelperMethods.waitForElementToBeClickable(L5);
		L5.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Add a Pickup Point");
		} else {
			System.out.println("Test:754, User are not able to login may be some issue");
		}
	}

	@Test(priority = 755)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Check_Remeber_Featur_User_Logout_from_Application_755(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
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
			System.out.println("Test:755, User are not able to Logout may be some issue");
		}

	}

	@Test(priority = 756)
	@Parameters({ "CommonLocator", "PhoneNum" })
	public void Test_Check_Remeber_Featur_ForgotPhone_Number_Text_756(String CommonLocator, String PhoneNum)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_phone"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, PhoneNum);
		} else {
			System.out.println("Test:756, Phone Number are not present");
		}
	}

	@Test(priority = 757)
	@Parameters({ "CommonLocator", "Pwd" })
	public void Test_Check_Remeber_Featur_ForgotPhone_Number_Text_757(String CommonLocator, String Pwd) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "text_input_end_icon"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_password"));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, Pwd + ", Password");
		} else {
			System.out.println("Test:756, Password text are not present");
		}
	}

	@Test(priority = 758)
	@Parameters({ "PhoneNum", "Pwd", "CommonLocator" })
	public void Test_Check_Remeber_Featur_Allow_user_to_LoginWith_valid_credential_Loginagain_758(String PhoneNum,
			String Pwd, String CommonLocator) throws InterruptedException {

		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Add a Pickup Point");
		} else {
			System.out.println("Test:758, User are not able to login may be some issue");
		}
	}

	@Test(priority = 759)
	@Parameters({ "Sidermenue_CommonText", "CommonLocator_ClassView", "CommonLocator" })
	public void Test_check_Remeber_Feature_Go_Back_ChangePWD_page_759(String Sidermenue_CommonText,
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

	@Test(priority = 760)
	@Parameters({ "CommonLocator", "Change_Pwd", "Pwd" })
	public void Test_Check_Remeber_Feature_Change_PWD_again_to_Orignal_760(String CommonLocator, String Change_Pwd,
			String Pwd) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_old_password"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Pwd);

		HelperMethods.waitForPageLoaded();
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


	}

	@Test(priority = 761)
	@Parameters({ "CommonLocator", "Change_Pwd", "Pwd" })
	public void Test_Check_Remeber_Feature_Check_BackButton_761(String CommonLocator, String Change_Pwd, String Pwd)
			throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		//WebElement L5 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		//String Get_text1 = L5.getText();
		//Assert.assertEquals(Get_text1, "Password updated successfully, save your login details for easy login");
		//WebElement L6 = driver.findElement(By.id(CommonLocator + "snackbar_action"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "snackbar_action")));
		//L6.click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 761)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Check_Remeber_Feature_and_Logout_761(String CommonLocator, String Sidermenue_CommonText)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
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
			System.out.println("Test:761, User are not able to Logout may be some issue");
		}

	}

	@Test(priority = 762)
	@Parameters({ "CommonLocator", "Change_Pwd" })
	public void Test_Check_Remeber_Featur_ForgotPhone_Number_Text_and_check_ChangePwd_762(String CommonLocator,
			String Change_Pwd) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "text_input_end_icon"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_password"));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, Change_Pwd + ", Password");
		} else {
			System.out.println("Test:762, Change Password text are not present");
		}
	}

	@Test(priority = 763)
	@Parameters({ "PhoneNum", "Pwd", "CommonLocator" })
	public void Test_Check_Remeber_Featur_Again_login__with_save_Pwd_763(String PhoneNum, String Pwd,
			String CommonLocator) throws InterruptedException {

		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_login"));
		HelperMethods.waitForElementToBeClickable(L3);
		L3.click();
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Add a Pickup Point");
		} else {
			System.out.println("Test:763, User are not able to login may be some issue");
		}
	}

	@Test(priority = 764)
	@Parameters({ "Sidermenue_CommonText", "CommonLocator_ClassView", "CommonLocator" })
	public void Test_check_Remeber_Feature_Go_Back_Again_to_ChangePWD_page_764(String Sidermenue_CommonText,
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

	@Test(priority = 765)
	@Parameters({ "CommonLocator", "Change_Pwd", "Pwd" })
	public void Test_Check_Remeber_Feature__Check_Change_PWD_again_to_Orignal_765(String CommonLocator,
			String Change_Pwd, String Pwd) throws InterruptedException {

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


	}
	
	@Test(priority = 766)
	@Parameters({ "CommonLocator", "Change_Pwd", "Pwd" })
	public void Test_Check_Remeber_Feature_Check_BackButton_on_2ndtime_766(String CommonLocator, String Change_Pwd, String Pwd)
			throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		//WebElement L5 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		//String Get_text1 = L5.getText();
		//Assert.assertEquals(Get_text1, "Password updated successfully, save your login details for easy login");
		//WebElement L6 = driver.findElement(By.id(CommonLocator + "snackbar_action"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "snackbar_action")));
		//L6.click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		HelperMethods.waitForPageLoaded();

	}

	@Test(priority = 767)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Check_Remeber_Feature_and_Logout_for_3rd_time_767(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
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
			System.out.println("Test:767, User are not able to Logout may be some issue");
		}

	}

	@Test(priority = 768)
	@Parameters({ "CommonLocator", "Pwd" })
	public void Test_Check_Remeber_Featur_check_ChangePwd_validation_768(String CommonLocator, String Pwd) {

		WebElement L1 = driver.findElement(By.id(CommonLocator + "text_input_end_icon"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_password"));
		if (L2.isDisplayed()) {
			String Get_text1 = L2.getText();
			Assert.assertEquals(Get_text1, Pwd + ", Password");
		} else {
			System.out.println("Test:767, Change Password text are not present");
		}
	}

}
