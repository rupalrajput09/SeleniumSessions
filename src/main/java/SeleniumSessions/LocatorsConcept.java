package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// 1. id: unique attribute

		// 2. name: not

//		driver.findElement(By.name("firstname")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.name("lastname")).sendKeys("naveen@123");
//		driver.findElement(By.name("agree")).click();
//
//		By fn = By.name("firstname");
//		By check = By.name("agree");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "Tom");
//		eleUtil.doClick(check);

		// 3. class name: not unique
		driver.findElement(By.className("form-control")).sendKeys("Tomi");

		// 4. xpath : Its not an attribute. Its the address of the element in HTML DOM.
		// can be unique / can be duplicate
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Tom");

		// 5. css selector : Its not an attribute.
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Aana");

		// xpath vs css selector

		// 6. linkText : Only for Links
		// can be duplicate , can be blank
		driver.findElement(By.linkText("Login")).click();

		// 7. partialLinkText : Only for Links
		// can be duplicate
		// forgotten userid/ forgotten password (not unique)
//		driver.findElement(By.partialLinkText("Forgotten")).click();

		// 8. tag Name : HTML tag
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println("Header Value : " + header);
		if (header.equals("New Customer")) {
			System.out.println("PASS");
		}

//		String text = driver.findElement(By.linkText("Recurring payments")).getText();
//		System.out.println(text);

		By rp = By.linkText("Recurring payments");
		String text = doGetElementText(rp);
		System.out.println(text);
	}

	public static String doGetElementText(By locator) {
		return getElement(locator).getText();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
