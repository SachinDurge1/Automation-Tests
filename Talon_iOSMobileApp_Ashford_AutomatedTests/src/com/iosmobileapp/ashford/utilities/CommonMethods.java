package com.iosmobileapp.ashford.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Class for commonly used methods in the test scripts for Re-usability..
public class CommonMethods
{
	// Create a string variable to capture the exception message..
	public static String exceptionMsg = "";		

	// Method to check whether the element is found..
	public static boolean isElementFound(By locator)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(Appium.driver, 50);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		}
		catch (WebDriverException ex)
		{
			exceptionMsg = locator + " - element not found | element not visible!! " + ex.getMessage();                
			return false;
		}
	}

	// Method to accept the Alert Pop up..
	public static void clickAlertPopUp()
	{	   
		WebDriverWait wait = new WebDriverWait(Appium.driver, 60);

		if(wait.until(ExpectedConditions.alertIsPresent())!=null)
		{
			System.out.println("TalonQA Alert is present..");
			// Wait for Alert to be present
			Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
			myAlert.accept();
		}   
		
	}

	// Method to read the test data as key and values from the text file..
	public static Properties readFile(String path) throws IOException
	{            
		Properties prop = new Properties();
		FileInputStream inputFile = null;

		// Read the file for the path specified..
		try {			
			inputFile = new FileInputStream(path);
		} catch (FileNotFoundException e) {

			System.out.println("Exception thrown for filepath: " + path + " - " + e.getMessage());
			System.out.println("Stack Trace follows: ");
			e.printStackTrace();
		}

		// Get the properties from the file path specified..
		try {
			prop.load(inputFile);
		} catch (Exception e) {

			System.out.println("Exception thrown for filepath: " + path + " - " + e.getMessage());
			System.out.println("Stack Trace follows: ");
			e.printStackTrace();
		}

		return prop;
	}	

	// Method to Click on the "BACK" button ..
	public static void  clickBackBtn()
	{
		By locator_BackBtn = AshfordLocators.HelpCenterPage.ICON_BACK;
		boolean elementFound = CommonMethods.isElementFound(locator_BackBtn);

		if (elementFound)
		{
			WebElement backBtn = Appium.driver.findElement(locator_BackBtn);
			backBtn.click();
		}
	}

	// Method to click on the "ThreeLineBar" field in Home Page..
	public static void  threeLineBar()
	{
		By locator_threeLineBarBtn = AshfordLocators.HomePage.ICON_THREELINEBAR;
		boolean elementFound = CommonMethods.isElementFound(locator_threeLineBarBtn);

		if (elementFound)
		{
			WebElement threelineBtn = Appium.driver.findElement(locator_threeLineBarBtn);
			threelineBtn.click();
		}
	}

}