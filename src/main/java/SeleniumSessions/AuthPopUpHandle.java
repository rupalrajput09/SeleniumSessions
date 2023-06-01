package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		
		// Its an authentication pop, not javascript alert
		// its not a part of HTML DOM
		// there are two box one for username and another is for password
		// cannot switch to these types of alerts
		// here you have to pass the user name and password along with the URL
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();

//		driver.get("https://the-internet.herokuapp.com/basic_auth");
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
//		Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument
//      If you have entered the username and password in a wrong way
		
		// problem : What if your user name password have @, So in that case you are not allowed to do that because a 
//		url cannot have two URL.
		
//		These types do not come randomly, they come whenever first time you enter/ launch the url its not randomly they are 
//		coming somewhere , they are not coming in middle of anywhere 
		
		// OR
		
		String username = "admin";
		String password = "admin";
		
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");

		
		// limitation of authentication pop up
		// it will not work if username and password have @, So always use username and password without @
		// Sometimes does not work with other browsers
		
		
		
		
	}

}
