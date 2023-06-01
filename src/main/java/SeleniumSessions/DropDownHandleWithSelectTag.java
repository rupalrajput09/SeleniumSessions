package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {

	public static void main(String[] args) {

		// drop down -- html tag = <select>
		// Select is a inbuilt class in selenium

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

		By country = By.id("Form_getForm_Country");
		WebElement countryEle = driver.findElement(country);
		Select select = new Select(countryEle);

//		select.selectByIndex(7);
//		select.selectByVisibleText("India");
//		select.selectByValue("Austria");
//		select.selectByVisibleText("naveen");//NoSuchElementException: Cannot locate option with text: naveen
//		select.selectByIndex(500); //NoSuchElementException: Cannot locate option with index: 500
	}

}
