package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		By firstName = By.id("input-firstname");
		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(firstName), "Pooja")
//		             .sendKeys(Keys.TAB)
//		             .pause(1000)
//		             .sendKeys("Gupta")
//		             .pause(1000)
//		             .sendKeys(Keys.TAB)
//		             .sendKeys("pooja@gmail.com")
//		             .pause(1000)
//		             .sendKeys(Keys.TAB)
//		             .sendKeys("123456789")
//		             .pause(1000)
//		             .sendKeys(Keys.TAB)
//		             .sendKeys("test@123")
//		             .pause(1000)
//		             .sendKeys(Keys.TAB)
//		             .sendKeys("test@123")
//		             .pause(1000)
//		             .sendKeys(Keys.TAB)
//		             .pause(1000)
//		             .sendKeys(Keys.TAB)
//		             .pause(1000)
//		             .sendKeys(Keys.TAB)
//		             .pause(1000)
//		             .click()
//		             .pause(1000)
//		             .sendKeys(Keys.TAB)
//		             .pause(1000)
//		             .click()
//		             .build().perform();
		
		driver.get("https://www.amazon.com/");
		act.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys("TV")
			.sendKeys(Keys.ENTER)
			.build().perform();
		
		}

}
