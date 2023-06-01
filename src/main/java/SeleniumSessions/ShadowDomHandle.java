package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
		
		
//		driver.get("chrome://settings/");
//		driver.findElement(By.id("searchInput")).sendKeys("notification");
		
		// browser
			// page
				// shadow DOM
					// elements
		
		
		// browser
					// page
						// iframe
							// shadow DOM
								// elements
		
//		driver.findElement(By.id("pizza")).sendKeys("veg pizza"); It won't work
		
		// TO work with shadow DOM we have to use Javascript executor
		
		String pizza_JsPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\")"
				+ ".shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js.executeScript(pizza_JsPath); // it will give you html element, 
		//So convert it into web element, bcoz selenium understands web element
		
		pizza.sendKeys("veg pizza");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
