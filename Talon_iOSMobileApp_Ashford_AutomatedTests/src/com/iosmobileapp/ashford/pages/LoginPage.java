package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

// Class for maintaining the objects for the Login Page..
public class LoginPage 
{		

	// Method to click on the "Help Center" icon in Login Page..
	public static void clickHelpCenterIcon()
	{
		By locator_HelpCenterIcon = AshfordLocators.LoginPage.ICON_HELPCENTER;
		boolean elementFound = CommonMethods.isElementFound(locator_HelpCenterIcon);

		if (elementFound)
		{
			WebElement helpCenterIcon = Appium.driver.findElement(locator_HelpCenterIcon);
			helpCenterIcon.click();
		}
	}

	// Method to click on the "Forgot Password" link in Login Page..
	public static void clickForgotPasswordLink()
	{
		By locator_ForgotPassword = AshfordLocators.LoginPage.LINK_FORGOTPASSWORD;
		boolean elementFound = CommonMethods.isElementFound(locator_ForgotPassword);

		if (elementFound)
		{
			WebElement forgotPasswordBtn = Appium.driver.findElement(locator_ForgotPassword);
			forgotPasswordBtn.click();
		}
	}

	// Method to enter the UserName into the "UserName" field in Login Page..
	public static void enterUserName(String userName)
	{
		By locator_Username = AshfordLocators.LoginPage.FIELD_EMAILID;
		boolean elementFound = CommonMethods.isElementFound(locator_Username);

		if (elementFound)
		{   
			WebElement emailTxtBox = Appium.driver.findElement(locator_Username);	
			emailTxtBox.clear();
			emailTxtBox.sendKeys(userName);
			System.out.println("Entered the UserName in the UserID field successfully..");
		}

	}

	// Method to enter the Password into the "Password" field in Login Page..
	public static void enterPassword(String password)
	{
		By locator_Password = AshfordLocators.LoginPage.FIELD_PASSWORD;
		boolean elementFound = CommonMethods.isElementFound(locator_Password);

		if (elementFound)
		{
			WebElement passwordTxtBox = Appium.driver.findElement(locator_Password);	
			passwordTxtBox.clear();
			passwordTxtBox.sendKeys(password);
			System.out.println("Entered the Password in the password field successfully..");
		}
	}

	// Method to click on the "SignIn" button in Login Page..
	public static void clickSignInBtn()
	{
		By locator_SigninBtn = AshfordLocators.LoginPage.BUTTON_SIGNIN;
		boolean elementFound = CommonMethods.isElementFound(locator_SigninBtn);
		if (elementFound)
		{
			WebElement loginBtn = Appium.driver.findElement(locator_SigninBtn);
			try
			{
				loginBtn.click();
			} 
			catch(Exception ex)	
			{
				System.out.println("Login button in the Ashford Login Page is not clickable - Error: " + ex.getMessage());
			}
		}
	}
	

	// Method to verify the "UserName" Element in login page..
	public static boolean isUserNameField_Exists() throws InterruptedException
	{
		By locator_HomeIcon = AshfordLocators.LoginPage.FIELD_EMAILID;
		boolean elementFound = CommonMethods.isElementFound(locator_HomeIcon);
		return elementFound;
	}
	
	// Method to verify the "Password" Element in login page..
	public static boolean isPasswordField_Exists() throws InterruptedException
	{
		By locator_HomeIcon = AshfordLocators.LoginPage.FIELD_PASSWORD;
		boolean elementFound = CommonMethods.isElementFound(locator_HomeIcon);
		return elementFound;
	}
	
	// Method to verify the "Help center" Icon in login Page..
	public static boolean isHelpCenterIcon_Exists()
	{
		By locator_HelpCenterIcon = AshfordLocators.LoginPage.ICON_HELPCENTER;
		boolean elementFound = CommonMethods.isElementFound(locator_HelpCenterIcon);
		return elementFound;
	}
	
	// Method to verify the "Forgot Password" link in login Page..
	public static boolean isForgotPasswordLink_Exists()
	{
		By ForgotPasswordLink = AshfordLocators.LoginPage.LINK_FORGOTPASSWORD;
		boolean elementFound = CommonMethods.isElementFound(ForgotPasswordLink);
		return elementFound;
	}

}