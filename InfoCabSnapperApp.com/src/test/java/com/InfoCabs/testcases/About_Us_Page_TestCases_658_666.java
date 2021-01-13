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

public class About_Us_Page_TestCases_658_666 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();


	@Test(priority = 658)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_About_Us_Page_ClickTO_Open_About_Us_Page_658(String CommonLocator, String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		L1.click();

		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='About Us']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='About Us']")));
		L2.click();

	}

	@Test(priority = 659)
	@Parameters("CommonLocator")
	public void Test_About_Us_Page_check_BackButton_is_present_659(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_back")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 660)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_About_Us_Page_check_CompanyDescritption_text_is_present_660(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_description"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1,
					"Hollywoodcars is a leading minicab provider with a huddersfield wide coverage. Guaranteed on time advance booking and fast response for asap request");
		} else {
			System.out.println(
					"Test:660, Hollywoodcars is a leading minicab provider with a huddersfield wide coverage. Guaranteed on time advance booking and fast response for asap request text are not present");
		}

	}

	@Test(priority = 661)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "AppPackage" })
	public void Test_About_Us_Page_check_CompanyMobile_Number_is_present_661(String CommonLocator,
			String CommonLocator_ClassView, String AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_phone"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "01484453061");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_phone")));
			L1.click();
			Thread.sleep(5000);
			HelperMethods.waitForPageLoaded();
			driver.activateApp(AppPackage);
			HelperMethods.waitForPageLoaded();
			driver.hideKeyboard();

		} else {
			System.out.println("Test:661, Mobile Number is not present");
		}

	}

	@Test(priority = 662)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "AppPackage" })
	public void Test_About_Us_Page_check_CompanyEmail_address_is_present_662(String CommonLocator,
			String CommonLocator_ClassView, String AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_email"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "admin@hollywoodcars.co.uk");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_email")));
			L1.click();
			HelperMethods.waitForPageLoaded();
			Thread.sleep(4000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			HelperMethods.waitForPageLoaded();

		} else {
			System.out.println("Test:662, admin@hollywoodcars.co.uk email is not present");
		}

	}

	@Test(priority = 663)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "AppPackage" })
	public void Test_About_Us_Page_check_Company_Website_is_present_663(String CommonLocator,
			String CommonLocator_ClassView, String AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_website"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "www.infocabs.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_website")));
			L1.click();
			Thread.sleep(5000);
			HelperMethods.waitForPageLoaded();
			driver.activateApp(AppPackage);
			HelperMethods.waitForPageLoaded();
			driver.hideKeyboard();

		} else {
			System.out.println("Test:664, www.infocabs.com is not present");
		}

	}

	@Test(priority = 665)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView", "AppPackage" })
	public void Test_About_Us_Page_check_Company_Address_is_present_665(String CommonLocator,
			String CommonLocator_ClassView, String AppPackage) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_address"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "21 Newsome Road  HUDDERSFIELD (HD1 3FB) United Kingdom");
			wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "tv_address")));
			L1.click();
			Thread.sleep(5000);
			HelperMethods.waitForPageLoaded();
			driver.activateApp(AppPackage);
			HelperMethods.waitForPageLoaded();
			driver.hideKeyboard();

		} else {
			System.out.println("Test:665, 21 Newsome Road  HUDDERSFIELD (HD1 3FB) United Kingdom is not present");
		}

	}

	@Test(priority = 666)
	public void Test_About_Us_Page_GoBack_To_HomeScreen_666() throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		HelperMethods.waitForPageLoaded();

	}

}
