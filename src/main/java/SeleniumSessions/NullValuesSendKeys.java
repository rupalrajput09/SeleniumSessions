package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullValuesSendKeys {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys(null);
		
		//Exception in thread "main" java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
		
	}

}
