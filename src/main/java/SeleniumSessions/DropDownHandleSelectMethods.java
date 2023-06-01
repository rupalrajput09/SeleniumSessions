package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleSelectMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

//		By week = By.id("select-demo");
//		WebElement weekEle = driver.findElement(week);
//		Select select1 = new Select(weekEle);
//		System.out.println(select1.isMultiple()); //false

		By state = By.id("multi-select");
		WebElement stateEle = driver.findElement(state);
		Select select2 = new Select(stateEle);
		System.out.println(select2.isMultiple()); // true

		select2.selectByVisibleText("Ohio");
		select2.selectByVisibleText("Texas");
		select2.selectByVisibleText("California");

		List<WebElement> allStateSelectList = select2.getAllSelectedOptions();
		for (WebElement e : allStateSelectList) {
			String text = e.getText();
			System.out.println(text);
		}

		String firstOption = select2.getFirstSelectedOption().getText();
		System.out.println(firstOption);

		select2.deselectByVisibleText("Ohio");
		select2.deselectAll();
	}
}

