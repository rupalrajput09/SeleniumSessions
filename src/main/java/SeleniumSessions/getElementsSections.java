package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getElementsSections {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		List<WebElement> rightPaneLinksList = driver.findElements(By.className("list-group-item"));// CSS
//
//		System.out.println(rightPaneLinksList.size() == 13); // true , just for validation purpose
//
//		for (WebElement e : rightPaneLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}

		By rightPaneLinks = By.className("list-group-item");
		By footerLinks = By.xpath("//footer//a");

//		clickElementFromPageSection(rightPaneLinks, "Forgotten Password");

		clickElementFromPageSection(footerLinks, "Site Map");

//		List<WebElement> rightPaneLinksList = getElements(rightPaneLinks);
//
//		for (WebElement e : rightPaneLinksList) {
//			String text = e.getText();
//			if (text.equals("Forgotten Password")) {
//				e.click();
//				break;
//			}
//		}

		System.out.println("--------------");
//		By rightPaneLinksList = By.className("list-group-item");

//		if(getElements(rightPaneLinksList).size() == 13) {
//			System.out.println("right panel links count is correct");
//		}
//		
//		List<String> rightPaneLinksTestList= getElementsTextList(rightPaneLinksList);
//		if(rightPaneLinksTestList.contains("My Account")) {
//			System.out.println("My account -- pass");
//		}
//		
//		if(rightPaneLinksTestList.contains("Register")) {
//			System.out.println("Register -- pass");
//		}

	}

	// Generic function for above logic
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elementsLinksList = getElements(locator);
		List<String> elesTextList = new ArrayList<String>();

		for (WebElement e : elementsLinksList) {
			String text = e.getText();
			elesTextList.add(text);
		}
		return elesTextList;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void clickElementFromPageSection(By locator, String eleText) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(eleText)) {
				e.click();
				break;
			}
		}

	}

}
