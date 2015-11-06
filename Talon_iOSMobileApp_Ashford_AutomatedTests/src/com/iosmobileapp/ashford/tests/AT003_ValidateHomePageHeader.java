package com.iosmobileapp.ashford.tests;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.iosmobileapp.ashford.pages.CalendarPage;
import com.iosmobileapp.ashford.pages.HomePage;
import com.iosmobileapp.ashford.pages.LoginPage;
import com.iosmobileapp.ashford.pages.MainThreeLineMenuBarPanel;
import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.CommonMethods;
import com.iosmobileapp.ashford.utilities.GetResourceFileLocations;


public class AT003_ValidateHomePageHeader {

	// Set up to set the Configurations of the device..
	@BeforeTest
	public void setUp() throws Exception 
	{

		// Read the test data as the key and value pair from the text file..
		Properties prop = CommonMethods.readFile(GetResourceFileLocations.DEVICESETUP);

		// Set all the capabilities to the device..
		Appium.setUp(prop);

		//Handle the Alerts..
		CommonMethods.clickAlertPopUp();
		System.out.println("Launched the Ashford app successfully..");
	}

	// Test Method to verify the Functionality of the home page..
	@Test
	public void ValidateHomePageHeader() throws IOException, InterruptedException
	{

		// Read the test data as key and values from the text file..
		Properties prop = CommonMethods.readFile(GetResourceFileLocations.CREDENTIALS);

		//Enter the UserName into the "UserName" field in the login page..
		LoginPage.enterUserName(prop.getProperty("UserName"));

		// Enter the Password into the "Password" field in the login page..
		LoginPage.enterPassword(prop.getProperty("Password"));

		// Click on the "Sign In" button in the login Page..
		LoginPage.clickSignInBtn();
		
		// Get the Existence of the "Home" header in the home page..
		boolean isHomeheader_exists = HomePage.isHomeHeader_Exists();
		// Assert to validate the Home Tab exists successfully.
		Assert.assertTrue(isHomeheader_exists,"Expected Home tab in home page; Actually not found");

		//Click on the "Three Line icon Bar" in the home page..
		CommonMethods.threeLineBar();
		
		// Get the Existence of the "Home" link in the three line menu bar page..
		boolean isHomeLink_exists = MainThreeLineMenuBarPanel.isHomeLink_Exists();
		// Assert to validate the Home Link exists successfully.
		Assert.assertTrue(isHomeLink_exists,"Expected Home link in Three Line Icon Bar page; Actually not found");
		
		//Click on the "Home" tab in the three line menu bar page..
		MainThreeLineMenuBarPanel.clickHomeLink();
		
		// Get the Existence of the "Home" header in the home page..
		isHomeheader_exists = HomePage.isHomeHeader_Exists();
		// Assert to validate the Home Tab exists successfully.
		Assert.assertTrue(isHomeheader_exists,"Expected Home tab in home page; Actually not found");
		
		//Click on the "calendar" icon in the home page..
		HomePage.clickCalendarIcon();
		
		// Get the Existence of the "Calendar Today" Header in the calendar page..
		boolean isTodayHeader_exists = CalendarPage.isCalendarHeader_Exists();
		// Assert to validate the Today header exists successfully.
		Assert.assertTrue(isTodayHeader_exists,"Expected Calendar Today header in Three Line Icon Bar page; Actually not found");
		
		//Click on the 'Three Line icon Bar' in Home page..
		CommonMethods.threeLineBar();
		
		// Get the Existence of the "Calendar" Link in the Three Line Icon Bar page..
		boolean isCalenderLink_exists = MainThreeLineMenuBarPanel.isCalendarLink_Exists();
		// Assert to validate the Home Link exists successfully.
		Assert.assertTrue(isCalenderLink_exists,"Expected Calendar link in Three Line Icon Bar page; Actually not found");

	}

	// Tear Down to close the driver instance..
	@AfterTest
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
