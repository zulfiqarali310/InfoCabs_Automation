package com.InfoCabs.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.InfoCabs.common.HelperMethods;
import com.InfoCabs.common.TestBase;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions; 
import static io.appium.java_client.touch.offset.ElementOption.element; 

public class Book_6_Seater_TestCases extends TestBase{
	
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
	
	@Test(priority = 22)
	@Parameters({ "CommonLocator", "DropoffAddress" })
	public void Test_Book_SaloonWith_PrmoCode_EnterDropofAddress_Cab_22(String CommonLocator, String DropoffAddress) {
		HelperMethods.waitForPageLoaded();
		driver.hideKeyboard();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement L1 = driver.findElement(By.id(CommonLocator + "btn_confirm"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "btn_confirm")));
		L1.click();
		WebElement L2 = driver.findElement(By.id(CommonLocator + "et_destination"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "et_destination")));
		L2.click();
		HelperMethods.waitForPageLoaded();
		WebElement L3 = driver.findElement(By.id(CommonLocator + "et_place_predict"));
		L3.sendKeys(DropoffAddress);
		HelperMethods.waitForPageLoaded();
		WebElement L4 = driver.findElement(By.id(CommonLocator + "text_view_address"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(CommonLocator + "text_view_address")));
		L4.click();
		HelperMethods.waitForPageLoaded();

	}
	
	@Test(priority = 24)
	@Parameters({ "CommonLocator_ClassView", "DropoffAddress" })
	public void Test_Book_SaloonWith_PrmoCode_ClickOnBookNow_Button_Cab_24(String CommonLocator_ClassView, String DropoffAddress)
			throws InterruptedException {
		HelperMethods.waitForPageLoaded();
		Actions actions = new Actions(driver);
		driver.hideKeyboard();
		Thread.sleep(3000);
		WebElement L1 = driver.findElement(By.id("com.infosun.csandroidx:id/rv_cars_list"));
		//WebElement L2 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='6 Seater']"));
		
		MobileElement element = (MobileElement) driver.findElement(By.id("com.infosun.csandroidx:id/rv_cars_list"));
		Dimension elementSize = element.getSize();
		System.out.println(elementSize);
		
		
		
		TouchAction action = new TouchAction(driver);
		 action.press(PointOption.point(1080,0))
		 .waitAction(new WaitOptions().withDuration(Duration.ofMillis(3000))) //you can change wait durations as per your requirement
		 .moveTo(PointOption.point(1080, 200))
		 .release()
		 .perform();
		
	
		  

		  //TouchAction action = new TouchAction((MobileDriver)driver);
		//Find element to swipe from left to right.
		  //WebElement ele2 = driver.findElementsById("ccom.infosun.csandroidx:id/rv_cars_list").get(3);
		  //Create swipe action chain and perform horizontal(left to right) swipe.
		  //Here swipe to point x2 Is at right side of screen. So It will swipe element from left to right.
		  //action.longPress(ele2).moveTo(x2,580).release().perform();
		  //action.longPress(ele2).release().perform();
		  
		  
		  
		
		
	
		 
		 
			
		 
		
		
		
		
		
		
		/*TouchAction().press(el0).moveTo(el1).release();
		
		WebElement L1 = driver.findElement(By.xpath("//" + CommonLocator_ClassView + "[@text='6 Seater']"));
		TouchActions action = new TouchActions(driver);
		action.scroll(L1, 10, 100);
		action.perform();*/
	

	}
	

}
