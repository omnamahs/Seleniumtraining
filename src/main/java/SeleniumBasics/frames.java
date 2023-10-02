package SeleniumBasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
		driver.findElement(By.id("mce_0_ifr")).sendKeys("Mukesh");
	}
	

}