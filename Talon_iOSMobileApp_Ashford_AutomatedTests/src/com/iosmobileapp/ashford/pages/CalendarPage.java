package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;

import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class CalendarPage {

	// Method to verify the "Calendar Today" Header from the calendar page..
	public static boolean isCalendarHeader_Exists() throws InterruptedException
	{
		By locator_CalendarHeader = AshfordLocators.CalendarPage.HEADER_TODAY;
		boolean elementfound = CommonMethods.isElementFound(locator_CalendarHeader);
		return elementfound;
	}
}
