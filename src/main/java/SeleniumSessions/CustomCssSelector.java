package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		// https://app.hubspot.com/login

		//css selectors : cypress, playwrite(pw), WDIO
		// page : html+css
		// id:
		//#id
		//tag#id
		
		
		//#username
		//#loginBtn
		//button#loginBtn
		
		// class:
		//.login-email
		//input.login-email
		
		//	#id.class : 
		// tag#id.class
		// tag.class#id
		
		//#username.form-control
		//input#username.form-control
		//.form-control#username
		//input.form-control#username
		
		// c1 c2 c3
		//.c1.c2.c3
		//tag.c1.c2.c3
		//tag.c1.c2.c3#id
		//tag#id.c1.c2.c3
		//.c2.c3 sequence does not matter , any combination
		//.c1.c2 sequence does not matter
		//.c3.c2 sequence does not matter
		
		//.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email#username
		//input#username.form-control.private-form__control.login-email
		//.private-form__control.login-email
		
		// which one is valid (Interview Question)
		
		By.xpath("//input[@class='form-control private-form__control login-email']");// valid
		By.cssSelector("input.form-control.private-form__control.login-email");// valid
		By.xpath("//input[@class='form-control']");// not valid
		By.className("login-email");// valid
//		By.className("form-control private-form__control login-email");// not valid, pass the single class name , unique
//		org.openqa.selenium.InvalidSelectorException --> If we pass multiple classes 
		
		
//		other attribute :
//		tag[attribute = 'value']
		
//		input[type='email'] --> CSS
//		//input[@type='email'] --> xpath
//		input[id='username'] --> CSS
		
//		https://naveenautomationlabs.com/opencart/index.php?route=account/register

//		input[placeholder='First Name']

//		* If we want to add multiple attributes in CSS Selector.

//		tag[attribute1='value'][attribute2='value'] --> CSS
		
//		tag[@attribute1='value' and @attribute2='value'] --> Xpath

//		input[type='text'][name='firstname']

//		input[type='text'][name='firstname'][placeholder='First Name']

//		input[type][name][placeholder] --> it will give all the input which is having all type name and placeholder,
//		here I am not bother about the values

//		input[type][name][placeholder='Search'] --> it will give you first placeholder with search value
		
//		//input[@type and @name and @placeholder] --> xpath , valid
//		//input[@type and @name and @placeholder='Search'] --> xpath, valid
		
//		//a[@href] --> xpath, valid, give all the links with href property/ attribute
		
		
//		input[type='text'][name='firstname'][placeholder='First Name']#input-firstname --> CSS
//		input[placeholder='First Name']#input-firstname    -->CSS
//		input#input-firstname[placeholder='First Name']		--> CSS
		
		//text in CSS : Not Applicable
		
		// contains in CSS
//		tag[attribut*='value']
//		input[id*='firstname']
//		input[placeholder*='First']		
//		input[placeholder*='First'][type='text']		
//		input[placeholder*='First'][type='text'][class*='form-control']		
//		input[placeholder][type='text'][class*='form-control']
		
		
		// https://app.hubspot.com/login

//		input[type='email'][class*='login-email'] --> CSS
//		input[class*='login-email']	--> CSS	

		//input[contains(@class,'login-email')] --> xpath
		
		// starts-with in css :
//		tag[attribute^='value'] --> starts-with
//		input[id^='user']		
		
		// ends-with in css :
//		tag[attribute$='value'] --> ends-with
//		input[id$='name']

		// parent to child
//		 parent tag child tag --> direct + indirect child element
//	website ->	https://www.orangehrm.com/orangehrm-30-day-trial
//		select#Form_getForm_Country option
//	website ->	https://app.hubspot.com/login
//		form#hs-login div
		
//		parent tag > child tag --> direct child elements
//		form#hs-login > div
//		form#hs-login input#username  --> direct indirect child elements
		
		
		
		// child to parent --> backward traversing is not possible in CSS
		
		// following sibling in CSS
//		tag[attribute='value']+tag of immidiate sibling#idvalue
		
//	website -->	https://naveenautomationlabs.com/opencart/index.php?route=account/login
		
//		label[for='input-email']+input#input-email  --> gives you immidiate sibling
		
//		all forward sibling --> Use ~ 
//		https://www.orangehrm.com/orangehrm-30-day-trial
		
//		select#Form_getForm_Country > option[value='Afghanistan'] ~ option
		
		// preceding sibling in CSS --> Not possible with CSS
		
		
//		indexing in CSS : only first and last child and nth child also
//		select#Form_getForm_Country option:first-child
//		select#Form_getForm_Country option:last-child
		
//		select#Form_getForm_Country option:nth-child(5) --> nth child
//		select#Form_getForm_Country option:nth-last-child(2) --> 2nd from last
//		select#Form_getForm_Country option:nth-last-child(5) --> 5th from last
		
//		select#Form_getForm_Country option:nth-child(odd) --> gives odd element
//		select#Form_getForm_Country option:nth-child(even) --> even child
//		select#Form_getForm_Country option:nth-child(n) --> all child
		
//		select#Form_getForm_Country option:nth-child(n+4) --> start from 4 and rest all
		
//		select#Form_getForm_Country option:nth-child(3n-1) --> start from 3 and then -1
//		select#Form_getForm_Country option:nth-child(7n) --> 7th and then next 7th
		
//		normalize-space() is a function in xpath
		//option[normalize-space()='India']
		
		
		// or in CSS -->
		
		// not in CSS --> which you want to exclude
		
//		https://app.hubspot.com/login
		
//		form-control private-form__control login-email
//		form-control private-form__control login-password m-bottom-3
//		
//		input.form-control.private-form__control:not(input#username)
		 
		
		// comma in CSS -->
//		input#username,input#password,input#remember,button#loginBtn
//		https://app.hubspot.com/login
		List<WebElement>mandatoryEles =
				driver.findElements(By.cssSelector("input#username,input#password,input#remember,button#loginBtn"));
		
		if(mandatoryEles.size() == 4) {
			System.out.println("Mandatory elements are present ---- Pass");
		}

		
		//					xpath			 vs 			css
		
//		1. syntax: 			hard							easy
//		2. text				yes								No
//		3.AND				yes								yes
//		4.OR				yes								yes,comma
//		5.forward:			yes								yes
//		6.backward:			yes								No
//		7.forward-sibling	yes								yes
//		8.backward-sibling	yes								no
//		9.index				yes								yes
//		10.capture group	yes								no
//		11.contains			yes								yes
//		12.starts-with		yes								yes
//		13.ends-with		no								yes
//		14.normalize-space	yes								no
//		15.first/last		yes								yes
//		16.parent to child	yes								yes
//		17.child to parent	yes								no
//		18.performance		good							slightly better than xpath/ good
//		19.webtable			easy							limited
		
		
		// performance means which locator is fast
		
		
		
		
		
		
		
	}

}
