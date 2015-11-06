package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class MyFinancesPage {
	
	// Method to click on the "Account Info" Tab in My Finance Page..
	public static void clickAccountInfoTab()
	{
		By locator_AccountInfoTab = AshfordLocators.MyFinancesPage.TAB_ACCOUNTINFO;
		boolean elementFound = CommonMethods.isElementFound(locator_AccountInfoTab);

		if (elementFound)
		{
			WebElement accountInfoTab = Appium.driver.findElement(locator_AccountInfoTab);
			accountInfoTab.click();
		}
	}

	// Method to click on the "FA Status" Tab in My Finance Page..
	public static void  clickFAStatusTab()
	{
		By locator_FAStatusTab = AshfordLocators.MyFinancesPage.TAB_FASTATUS;
		boolean elementFound = CommonMethods.isElementFound(locator_FAStatusTab);

		if (elementFound)
		{
			WebElement fAStatusTab = Appium.driver.findElement(locator_FAStatusTab);
			fAStatusTab.click();
		}
	}
	
	// Method to verify the "My Finances" Header from the My Finance page..
	public static boolean isMyFinancesHeader_Exists() throws InterruptedException
	{
		By locator_MyFinancesHeader = AshfordLocators.MyFinancesPage.HEADER_FINANCES;
		boolean elementfound = CommonMethods.isElementFound(locator_MyFinancesHeader);
		return elementfound;
	}
	
	// Method to verify the "Account Info" Tab from the My Finance page..
	public static boolean isAccountInfoTab_Exists() throws InterruptedException
	{
		By locator_AccountInfoTab = AshfordLocators.MyFinancesPage.TAB_ACCOUNTINFO;
		boolean elementfound = CommonMethods.isElementFound(locator_AccountInfoTab);
		return elementfound;
	}
	
	// Method to verify the "FA Status" Tab from the My Finance page..
	public static boolean isFAStatusTab_Exists() throws InterruptedException
	{
		By locator_FAStatusTab = AshfordLocators.MyFinancesPage.TAB_FASTATUS;
		boolean elementfound = CommonMethods.isElementFound(locator_FAStatusTab);
		return elementfound;
	}
}
