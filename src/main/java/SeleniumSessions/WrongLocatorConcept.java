package SeleniumSessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongLocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.findElement(By.xpath("//input[@@@title='Email' and @type==='email']")).sendKeys("test");
		// invalidSelectorException
		// NoJSAlertPresentException
		// NoSuchFrame
		//NoSuchElementException
		//StaleElementReferenceException
		//ElementNotInteractableException
		//NoSuchWindowException
		//TimeoutException - When element is not visible in (10) seconds
		//ElementClickInterceptedException - specially designed for the click operation, if not able to click on element
		
		

	}

}
