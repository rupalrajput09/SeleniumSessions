package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTool {

	public static void main(String[] args) {

		//never use AutoIT -- is only for windows machine -- it wont work on remote machine/mac/linux/docker/cloud
		//Robot class --> only for windows
		//Sikuli lib: image based (almost deprecated)
		
		//use sendKeys --> supply the file path
		//one thing you have to check , inspect the element and check that 
		//type attribute should be there--> type = file 
		// Limitations :
		// If type = file not available then talk to tour developer to add type = file
		// no option for the multi uploads, you have to upload one by one only
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Rupal\\Study\\testng-annotations.png");

		
		//type = file --> if its not there -- you cant use sendKeys
		//ask the dev team to add this attribute
		
	}

}
