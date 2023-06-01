package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		// Frame is available on the page
		// frame is a part of HTML DOM
		// On a web page some elements are directly available but some are available on
		// the frame
		// frame is also a web element, because its having its own HTML tag, attributes
		// but frame is also having #document
		// frame is a kind of container which is available on my page (Container of
		// different kind of elements, multiple element
		// frame is under main HTML
		// we can have multiple frames available on the page
		// Can we have nested frame (frame under a frame)

		// There are two types of frame
		// 1. frame -- according to w3c it has been deprecated, In modern its not there,
		// only in old application
		// 2. iframe

		// What is the need of frame? Why developers design the frame?
		// To secure your elements/ web elements, specially on banking or finance based
		// application. The moment you come
		// inside the frame, here are your elements they are not directly available on
		// the page
		// means any fishing activity or hacking (they do not have direct access to the
		// elements) Developers
		// provide one extra security. This is for your data (element) security on the
		// web page on UI layer.
		// use case of frame - to provide extra security

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

//		driver.findElement(By.linkText("CONTACTS")).click();
		
//		selenium.NoSuchElementException: no such element: Unable to locate element: If try to click on element
//		which is on frame and we are on web page not on frame

		// now switch to frame
		
		driver.switchTo().frame("mainpanel");		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		
	}

}
