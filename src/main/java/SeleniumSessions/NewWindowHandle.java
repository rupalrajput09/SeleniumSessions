package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindowId = driver.getWindowHandle();

		// introduced in sel4.x
//		driver.switchTo().newWindow(WindowType.TAB);// open a blank tab and driver will be on blank tab (driver
		// will switch automatically)

		driver.switchTo().newWindow(WindowType.WINDOW); // open a new window

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());

// use case - If you want to test some third party URL without disturbing your parent URL

	}

}
