package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		
//		do(){
//			
//		}while(condition);
		
		// this logic is for single selection
		while (true) {
			// element is present on the 1st page
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				// select country
				selectCountry("India");
				break;
			} else {
				// pagination logic
				// click on Next link :
				WebElement next = driver.findElement(By.linkText("Next"));

				if (next.getAttribute("class").contains("disable")) {
					System.out.println("pagination is over... country is not found...");
					break;
				}
				next.click();
				Thread.sleep(1500);
			}
		}
	}

	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

}
