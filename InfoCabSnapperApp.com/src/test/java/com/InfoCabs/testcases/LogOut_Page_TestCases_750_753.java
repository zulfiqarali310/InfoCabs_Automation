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

public class LogOut_Page_TestCases_750_753 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	
	/*@Test(priority = 749)
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
	}*/
	
	@Test(priority = 750)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_LogOut_Page_ClickTO_Open_Share_Page_750(String CommonLocator, String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		L1.click();
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();

		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Logout']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='Logout']")));
		L2.click();

	}

	@Test(priority = 751)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_LogOut_Page_check_Do_youwant_Logout_Text_751(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Do you really want to Log out?");
		} else {
			System.out.println("Test:751, Do you really want to Log out? text are not present");
		}

	}
	
	@Test(priority = 752)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_LogOut_Page_check_No_Keep_me_Login_Text_752(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_reject"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "No, Keep me logged in");

		} else {
			System.out.println("Test:752, No, Keep me logged in text are not present");
		}

	}

	@Test(priority = 753)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_LogOut_Page_check_Yes_ill_ComeBack_Text_753(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_accept"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Yes, I’ll come back later");
			Thread.sleep(3000);
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:753, Yes, I’ll come back later text are not present");
		}

	}



}
