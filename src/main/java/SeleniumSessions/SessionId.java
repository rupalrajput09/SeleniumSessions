package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SessionId {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co); // SessionId will generate after this line
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
//		System.out.println(driver.getTitle()); // Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

		
		driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle()); 

		
		
		
		
		}

}
