package TESTNG_Basics;

import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount = 3)
	public void M1() {
		System.out.println("Test Case");
	}
	

}
