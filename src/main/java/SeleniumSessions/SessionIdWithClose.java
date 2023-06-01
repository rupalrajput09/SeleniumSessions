package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SessionIdWithClose {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co); // SessionId will generate after this line
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		System.out.println(driver.getTitle()); // Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id

		
		driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle()); 
	}

}
