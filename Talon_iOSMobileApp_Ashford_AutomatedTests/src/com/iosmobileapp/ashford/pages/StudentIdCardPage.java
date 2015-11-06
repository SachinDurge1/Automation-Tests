package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iosmobileapp.ashford.utilities.Appium;
import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class StudentIdCardPage {

	// Method to click on the "StudentID Card" close icon in StudentID Card Page..
	public static void  clickStudentIDCloseIcon()
	{
		By locator_StudentIDCardCloseIcon = AshfordLocators.StudentIDCardPage.ICON_CLOSE;
		boolean elementFound = CommonMethods.isElementFound(locator_StudentIDCardCloseIcon);

		if (elementFound)
		{
			WebElement studentIDCardCloseIcon = Appium.driver.findElement(locator_StudentIDCardCloseIcon);
			studentIDCardCloseIcon.click();

		}
	}
	
	// Method to verify the "StudentId Card" close icon from the StudentId Card page..
	public static boolean isStudentIdCardCloseIcon_Exists() throws InterruptedException
	{
		By locator_StudentIdCardCloseIcon = AshfordLocators.StudentIDCardPage.ICON_CLOSE;
		boolean elementfound = CommonMethods.isElementFound(locator_StudentIdCardCloseIcon);
		return elementfound;
	}
	

}
