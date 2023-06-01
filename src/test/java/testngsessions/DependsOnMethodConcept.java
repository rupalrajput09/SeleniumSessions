package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void homePageTest() {
		System.out.println("home page test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void searchPageTest() {
		System.out.println("search test");

	}
		
	@Test(dependsOnMethods = "searchPageTest")
	public void cartTest() {
		System.out.println("cart test");
	}
	
	// AAA Rule -- Arrange, Act, Assertion
	
	//test cases should be independent (Do not create any kind of dependency in our framework)
	//CRUD - 
	//createUserTest --> create a new user -- assert
	//getUserTest --> create a new user(xxxxx) + get the same user(xxxxx) -- assert
	//invalid - getUserTest --> use the same userid(124) + get the same user -- assert --> 123 -- QA ---> stg --123X
	//updateUserTest --> create new user(xxxx) + get the same user (xxxxx) -- update user (xxxx) -- assert
	//deleteUserTest --> create new user(xxxx) + get the same user (xxxxx) -- delete the user (xxx) -- assert
	
	//C - R - U - D 
	
	// dependency is horrible thing in selenium. Never use it. Its a anti pattern of automation.
	// anti pattern means bad practices.
	// Sometimes priority also anti pattern, when we claim all the test cases are independent of each other then what 
	// is the point of giving priority. because in some cases we want to execute some particular test case then
	// in that case we give the priority. and we can run them accordingly.
	// deadlock - means all the threads are in the waiting state now
	
	
	
}
