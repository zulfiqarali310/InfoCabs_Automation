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

public class Add_PostPay_Account_TestCases_640_657 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();


	
	@Test(priority = 640)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Add_PostPay_Account_ClickTO_Open_Carddetails_640(String CommonLocator,
			String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvAddPaymentMethod"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tvAddPaymentMethod")));
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "tv_account"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_account")));
		L2.click();

	}

	@Test(priority = 641)
	@Parameters("CommonLocator")
	public void Test_Add_PostPay_Account_check_CrossButton_is_present_641(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_back")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 642)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_AddPostPay_text_642(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add Postpay account");

		} else {
			System.out.println("Test:641, Add Postpay account text are not present");
		}

	}

	@Test(priority = 643)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_EnterPostPay_text_643(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_hint"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Enter your Postpay account details");

		} else {
			System.out.println("Test:642, Enter your Postpay account details text are not present");
		}

	}

	@Test(priority = 644)
	@Parameters({ "CommonLocator" })
	public void Test_Add_PostPay_Account_EnterPostPay_Email_errorMessage_644(String CommonLocator)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_account"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_account")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter Email address");
			Thread.sleep(2000);

		} else {
			System.out.println("Test:644, Enter Email address error message are not displayed");
		}

	}

	@Test(priority = 645)
	@Parameters({ "CommonLocator", "CreditCardName", "Invalid_PostPayEmail" })
	public void Test_Add_PostPay_Account_EnterPostPay_Email_Validation_errorMessage_645(String CommonLocator,
			String CreditCardName, String Invalid_PostPayEmail) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "Username_et"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_PostPayEmail);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_account"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_account")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter password");
			Thread.sleep(4000);
			L1.clear();

		} else {
			System.out.println("Test:645, Enter password error message are not displayed");
		}

	}

	@Test(priority = 646)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "valid_email" })
	public void Test_Add_PostPay_Account_Email_Address_text_646(String CommonLocator, String CommonLocator_ClassView,
			String valid_email) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "Username_et"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(valid_email);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_account"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_account")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter password");

		} else {
			System.out.println("Test:646, Enter password error message are not displayed");
		}

	}

	@Test(priority = 647)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "Invalid_PostPay_Pwd" })
	public void Test_Add_PostPay_Account_Password_Address_text_647(String CommonLocator, String CommonLocator_ClassView,
			String Invalid_PostPay_Pwd) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "etPassword"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_PostPay_Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_account"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_account")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Min length 4");
			Thread.sleep(4000);
			L1.clear();

		} else {
			System.out.println("Test:647, Min length 4 error message are not displayed");
		}

	}

	@Test(priority = 648)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "Incorrect_PostPay_Pwd" })
	public void Test_Add_PostPay_Account_Password_Address_text_648(String CommonLocator, String CommonLocator_ClassView,
			String Incorrect_PostPay_Pwd) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "etPassword"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Incorrect_PostPay_Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_account"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_account")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Invalid account details, No account found with these details");

		} else {
			System.out.println(
					"Test:648, Invalid account details, No account found with these details message are not displayed");
		}

	}

	@Test(priority = 649)
	@Parameters({ "CommonLocator", "Incorrect_Pwd", "Pwd" })
	public void Test_Add_PostPay_Account_Clear_Email_and_Pwd_649(String CommonLocator, String Incorrect_Pwd, String Pwd)
			throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "Username_et"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.clear();

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "etPassword"));
		HelperMethods.waitForElementToBeVisible(L3);
		L3.clear();

	}

	@Test(priority = 651)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_Add_Account_Button_651(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_add_account"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add account");

		} else {
			System.out.println("Test:650, Add account text are not present");
		}

	}

	@Test(priority = 651)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "PostPayEmail", "PostPay_Pwd" })
	public void Test_Add_PostPay_Account_Enter_Email_and_Pwd_651(String CommonLocator, String CommonLocator_ClassView,
			String PostPayEmail, String PostPay_Pwd) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "Username_et"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PostPayEmail);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "etPassword"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.sendKeys(PostPay_Pwd);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L3 = driver.findElement(By.id(CommonLocator + "btn_add_account"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_account")));
		L3.click();

	}

	@Test(priority = 652)
	@Parameters({ "CommonLocator", "CommonLocator_ClassImageView" })
	public void Test_Add_PostPay_Account_ClickTo_DeletePostPay_account_652(String CommonLocator,
			String CommonLocator_ClassImageView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_ClassImageView + "[@index='2']"));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//" + CommonLocator_ClassImageView + "[@index='2']")));
		L2.click();

	}

	@Test(priority = 653)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_AreYouSurewant_to_delete_text_653(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Are you sure you want to delete Account **** Jeet Singh ?");

		} else {
			System.out.println(
					"Test:653, Are you sure you want to delete Account **** Jeet Singh ? text are not present");
		}

	}

	@Test(priority = 654)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_NoCancel_Text_and_Button_654(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_reject"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "No, cancel");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_reject")));
			L1.click();

		} else {
			System.out.println("Test:654, No, cancel text are not present");
		}

	}

	@Test(priority = 655)
	@Parameters({ "CommonLocator", "CommonLocator_ClassImageView" })
	public void Test_Add_PostPay_Account_Click_againOn_DeletePostPay_account_655(String CommonLocator,
			String CommonLocator_ClassImageView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_ClassImageView + "[@index='2']"));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//" + CommonLocator_ClassImageView + "[@index='2']")));
		L2.click();

	}

	@Test(priority = 656)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_YesDeleteCard_Text_and_Button_656(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_accept"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Yes, delete card");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_accept")));
			L1.click();

		} else {
			System.out.println("Test:654, Yes, delete card text are not present");
		}

	}

	@Test(priority = 657)
	public void Test_Add_PostPay_GoBack_To_HomeScreen_657() throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		HelperMethods.waitForPageLoaded();

	}

}
