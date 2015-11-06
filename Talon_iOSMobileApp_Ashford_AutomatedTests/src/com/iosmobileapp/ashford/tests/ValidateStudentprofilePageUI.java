package com.iosmobileapp.ashford.tests;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.iosmobileapp.ashford.pages.StudentProfilePage;
import com.iosmobileapp.ashford.pages.HomePage;
import com.iosmobileapp.ashford.pages.LoginPage;
import com.iosmobileapp.ashford.pages.MainThreeLineMenuBarPanel;
import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.CommonMethods;
import com.iosmobileapp.ashford.utilities.GetResourceFileLocations;

public class ValidateStudentprofilePageUI {

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
	}
	
	// Test Method to verify the Functionality of the Login page.. 
	@Test
	public void verifyStudentProfilePageUI() throws IOException, InterruptedException
	{

		// Read the test data as key and values from the text file..
		Properties prop = CommonMethods.readFile(GetResourceFileLocations.CREDENTIALS);

		// Enter the UserName into the "UserName" field in Login Page..
		LoginPage.enterUserName(prop.getProperty("UserName"));

		// Enter the Password into the "Password" field in Login Page..
		LoginPage.enterPassword(prop.getProperty("Password"));

		// Click on the "Sign In" button in Login Page..
		LoginPage.clickSignInBtn();

		// Get the Existence of the "Home" Tab in the home page..
		boolean isHometab_exists = HomePage.isHomeHeader_Exists();
		// Assert to validate the Home Tab exists successfully.
		Assert.assertTrue(isHometab_exists,"Expected Home tab in home page; Actually not found");

		//click on the "ThreeLineBar" field in Home Page..
		CommonMethods.threeLineBar();

		//click on the "Ashford Profile" link in three line menu bar Page..
		MainThreeLineMenuBarPanel.clickStudentProfileID();

		// Get the Existence of the "Ashford Student Profile" header in the Ashford Student Profile page..
		boolean isAshfordProfileHeader_exists = StudentProfilePage.isAshfordStdentProfileHdr_Exists();
		// Assert to validate the "Ashford Profile header" exists successfully.
		Assert.assertTrue(isAshfordProfileHeader_exists,"Expected Ashford Stdent Profile header in Ashford Stdent Profile page; Actually not found");

		// Get the Existence of the "Three Line Menu Bar"  in the Ashford Student Profile page..
		boolean isThreeLineMenuBar_exists = StudentProfilePage.isThreeLineMenuBar_Exists();
		// Assert to validate the "Three Line Menu Bar" exists successfully.
		Assert.assertTrue(isThreeLineMenuBar_exists,"Expected Three Line Menu Bar in Ashford Stdent Profile page; Actually not found");

		// Get the Existence of the "Profile Id Picture"  in the Ashford Student Profile page..
		boolean isProfileIdPicture_exists = StudentProfilePage.isProfileIdPicture_Exists();
		// Assert to validate the "Three Line Menu Bar" exists successfully.
		Assert.assertTrue(isProfileIdPicture_exists,"Expected Profile Id Picture in Ashford Stdent Profile page; Actually not found");

		// Get the Existence of the "My Finances" link  in the Ashford Student Profile page..
		boolean isMyFinances_exists = StudentProfilePage.isMyFinancesLink_Exists();
		// Assert to validate the "My Finances" exists successfully.
		Assert.assertTrue(isMyFinances_exists,"Expected My Finances link in Ashford Stdent Profile page; Actually not found");

		// Get the Existence of the "Student ID Card" link in the Ashford Student Profile page..
		boolean isStudentIDCard_exists = StudentProfilePage.isStudentIDCardLink_Exists();
		// Assert to validate the "Student ID Card" exists successfully.
		Assert.assertTrue(isStudentIDCard_exists,"Expected Student ID Card link in Ashford Stdent Profile page; Actually not found");

		// Get the Existence of the "Set Signature" link in the Ashford Student Profile page..
		boolean isSetSignature_exists = StudentProfilePage.isSetSignatureLink_Exists();
		// Assert to validate the "Set Signature" exists successfully.
		Assert.assertTrue(isSetSignature_exists,"Expected Set Signature link in Ashford Stdent Profile page; Actually not found");

		//click on the "ThreeLineBar" field in the home Page..
		CommonMethods.threeLineBar();
		
		// Get the Existence of the "Ashford Student Profile" link in the three line menu bar page..
		boolean isAshfordProfileLink_exists = MainThreeLineMenuBarPanel.isAshfordProfileLink_Exists();
		// Assert to validate the "Ashford Profile: link exists successfully.
		Assert.assertTrue(isAshfordProfileLink_exists,"Expected Ashford Profile link in three line menu bar page; Actually not found");

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
