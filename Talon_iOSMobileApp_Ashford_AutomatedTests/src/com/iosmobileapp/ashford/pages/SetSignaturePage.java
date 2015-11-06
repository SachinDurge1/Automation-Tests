package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;

import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class SetSignaturePage {
	
	// Method to get the "Set Signature" Header from the Set Signature page..
	public static boolean isSetSignatureHeader_Exists() throws InterruptedException
	{
		By locator_SetSignatureHeader = AshfordLocators.SetSignaturePage.SIGNATURE_HEADER;
		boolean elementfound = CommonMethods.isElementFound(locator_SetSignatureHeader);
		return elementfound;
	}

	// Method to get the "Save" button from the Set Signature page..
	public static boolean isSaveButton_Exists() throws InterruptedException
	{
		By locator_SaveButton = AshfordLocators.SetSignaturePage.SIGNATURE_HEADER;
		boolean elementfound = CommonMethods.isElementFound(locator_SaveButton);
		return elementfound;
	}
	
	// Method to get the "Signature Name" filed from the Set Signature page..
	public static boolean isSignatureNameField_Exists() throws InterruptedException
	{
		By locator_SignatureNameField = AshfordLocators.SetSignaturePage.SIGNATURE_HEADER;
		boolean elementfound = CommonMethods.isElementFound(locator_SignatureNameField);
		return elementfound;
	}
	
	// Method to get the "Signature Email" filed from the Set Signature page..
	public static boolean isSignatureEmailField_Exists() throws InterruptedException
	{
		By locator_SignatureEmailField = AshfordLocators.SetSignaturePage.SIGNATURE_HEADER;
		boolean elementfound = CommonMethods.isElementFound(locator_SignatureEmailField);
		return elementfound;
	}
	
	
}
