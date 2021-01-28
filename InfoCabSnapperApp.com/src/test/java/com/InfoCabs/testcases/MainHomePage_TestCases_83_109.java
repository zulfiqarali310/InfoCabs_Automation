package com.InfoCabs.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MainHomePage_TestCases_83_109 extends TestBase {

	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 83)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_AddPickUpPoint_Text_83(String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		Thread.sleep(3000);
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tvTitle"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Add a Pickup Point");

		} else {
			System.out.println("Test:83, Main Home Screen have some issue");
		}
	}

	@Test(priority = 84)
	@Parameters("CommonLocator")
	public void Test_MainHomePage_Notification_Icon_84(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		HelperMethods.waitForPageLoaded();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_notif")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 85)
	@Parameters("CommonLocator")
	public void Test_MainHomePage_PickUp_Icon_85(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_loc")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 86)
	@Parameters("CommonLocator")
	public void Test_MainHomePage_BackToLocation_Icon_86(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean Icon = driver.findElement(By.id(CommonLocator + "btnbacktoLocation")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 87)
	@Parameters("CommonLocator_ClassImageView")
	public void Test_MainHomePage_GoogleImage_Icon_87(String CommonLocator_ClassImageView) {
		HelperMethods.waitForPageLoaded();
		boolean Icon = driver.findElement(By.className(CommonLocator_ClassImageView)).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);
	}

	@Test(priority = 88)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_ConfirmPickUpButton_Text_88(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Confirm Pickup");

		} else {
			System.out.println("Test:88, Main Home Screen have some issue");
		}
	}

	@Test(priority = 89)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_ScheduleRideButton_Text_89(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "tv_schedule"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Schedule a ride");

		} else {
			System.out.println("Test:89, Main Home Screen have some issue");
		}
	}

	@Test(priority = 90)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_ChangePickup_Text_90(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "chng_pickup"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "CHANGE");
			L1.click();

		} else {
			System.out.println("Test:90, Main Home Screen have some issue");
		}
	}

	@Test(priority = 91)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_PickLocation_CrossButton_91(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_close"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "x");
			L1.click();
			HelperMethods.waitForPageLoaded();
			WebElement L2 = driver.findElement(By.id(CommonLocator + "chng_pickup"));
			L2.click();

		} else {
			System.out.println("Test:91, Pick Up Location Screen have some issue");
		}
	}

	@Test(priority = 92)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_PickupLocation_Text_92(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "location_title"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Pickup Location");

		} else {
			System.out.println("Test:92, Pickup Location Screen have some issue");
		}
	}

	@Test(priority = 93)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_FavoritePlaces_Text_93(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "fav_title"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Favorite Places");

		} else {
			System.out.println("Test:93, Pickup Location Screen have some issue");
		}
	}

	@Test(priority = 94)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_AddPickupPoint_Button_Text_94(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Confirm Pickup");

		} else {
			System.out.println("Test:94, Pickup Location Screen have some issue");
		}
	}

	@Test(priority = 95)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_CheckSearchbar_isPresent_95(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean Icon = driver.findElement(By.id(CommonLocator + "search_bar")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);

	}

	@Test(priority = 96)
	@Parameters({ "CommonLocator", "PickUpAddress" })
	public void Test_MainHomePage_AddPickUpAddress_96(String CommonLocator, String PickUpAddress) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_place_predict"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PickUpAddress);
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "clear_text"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.click();
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(PickUpAddress);

	}

	@Test(priority = 97)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_Add_AddressToFavoriteList_97(String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_fav"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		Thread.sleep(5000);
	}

	@Test(priority = 98)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_SelectPickUpAddress_98(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "text_view_address"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
	}

	@Test(priority = 99)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_Dropoff_address_icon_99(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean Icon = driver.findElement(By.id(CommonLocator + "iv_lloc")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);

	}

	@Test(priority = 100)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_ClickOn_where_are_you_heading_Text_100(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_destination"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Where are you heading?");
			L1.click();
		} else {
			System.out.println("Test:100, Main Screen having some issue with Dropoff address");
		}
	}

	@Test(priority = 101)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_Dropoffaddress_CrossButton_101(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_close"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "x");
			L1.click();
			HelperMethods.waitForPageLoaded();
			WebElement L2 = driver.findElement(By.id(CommonLocator + "et_destination"));
			L2.click();

		} else {
			System.out.println("Test:101, Dropoff Location Screen have some issue");
		}
	}

	@Test(priority = 102)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_PickupLocation_Text_102(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "location_title"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Dropoff Location");

		} else {
			System.out.println("Test:102, Dropoff Location Screen have some issue");
		}
	}

	@Test(priority = 103)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_FavoritePlaces_Text_103(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "fav_title"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "Favorite Places");

		} else {
			System.out.println("Test:103, Dropoff Location Screen have some issue");
		}
	}

	@Test(priority = 104)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_AddPickupPoint_Button_Text_104(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		System.out.println("Add Destination button removed");
		
	}

	@Test(priority = 105)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_CheckSearchbar_isPresent_105(String CommonLocator) {
		HelperMethods.waitForPageLoaded();
		boolean Icon = driver.findElement(By.id(CommonLocator + "search_bar")).isDisplayed();
		boolean expected = true;
		Assert.assertEquals(Icon, expected);

	}
	@Test(priority = 106)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_MainHomePage_AddDropoffAddress_106(String CommonLocator, String DropoffAddress) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "et_place_predict"));
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(DropoffAddress);
		HelperMethods.waitForPageLoaded();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "clear_text"));
		HelperMethods.waitForElementToBeVisible(L2);
		L2.click();
		HelperMethods.waitForElementToBeVisible(L1);
		L1.sendKeys(DropoffAddress);

	}

	@Test(priority = 107)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_Add_AddressToFavoriteList_107(String CommonLocator) throws InterruptedException {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "iv_fav"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
		Thread.sleep(5000);
	}

	@Test(priority = 108)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_SelectDropoffAddress_108(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "text_view_address"));
		HelperMethods.waitForElementToBeClickable(L1);
		L1.click();
	}
	@Test(priority = 109)
	@Parameters({ "CommonLocator" })
	public void Test_MainHomePage_DropoffAddress_ChangeButton_109(String CommonLocator) {

		HelperMethods.waitForPageLoaded();
		WebElement L1 = driver.findElement(By.id(CommonLocator + "chng_dest"));
		if (L1.isDisplayed()) {
			String Get_text1 = L1.getText();
			Assert.assertEquals(Get_text1, "CHANGE");
		} else {
			System.out.println("Test:109, Dropoff Location Screen have some issue");
		}
	}
	

}
