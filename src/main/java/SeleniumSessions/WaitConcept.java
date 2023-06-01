package SeleniumSessions;

public class WaitConcept {

	public static void main(String[] args) {

		//wait types :
		//1. Static wait: Thread.sleep(5000)- wait for 5 seconds --(Its a JAVA feature)
		//2. Dynamic wait: total time out = 10 seconds --> found 2 seconds --> 
		// rest of 8 seconds will be ignored/ cancelled 
		// apply wait for 10 seconds -- element not found after 10 seconds also --NoSuchElementException
		
		// 2 types of dynamic wait
		// a. implicit wait
		// b. explicit wait
			// i. WebDriverWait
			//ii. FluentWait
		
		//WebDriverWait(class) --> FluentWait(class)
		// WebDriverWait class extends FluentWait class
		// FluentWait implements Wait(I) interface
		// Wait(I) has a method until(); 
		// FluentWait will implement until(){} method + other methods as well
		// no public method in WebDriverWait
		// WebDriverWait inherits FluentWait class methods
		
	}

}
