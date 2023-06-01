package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
//		driver.get("https://classic.crmpro.com/");
//		driver.get("https://app.hubspot.com/login");


//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title;").toString();
//		// it will give you javascript String, So convert it into toString()
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
//		jsUtil.generateAlert("This is my js alert");
//		
//		String pageText = jsUtil.getPageInnerText(); // give you inner text, useful for content texting
//		System.out.println(pageText);
//		System.out.println(pageText.contains("Task & Event Tracking"));//true

//		jsUtil.zoomChromeEdge("400.0");
		// responsive testing - 50% 100% 60%
		
//		WebElement Login = driver.findElement(By.xpath("//input[@value='Login']"));
//		jsUtil.drawBorder(Login);
		
//		WebElement form = driver.findElement(By.id("hs-login"));
//		jsUtil.drawBorder(form);
		
//		jsUtil.flash(Login);
//		jsUtil.flash(form);
		
		// use case of flash - before entering the value highlight the area ( may be at the time of demo).
		// To know where is driver now
		// drawback - When you flash it and then enter value it takes time
		// what we can do here is put a condition if the flag = true, then we want to highlight the element 
		// otherwise we don't want to highlight here
		
		
		// scrolling
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));
		jsUtil.scrollIntoView(ele);
		
		
		
		
		
		
		
		
		
		
	}

}
