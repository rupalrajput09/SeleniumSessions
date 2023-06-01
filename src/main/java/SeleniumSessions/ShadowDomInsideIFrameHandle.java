package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomInsideIFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(3000);
		//use case
		// browser
		// page
			// iframe
				// shadow DOM
					// elements
		
		String tea_JsPath = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		driver.switchTo().frame("pact");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement tea = (WebElement)js.executeScript(tea_JsPath); 
		//Exception in thread "main" org.openqa.selenium.JavascriptException: javascript error: Unexpected identifier 'type'
		//on entering wrong JS path 
		tea.sendKeys("Ginger Tea");
		
	}

}
