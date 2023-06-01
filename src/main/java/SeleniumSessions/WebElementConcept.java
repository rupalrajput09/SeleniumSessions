package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); // sid = 123

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// create a webelement + perform action (click, sendkeys, getText, isDisplayed
		// ...)
		// findElement() + click(), sendKeys();

		// 1st approach (here we hit the sever n number of times)
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");

		// 2nd approach, use web element whenever you want

//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));

//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");

		// 3rd approach : By locator
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailId = driver.findElement(email);
//		WebElement password = driver.findElement(pwd);
//		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");

		// 4th approach : By locator and create a generic function to create a
		// webelement

//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailId = getElement(email);
//		WebElement password = getElement(pwd);
//		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");

		// 5th approach : By locator and create generic functions for webelement and
		// action

//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(email,"naveen@gmail.com");
//		doSendKeys(pwd, "naveen@123");

		// 6th approach : By locator and create generic functions for webelement and
		// action in util class

		By email = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtil eleUtil = new ElementUtil(driver); // sid = 123
		eleUtil.doSendKeys(email, "naveen@gmail.com");
		eleUtil.doSendKeys(pwd, "naveen@123");
		
		Thread.sleep(5000);
//		doClear(email);
		eleUtil.doSendKeys(email, "admin@gmail.com");

//		doClear(pwd);
		eleUtil.doSendKeys(email, "admin@123");

		
	}

	// driver.findElement() is a repetitive line , so why don't create a function to
	// call driver.findElement()
	// internally
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

	public static void doClear(By locator) {
		getElement(locator).clear();
	}
//		driver.quit();

}
