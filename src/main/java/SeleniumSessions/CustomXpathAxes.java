package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathAxes {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		//parent to child 
		// direct --> parent/child
		
		//website - link("https://app.hubspot.com/login");
		//form[@id='hs-login']/div
		//form[@id='hs-login']//div
		//form[@id='hs-login']//input[@id='username']
		//form[@id='hs-login']/child::div --> direct
		//form[@id='hs-login']//child::div --> direct+indirect
		
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		
		//indirect+direct --> parent//child
		
		
		
		// child to parent : backward traversing in xpath
		//input[@id='username']/parent::div
		//input[@id='username']/parent::div/parent::div
		
		//input[@id='username']/..   (Here we did not use parent tag , we use /.. to reach the patent tag)
		//input[@id='username']/../../../../../../../../../..  (reached till top , html is the top) 
		
		
		// how to reach grandparent, use ancestor keyword (ancestor will give you all direct + indirect parent)
		
		//input[@id='username']/ancestor::div
		
		//sibling
		// two types
		// website ("https://naveenautomationlabs.com/opencart/index.php?route=account/login")

		//1. preceding-sibling
		//input[@id='input-email']/preceding-sibling::label
		
		//2. following-sibling
		
		//label[@for='input-email']/following-sibling::input
		//label[@for='input-email']/following-sibling::input[@id='input-email']
		
		//website link(https://www.amazon.com/)
		
		driver.get("https://www.amazon.com/");
		
		//div[text()='Get to Know Us']/following-sibling::ul//a
		
		//div[text()='Make Money with Us']/following-sibling::ul//a
		getColumnValues("Get to Know Us");
		getColumnValues("Make Money with Us");
	}
	
	public static void getColumnValues(String columnName) {
		System.out.println("----------- Print the values for------------- " + columnName);
		List<WebElement> columnValues = driver.findElements(By.xpath("//div[text()='"+columnName+"']/following-sibling::ul//a"));
		for(WebElement e : columnValues) {
			String text = e.getText();
			System.out.println(text);
		}
		
		//its a dynamic xpath
		
		
	}
	

}
