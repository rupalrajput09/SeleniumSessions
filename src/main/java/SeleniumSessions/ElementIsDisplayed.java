package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

//		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		
//		System.out.println(flag); // true

		By search = By.id("twotabsearchtextbox");

		ElementUtil elUtil = new ElementUtil(driver);

		if (elUtil.checkElementIsDisplayed(search)) {
			elUtil.doSendKeys(search, "easter");
		} else {
			System.out.println("Element is not present");
		}
	}

}
