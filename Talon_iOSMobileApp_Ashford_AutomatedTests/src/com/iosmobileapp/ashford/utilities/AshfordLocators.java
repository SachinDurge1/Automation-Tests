package com.iosmobileapp.ashford.utilities;

import org.openqa.selenium.By;

// Class for Locators in the test scripts for Re-usability..
public final  class AshfordLocators
{	
	
	// InnerClass for "Login" page locators in the test scripts..
	public static final class LoginPage {

		//Constants assigned with the locator values for the 'Login' page elements..	
		public static final By FIELD_EMAILID = By.name("Username");
		public static final By FIELD_PASSWORD = By.name("Password");
		public static final By BUTTON_SIGNIN = By.name("Go");
		public static final By LINK_FORGOTPASSWORD = By.name("Forgot Password Button");
		public static final By ICON_HELPCENTER = By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[1]");

	}
	
	// InnerClass for "Home" page locators in the test scripts..
	public static final class HomePage {

		//Constants assigned with the locator values for the 'Home' page elements..
		public static final By HEADER_HOME = By.name("Home");
		public static final By ICON_THREELINEBAR = By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[1]");
		public static final By ICON_CALENDER = By.name("ico calendar");
		public static final By ICON_WRITINGCENTER = By.name("writingcenter");
		public static final By ICON_ASHFORDLIBRARY = By.name("library");
		public static final By ICON_FACBOOK = By.name("Facebook");
		public static final By ICON_TWITTER = By.name("Twitter");
		public static final By ICON_YOUTUBE = By.name("Youtube");
		public static final By ICON_SIGNOUT = By.name("Sign Out");

	}
	
	// InnerClass for "Three Line Menu Bar" Panel locators in the test scripts..
	public static final class ThreeLineMenuBarPanel {
		
		//Constants assigned with the locator values for the 'ThreeLineIconBar' page elements..
		public static final By LINK_ASHFORDPROFILE = By.name("Ashford01's Profile");
		public static final By LINK_HOME = By.name("Home");
		public static final By LINK_CALENDER = By.name("Calendar");
		public static final By LINK_NEWSALERTS = By.name("News & Alerts");
		public static final By LINK_CONTACTS = By.name("Contacts");		
		public static final By LINK_PASTCOURSES = By.name("Past Courses");
		public static final By LINK_FUTURECOURSES = By.name("Future Courses");
		public static final By LINK_HELPCENTER = By.name("Help Center");
		public static final By LINK_SIGNOUT = By.name("Sign Out");
		public static final By POPUP_YES = By.name("YES");

	}

	// InnerClass for "Help Center" page locators in the test scripts..
	public static final class HelpCenterPage {

		//Constants assigned with the locator values for the 'Help Center' page elements..
		public static final By ICON_BACK = By.name("Back");
		public static final By ICON_HELPCENTER = By.name("Help Center");
		public static final By ICON_TALON = By.name("ico talon");
		public static final By LINK_SUPPORTNUMBER = By.name("Support Number: (800) 285-9796");
		public static final By LINK_FAQ = By.name("Frequently Asked Questions");
		public static final By LINK_VIDEOTUTORIAL = By.name("Video Tutorial");
		public static final By LINK_PRIVACYPOLICY = By.name("Privacy Policy");

	}

	// InnerClass for "Forgot Password" page locators in the test scripts..
	public static final class ForgotPasswordPage {

		//Constants assigned with the locator values for the 'Forgot Password' page elements..
		public static final By HEADER_RESETPASSWORD = By.name("Reset Password");
	}

	// InnerClass for "Facebook" page locators in the test scripts..
	public static final class FacebookPage {
		
		//Constants assigned with the locator values for the 'Facebook' page elements..
		public static final By LINK_BACKTOASHFORD = By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAStatusBar[1]/UIAButton[1]");

	}

	// InnerClass for "Calendar" page locators in the test scripts..
	public static final class CalendarPage {
		
		//Constants assigned with the locator values for the 'Calendar' page elements..
		public static final By HEADER_TODAY = By.name("Today");

	}

	// InnerClass for "StudentProfile" page locators in the test scripts..
	public static final class StudentProfilePage {

		//Constants assigned with the locator values for the 'Student Profile' page elements..
		public static final By HEADER_STUDENTPROFILE = By.name("Student Profile");
		public static final By ICON_THREELINEBAR = By.name("ico menu");
		public static final By PICTURE_PROFILEID = By.name("profile ID picture");
		//public static final By ASHFORDPROFILE_PROFILEID_PICTURE = By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[1]");
		public static final By LINK_MYFINANCES = By.name("My Finances");
		public static final By LINK_STUDENTIDCARD = By.name("Student ID Card");
		public static final By LINK_SETSIGNATURE = By.name("Set Signature");

	}

	// InnerClass for "My Finances" page locators in the test scripts..
	public static final class MyFinancesPage {

		//Constants assigned with the locator values for the 'My Finances' page elements..
		public static final By HEADER_FINANCES = By.name("My Finances");
		//public static final By MYFINANCES_BACK = By.name("Back");
		public static final By TAB_ACCOUNTINFO = By.name("Account Info");
		public static final By TAB_FASTATUS = By.name("FA Status");

	}

	// InnerClass for "Student ID Card" page locators in the test scripts..
	public static final class StudentIDCardPage {

		//Constants assigned with the locator values for the 'StudentID Card' page elements..
		public static final By PICTURE_PROFILEID = By.name("profile ID picture plain");
		//public static final By StudentIDCard_profileIDpictureplain = By.name("//UIAApplication[1]/UIAWindow[2]/UIAButton[1]");
		public static final By ICON_CLOSE = By.name("close icon");

	}

	// InnerClass for "Set Signature" page locators in the test scripts..
	public static final class SetSignaturePage {

		//Constants assigned with the locator values for the 'Set Signature' page elements..
		public static final By SIGNATURE_HEADER = By.name("Signature");
		public static final By BACK_LINK = By.name("Back");
		public static final By SAVE_BUTTON = By.name("Save");
		public static final By SIGNATURENAME_FIELD = By.name("Signature Name");
		public static final By SIGNATUREEMAIL_FIELD = By.name("Signature Email");

	}

}