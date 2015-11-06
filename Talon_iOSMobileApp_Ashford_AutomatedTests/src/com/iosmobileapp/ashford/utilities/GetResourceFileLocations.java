package com.iosmobileapp.ashford.utilities;


//Class for Resources in the test scripts for Re-usability..
public final class GetResourceFileLocations {

	// Constant to get current project workspace location
	public final static String commonPath = System.getProperty("user.dir") + "/src/com/iosmobileapp/ashford/resources";
	
	// Constant for file path of device set up file..
	public final static String DEVICESETUP = commonPath + "/DeviceSetUp.txt";

	// Constant for file path of Credentials file..
	public final static String CREDENTIALS = commonPath + "/Credentials.txt";

}
