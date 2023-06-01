package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1. valid -- only for chrome -- local execution
		// ChromeDriver driver = new ChromeDriver();

		// 2. valid -- not recommended
		// SearchContext driver = new ChromeDriver();

		// 3. valid -- recommended -- local execution
		// WebDriver driver = new ChromeDriver();

		// 4. valid -- recommended -- local execution
		// RemoteWebDriver driver = new ChromeDriver();

		// 5. valid -- recommended --remote-- other machine, Selenium GRID, Cloud -
		// lemda test,
		// BrowserStack, AWS
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		// capabilities = chrome, 109

		// 6. valid -- not recommended
		// SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);

		// 7. valid -- only for chromium based browser (edge, chrome)
		// ChromiumDriver driver = new ChromeDriver();
		// ChromiumDriver driver = new EdgeDriver();

		// 8. invalid, as there is no constructor in ChromiumDriver class
		// RemoteWebDriver driver = new ChromiumDriver();

	}

}
