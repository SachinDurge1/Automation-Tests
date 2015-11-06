package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class MainThreeLineMenuBarPanel {

	// Method to click on the "Student Profile" Tab in the three line menu bar Panel..
	public static void clickStudentProfileID()
	{
		By locator_StudentProfileID = AshfordLocators.ThreeLineMenuBarPanel.LINK_ASHFORDPROFILE;
		boolean elementFound = CommonMethods.isElementFound(locator_StudentProfileID);

		if (elementFound)
		{
			WebElement ashfordProfile = Appium.driver.findElement(locator_StudentProfileID);
			ashfordProfile.click();
		}
	}

	// Method to click on the "Home" Link in the Three Line Icon Panel..
	public static void clickHomeLink()
	{
		By locator_HomeTab = AshfordLocators.ThreeLineMenuBarPanel.LINK_HOME;
		boolean elementFound = CommonMethods.isElementFound(locator_HomeTab);

		if (elementFound)
		{
			WebElement homeTabBtn = Appium.driver.findElement(locator_HomeTab);
			homeTabBtn.click();
		}
	}

	// Method to click on the "Calendar" link in the Three Line Icon Panel..
	public static void clickCalendarLink()
	{
		By locator_CalenderLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_CALENDER;
		boolean elementFound = CommonMethods.isElementFound(locator_CalenderLink);

		if (elementFound)
		{
			WebElement calenderIcon = Appium.driver.findElement(locator_CalenderLink);
			calenderIcon.click();
		}
	}

	// Method to click on the "News & Alerts" link in the three line menu bar Panel..
	public static void clickNewAlertsLink()
	{
		By locator_NewsAlertsLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_NEWSALERTS;
		boolean elementFound = CommonMethods.isElementFound(locator_NewsAlertsLink);

		if (elementFound)
		{
			WebElement newsAlerts = Appium.driver.findElement(locator_NewsAlertsLink);
			newsAlerts.click();
		}
	}

	// Method to click on the "Contacts" link in the three line menu bar Panel..
	public static void clickContactsLink()
	{
		By locator_ContactsLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_CONTACTS;
		boolean elementFound = CommonMethods.isElementFound(locator_ContactsLink);

		if (elementFound)
		{
			WebElement contacts = Appium.driver.findElement(locator_ContactsLink);
			contacts.click();
		}
	}

	// Method to click on the "Past Courses" link in the three line menu bar Panel..
	public static void clickPastCoursesLink()
	{
		By locator_PastCoursesLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_PASTCOURSES;
		boolean elementFound = CommonMethods.isElementFound(locator_PastCoursesLink);

		if (elementFound)
		{
			WebElement pastCourses = Appium.driver.findElement(locator_PastCoursesLink);
			pastCourses.click();
		}
	}

	// Method to click on the "Future Courses" link in the three line menu bar Panel..
	public static void clickFutureCoursesLink()
	{
		By locator_FutureCoursesLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_FUTURECOURSES;
		boolean elementFound = CommonMethods.isElementFound(locator_FutureCoursesLink);

		if (elementFound)
		{
			WebElement futureCourses = Appium.driver.findElement(locator_FutureCoursesLink);
			futureCourses.click();
		}
	}

	// Method to click on the "Help Center" Link in the three line menu bar Panel..
	public static void clickHelpCenterLink()
	{
		By locator_HelpCenterLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_HELPCENTER;
		boolean elementFound = CommonMethods.isElementFound(locator_HelpCenterLink);

		if (elementFound)
		{
			WebElement helpCenter = Appium.driver.findElement(locator_HelpCenterLink);
			helpCenter.click();
		}
	}

	// Method to click on the "Sign Out" Link in the three line menu bar Panel..
	public static void clickSignOutLink()
	{
		By locator_SignOutLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_SIGNOUT;
		boolean elementFound = CommonMethods.isElementFound(locator_SignOutLink);

		if (elementFound)
		{

			WebElement signOutLink = Appium.driver.findElement(locator_SignOutLink);
			signOutLink.click();

			By locator_SignOutPopUp = AshfordLocators.ThreeLineMenuBarPanel.LINK_SIGNOUT;
			elementFound = CommonMethods.isElementFound(locator_SignOutPopUp);

			if (elementFound)
			{

				By locator_YES = AshfordLocators.ThreeLineMenuBarPanel.POPUP_YES;
				elementFound = CommonMethods.isElementFound(locator_YES);
				if(elementFound)
				{
					WebElement yesAlert = Appium.driver.findElement(locator_YES);
					yesAlert.click();
				}
			}
		}
	}

	// Method to verify the "Ashford Profile" link from the three line menu bar Panel..
	public static boolean isAshfordProfileLink_Exists() throws InterruptedException
	{
		By locator_AshfordProfile = AshfordLocators.ThreeLineMenuBarPanel.LINK_ASHFORDPROFILE;
		boolean elementfound = CommonMethods.isElementFound(locator_AshfordProfile);
		return elementfound;
	}

	// Method to verify the "Home" Link from the three line menu bar Panel..
	public static boolean isHomeLink_Exists() throws InterruptedException
	{
		By locator_HomeLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_HOME;
		boolean elementfound = CommonMethods.isElementFound(locator_HomeLink);
		return elementfound;
	}

	// Method to verify the "Calendar" Link from the three line menu bar Panel..
	public static boolean isCalendarLink_Exists() throws InterruptedException
	{
		By locator_CalenderLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_CALENDER;
		boolean elementfound = CommonMethods.isElementFound(locator_CalenderLink);
		return elementfound;
	}

	// Method to verify the "News & Alerts" Link from the three line menu bar Panel..
	public static boolean isNewsAlertsLink_Exists() throws InterruptedException
	{
		By locator_NewsAlertsLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_NEWSALERTS;
		boolean elementfound = CommonMethods.isElementFound(locator_NewsAlertsLink);
		return elementfound;
	}

	// Method to verify the "Contacts" Link from the three line menu bar Panel..
	public static boolean isContacts_Exists() throws InterruptedException
	{
		By locator_ContactsLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_CONTACTS;
		boolean elementfound = CommonMethods.isElementFound(locator_ContactsLink);
		return elementfound;
	}

	// Method to verify the "Past Courses" Link from the three line menu bar Panel..
	public static boolean isPastCoursesLink_Exists() throws InterruptedException
	{
		By locator_PastcoursesLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_PASTCOURSES;
		boolean elementfound = CommonMethods.isElementFound(locator_PastcoursesLink);
		return elementfound;
	}

	// Method to verify the "Future Courses" Link from the three line menu bar Panel..
	public static boolean isFutureCoursesLink_Exists() throws InterruptedException
	{
		By locator_FuturecoursesLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_FUTURECOURSES;
		boolean elementfound = CommonMethods.isElementFound(locator_FuturecoursesLink);
		return elementfound;
	}

	// Method to verify the "Help Center" Link from the three line menu bar Panel..
	public static boolean isHelpCenterLink_Exists() throws InterruptedException
	{
		By locator_HelpCenterLink = AshfordLocators.ThreeLineMenuBarPanel.LINK_HELPCENTER;
		boolean elementfound = CommonMethods.isElementFound(locator_HelpCenterLink);
		return elementfound;
	}
}
