package SeleniumSessions;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Actions act = new Actions(driver);

//		act.sendKeys(Keys.PAGE_DOWN).build().perform(); // it will not go completely down, a little bit down only
//		act.sendKeys(Keys.PAGE_DOWN).build().perform(); // partial scroll down
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//
//		act.sendKeys(Keys.PAGE_UP).build().perform();
//		act.sendKeys(Keys.PAGE_UP).build().perform();

		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();

		// refresh the page
		// keyDown means press the control key along with that press f5 also after that
		// release the Control
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		
		// sendKeys(charSequence...        )
		// charSequence is an interface in Java. String StringBuffer and StringBuilder , all three classes are 
		// implementing charSequence interface
	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String s1 = "Pooja";
		String s2 = "Gupta";
		StringBuffer s3 = new StringBuffer("Testing");
		StringBuilder s4 = new StringBuilder("Automation");
		
		// use case
		// want to enter address etc
		driver.findElement(By.name("search")).sendKeys(s1 +" "+ s2 +" "+ s3+" "+ s4);
//		driver.findElement(By.name("search")).sendKeys(null);
		
		// can I pass null with sendKeys(). No below exception on doing so
//		Exception in thread "main" java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence

		// perform .click() on any button, It will not do anything and also not throwing any exception
		driver.findElement(By.xpath("//input[@value='Login']")).click();// no exception
		
		// click on text box
		driver.findElement(By.id("input-email")).click();// no exception, it just click 
		
		// assignment
		// disable text field -- sendkeys
		// disable button -- click on it
		
	}

}
