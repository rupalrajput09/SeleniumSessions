package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(placeholder); //First Name
//
//		String name = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		System.out.println(name); //firstname
//		
//		String type = driver.findElement(By.id("input-firstname")).getAttribute("type");
//		System.out.println(type);//text
//		
//		String loginUrl = driver.findElement(By.linkText("Login")).getAttribute("href");
//		System.out.println(loginUrl);
//		// https://naveenautomationlabs.com/opencart/index.php?route=account/login

		By fn = By.id("input-firstname");
		By loginLink = By.linkText("Login");
		String placeholder = doGetAttributeValue(fn, "placeholder");
		String name = doGetAttributeValue(fn, "name");
		String type = doGetAttributeValue(fn, "type");
		String hrefValue = doGetAttributeValue(loginLink, "href");

		System.out.println(placeholder);
		if(placeholder.equals("First Name")) {
			System.out.println("right placeholder value -- Pass");
		}
		else {
			System.out.println("wrong place holder value -- Fail");
		}
		System.out.println(hrefValue);

	}

	public static String doGetAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
