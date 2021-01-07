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

public class LogOut_Page_TestCases_662_665 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 662)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_LogOut_Page_ClickTO_Open_Share_Page_662(String CommonLocator, String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		L1.click();

		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='Logout']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='Logout']")));
		L2.click();

	}

	@Test(priority = 663)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_LogOut_Page_check_Do_youwant_Logout_Text_663(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Do you really want to Log out?");
		} else {
			System.out.println("Test:663, Do you really want to Log out? text are not present");
		}

	}

	@Test(priority = 664)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_LogOut_Page_check_Yes_ill_ComeBack_Text_664(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_accept"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Yes, I’ll come back later");
		} else {
			System.out.println("Test:664, Yes, I’ll come back later text are not present");
		}

	}

	@Test(priority = 665)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_LogOut_Page_check_No_Keep_me_Login_Text_665(String CommonLocator, String CommonLocator_ClassView)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_reject"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "No, Keep me logged in");
			Thread.sleep(3000);
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:665, No, Keep me logged in text are not present");
		}

	}

}
