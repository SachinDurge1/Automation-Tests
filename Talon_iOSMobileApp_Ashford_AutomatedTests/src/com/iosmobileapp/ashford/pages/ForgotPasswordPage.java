package com.iosmobileapp.ashford.pages;

import org.openqa.selenium.By;

import com.iosmobileapp.ashford.utilities.AshfordLocators;
import com.iosmobileapp.ashford.utilities.CommonMethods;

public class ForgotPasswordPage {

	// Method to verify the "Reset Password" header from the Forgot password page..
	public static boolean isResetPasswordHeader_Exists() throws InterruptedException
	{
		By locator_ResetPasswordHeader = AshfordLocators.ForgotPasswordPage.HEADER_RESETPASSWORD;
		boolean elementfound = CommonMethods.isElementFound(locator_ResetPasswordHeader);
		return elementfound;
	}
}
