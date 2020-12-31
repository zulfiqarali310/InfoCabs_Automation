package com.InfoCabs.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.InfoCabs.common.HelperMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ForgotPhoneNumber_Locators {

	AppiumDriver<MobileElement> driver;
	HelperMethods HelpMethod = new HelperMethods();

	public ForgotPhoneNumber_Locators(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Forgot Phone number?']")
	WebElement ForgotPhonText_Verification;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Enter your registered email address to get your phone number.']")
	WebElement EnterRegisterEmail_Text_Verification;
	
	@FindBy(how = How.XPATH, using = "//android.widget.Button[@text='Send']")
	WebElement ClickOnSendButton;
	
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Email is required']")
	WebElement Get_Validation_Messages;

	public String PhoneNumber_text_Verification() {

		HelperMethods.waitForElementToBeVisible(ForgotPhonText_Verification);
		return ForgotPhonText_Verification.getText();
	}

	public String EnterRegisterEmail_text_Verification() {

		HelperMethods.waitForElementToBeVisible(EnterRegisterEmail_Text_Verification);
		return EnterRegisterEmail_Text_Verification.getText();
	}
	
	public void clickOn_Send_Button() {
		HelperMethods.waitForElementToBeClickable(ClickOnSendButton);
		ClickOnSendButton.click();
	}
	public String GetNativeApp_ValidationMessages() {

		HelperMethods.waitForElementToBeVisible(Get_Validation_Messages);
		return Get_Validation_Messages.getText();
		
	}
	

}
