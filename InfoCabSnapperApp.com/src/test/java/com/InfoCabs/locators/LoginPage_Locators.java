package com.InfoCabs.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.InfoCabs.common.HelperMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPage_Locators {

	public static final String All_Locators = null;
	AppiumDriver<MobileElement> driver;
	HelperMethods HelpMethod = new HelperMethods();

	public LoginPage_Locators(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.android.packageinstaller:id/permission_allow_button")
	WebElement AllowDeviceDetails;
	@FindBy(how = How.ID, using = "com.android.packageinstaller:id/permission_allow_button")
	WebElement GPSAlert;

	@FindBy(how = How.ID, using = "com.infocabs.expresscars:id/iv_logo")
	WebElement ImageLogo;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Welcome Back!']")
	WebElement welcometext;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Please login to continue']")
	WebElement Continuetext;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Phone Number']")
	WebElement PhoneNumberText;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='+92']")
	WebElement CountryCode;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Forgot phone number?']")
	WebElement ForgotPhoneNumberText;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Forgot password?']")
	WebElement ForgotPasswordText;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='New User?']")
	WebElement NewUserText;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Sign up for new account']")
	WebElement SignUpText;

	@FindBy(how = How.XPATH, using = "//android.widget.EditText[@text='12345678900']")
	WebElement PhoneNumber;

	@FindBy(how = How.CLASS_NAME, using = "android.widget.EditText")
	WebElement clearPhoneNumber;

	@FindBy(how = How.ID, using = "com.infocabs.expresscars:id/et_password")
	WebElement Password;

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@text='Log In']")
	WebElement LoginButton;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Enter phone number']")
	WebElement EnterPhoneNumText;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Enter valid phone number']")
	WebElement EnterPhoneNumValidText;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Enter password']")
	WebElement EnterPasswordText;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Minimum 8 characters required']")
	WebElement EnterPasswordValidationText;
	@FindBy(how = How.ID, using = "com.infocabs.expresscars:id/text_input_end_icon")
	WebElement PasswordeyeIcon;

	@FindBy(how = How.ID, using = "com.infocabs.expresscars:id/btn_menu")
	WebElement SiderMenuButton;
	@FindBy(how = How.XPATH, using = "//android.widget.CheckedTextView[@text='Logout']")
	WebElement LogOutButton;
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Yes, I’ll come back later']")
	WebElement LogOut_Yes_Button;

	public void AllowDevice_Access() {

		HelperMethods.waitForElementToBeClickable(AllowDeviceDetails);
		AllowDeviceDetails.click();

	}

	public void AllowGPS_Access() {

		HelperMethods.presenceOfElement(GPSAlert);
		GPSAlert.click();
	}

	public String verifying_Logo_is_Present() {

		HelperMethods.waitForElementToBeVisible(ImageLogo);
		return ImageLogo.getText();
	}

	public String verifying_WelcomeText_is_Present() {

		HelperMethods.waitForElementToBeVisible(welcometext);
		return welcometext.getText();
	}

	public String verifying_ContinueText_is_Present() {

		HelperMethods.waitForElementToBeVisible(Continuetext);
		return Continuetext.getText();
	}

	public String PhoneNumber_Text() {

		HelperMethods.waitForElementToBeVisible(PhoneNumberText);
		return PhoneNumberText.getText();
	}

	public String Enter_validPhoneNumber() {

		HelperMethods.waitForElementToBeVisible(EnterPhoneNumValidText);
		return EnterPhoneNumValidText.getText();
	}

	public String Country_Code() {

		HelperMethods.waitForElementToBeVisible(CountryCode);
		return CountryCode.getText();
	}

	public String ForgotPhoneNumber_Text() {

		HelperMethods.waitForElementToBeVisible(ForgotPhoneNumberText);
		return ForgotPhoneNumberText.getText();
	}

	public void clickOnForgot_PhoneNumber() {
		HelperMethods.waitForElementToBeClickable(ForgotPhoneNumberText);
		ForgotPhoneNumberText.click();
	}

	public String ForgotPassword_Text() {

		HelperMethods.waitForElementToBeVisible(ForgotPasswordText);
		return ForgotPasswordText.getText();
	}

	public String NewUser_Text() {

		HelperMethods.waitForElementToBeVisible(NewUserText);
		return NewUserText.getText();
	}

	public String SignUP_Text() {

		HelperMethods.waitForElementToBeVisible(SignUpText);
		return SignUpText.getText();
	}

	public String PhoneNumber_requiredText() {

		HelperMethods.waitForElementToBeVisible(EnterPhoneNumText);
		return EnterPhoneNumText.getText();
	}

	public String EnterPassword_Text() {

		HelperMethods.waitForElementToBeVisible(EnterPasswordText);
		return EnterPasswordText.getText();
	}

	public String EnterPassword_Validation_Text() {

		HelperMethods.waitForElementToBeVisible(EnterPasswordValidationText);
		return EnterPasswordValidationText.getText();
	}

	public void clickOnPasswordVisibleicon() {
		HelperMethods.waitForElementToBeClickable(PasswordeyeIcon);
		PasswordeyeIcon.click();
	}

	public void typePhoneNumber(String Phonenumber) {
		HelperMethods.waitForElementToBeVisible(PhoneNumber);
		PhoneNumber.sendKeys(Phonenumber);
	}

	public void typePassword(String pwd) {
		HelperMethods.waitForElementToBeVisible(Password);
		Password.sendKeys(pwd);

	}

	public String Test_EnterPasswordVisible() {

		HelperMethods.waitForElementToBeVisible(Password);
		return Password.getText();
	}

	public void clearPhonenumber() {
		HelperMethods.presenceOfElement(clearPhoneNumber);
		clearPhoneNumber.clear();
	}

	public void clearpassword() {
		HelperMethods.presenceOfElement(Password);
		Password.clear();
	}

	public void clickOnloginButton() {
		HelperMethods.waitForElementToBeClickable(LoginButton);
		LoginButton.click();
	}

	public void clickOnSiderButton() {
		HelperMethods.waitForElementToBeClickable(SiderMenuButton);
		SiderMenuButton.click();
	}

	public void clickOnLogOutButton() {
		HelperMethods.waitForElementToBeClickable(LogOutButton);
		LogOutButton.click();
	}

	public void clickOnLogOut_Yes_Button() {
		HelperMethods.waitForElementToBeClickable(LogOut_Yes_Button);
		LogOut_Yes_Button.click();
	}

}
