package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {

		// new window/ new tab
		// click on ele --> new tab/ window -- browser window pop up
		// on opening a new window driver is always on parent window
		// also called cors origin policy(when you move from one domain to another)

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();

		// parent(driver is on parent window) + child window
		// window Id is a browser feature

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		String childWindowId = it.next();

		System.out.println("Parent Window Id : " + parentWindowId);
		System.out.println("Child Window Id : " + childWindowId);

		// switching work :
		driver.switchTo().window(childWindowId);
		System.out.println("child window url : " + driver.getCurrentUrl());
		driver.close(); // close child window
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url : " + driver.getCurrentUrl());
		driver.quit();

	}

}
