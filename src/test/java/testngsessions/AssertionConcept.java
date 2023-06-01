package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {

	@Test
	public void searchTest() {
		String name = "macbook";
		Assert.assertEquals(name, "macbook111");
	}

	@Test
	public void sumTest() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		Assert.assertEquals(sum, 30);
	}

	@Test
	public void nameTest() {
		String userName = "Tom";
		Assert.assertNotNull(userName);
	}

	@Test
	public void isEleDisplayed() {
		String loginBtn = "loginAmazonButton";
		Assert.assertTrue(loginBtn.contains("loginAmazon"));
	}
	

	@Test
	public void isUserInActive() {
		boolean inactiveFlag = false;
		Assert.assertFalse(inactiveFlag);
	}
		
}





