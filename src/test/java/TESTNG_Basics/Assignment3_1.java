package TESTNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3_1 {
	@Test(dataProvider = "getdata")
	public void login() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("testemail@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
	}
	@DataProvider
public Object[][] getdata() {
		Object[][] data = new Object[2][2];
	data[0][0] = "testemail@gmail.com";
	data[0][1] = "Password";
	return data;
	
}
}