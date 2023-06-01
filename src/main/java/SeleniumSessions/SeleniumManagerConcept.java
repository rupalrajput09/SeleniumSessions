package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManagerConcept {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		
//		driver.get("www.google.com"); // Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument (it will just launch the browser)
		driver.get("https://google.com");// without www it will work , but not recommended

		String cPath = SeleniumManager.getInstance().getDriverPath(co);
		System.out.println(cPath); // C:\Users\Rupal\.cache\selenium\chromedriver\win32\111.0.5563.64\chromedriver.exe

		driver.quit();

	}

}
 	