package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

//		List<WebElement> imageList = driver.findElements(By.tagName("img"));
//		System.out.println("total images : " + imageList.size());
//		
//		
//		for(WebElement e : imageList) {
//			String altValue = e.getAttribute("alt");
//			System.out.println(altValue);
//		}

		By image = By.tagName("img");
		By links = By.tagName("a");

		int imagesCount = getElementsCount(links);
		if (imagesCount > 200) {

		}

		List<String> imagesAttrList = getElementsAttributeValue(image, "alt");
		if (imagesAttrList.contains("Beauty picks")) {
			System.out.println("Pass");
		}

		getElementsAttributeValue(links, "href");
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();// 0

		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
//			System.out.println(attrValue);
			eleAttrList.add(attrValue); // adding value in ArrayList
		}
		return eleAttrList;
	}

}
