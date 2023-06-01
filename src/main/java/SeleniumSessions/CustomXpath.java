package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// xpath is the address of the element in the HTML DOM.
		// two types of xpath.
		// 1. absolute xpath. --> absolute address of the element in the HTML DOM.
		// html/body/div/div[2]/div/ul/li[2]/input

		// 2. relative / custome xpath.
		// xpath functions
		// xpath properties
		// xpath axes

		// double // -> parent to (direct + indirect child elements)
		// single / -> direct child elements

		// how to write xpath

//		//htmltag[@attribute='value']

//		driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();

//		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname' and @placeholder='First Name']")).
		sendKeys("AAA");
		
		// text() : label, header, span, link
		//htmltag[text()='value']
		//a[text()='Login']
		//a[text()='Terms & Conditions']
		//h1[text()='Register Account']
		
		//contains() with attributes
		//htmltag[contains(@attribute,'value')]
				
		//input[contains(@placeholder,'E-Mail')]
		//a[contains(@href,'account/forgotten')]
		
		//contains() with two attributes

		//htmltag[contains(@attribute1,'value') and contains(@attribute2,'value')]
		//input[contains(@placeholder,'E-Mail') and contains(@id,'email')]
		
		
		// contains with first attribute but no contains with second attribute
		//htmltag[contains(@attribute1,'value') and @attribute2 = 'value']
		//input[contains(@placeholder,'E-Mail') and @id='input-email']
		//input[@id='input-email' and contains(@placeholder,'E-Mail')] // can change the sequence also
		
		
		//contains() with text() :
		//htmltag[contains(text(),'value')]
		//a[contains(text(),'Delivery')]		
		//div[contains(text(),'Warning')]
		
		//contains() with text() and contains with @attribute :
		//htmltag[contains(text(),'value') and contains(@attribute,'value')]
		//a[contains(text(),'Policy') and contains(@href,'information')]		
		
		//contains() with text() and no contains with @attribute :
		//htmltag[contains(text(),'value') and @attribute = 'value']
		//a[contains(text(),'Account') and @class = 'list-group-item']
		
		
		// starts-with
		//htmltag[starts-with(@attribute,'value')]
		//input[starts-with(@placeholder,'E-Mail')]
		
		// ends-with() in xpath -- No (now it is deprecated in modern browser)
		
		// index
//		(//input[@class='form-control'])[1]
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("AD");
		
		// Position
//		(//input[@class='form-control'])[position()=1]
//		(//input[@class='form-control'])[position()=3]
		
		// get the last element : last()
//		(//input[@class='form-control'])[last()]
		
		// get the second last element : last()
//		(//input[@class='form-control'])[last()-1]
//		(//input[@class='form-control'])[last()-2]
		
//		(//input[@class='form-control'])[last()-(last()-1)] // it will give you 1st element
		
		driver.get("https://www.amazon.com/");
//		(//div[contains(@class,'navFooterLinkCol')][last()]//a)[last()] // it will give you last element
		
//		(//div[contains(@class,'navFooterLinkCol')][last()]//a)[last()-(last()-1)] // it will give you 1st element
		
		
//		https://www.orangehrm.com/orangehrm-30-day-trial
//		normalize-space() is a function in xpath
		//option[normalize-space()='India']
				
	}
	
	
	

}
