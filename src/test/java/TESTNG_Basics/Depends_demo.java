package TESTNG_Basics;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Depends_demo {
public void Login() {
	System.out.println("Validating Login ");
	Assert.fail("Login Failed");
}
@Test(dependsOnMethods = {"Login"})
public void sendFriendrequest() {
	System.out.println("Sending Friendrequest");
	Assert.fail("Sending Friendrequest is not working");
}
@Test(dependsOnMethods = {"Login ,sendFriendrequest"})
public void AcceptFriendrequest() {
	System.out.println("Accepting Friendrequest");
}
}
