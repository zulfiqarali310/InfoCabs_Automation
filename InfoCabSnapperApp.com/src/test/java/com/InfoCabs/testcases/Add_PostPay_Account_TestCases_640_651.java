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

public class Add_PostPay_Account_TestCases_640_651 extends TestBase {

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
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "valid_email" })
	public void Test_Add_PostPay_Account_Email_Address_text_644(String CommonLocator, String CommonLocator_ClassView,
			String valid_email) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "Username_et"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Email Address");
			HelperMethods.waitForElementToBeVisible(L1);
			L1.sendKeys(valid_email);

		} else {
			System.out.println("Test:643, Email Address text are not present");
		}

	}

	@Test(priority = 645)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "Pwd" })
	public void Test_Add_PostPay_Account_Password_Address_text_645(String CommonLocator, String CommonLocator_ClassView,
			String Pwd) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "etPassword"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Password");
			HelperMethods.waitForElementToBeVisible(L1);
			L1.sendKeys(Pwd);

		} else {
			System.out.println("Test:644, Password text are not present");
		}

	}

	@Test(priority = 646)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_Add_Account_Button_646(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_add_account"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add account");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_account")));
			L1.click();

		} else {
			System.out.println("Test:646, Add account text are not present");
		}

	}

	@Test(priority = 647)
	@Parameters({ "CommonLocator", "CommonLocator_ClassImageView" })
	public void Test_Add_PostPay_Account_ClickTo_DeletePostPay_account_647(String CommonLocator,
			String CommonLocator_ClassImageView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_ClassImageView + "[@index='2']"));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//" + CommonLocator_ClassImageView + "[@index='2']")));
		L2.click();

	}

	@Test(priority = 648)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_AreYouSurewant_to_delete_text_648(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Are you sure you want to delete Account ****  ?");

		} else {
			System.out.println("Test:648, Are you sure you want to delete Account ****  ? text are not present");
		}

	}

	@Test(priority = 649)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_YesDeleteCard_Text_and_Button_649(String CommonLocator,
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
			System.out.println("Test:649, Yes, delete card text are not present");
		}

	}

	@Test(priority = 650)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PostPay_Account_NoCancel_Text_and_Button_650(String CommonLocator,
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
			System.out.println("Test:650, No, cancel text are not present");
		}

	}

	@Test(priority = 651)
	public void Test_Add_PostPay_GoBack_To_HomeScreen_651() throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		HelperMethods.waitForPageLoaded();

	}

}
