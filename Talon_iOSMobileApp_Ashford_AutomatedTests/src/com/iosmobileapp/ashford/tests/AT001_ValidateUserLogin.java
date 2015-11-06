package com.iosmobileapp.ashford.tests;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.iosmobileapp.ashford.pages.HomePage;
import com.iosmobileapp.ashford.pages.LoginPage;
import com.iosmobileapp.ashford.pages.MainThreeLineMenuBarPanel;
import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.CommonMethods;
import com.iosmobileapp.ashford.utilities.GetResourceFileLocations;

// Unit Test for the Login Functionality in the application..
public class AT001_ValidateUserLogin 
{	
	// Set up to set the Configurations of the device..
	@BeforeTest
	public void setUp() throws Exception 
	{
		// Read the test data as the key and value pair from the text file..
		Properties prop = CommonMethods.readFile(GetResourceFileLocations.DEVICESETUP);

		// Set all the capabilities to the device..
		Appium.setUp(prop);

		// Handle the Alerts..
		CommonMethods.clickAlertPopUp();
		System.out.println("Launched the Ashford app successfully..");
	}

	// Test Method to verify the Functionality of the login page.. 
	@Test
	public void ValidateUserLogin() throws IOException, InterruptedException
	{

		// Read the test data as key and values from the text file..
		Properties prop = CommonMethods.readFile(GetResourceFileLocations.CREDENTIALS);

		// Enter the UserName into the "UserName" field in login Page..
		LoginPage.enterUserName(prop.getProperty("UserName"));

		// Enter the Password into the "Password" field in the login Page..
		LoginPage.enterPassword(prop.getProperty("Password"));

		// Click on the "Sign In" button in login page..
		LoginPage.clickSignInBtn();

		// Get the Existence of the "Home" header in the home page..
		boolean isHome_exists = HomePage.isHomeHeader_Exists();
		// Assert to validate the signed successfully.
		Assert.assertTrue(isHome_exists,"Expected Home header in home page; Actually not found");
		
		System.out.println("Successfully Logged in with valid credentials..");
			
		//click on the "ThreeLineBar" field in the home Page..
		CommonMethods.threeLineBar();
		
		// Get the Existence of the "Home" tab in the home page..
		boolean isHometab_exists = HomePage.isHomeHeader_Exists();
		// Assert to validate the signed successfully..
		Assert.assertTrue(isHometab_exists,"Expected Home tab in home page; Actually not found");
		
	}

	@AfterTest
	// Tear Down to close the driver instance.
	public void tearDown() throws Exception
	{		
		// Click on SignOut Link...
		MainThreeLineMenuBarPanel.clickSignOutLink();
		System.out.println("Successfully Logged out..");
		
		// Wait until "UserName" field exists in login page..
		LoginPage.isUserNameField_Exists();
		
		// Quit the app.. 
		Appium.driver.quit();
		System.out.println("Closed the Ashford app successfully..");
	}
}