package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownbutton {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/dropdown");
	WebElement dropdown = driver.findElement(By.id("dropdown"));
	Select obj = new Select(dropdown);
	obj.selectByIndex(1);
	obj.selectByValue("2");
	obj.selectByVisibleText("option2");
	
	
	
;
	}
}
