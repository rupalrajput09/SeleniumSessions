package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethods {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

		By country = By.id("Form_getForm_Country");
//		WebElement countryEle = driver.findElement(country);
		
		ElementUtil eleUtil = new ElementUtil(driver);
//		boolean flag = eleUtil.doSelectDropDownValue(country, "India");
		boolean flag = eleUtil.doSelectDropDownValue(country, "ABC");

		System.out.println(flag);
		

//		int actCount = getDropDownValue(country);
//		if (actCount == 233) {
//			System.out.println("PASS -- Count");
//		}
//
//		List<String> actCountryList = getAllDropDownOptions(country);
//
//		System.out.println(actCountryList.contains("India")); // true
//		System.out.println(actCountryList.contains("Bhutan"));

//		doSelectDropDownValue(country, "India");

		// created generic method for below
//		Select select = new Select(countryEle);
//		List<WebElement> countryOptions = select.getOptions();
//		System.out.println("Total countries :- " + (countryOptions.size() - 1));
//
//		for (WebElement e : countryOptions) {
//			String text = e.getText();
//			System.out.println(text);
//		}
	}
	
// util methods
	public static int getDropDownValue(By locator) {
		return getAllDropDownOptions(locator).size();
	}

	public static List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> OptionsLists = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		System.out.println("Total countries :- " + OptionsLists.size());

		for (WebElement e : OptionsLists) {
			String text = e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		return optionsValueList;
	}

	public static void doSelectDropDownValue(By locator, String dropDownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> OptionsLists = select.getOptions();
		System.out.println("Total countries :- " + OptionsLists.size());

		for (WebElement e : OptionsLists) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(dropDownValue)) {
				e.click();
				break;
			}
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
