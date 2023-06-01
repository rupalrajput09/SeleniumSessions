package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class StaleElementRefExceptionConcept {
	
	
	@FindBy(id = "input-email")
	static WebElement userId;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// web element + action
		// By locator --> web element -- action (It is better)

		By emailId = By.id("input-email");
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(emailId, "test@gmail.com");
		driver.navigate().refresh();
		elUtil.doSendKeys(emailId, "selenium@gmail.com");

		// Page factory -- class 
		// page factory worst pattern, not use
	
		userId.sendKeys("test@gmail.com");
		
		
		// ---------------
		
		WebElement ele = driver.findElement(By.id("input-email"));
		ele.sendKeys("test@gmail.com");
		driver.navigate().refresh();
		ele = driver.findElement(By.id("input-email"));

//		Thread.sleep(5000);
//		ele.clear();
		ele.sendKeys("abc@gmail.com");
		// StaleElementReferenceException: stale element reference: element is not
		// attached to the page document

		// You might get stale element - when you refresh the page/ click on back button/ forward 
	}

}
