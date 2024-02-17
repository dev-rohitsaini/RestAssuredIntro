package Tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class IntroToTestNg {

	
	
	@Test
	public static void validateGetProducts() {
		
		Response res = RestAssured.get("https://api.escuelajs.co/api/v1/products");
		System.out.println(res.statusCode());
		System.out.println(res.getTime() );
	}
}
