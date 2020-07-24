package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class RESTAssuredDemo {
	@Test
	public void test1() {
		int code = RestAssured.given()
				.auth()
				.preemptive().basic("ToolsQA", "TestPassword")
				.when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
				.getStatusCode();
		System.out.println("Response Code:" +code);
	
	}
}
