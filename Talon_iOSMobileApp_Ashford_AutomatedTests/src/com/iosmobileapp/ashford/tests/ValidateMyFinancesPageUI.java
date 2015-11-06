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
import com.iosmobileapp.ashford.pages.MyFinancesPage;
import com.iosmobileapp.ashford.pages.StudentProfilePage;
import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.CommonMethods;
import com.iosmobileapp.ashford.utilities.GetResourceFileLocations;

public class ValidateMyFinancesPageUI {
	
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
	public void VerifyMyFinancesPageUI() throws IOException, InterruptedException
	{

		// Read the test data as key and values from the text file..
		Properties prop = CommonMethods.readFile(GetResourceFileLocations.CREDENTIALS);

		// Enter the UserName into the "UserName" field in Login Page..
		LoginPage.enterUserName(prop.getProperty("UserName"));

		// Enter the Password into the "Password" field in Login Page..
		LoginPage.enterPassword(prop.getProperty("Password"));

		// Click on the "Sign In" button in Login Page..
		LoginPage.clickSignInBtn();

		// Get the Existence of the "Home" header in the home page..
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

		//click on the "My Finance" link in student profile Page..
		StudentProfilePage.clickMyFinancesLink();

		// Get the Existence of the "My Finances" Header  in the My Finance page..
		boolean isMyFinances_exists = MyFinancesPage.isMyFinancesHeader_Exists();
		// Assert to validate the "My Finances" exists successfully.
		Assert.assertTrue(isMyFinances_exists,"Expected My Finances header in My Finance page; Actually not found");
		
		// Get the Existence of the "Account Info" Tab in the My Finance page..
		boolean isAccountInfo_exists = MyFinancesPage.isAccountInfoTab_Exists();
		// Assert to validate the "Account Info" exists successfully.
		Assert.assertTrue(isAccountInfo_exists,"Expected Account Info tab in My Finance page; Actually not found");
		
		// Get the Existence of the "FA Status" Tab in the My Finance page..
		boolean isFAStatus_exists = MyFinancesPage.isFAStatusTab_Exists();
		// Assert to validate the "FA Status" exists successfully.
		Assert.assertTrue(isFAStatus_exists,"Expected FA Status tab in My Finance page; Actually not found");
		
		//click on the "Back" link in My Finances Page..
		CommonMethods.clickBackBtn();

		// Get the Existence of the "Ashford Student Profile" header in the Ashford Student Profile page..
		isAshfordProfileHeader_exists = StudentProfilePage.isAshfordStdentProfileHdr_Exists();
		// Assert to validate the "Ashford Profile header" exists successfully.
		Assert.assertTrue(isAshfordProfileHeader_exists,"Expected Ashford Stdent Profile header in Ashford Stdent Profile page; Actually not found");
		
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
		
		// Quit the Ashford app.. 
		Appium.driver.quit();
		System.out.println("Closed the Ashford app successfully..");
	}

}
