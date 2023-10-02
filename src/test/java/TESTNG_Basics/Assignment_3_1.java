package TESTNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment_3_1 {
	@Test(dataProvider = "getdata")
	public void  getdata() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("testemail.1@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Pasword");
		
		
	}

}
