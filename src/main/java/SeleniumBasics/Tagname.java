package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagname {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	List<WebElement> urls = driver.findElements(By.tagName("a"));
	for (WebElement xyz : urls) {
		System.out.println(xyz.getText());
		
	}
	driver.close();
	
	
}
}
