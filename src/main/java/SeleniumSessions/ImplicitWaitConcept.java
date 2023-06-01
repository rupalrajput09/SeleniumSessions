package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // upto sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // sel4.x
		
		// implicitly wait :- is a global wait
		// it is applicable for all the web elements on the web page by default
		// not applied to the specific element 
		// will be applied when you interact with the web elements
		// cannot be used to non web elements: title, url, alerts
		
		// home page : 10 sec
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
		String label = driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");
		System.out.println(label);
				
		// product page : 20 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // sel4.x
		
		// home page : 20 sec --> 10sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//registration page : 10sec --> 5sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// we never use implicitly wait in framework

		//page --> no wait --> 0 sec : nullify of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		// WebDriver BiDi (bidirectional) -- web socket
		
	}

}
