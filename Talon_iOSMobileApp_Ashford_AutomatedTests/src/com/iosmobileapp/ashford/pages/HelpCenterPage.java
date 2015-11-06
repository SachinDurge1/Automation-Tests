package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class HelpCenterPage {

	// Method to click on the "Talon" Icon in Help Center Page..
	public static void clickTalonIcon()
	{
		By locator_TalonIcon = AshfordLocators.HelpCenterPage.ICON_TALON;
		boolean elementFound = CommonMethods.isElementFound(locator_TalonIcon);

		if (elementFound)
		{
			WebElement talonIcon = Appium.driver.findElement(locator_TalonIcon);
			talonIcon.click();
		}
	}

	// Method to click on the "Frequently Asked Questions" Icon in Help Center Page..
	public static void clickFAQLink()
	{
		By locator_FAQLink = AshfordLocators.HelpCenterPage.LINK_FAQ;
		boolean elementFound = CommonMethods.isElementFound(locator_FAQLink);

		if (elementFound)
		{
			WebElement faqLink = Appium.driver.findElement(locator_FAQLink);
			faqLink.click();
		}
	}

	// Method to verify the "Help Center" Header from the Help center page..
	public static boolean isHelpCenterHeader_Exists() throws InterruptedException
	{
		By locator_HelpCenter = AshfordLocators.HelpCenterPage.ICON_HELPCENTER;
		boolean elementfound = CommonMethods.isElementFound(locator_HelpCenter);
		return elementfound;
	}

}
