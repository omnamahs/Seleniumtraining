package TESTNG_Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ANNOTATIONDEMO {
	@AfterSuite
	public void aftersuite() {
		System.out.println("Sending the status report");
	}
	
@BeforeMethod

public void beforemethod() {
	System.out.println("Open the Browser");
	System.out.println("Launch the Application");
	
}
@Test
public void ValidateTitle() {
System.out.println("Validate Test case");
}

@Test
	public void validateLogin() {
		System.out.println("Validate Login Test case");
}
	@AfterMethod
	public void closebrowser() {
		System.out.println("clsoe the browser");
	}
}
//ANNOTATIONS:-

//BEFORESUITE
//BEFORETEST
//BEFORECLASS 
//BEFOREMETHOD

//TEST:-

//AFTERSUITE
//AFTERCLASS
//AFTERTEST
//AFTERMETHOD