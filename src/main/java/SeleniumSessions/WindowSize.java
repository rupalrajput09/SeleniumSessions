package SeleniumSessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		Dimension dim = new Dimension(1000, 600); // dimension unit is pixels

		driver.manage().window().setSize(dim);

//		driver.manage().window().setSize(new Dimension(1000, 600)); // can be done like this but here object is created

		driver.get("https://www.amazon.com");

		driver.quit();

	}

}
