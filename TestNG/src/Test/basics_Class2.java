package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class basics_Class2 {
	@Test(groups= {"Smoke"})
	public void demo3() {
		System.out.println("Hello2");
	}


	
	//scope of aftertest is only for this class
	@AfterTest
	public void postcheck() {
		System.out.println("Post Script");
	}
}
