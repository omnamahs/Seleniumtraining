package SeleniumBasics;

import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
public static void main(String[] args) {
	//hover();
	//keyboardevents();
	//click();
	//scrolling();
	dragdrop();
}
public static void hover() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.myntra.com/shop/kids");
	WebElement kidsmenu = driver.findElement(By.xpath("//a[@data-group='kids']"));
	Actions act = new Actions(driver);
	act.moveToElement(kidsmenu).perform();
	
	
}
//keyboard actions 
private static void keyboardevents() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement username =driver.findElement(By.id("email"));
	Actions act = new Actions(driver);
    act.moveToElement(username).keyDown(Keys.SHIFT).sendKeys("testemail").keyUp(Keys.SHIFT);
    act.keyDown(Keys.TAB).perform();
	
}



//double click & right click
private static void click() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	Actions act = new Actions(driver);
	//act.doubleClick().perform();
	act.contextClick(username).perform();
}


//Scrolling
private static void scrolling() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Actions act = new Actions(driver);
	act.scrollByAmount(0, 1000).perform();
}



//drag & drop
private static void dragdrop() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://jqueryui.com/");
	System.out.println(driver.findElement(By.tagName("iframe")).getSize());
	driver.switchTo().frame(0);
	Actions act = new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	act.dragAndDrop(source, target).perform();
	
	
}
}