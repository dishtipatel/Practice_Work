package getRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post_delete_put_example {

		@Test
		public void test1() {
			
			//REst Assured
			
			RequestSpecification request = RestAssured.given();
			
			request.header("Content-Type","application/json");
			
			JSONObject json = new JSONObject();
			
			json.put("id","21");
			json.put("title","Test");
			json.put("author","Dishti Patel");
			
		
			request.body(json.toJSONString());
			
			Response response = request.post("http://localhost:3000/posts");
			
			System.out.println(response.body().asString());
			
			
			
		}
		@Test
		public void test2() {
			
			//REst Assured
			
			RequestSpecification request = RestAssured.given();
			
			request.header("Content-Type","application/json");
			
			JSONObject json = new JSONObject();
			
			json.put("id","22");
			json.put("title","Test");
			json.put("author","Dishti Patel");
			
		
			request.body(json.toJSONString());
			
			Response response = request.delete("http://localhost:3000/posts/22");
			
			System.out.println(response.body().asString());
			
			
			
		}
}
