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

public class Add_CreditCards_TestCases_623_639 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 623)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_CreditCards_Click_to_Open_CardMenu_623(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_cc"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Credit Card");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_cc")));
			L1.click();

		} else {
			System.out.println("Test:623, Credit Card text are not present");
		}

	}

	@Test(priority = 624)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_CreditCards_Click_to_Cross_Button_624(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_back"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "X");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "iv_back")));
			L1.click();

		} else {
			System.out.println("Test:623, X text are not present");
		}

	}

	@Test(priority = 625)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Add_CreditCards_Again_Back_to_CreditCardPage_625(String CommonLocator,
			String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvAddPaymentMethod"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tvAddPaymentMethod")));
		L1.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "tv_cc"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_cc")));
		L2.click();

	}

	@Test(priority = 626)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_CreditCards_AddCreditCards_text_626(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_welcome"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add Credit Card");

		} else {
			System.out.println("Test:626, Add Credit Card text are not present");
		}

	}

	@Test(priority = 627)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_CreditCards_CardHolder_text_627(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Cardholder's name");

		} else {
			System.out.println("Test:627, Cardholder's name text are not present");
		}

	}

	@Test(priority = 628)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_CreditCards_Card_number_text_628(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_cc_num"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Card number");

		} else {
			System.out.println("Test:628, Card number text are not present");
		}

	}

	@Test(priority = 629)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_CreditCards_Expiry_text_629(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_expiry"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Expiry");

		} else {
			System.out.println("Test:629, Expiry text are not present");
		}

	}

	@Test(priority = 630)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_CreditCards_Expiry_text_630(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_cvv"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "CVV");

		} else {
			System.out.println("Test:630, CVV text are not present");
		}

	}

	@Test(priority = 631)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_Add_CreditCards_Expiry_text_631(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_add_card"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add Card");
		} else {
			System.out.println("Test:631, Add Card text are not present");
		}

	}

	@Test(priority = 632)
	@Parameters({ "CommonLocator", "Pwd" })
	public void Test_Add_CreditCards_Check_CardHoldername_errorMessage_632(String CommonLocator, String Pwd)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_card"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_card")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter card holder name");
			Thread.sleep(2000);

		} else {
			System.out.println("Test:632, Enter card holder name error message are not displayed");
		}

	}

	@Test(priority = 633)
	@Parameters({ "CommonLocator", "CreditCardName" })
	public void Test_Add_CreditCards_EnterCreditCardname_633(String CommonLocator, String CreditCardName)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_name"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(CreditCardName);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_card"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_card")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter card number");

		} else {
			System.out.println("Test:633, Enter card number error message are not displayed");
		}

	}

	@Test(priority = 634)
	@Parameters({ "CommonLocator", "Invalid_CreditCardNumber" })
	public void Test__Add_CreditCards_EnterCreditCardnumber_check_Validation_634(String CommonLocator,
			String Invalid_CreditCardNumber) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_cc_num"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_CreditCardNumber);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_card"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_card")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter valid card number");
			Thread.sleep(2000);
			L1.clear();

		} else {
			System.out.println("Test:634, Enter valid card number message are not displayed");
		}

	}

	@Test(priority = 635)
	@Parameters({ "CommonLocator", "Incorrect_CreditCardNumber", "ExpireDate", "CVV", "CommonLocator_ClassButton" })
	public void Test__Add_CreditCards_EnterCreditCardnumber_check_for_Incorrect_Validation_635(String CommonLocator,
			String Incorrect_CreditCardNumber, String ExpireDate, String CVV, String CommonLocator_ClassButton)
			throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_cc_num"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Incorrect_CreditCardNumber);

		WebElement L4 = driver.findElement(By.id(CommonLocator + "et_expiry"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "et_expiry")));
		L4.click();
		Thread.sleep(2000);

		WebElement L7 = driver.findElement(By.xpath("//" + CommonLocator_ClassButton + "[@text='2022']"));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//" + CommonLocator_ClassButton + "[@text='2022']")));
		L7.click();

		WebElement L8 = driver.findElement(By.xpath("//" + CommonLocator_ClassButton + "[@text='OK']"));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//" + CommonLocator_ClassButton + "[@text='OK']")));
		L8.click();

		WebElement L5 = driver.findElement(By.id(CommonLocator + "et_cvv"));
		HelperMethods.waitForElementToBeVisible(L5);
		L5.sendKeys(CVV);

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_card"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_card")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "snackbar_text"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Cards details are invalid, Make sure you are entering valid card details");

		} else {
			System.out.println(
					"Test:635, Cards details are invalid, Make sure you are entering valid card details message are not displayed");
		}

	}

	@Test(priority = 636)
	@Parameters({ "CommonLocator", "Incorrect_Pwd", "Pwd" })
	public void Test_dd_CreditCards_Number_Expire_CVV_636(String CommonLocator, String Incorrect_Pwd, String Pwd)
			throws InterruptedException {

		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_cc_num"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.clear();

		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "et_expiry"));
		HelperMethods.waitForElementToBeVisible(L3);
		L3.clear();

		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "et_cvv"));
		HelperMethods.waitForElementToBeVisible(L4);
		L4.clear();

	}

	@Test(priority = 637)
	@Parameters({ "CommonLocator", "Valid_CreditCardNumber" })
	public void Test__Add_CreditCards_EnterCreditCardnumber_check_CVVValidation_637(String CommonLocator,
			String Valid_CreditCardNumber) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_cc_num"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Valid_CreditCardNumber);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_card"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_card")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter CVV (123)");

		} else {
			System.out.println("Test:637, Enter CVV (123) message are not displayed");
		}

	}

	@Test(priority = 638)
	@Parameters({ "CommonLocator", "Invalid_CVV" })
	public void Test__Add_CreditCards_check_CVValidation_message_638(String CommonLocator, String Invalid_CVV)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_cvv"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(Invalid_CVV);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_card"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_card")));
		L2.click();

		WebElement L3 = driver.findElement(By.id(CommonLocator + "textinput_error"));
		if (L3.isDisplayed()) {
			String Get_text1 = L3.getText();
			Assert.assertEquals(Get_text1, "Enter valid CVV (123)");
			Thread.sleep(3000);
			L1.clear();

		} else {
			System.out.println("Test:638, Enter valid CVV (123) message are not displayed");
		}

	}

	@Test(priority = 639)
	@Parameters({ "CommonLocator", "CVV", "CommonLocator_ClassButton" })
	public void Test__Add_CreditCards_EnterCVV_639(String CommonLocator, String CVV, String CommonLocator_ClassButton)
			throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_cvv"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(CVV);

		WebElement L4 = driver.findElement(By.id(CommonLocator + "et_expiry"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "et_expiry")));
		L4.click();
		Thread.sleep(2000);

		WebElement L7 = driver.findElement(By.xpath("//" + CommonLocator_ClassButton + "[@text='2022']"));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//" + CommonLocator_ClassButton + "[@text='2022']")));
		L7.click();

		WebElement L8 = driver.findElement(By.xpath("//" + CommonLocator_ClassButton + "[@text='OK']"));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//" + CommonLocator_ClassButton + "[@text='OK']")));
		L8.click();

		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_add_card"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_add_card")));
		L2.click();

	}

}
