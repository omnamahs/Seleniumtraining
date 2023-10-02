package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath_Alerts {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	driver.findElement(By.id("alertexamples")).click();
	Thread.sleep(4000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(4000);
	driver.findElement(By.id("confirmexample")).click();
	Thread.sleep(4000);
	driver.switchTo().alert().dismiss();
	
	
	
}
	
	
	
}

