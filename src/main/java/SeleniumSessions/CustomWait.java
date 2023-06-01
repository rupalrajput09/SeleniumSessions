package SeleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By locator, int timeOut) {

		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("element is found ..." + locator + "in attempt : " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is found ..." + locator + "in attempt : " + attempts);

				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if (element == null) {
			System.out.println("Element is not found ... tried for " + timeOut + " secs"
					+ "with the interval of 500 milliseconds");

		}
		return element;

	}
	
	public static WebElement retryingElement(By locator, int timeOut, int pollingTime) {

		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("element is found ..." + locator + "in attempt : " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is found ..." + locator + "in attempt : " + attempts);

				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if (element == null) {
			System.out.println("Element is not found ... tried for " + timeOut + " secs"
					+ "with the interval of 500 milliseconds");

		}
		return element;

	}

	public static void main(String[] args) {
		// Custom wait means you are not allowed to use any selenium wait
		// static wait --> dynamic wait
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");
//		retryingElement(twitterLink, 20).click();
		retryingElement(twitterLink, 20, 2000).click();

	}

}
