package Test;

import org.testng.annotations.Test;

public class basics_Class4 {
	@Test
	public void WebloginCarLoan() {
	//Selenium
	System.out.println("WebLoginCarLoan");
	}

@Test
	public void MobileloginCarLoan() {
	//Appium
	System.out.println("MobileLoginCarLoan");
}

@Test(groups= {"Smoke"})
	public void LoginAPICarLoan() {
	//Rest API AUtomation
	System.out.println("APILoginCarLoan");
}
}
