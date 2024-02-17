package Tests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class IntroToRestAssured {
	public static void main(String[] args) {
		System.out.println("Hello Rest Assured Api Testing");
		validateGetProducts();
		
	}
	@Test
	public static void validateGetProducts() {
		
		Response res = RestAssured.get("https://api.escuelajs.co/api/v1/products");
		System.out.println(res.statusCode());
		System.out.println(res.getTime());
		System.out.println(res.getContentType());
	}

}
