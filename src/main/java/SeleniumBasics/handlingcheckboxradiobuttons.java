package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingcheckboxradiobuttons {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	WebElement cbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]"));
	System.out.println(cbox1.isDisplayed());
	System.out.println(cbox1.isEnabled());
	System.out.println(cbox1.isSelected());
	driver.close();
	
}
}
