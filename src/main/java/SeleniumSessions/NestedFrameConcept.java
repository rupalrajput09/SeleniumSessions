package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");

		// Nested iframes/ frames
		// browser
		// page -- elements -- no need to go frame can interact directly with elements
		// iframe1 -- elements -- need to go to frame1 and then can interact with
		// elements
		// iframe2 -- elements
		// iframe3 -- elements
//
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("Hello");
//
//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("Helloo");
//
//		driver.switchTo().frame("pact3");
//		driver.findElement(By.id("glaf")).sendKeys("Hi");

//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("Tom");
//		
//		Exception in thread "main" org.openqa.selenium.NoSuchFrameException: No frame element found by name or id pact2
		// cannot go back to frame (pact2) from frame (pact3), cannot go in backward
		// direction

		// use parentframe() -- introduced in sel 4.x

		// currently driver is at frame(pact3) after using parentframe() , it will go to
		// frame(pact2)
//		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("jex")).sendKeys("Tom");
//		
//		// now driver is at frame(pact2)
//		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("Peter");

//		// pact 3 to pact 2
//		driver.switchTo().parentFrame();
//		// pact 2 to pact 1
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("Testing");
//
//		// driver is on pact 1 --> go to main page (default content)
//
//		driver.switchTo().defaultContent();
//		
//		String header = driver.findElement(By.cssSelector("h1.elementor-heading-title.elementor-size-default"))
//				.getText();
//		System.out.println(header); //SELECTORSHUB 	Innovation Inspired Automation!!
//
//		// pact 3 to default contect
//		
//		driver.switchTo().defaultContent(); // it will always goto defaultContent() page from any frame or pact

				//page to frame
				//f1 to f2
				//f2 to f3
				//f3 to f2
				//f2 to f1
				//f1 to f3 -- NO
				//f1 to f2  to f3 -- yes
				//f3 to default content ---> page
				//page --> f1 -> f2
				//f2 to main page --> yes with default content
				//page --> f3 -- NO
				//Page --> f2 --> NO
				//Page --> f1 --> f2 --> f3 ---> yes
			
//	driver.switchTo()
//				.frame("pact1")
//					.switchTo().frame("pact2")
//						.switchTo().frame("pact3")
//							.findElement(By.id("glaf")).sendKeys("Selenium");
//		

//		
//		driver.switchTo()
//		.frame("pact1")
//			.switchTo().frame("pact2")
//					.findElement(By.id("jex")).sendKeys("Selenium");

		driver.switchTo()
		.frame("pact1")
			.switchTo().frame("pact2")
				.switchTo().frame("pact3")
					.findElement(By.id("glaf")).sendKeys("Selenium");

		driver.switchTo().parentFrame();//pact2
		driver.findElement(By.id("jex")).sendKeys("Test");

	}

}
