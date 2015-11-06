package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class HomePage {

	// Method to click on the "Calendar" icon in Home Page..
	public static void clickCalendarIcon()
	{
		By locator_Calendaricon = AshfordLocators.HomePage.ICON_CALENDER;
		boolean elementFound = CommonMethods.isElementFound(locator_Calendaricon);

		if (elementFound)
		{
			WebElement calendarIcon = Appium.driver.findElement(locator_Calendaricon);
			calendarIcon.click();
		}
	}

	// Method to click on the "Writing Center" icon in Home Page..
	public static void clickWritingCenterIcon()
	{
		By locator_WritingCenter = AshfordLocators.HomePage.ICON_WRITINGCENTER;
		boolean elementFound = CommonMethods.isElementFound(locator_WritingCenter);

		if (elementFound)
		{
			WebElement writingcenterotpn = Appium.driver.findElement(locator_WritingCenter);
			writingcenterotpn.click();
		}
	}

	// Method to click on the "Ashford Library" icon in Home Page..
	public static void clickAshfordLibraryIcon()
	{
		By locator_AshfordLibrary = AshfordLocators.HomePage.ICON_ASHFORDLIBRARY;
		boolean elementFound = CommonMethods.isElementFound(locator_AshfordLibrary);

		if (elementFound)
		{
			WebElement ashordLibrary = Appium.driver.findElement(locator_AshfordLibrary);
			ashordLibrary.click();
		}
	}

	// Method to verify the header for the successfully from Home page..
	public static boolean isHomeHeader_Exists() throws InterruptedException
	{
		By locator_HomeHeader = AshfordLocators.HomePage.HEADER_HOME;
		boolean elementfound = CommonMethods.isElementFound(locator_HomeHeader);
		return elementfound;
	}

}
