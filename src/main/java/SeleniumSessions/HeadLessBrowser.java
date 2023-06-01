package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
//		ChromeOptions co = new ChromeOptions();
////		co.addArguments("--headless");
//
//		co.addArguments("--incognito");
//		
//		WebDriver driver = new ChromeDriver(co);
		
		
		FirefoxOptions fo = new FirefoxOptions();
		
//		fo.addArguments("--headless");
		fo.addArguments("--incognito");
		
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https:\\www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
