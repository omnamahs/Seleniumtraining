package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("testemail@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Testingpassword");
		driver.findElement(By.name("SubmitLogin")).click();
		driver.close();
	}

}
