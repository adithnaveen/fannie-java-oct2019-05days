package com.fannie.rest.tests;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class RestAssuredEx01 {

//	@Test
	public void testStatusCode() {
		given().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200);
	}

	@Test
	public void testToGetResponseData() {
		given().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200).log().all();
	}
}
