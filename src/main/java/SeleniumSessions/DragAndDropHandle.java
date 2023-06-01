package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandle {

	public static void main(String[] args) {
		
		// Selenium support only element to element drag		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
//		action.dragAndDrop(source, target).build().perform();
		// all the action perform by Actions class have to be build and performed
		// build() method check how many actions do you want to perform (you build it and perform on web page, here 
		// only one action)
		
		// if we do not want to use dranAndDrop() then any other action
		// yes
		
		action.clickAndHold(source)
							.moveToElement(target)
								.release().build().perform();
		// here we have performed 3 actions
		
		// what if I don't write build().perform()
		
//		action.clickAndHold(source)
//		.moveToElement(target)
//			.release();
		// neither it will do anything nor giving any error
		// because you have written all the actions correctly but you are not building it and perform it on the page.
		
		
		
		
		
		
		
		
		
		
		
	}

}
