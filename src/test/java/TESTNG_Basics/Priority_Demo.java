package TESTNG_Basics;

import org.testng.annotations.Test;

public class Priority_Demo {
@Test(priority = 1)
	public void Apple() {
		System.out.println("Apple");
	}
@Test(priority = 3)
	public void Pinaaple() {
		System.out.println("Pinaaple");
	}
@Test(priority = 2)
    public void Coconut() {
    	System.out.println("Coconut"); 
    }
}
