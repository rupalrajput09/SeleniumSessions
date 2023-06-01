package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//		xpath - //a[@class='menulink']
//		cssSelector - a.menulink
//		linktext = By.linkText("CONTENT")
//		WebElement ContentMenu = driver.findElement(By.className("menulink"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(ContentMenu).build().perform();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("COURSES")).click();

		By contentParentMenu = By.className("menulink");
		By coursesChildMenu = By.linkText("COURSES");

//		handleTwoLevelMenu(contentParentMenu, coursesChildMenu);
		handleTwoLevelMenu(contentParentMenu, "ARTICLES");

	}

// overloaded methods
	public static void handleTwoLevelMenu(By parentMenu, By childMenu) throws InterruptedException {
		WebElement parentLevelMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(parentLevelMenu).build().perform();

		Thread.sleep(2000);

		driver.findElement(childMenu).click();
	}

	public static void handleTwoLevelMenu(By parentMenu, String childMenuLinkText) throws InterruptedException {
		WebElement ContentMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(ContentMenu).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.linkText(childMenuLinkText)).click();
	}
}
