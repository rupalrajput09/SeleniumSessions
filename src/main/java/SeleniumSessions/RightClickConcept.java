package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		//right click -- context click --context menu
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClickBtn).build().perform();
		
		// get the text of all web element which comes after right click
		
		List<WebElement> rightClickElements = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		
//		xpath - //ul[@class = 'context-menu-list context-menu-root']//span 
		
		System.out.println(rightClickElements.size());
		
		for(WebElement e : rightClickElements) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				break;
				
				// handle the javascript pop up
			}
		}
		
		
	}

}

//Exception in thread "main" org.openqa.selenium.UnhandledAlertException: unexpected alert open: 
//{Alert text : clicked: copy}

// Here I clicked on copy and then unable to get the text of rest of the elements , so got error (here did not use break)
