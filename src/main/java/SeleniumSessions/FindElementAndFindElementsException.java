package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsException {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		driver.findElement(By.name("search111")).sendKeys("macbook");// Locator is incorrect

		// NoSuchElementException in case of findElement();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		List<WebElement> panelLinks = driver.findElements(By.className("list-group-item111"));// Locator is incorrect
//		System.out.println(panelLinks.size()); //0
//		
		By search = By.name("search");
		if (isElementDisplayed(search)) {
			System.out.println("enter the value");
		}
		
		// checking element is present or not by inbuilt methods
//		driver.findElement(By.id("")).isDisplayed();
//		if(driver.findElements(By.name("")).size()>0) {
//			System.out.println("Element is present");
//		}
//		

	}

	public static boolean isElementDisplayed(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		if (eleList.size() > 0) {
			System.out.println(locator + "Element is present on the page");
			return true;
		} else {
			return false;
		}
	}

}
