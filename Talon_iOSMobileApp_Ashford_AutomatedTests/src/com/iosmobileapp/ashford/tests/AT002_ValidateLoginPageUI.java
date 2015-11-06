package com.iosmobileapp.ashford.tests;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.iosmobileapp.ashford.pages.ForgotPasswordPage;
import com.iosmobileapp.ashford.pages.HelpCenterPage;
import com.iosmobileapp.ashford.pages.LoginPage;
import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.CommonMethods;
import com.iosmobileapp.ashford.utilities.GetResourceFileLocations;

public class AT002_ValidateLoginPageUI {
	
	// Set up to set the Configurations of the device..
	@BeforeTest
	public void setUp() throws Exception 
	{
		// Read the test data as the key and value pair from the text file..
		Properties prop = CommonMethods.readFile(GetResourceFileLocations.DEVICESETUP);

		// Set all the capabilities to the device..
		Appium.setUp(prop);
		System.out.println("Launched the Ashford app successfully..");
		
		// Handle the Alerts..
		CommonMethods.clickAlertPopUp();
		
	}
	
	// Test Method to verify the Functionality of the login page.. 
		@Test
		public void verifyLoginPage() throws IOException, InterruptedException
		{
			
			// Get the Existence of the "Help Center" icon in the login page.
			boolean isHelpCenterIcon_Exists = LoginPage.isHelpCenterIcon_Exists();

			// Assert to validate the "Help Center" header exists..
			Assert.assertTrue(isHelpCenterIcon_Exists,"Expected Help Center header in Login page; Actually not found");

			// Get the Existence of the "UserName" field in the login page when click on back button in help center page..
			boolean isUserName_Exists = LoginPage.isUserNameField_Exists();

			// Assert to validate the "UserName" field exists..
			Assert.assertTrue(isUserName_Exists,"Expected UserName field in Login page; Actually not found");
			
			// Get the Existence of the "Password" field in the login page when click on back button in help center page..
			boolean isPassword_Exists = LoginPage.isPasswordField_Exists();

			// Assert to validate the "Password" field exists..
			Assert.assertTrue(isPassword_Exists,"Expected Password field in Login page; Actually not found");
			
			// Get the Existence of the "Forgot Password" link in the login page..
			boolean isForgotPassword_Exists = LoginPage.isForgotPasswordLink_Exists();

			// Assert to validate the "Forgot Password" link exists..
			Assert.assertTrue(isForgotPassword_Exists,"Expected Forgot Password link in Login page; Actually not found");
			
			// Click on the "HelpCenter" icon in the login Page..
			LoginPage.clickHelpCenterIcon();

			// Get the Existence of the "Help Center" header in the help center page.
			boolean isHelpCenter_Exists = HelpCenterPage.isHelpCenterHeader_Exists();

			// Assert to validate the "Help Center" header exists.
			Assert.assertTrue(isHelpCenter_Exists,"Expected Help Center header in Help center page; Actually not found");

			// Click on the "Back " icon in the help center page..
			CommonMethods.clickBackBtn();

			// Get the Existence of the "User name" field in the login page when click on back button in help center page..
			isUserName_Exists = LoginPage.isUserNameField_Exists();

			// Assert to validate the "UserName" field exists.
			Assert.assertTrue(isUserName_Exists,"Expected UserName field in Login page; Actually not found");

			// Click on the "Forgot password " icon in the login Page..
			LoginPage.clickForgotPasswordLink();

			// Get the Existence of the "Reset Password" header in the forgot password page..
			boolean isResetPassword_Exists = ForgotPasswordPage.isResetPasswordHeader_Exists();

			// Assert to validate the "Reset Password" header exists.
			Assert.assertTrue(isResetPassword_Exists,"Expected Reset Password headerdoes in Forgot Password page; Actually not found");

			// Click on the "Back" icon in the help center page..
			CommonMethods.clickBackBtn();

			// Get the Existence of the "UserName" field in the login page when click on back button in the forgot password page..
			isUserName_Exists = LoginPage.isUserNameField_Exists();

			// Assert to validate the "User name" element exists.
			Assert.assertTrue(isUserName_Exists,"Expected UserName field in Login page; Actually not found");

		}

		@AfterTest
		// Tear Down to close the driver instance.
		public void tearDown() throws Exception
		{		
			Appium.driver.quit();
			System.out.println("Closed the application successfully..");
		}

}
