package com.iosmobileapp.ashford.tests;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.iosmobileapp.ashford.pages.StudentProfilePage;
import com.iosmobileapp.ashford.pages.CalendarPage;
import com.iosmobileapp.ashford.pages.HomePage;
import com.iosmobileapp.ashford.pages.LoginPage;
import com.iosmobileapp.ashford.pages.MainThreeLineMenuBarPanel;
import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.CommonMethods;
import com.iosmobileapp.ashford.utilities.GetResourceFileLocations;

public class AT004_ValidateMainThreeLineMenuBar {

	
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

		// Test Method to verify the Functionality of the Login page.. 
		@Test
		public void ValidateMainThreeLineMenuBar() throws IOException, InterruptedException
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
			
			// Get the Existence of the "Ashford Student Profile" Tab in the Ashford Stdent Profile page..
			boolean isAshfordProfileHeader_exists = StudentProfilePage.isAshfordStdentProfileHdr_Exists();
			// Assert to validate the "Ashford Profile header" exists successfully.
			Assert.assertTrue(isAshfordProfileHeader_exists,"Expected Ashford Stdent Profile header in Ashford Stdent Profile page; Actually not found");
			
			//click on the "ThreeLineBar" icon in Ashford Profile Page..
			CommonMethods.threeLineBar();
			
			// Get the Existence of the "Ashford Student Profile" link in the three line menu bar page..
			boolean isAshfordProfileLink_exists = MainThreeLineMenuBarPanel.isAshfordProfileLink_Exists();
			// Assert to validate the "Ashford Profile: link exists successfully.
			Assert.assertTrue(isAshfordProfileLink_exists,"Expected Ashford Profile link in three line menu bar page; Actually not found");
			
			
			//click on the "Home" link in three line menu bar Page..
			MainThreeLineMenuBarPanel.clickHomeLink();
			
			// Get the Existence of the "Home" Tab in the home page..
			isHometab_exists = HomePage.isHomeHeader_Exists();
			// Assert to validate the Home Tab exists successfully.
			Assert.assertTrue(isHometab_exists,"Expected Home tab in home page; Actually not found");
			
			//click on the "ThreeLineBar" icon in Home Page..
			CommonMethods.threeLineBar();
			
			// Get the Existence of the "Home" Link in the three line menu bar page..
			boolean isHomeLink_exists = MainThreeLineMenuBarPanel.isHomeLink_Exists();
			// Assert to validate the Home Link exists successfully.
			Assert.assertTrue(isHomeLink_exists,"Expected Home link in three line menu bar page; Actually not found");
			
			//click on the "Calendar" link in three line menu bar Page..
			MainThreeLineMenuBarPanel.clickCalendarLink();
			
			// Get the Existence of the "Calendar Today" Header in the Calendar page..
			boolean isTodayHeader_exists = CalendarPage.isCalendarHeader_Exists();
			// Assert to validate the Home Link exists successfully.
			Assert.assertTrue(isTodayHeader_exists,"Expected Calendar Today header in three line menu bar page; Actually not found");
			
			//click on the "ThreeLineBar" icon in Calendar Page..
			CommonMethods.threeLineBar();
			
			// Get the Existence of the "Calendar" Link in the three line menu bar page..
			boolean isCalendarLink_exists = MainThreeLineMenuBarPanel.isCalendarLink_Exists();
			// Assert to validate the Home Link exists successfully.
			Assert.assertTrue(isCalendarLink_exists,"Expected Calendar link in three line menu bar page; Actually not found");
			
			//click on the "New & Alerts" link in three line menu bar Page..
			MainThreeLineMenuBarPanel.clickNewAlertsLink();
			
			//click on the "ThreeLineBar" icon in News & Alerts Page..
			CommonMethods.threeLineBar();
			
			// Get the Existence of the "New & Alerts" Link in the three line menu bar page..
			boolean isNewAlerts_exists = MainThreeLineMenuBarPanel.isNewsAlertsLink_Exists();
			// Assert to validate the Home Link exists successfully.
			Assert.assertTrue(isNewAlerts_exists,"Expected New & Alerts link in three line menu bar page; Actually not found");
			
			//click on the "Contacts" link in three line menu bar Page..
			MainThreeLineMenuBarPanel.clickContactsLink();
			
			//click on the "ThreeLineBar" icon in Contacts Page..
			CommonMethods.threeLineBar();
			
			// Get the Existence of the "Contacts" Link in the three line menu bar page..
			boolean isContacts_exists = MainThreeLineMenuBarPanel.isContacts_Exists();
			// Assert to validate the Home Link exists successfully.
			Assert.assertTrue(isContacts_exists,"Expected Contacts link in three line menu bar page; Actually not found");
			
			//click on the "Past Courses" link in three line menu bar Page..
			MainThreeLineMenuBarPanel.clickPastCoursesLink();
			
			//click on the "ThreeLineBar" icon in Past Courses Page..
			CommonMethods.threeLineBar();
			
			// Get the Existence of the "Past Courses" Link in the three line menu bar page..
			boolean isPastCourses_exists = MainThreeLineMenuBarPanel.isPastCoursesLink_Exists();
			// Assert to validate the Past Courses Link exists successfully.
			Assert.assertTrue(isPastCourses_exists,"Expected Past Courses link in three line menu bar page; Actually not found");
			
			//click on the "Future Courses" link in three line menu bar Page..
			MainThreeLineMenuBarPanel.clickFutureCoursesLink();
			
			//click on the "ThreeLineBar" icon in Future Courses Page..
			CommonMethods.threeLineBar();
			
			// Get the Existence of the "Future Courses" Link in the three line menu bar page..
			boolean isFutureCourses_exists = MainThreeLineMenuBarPanel.isFutureCoursesLink_Exists();
			// Assert to validate the Future Courses Link exists successfully.
			Assert.assertTrue(isFutureCourses_exists,"Expected Future Courses link in three line menu bar page; Actually not found");
			
			//click on the "Help Center" link in three line menu bar Page..
			MainThreeLineMenuBarPanel.clickHelpCenterLink();
			
			//click on the "ThreeLineBar" icon in Help Center Page..
			CommonMethods.threeLineBar();
			
			// Get the Existence of the "Help Center" Link in the three line menu bar page..
			boolean isHelpCenter_exists = MainThreeLineMenuBarPanel.isPastCoursesLink_Exists();
			// Assert to validate the Help Center Link exists successfully.
			Assert.assertTrue(isHelpCenter_exists,"Expected Help Center link in three line menu bar page; Actually not found");
			
			
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
