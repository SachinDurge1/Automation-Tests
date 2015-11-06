package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class AshfordPage {

	// Method to click on the "Ashford.EDU URL" field in Home Page..
	public static void clickBackToAshfordLink()
	{
		By locator_BackToAshford = AshfordLocators.FacebookPage.LINK_BACKTOASHFORD;
		boolean elementFound = CommonMethods.isElementFound(locator_BackToAshford);

		if (elementFound)
		{
			WebElement backToAshford = Appium.driver.findElement(locator_BackToAshford);
			backToAshford.click();
		}
	}
}
