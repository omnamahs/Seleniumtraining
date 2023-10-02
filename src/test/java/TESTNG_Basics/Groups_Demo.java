package TESTNG_Basics;

import org.testng.annotations.Test;

public class Groups_Demo {
	@Test(groups = {"Mobile"})
public void MobileTc1() {
	System.out.println("Mobile tc");

}
	@Test(groups = {"Mobile"} )
public void MobileTc2() {
	System.out.println("Mobile tc2");
}
	@Test(groups = {"Mobile"})
public void MobileTc3() {
	System.out.println("Mobile tc3");
}
}
