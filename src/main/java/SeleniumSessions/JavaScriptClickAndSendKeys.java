package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClickAndSendKeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");

		WebElement ele = driver.findElement(By.id("persistent"));
		Thread.sleep(3000);
		// Exception in thread "main"
		// org.openqa.selenium.ElementNotInteractableException: element not interactable
		// 1. option
//		ele.click();

		// 2. option Actions class
//		Actions act = new Actions(driver);
//		act.click(ele).build().perform(); // working

		// 3. option js click
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.clickElementByJS(ele);

		jsUtil.sendKeysUsingWithId("login-username", "rupal@yahoo.com");

	}

}
