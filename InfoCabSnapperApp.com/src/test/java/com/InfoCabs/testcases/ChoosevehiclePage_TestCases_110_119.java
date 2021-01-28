package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

public class ChoosevehiclePage_TestCases_110_119 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 110)
	@Parameters({ "CommonLocator" })
	public void Test_ChoosevehiclePage_Choosevehicle_Text_110(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			HelperMethods.waitForPageLoaded();
			Assert.assertEquals(Get_text1, "Choose a vehicle");

		} else {
			System.out.println("Test:110, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 111)
	@Parameters("CommonLocator")
	public void Test_ChoosevehiclePage_CheckBothAddressAre_Added_111(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean Icon = driver.findElement(By.id(CommonLocator + "et_address")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 112)
	@Parameters("CommonLocator")
	public void Test_ChoosevehiclePage_CarImage_arePresent_112(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_car")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 113)
	@Parameters("CommonLocator")
	public void Test_ChoosevehiclePage_SaloonCar_Text_arePresent_113(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Saloon");

		} else {
			System.out.println("Test:113, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 114)
	@Parameters("CommonLocator")
	public void Test_ChoosevehiclePage_EstimatedFares_Text_arePresent_114(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_hint"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Estimated fare");

		} else {
			System.out.println("Test:114, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 115)
	@Parameters("CommonLocator")
	public void Test_ChoosevehiclePage_FaresValue_inNumbers_115(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean Icon = driver.findElement(By.id(CommonLocator + "tv_price")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 116)
	@Parameters("CommonLocator")
	public void Test_ChoosevehiclePage_BookNow_Button_Text_arePresent_116(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_book_now"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Book Now");

		} else {
			System.out.println("Test:116, Choose a vehicle Screen have some issue");
		}
	}

	@Test(priority = 117)
	@Parameters("CommonLocator")
	public void Test_ChoosevehiclePage_RideLater_Button_Text_arePresent_117(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_ride_later"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Schedule Ride");

		} else {
			System.out.println("Test:117, Choose a vehicle Screen have some issue");
		}
	}

	/*@Test(priority = 118)
	@Parameters("CommonLocator")
	public void Test_ChoosevehiclePage_6SeaterCar_Text_arePresent_118(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "car_name"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "6 Seater");

		} else {
			System.out.println("Test:118, Choose a vehicle Screen have some issue");
		}
	}*/

	@Test(priority = 119)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_ClickOn_BookNow_Button_119(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_book_now"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
	}

}
