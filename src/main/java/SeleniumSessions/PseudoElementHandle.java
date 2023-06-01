package SeleniumSessions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	public static void main(String[] args) {

//		window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// Javascript Executor :

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String man_field_text = js.executeScript(
				"return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')")
				.toString();

		// here return is javascript return.
		// "*" is a javascript String. So we have to convert it into the javascript.

		System.out.println(man_field_text);
		
		String man_field_lastName_text = js.executeScript(
				"return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')")
				.toString();
		
		System.out.println(man_field_lastName_text);
		
		if(man_field_lastName_text.contains("*")) {
			System.out.println("last name is a mandatory field");
		}
		// create a generic function for this	
		
	}

}
