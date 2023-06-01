package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverLaunch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();

//		WebDriver driver1 = new FirefoxDriver(); // can be done on two different browsers

		driver.get("https://www.amazon.com");
		driver1.get("https://www.google.com");

		driver = driver1;

		System.out.println(driver.getTitle()); // google

		// Generally we don't do , but interview question

	}

}
