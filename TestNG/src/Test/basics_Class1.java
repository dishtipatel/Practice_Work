package Test;

import org.testng.annotations.*;

public class basics_Class1 {
	@Test
	public void demo() {
		System.out.println("Hello");

	}

	@Test
	public void demo2() {
		System.out.println("Hello1");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
}
