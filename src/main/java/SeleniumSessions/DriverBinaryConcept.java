package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBinaryConcept {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		// maintain session id
		// launch browser
		
		Thread.sleep(5000);
		
		driver.quit(); // it closes the entire server.
		
//		driver.close();
	}

}
