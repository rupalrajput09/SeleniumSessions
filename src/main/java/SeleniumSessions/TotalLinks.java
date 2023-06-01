package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	// find out all the links on the page
	// count of links
	// link --> html tag -- <a>
	// FEs -- multiple elements
	// print the text of each link?
	// skip the blank text

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		int totalLinks = linksList.size();
		System.out.println("Total Links = " + totalLinks);

//		for (int i = 0; i < totalLinks; i++) {
//			String text = linksList.get(i).getText();
//			if (text.length() > 0) // it will skip the blank text
//			// how to remove space as well (if there is one space the length will be > 0
//			// only blanks --> " gifts cards"
//			{
//				System.out.println(i + " = " + text);
//			}
//		}

		// for each :
		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			if (text.length() > 0) {
				System.out.println(count + " = " + text);
			}
			count++;
		}

		// total images on the page
		// register page: placeholder for all the elements
		// fill the value and fetch the value
		// find all the links on the page and fetch the href value
		// find all the images on the page and fetch the alt and src values
	}

}
