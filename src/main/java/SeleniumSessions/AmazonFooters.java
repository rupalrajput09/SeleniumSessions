package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooters {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> footerList = driver.findElements(By.xpath("//table[@class = 'navFooterMoreOnAmazon']//td/a"));
		System.out.println(footerList.size());
		
		for(WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
		}
	
	}

}
