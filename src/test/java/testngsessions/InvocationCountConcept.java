package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 10)
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	// can be used in API, to generate the API back to back
	
	
	
	
	
	
	
}
