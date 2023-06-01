package testngsessions;

import org.testng.annotations.Test;

public class TestWithPriority {

	@Test(priority = 1)
	public void searchTest() {
		System.out.println("test - search test");
	}
	@Test(priority = 0)
	public void addToCartTest() {
		System.out.println("test - addToCart test");
	}

	// 8
	@Test(priority = 2)
	public void paymentTest() {
		System.out.println("test - payment test");
	}
	
	@Test(priority = -1)
	public void aTest() {
		System.out.println("a - test");
	}

	// 8
	@Test(priority = 4)
	public void bTest() {
		System.out.println("b - test");
	}
}
