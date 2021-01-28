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

public class Side_Menu_elements_verification_TestCases_568_576 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 21)
	@Parameters({ "PhoneNum", "Pwd", "CommonLocator" })
	public void Test_LoginPage_Allow_user_to_LoginWith_valid_credential_21(String PhoneNum, String Pwd,
			String CommonLocator) throws InterruptedException {

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
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L4.isDisplayed()) {
			String Get_text1 = L4.getText();
			Assert.assertEquals(Get_text1, "Add a Pickup Point");
		} else {
			System.out.println("Test:21, User are not able to login may be some issue");
		}
	}

	@Test(priority = 568)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Side_Menu_elements_verification_OpenSide_menu_568(String CommonLocator,
			String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		L1.click();
	}

	@Test(priority = 569)
	@Parameters("CommonLocator")
	public void Test_Side_Menu_elements_verification_check_Logo_is_present_569(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "ivperson")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 570)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Side_Menu_elements_verification_check_Dashboard_is_present_570(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Dashboard']"));
		WebElement L2 = driver.findElement(By.id(CommonLocator + "btn_menu"));

		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Dashboard");
			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='Dashboard']")));
			L1.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
			L2.click();

		} else {
			System.out.println("Test:570, Dashboard text are not present");
		}

	}

	@Test(priority = 571)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Side_Menu_elements_verification_check_MyProfile_is_present_571(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='My Profile']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "My Profile");
		} else {
			System.out.println("Test:571, My Profile text are not present");
		}

	}

	@Test(priority = 572)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Side_Menu_elements_verification_check_PaymentMethods_is_present_572(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Payment Methods']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Payment Methods");
		} else {
			System.out.println("Test:572, Payment Methods text are not present");
		}

	}

	@Test(priority = 573)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Side_Menu_elements_verification_check_MyTrips_is_present_573(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='My Trips']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "My Trips");
		} else {
			System.out.println("Test:573, My Trips text are not present");
		}

	}

	@Test(priority = 574)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Side_Menu_elements_verification_check_AboutUs_is_present_574(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='About Us']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "About Us");
		} else {
			System.out.println("Test:574, About Us text are not present");
		}

	}

	@Test(priority = 575)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Side_Menu_elements_verification_check_Share_is_present_575(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Share']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Share");
		} else {
			System.out.println("Test:575, Share text are not present");
		}

	}

	@Test(priority = 576)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_Side_Menu_elements_verification_check_Logout_is_present_576(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Logout']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Logout");
		} else {
			System.out.println("Test:576, Logout text are not present");
		}

	}

}
