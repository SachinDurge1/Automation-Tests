package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class StudentProfilePage {
	
	// Method to click on the "My Finances" Link in Student Profile Page..
	public static void  clickMyFinancesLink()
	{
		By locator_MyFinancesLink = AshfordLocators.StudentProfilePage.LINK_MYFINANCES;
		boolean elementFound = CommonMethods.isElementFound(locator_MyFinancesLink);

		if (elementFound)
		{
			WebElement myFinancesLink = Appium.driver.findElement(locator_MyFinancesLink);
			myFinancesLink.click();

		}
	}
	
	// Method to click on the "StudentID Card" Link in Student Profile Page..
	public static void  clickStudentIDCardLink()
	{
		By locator_StudentIDCardLink = AshfordLocators.StudentProfilePage.LINK_STUDENTIDCARD;
		boolean elementFound = CommonMethods.isElementFound(locator_StudentIDCardLink);

		if (elementFound)
		{
			WebElement myFinancesLink = Appium.driver.findElement(locator_StudentIDCardLink);
			myFinancesLink.click();

		}
	}
	
	// Method to click on the "Set Signature" Link in Student Profile Page..
	public static void  clickSetSignatureLink()
	{
		By locator_SetSignatureLink = AshfordLocators.StudentProfilePage.LINK_SETSIGNATURE;
		boolean elementFound = CommonMethods.isElementFound(locator_SetSignatureLink);

		if (elementFound)
		{
			WebElement setSignatureLink = Appium.driver.findElement(locator_SetSignatureLink);
			setSignatureLink.click();

		}
	}

	// Method to get the "Ashford Student Profile" Header from the Student Profile page..
	public static boolean isAshfordStdentProfileHdr_Exists() throws InterruptedException
	{
		By locator_AshfordProfile = AshfordLocators.StudentProfilePage.HEADER_STUDENTPROFILE;
		boolean elementfound = CommonMethods.isElementFound(locator_AshfordProfile);
		return elementfound;
	}
	
	// Method to get the "Three Line Menu Bar" Icon from the Student Profile page..
	public static boolean isThreeLineMenuBar_Exists() throws InterruptedException
	{
		By locator_ThreeLineMenuBar = AshfordLocators.StudentProfilePage.ICON_THREELINEBAR;
		boolean elementfound = CommonMethods.isElementFound(locator_ThreeLineMenuBar);
		return elementfound;
	}
	
	// Method to get the "Profile Id Picture" Icon from the Student Profile page..
	public static boolean isProfileIdPicture_Exists() throws InterruptedException
	{
		By locator_ProfileIdPicture = AshfordLocators.StudentProfilePage.PICTURE_PROFILEID;
		boolean elementfound = CommonMethods.isElementFound(locator_ProfileIdPicture);
		return elementfound;
	}
	
	// Method to get the "My Finances" Link from the Student Profile page..
	public static boolean isMyFinancesLink_Exists() throws InterruptedException
	{
		By locator_MyFinances = AshfordLocators.StudentProfilePage.LINK_MYFINANCES;
		boolean elementfound = CommonMethods.isElementFound(locator_MyFinances);
		return elementfound;
	}
	
	// Method to get the "Student ID Card" Link from the Student Profile page..
	public static boolean isStudentIDCardLink_Exists() throws InterruptedException
	{
		By locator_StudentIDCard = AshfordLocators.StudentProfilePage.LINK_STUDENTIDCARD;
		boolean elementfound = CommonMethods.isElementFound(locator_StudentIDCard);
		return elementfound;
	}
	
	// Method to get the "Set Signature" Link from the Student Profile page..
	public static boolean isSetSignatureLink_Exists() throws InterruptedException
	{
		By locator_SetSignatureCard = AshfordLocators.StudentProfilePage.LINK_SETSIGNATURE;
		boolean elementfound = CommonMethods.isElementFound(locator_SetSignatureCard);
		return elementfound;
	}
}
