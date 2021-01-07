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

public class MyProfile_SideMenue_verification_TestCases_577_587 extends TestBase {
	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 577)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_MyProfile_SideMenue_verification_Section_are_Opened_577(String CommonLocator,
			String Sidermenue_CommonText) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='My Profile']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "My Profile");
			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='My Profile']")));
			L1.click();
		} else {
			System.out.println("Test:577, My Profile section are not opened");
		}

	}

	@Test(priority = 578)
	@Parameters("CommonLocator")
	public void Test_MyProfile_SideMenue_verification_check_BackButton_is_present_578(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_back")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 579)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_MyProfile_SideMenue_verification_arrwo_button_closed_sidemenu_579(String CommonLocator,
			String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_back"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "iv_back")));
		L1.click();
	}

	@Test(priority = 580)
	@Parameters({ "CommonLocator", "Sidermenue_CommonText" })
	public void Test_MyProfile_SideMenue_verification_are_opened_again_580(String CommonLocator,
			String Sidermenue_CommonText) {

		HelperMethods.waitForPageLoaded();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_menu"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_menu")));
		L1.click();

		WebElement L2 = driver.findElement(By.xpath(Sidermenue_CommonText + "[@text='My Profile']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Sidermenue_CommonText + "[@text='My Profile']")));
		L2.click();

	}

	@Test(priority = 581)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_MyProfile_SideMenue_verification_check_MyProfile_is_present_581(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='My Profile']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "My Profile");
		} else {
			System.out.println("Test:581, My Profile text are not present");
		}

	}

	@Test(priority = 582)
	@Parameters("CommonLocator")
	public void Test_MyProfile_SideMenue_verification_check_Profileimage_is_present_582(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "iv_profile")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 583)
	@Parameters({ "CommonLocator", "Name" })
	public void Test_MyProfile_SideMenue_verification_check_Username_text_is_present_583(String CommonLocator,
			String Name) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, Name);
		} else {
			System.out.println("Test:583, Name text are not present");
		}

	}

	@Test(priority = 584)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_MyProfile_SideMenue_verification_check_ChangePwd_text_is_present_584(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Change Password']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Change Password");
		} else {
			System.out.println("Test:584, Change Password text are not present");
		}

	}

	@Test(priority = 585)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_MyProfile_SideMenue_verification_check_LogOut_text_is_present_585(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Logout']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Logout");
		} else {
			System.out.println("Test:585, Logout text are not present");
		}

	}

	@Test(priority = 586)
	@Parameters("CommonLocator")
	public void Test_MyProfile_SideMenue_verification_check_ChangePwdwithIcon_is_present_586(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "chng_pass")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 587)
	@Parameters("CommonLocator")
	public void Test_MyProfile_SideMenue_verification_check_logout_is_present_587(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean ImageLogo = driver.findElement(By.id(CommonLocator + "logout")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(ImageLogo, expected);
	}

	@Test(priority = 588)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_MyProfile_SideMenue_verification_check_ClickOn_LogOutButton_588(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='Logout']"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Logout");
			Thread.sleep(3000);
			L1.click();
		} else {
			System.out.println("Test:588, Logout text are not present");
		}

	}

	@Test(priority = 589)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_MyProfile_SideMenue_verification_check_Do_youwant_Logout_Text_589(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_text"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Do you really want to Log out?");
		} else {
			System.out.println("Test:589, Do you really want to Log out? text are not present");
		}

	}

	@Test(priority = 590)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_MyProfile_SideMenue_verification_check_Yes_ill_ComeBack_Text_590(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_accept"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Yes, I’ll come back later");
		} else {
			System.out.println("Test:590, Yes, I’ll come back later text are not present");
		}

	}

	@Test(priority = 591)
	@Parameters({ "CommonLocator", "CommonLocator_ClassView" })
	public void Test_MyProfile_SideMenue_verification_check_No_Keep_me_Login_Text_591(String CommonLocator,
			String CommonLocator_ClassView) throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_reject"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "No, Keep me logged in");
			Thread.sleep(3000);
			L1.click();
			HelperMethods.waitForPageLoaded();
		} else {
			System.out.println("Test:590, No, Keep me logged in text are not present");
		}

	}

}
