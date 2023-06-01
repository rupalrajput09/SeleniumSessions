package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

//		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize(); // maximum capacity
//		driver.manage().window().fullscreen();// fir to screen
		driver.get("https://www.google.com/");

//		String pgSource = driver.getPageSource();
//		System.out.println(pgSource); // show the page source
//		
//		System.out.println(pgSource.contains("carousel_intro")); // true (if given String exist)

		driver.navigate().refresh(); // refresh the page
		driver.get(driver.getCurrentUrl());// another way to refresh the page

	}

}
