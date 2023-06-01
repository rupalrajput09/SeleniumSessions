package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);

//		WebElement level1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
//
//		Actions act = new Actions(driver);
//		act.moveToElement(level1).build().perform();
//		Thread.sleep(1000);
//
//		WebElement level2 = driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(level2).build().perform();
//		Thread.sleep(1000);
//
//		WebElement level3 = driver.findElement(By.linkText("Tea"));
//		act.moveToElement(level3).build().perform();
//		Thread.sleep(1000);
//
//		driver.findElement(By.linkText("Exotic & Flavoured Tea")).click();
		
		By parentMenu = By.xpath("//a[@qa='categoryDD']");
//		multiLevelMenuChildMenuHandle(parentMenu, "Beverages", "Tea", "Green Tea");
		multiLevelMenuChildMenuHandle(parentMenu, "Kitchen, Garden & Pets", "Gardening","Gardening Tools");
	}
	
	public static void multiLevelMenuChildMenuHandle(By parentMenulocator, String level2LinkText,String level3LinkText,
			String level4LinkText) throws InterruptedException {
		WebElement level1 = driver.findElement(parentMenulocator);

		Actions act = new Actions(driver);
		act.moveToElement(level1).build().perform();
		Thread.sleep(1000);

		WebElement level2 = driver.findElement(By.linkText(level2LinkText));
		act.moveToElement(level2).build().perform();
		Thread.sleep(1000);

		WebElement level3 = driver.findElement(By.linkText(level3LinkText));
		act.moveToElement(level3).build().perform();
		Thread.sleep(1000);

		driver.findElement(By.linkText(level4LinkText)).click();
	}

}

// click on sources --> decide your scenario -->press function+f8 --> To freeze the screen -->clcik on element -->
// inspect the element --> so that you can inspect the element