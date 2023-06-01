package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertsHandling {

	public static void main(String[] args) throws InterruptedException {

		// javascript pop ups: Alert Interface
		// 1. alert
		// 2. confirm
		// 3. prompt

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// one alert at a time in all case
		
		// 1. alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//
//		Thread.sleep(4000);
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
//		alert.accept();// click on OK

		// 2. confirm
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(4000);
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println(alertText);
////		alert.accept();
//		alert.dismiss();
		
		// 3. prompt
		// In prompt we can get only one text at a time
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Test Automation");
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();	
	}

}
