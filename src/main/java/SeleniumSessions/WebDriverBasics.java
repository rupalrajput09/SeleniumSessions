package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {


//		ChromeDriver driver = new ChromeDriver();

//		FirefoxDriver driver = new FirefoxDriver();

		// Automation Steps:
		WebDriver driver = new ChromeDriver(); // launch browser
		
//		WebDriver driver = new FirefoxDriver(); // launch browser


		driver.get("https://www.amazon.com"); // enter url

		String title = driver.getTitle(); // get title
		System.out.println(title);

		// verification point / check point/ actual vs expected result
		if (title.contains("Amazon.com")) {
			System.out.println("Correct Title");
		} else {
			System.out.println("Incorrect title");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		// Automation Steps + verification point = automation testing

		driver.quit();
//		driver.close();
	}

}
