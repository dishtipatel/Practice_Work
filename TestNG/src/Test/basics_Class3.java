package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basics_Class3 {
	
	  @Parameters({"URL","APIKey"})
	  
	  @Test public void WebloginHomeLoan(String urlname, String key) { //Selenium
	  System.out.println("WebLoginHomeLoan"); System.out.println(urlname);
	  System.out.println(key); }
	 
	@BeforeMethod
	public void Beforemethod(){
		System.out.println("Before each method in this class");
	}
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("Before this class");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("After this class");
	}
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After each method in this class");
	}
	@Test(dataProvider = "getData")
		public void MobileloginHomeLoan(String username, String password) {
		//Appium
		System.out.println("MobileLoginHomeLoan");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination - usrename password
		//2nd combination - another username password
		//3rd combination - another username password
		//define multidimentional array
		Object[][] data= new Object[3][2];
		//1st Set
		data[0][0]="firstsetusername";
		data[0][1]="password";
		//columns in row are nothing but values for that particular combination
		//2nd Set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//3rd Set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
	@Test
	public void MobileloginHomeLoan2() {
	//Appium
	System.out.println("MobileLoginHomeLoan2");
}
	@Test(groups= {"Smoke"})
		public void LoginAPIHomeLoan() {
		//Rest API AUtomation
		System.out.println("APILoginHomeLoan");
	}	@AfterTest
	public void postcheck() {
		System.out.println("Post Script");
	}
}
