package TESTNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class XMLParameter {
	
	@Test(dataProvider = "getdata")
	public void login(String uname, String Pwd) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("uname");
		driver.findElement(By.name("password")).sendKeys("pwd");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@DataProvider
public Object[][] getdata() {
	Object[][] data = new Object[2][2];
	data[0][0] = "Admin";
	data[0][1] = "admin123";
	data[1][0] = "Mukesh";
	data[1][1] = "M2345";
	return data;
	
	
}
}
