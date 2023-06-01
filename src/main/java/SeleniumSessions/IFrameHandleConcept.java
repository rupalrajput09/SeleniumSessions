package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandleConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");// page
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();

		// img -- iframe --elements

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("My vehicle Registration");
		// fill the complete form

	}

}
