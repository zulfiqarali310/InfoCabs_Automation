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

public class Add_PaymentsMethods_TestCases_611_622 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	/*@Test(priority = 21)
	@Parameters({ "PhoneNum", "Pwd", "CommonLocator" })
	public void Test_Check_Remeber_Featur_Allow_user_to_LoginWith_valid_credential_21(String PhoneNum, String Pwd,
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
	}*/
	
	@Test(priority = 611)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Add_PaymentsMethods_are_sections_611(String CommonLocator, String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		L1.click();

		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Payment Methods']"));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='Payment Methods']")));
		L2.click();

	}

	@Test(priority = 611)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PaymentsMethods_check_PaymentMethods_is_present_611(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Payment Methods']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Payment Methods");
		} else {
			System.out.println("Test:581, Payment Methods text are not present");
		}

	}

	@Test(priority = 612)
	@Parameters("CommonLocator")
	public void Test_Add_PaymentsMethods_check_BackButton_is_present_612(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_back")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 613)
	@Parameters("CommonLocator")
	public void Test_Add_PaymentsMethods_check_CardContainer_is_present_613(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "card_container")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 614)
	@Parameters("CommonLocator")
	public void Test_Add_PaymentsMethods_check_CardIcon_is_present_614(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "ivCard")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 615)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PaymentsMethods_check_Cash_text_is_present_615(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Cash");
		} else {
			System.out.println("Test:615, Cash text are not present");
		}

	}

	@Test(priority = 616)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PaymentsMethods_check_Add_PaymentMethods_Button_is_present_616(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvAddPaymentMethod"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add Payment Method");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tvAddPaymentMethod")));
			L1.click();

		} else {
			System.out.println("Test:616, Add Payment Method text are not present");
		}

	}

	@Test(priority = 617)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Add_PaymentsMethods_CrossButton_is_Working_617(String CommonLocator,
			String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_close"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "iv_close")));
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "tvAddPaymentMethod"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tvAddPaymentMethod")));
		L2.click();

	}

	@Test(priority = 618)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PaymentsMethods_check_Add_PaymentMethods_text_is_present_618(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add a payment method");

		} else {
			System.out.println("Test:617, Add a payment method text are not present");
		}

	}

	@Test(priority = 619)
	@Parameters("CommonLocator")
	public void Test_Add_PaymentsMethods_check_CardDetails_field_is_present_619(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "rl_cc")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 620)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PaymentsMethods_check_Add_CreditCard_text_is_present_620(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_cc"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Credit Card");

		} else {
			System.out.println("Test:617, Credit Card text are not present");
		}

	}

	@Test(priority = 621)
	@Parameters("CommonLocator")
	public void Test_Add_PaymentsMethods_check_PostPayDetails_field_is_present_621(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "rl_account")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 622)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_PaymentsMethods_check_Add_PostPay_text_is_present_622(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_account"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Postpay account");

		} else {
			System.out.println("Test:622, Postpay account text are not present");
		}

	}

}
