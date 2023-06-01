package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By username = By.name("username");
		By password = By.name("password");
		By forgotPwd = By.linkText("Forgot Password?");
		// presenceOfElementLocated :
		// An expectation for checking that an element is present on the DOM of a page.
		// This does not necessarily mean that the element is visible.

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // sel 4.x
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		username_ele.sendKeys("test@gmail.com");
//
//		WebElement forgot_pwd_ele = wait.until(ExpectedConditions.presenceOfElementLocated(forgotPwd));
//		forgot_pwd_ele.click();

//		waitForElementPresence(username, 10).sendKeys("tom@gmail.com");
//		waitForElementPresence(forgotPwd, 5).click();
		
//		waitForElementVisible(username, 10).sendKeys("Test@gmail.com");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.getElement(username, 10).sendKeys("test@gmail.com");
		eleUtil.getElement(password).sendKeys("test@123");
		eleUtil.getElement(forgotPwd, 15).click();
		
		eleUtil.clickElementWhenReady(forgotPwd, 5);
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeoOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible on the page.
	 * Visibility means that the element is not only displayed but also
	 * has a height and width that isgreater than 0.
	 * @param locator
	 * @param timeoOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeoOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	
	
	
	
}
