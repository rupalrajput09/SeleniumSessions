package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void search(String searchKey, By searchLocator, String suggName, By suggestions)
			throws InterruptedException {

		driver.findElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(3000);
		List<WebElement> suggList = driver.findElements(suggestions);
		System.out.println("Total Suggestions: " + suggList.size());

		if (suggList.size() > 0) {
			for (WebElement e : suggList) {
				String text = e.getText();
				if (text.length() > 0) {
					System.out.println(text);
					if (text.contains(suggName)) {
						e.click();
						break;
					}
					else {
						System.out.println("Suggestion value is not present");
					}
				}
				else {
					System.out.println("blank values -- no suggestion");
					break;
				}
			}
		}
		else {
			System.out.println("No search suggesstion found");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.google.com");

		By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		By search = By.name("q");
		search("Selenium", search, "supplement", suggestions);
//		search("ewqwesaewewerassdtasdadsatdt", search, "supplement", suggestions); // blank values

	}

}
