package com.fannie.rest.tests;

import static org.hamcrest.Matchers.*; 

import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class RestAssuredEx01 {

	
	@Before
	public void setUp() {
//		proxy("zsproxy.fanniemae.com", 10479);
	}
	
	
//	@Test
	public void testStatusCode() {
		
		
		
		given()
		.relaxedHTTPSValidation()
		.get("https://jsonplaceholder.typicode.com/posts")
		.then().statusCode(200);
	}

//	@Test
	public void testToGetResponseData() {
		given().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200).log().all();
	}
	
	
	// @Test
	public void testEqualToFunctionValueOfTitle() {
		String returnText ="sunt aut facere repellat provident occaecati excepturi optio reprehenderit"; 
		
		given()
		.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()
		.body("title", equalTo(returnText)); 
		
	}
	
	
//	@Test
	public void testHasItemForEmailInComment() {
		given()
		.get("https://jsonplaceholder.typicode.com/posts/1/comments")
		.then()
		.body("email", hasItems("Jerald@laura.io","Jamey_Dare@johnny.org","Amiya.Morar@emma.tv")); 
	}
	
	
//	@Test
	public void testQueryParam() {
//		https://jsonplaceholder.typicode.com/comments?postId=1
		
		
		given()
			.queryParam("postId", 1)
		.when()
			.get("https://jsonplaceholder.typicode.com/comments")
		.then()
			.statusCode(200)
			.log()
			.all(); 
		
	}
	
//	http://thomas-bayer.com/sqlrest/CUSTOMER/10
//	@Test
	public void testXmlData() {
		String expectedName  ="Sue"; 
		String path ="http://thomas-bayer.com/sqlrest/CUSTOMER/10"; 
		
		given().
			get(path).
		then().
			body("CUSTOMER.FIRSTNAME", equalTo(expectedName)).
			statusCode(200).
			log().
			all(); 
	}
	
	
//	@Test
	public void testXmlDataTestWithHasXml() {
		String expectedName  ="Sue"; 
		String path ="http://thomas-bayer.com/sqlrest/CUSTOMER/10"; 
		
		given().
			get(path).
		then().
			body(hasXPath("/CUSTOMER/FIRSTNAME"), containsString(expectedName)).
			statusCode(200).
			log().
			all(); 
	}

	
//	@Test
	public void testAuthorizationFailedCase() {
		String path="https://ecommerceapiservices.herokuapp.com/v1/account"; 
		
		given().get(path).then().body("email", equalTo("test@fannie.com")); 
	}

	
//	@Test
	public void testAuthorizationFailedPassCase() {
		String path="https://ecommerceapiservices.herokuapp.com/v1/account"; 
		
		given().get(path).then().
			body("statusCode", equalTo(401)).
			body("error",equalTo( "Unauthorized")); 
		
	}
	
	
	
	
//	@Test
	public void testWithAuthCartId() {
		String path="https://ecommerceapiservices.herokuapp.com/v1/account"; 
		String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6IjQ5ZjAzNjBlLTk5YTAtNDMxMy05N2I4LTgyZTYyYjMwY2ZjOSIsImlhdCI6MTU3MTQxNTkzNn0.-5349B7LBW6gsWZuyuAI_At9WrsZ89dhx6hRkr2k6Uo"; 

		
		given()
			.header("Authorization", "Bearer " + token)
		.when()
			.get(path)
		.then()
			.body("carts[0].id", is("04dad335-084c-4215-890c-08cced1d945d"))
			.body("carts[0].createdAt", is("2019-10-18T17:53:36.926Z"))
			.statusCode(200)
			.log()
			.all(); 
	}
	
	

	
//	@Test
	public void testWithAuthCartIdWithRoot() {
		String path="https://ecommerceapiservices.herokuapp.com/v1/account"; 
		String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6IjQ5ZjAzNjBlLTk5YTAtNDMxMy05N2I4LTgyZTYyYjMwY2ZjOSIsImlhdCI6MTU3MTQxNTkzNn0.-5349B7LBW6gsWZuyuAI_At9WrsZ89dhx6hRkr2k6Uo"; 

		
		given()
			.header("Authorization", "Bearer " + token)
		.when()
			.get(path)
		.then()
			.root("carts[0]")
			.body("id", is("04dad335-084c-4215-890c-08cced1d945d"))
			.body("createdAt", is("2019-10-18T17:53:36.926Z"))
			.statusCode(200)
			.log()
			.all(); 
	}
	
	
	

	
	@Test
	public void testWithAuthCartIdWithRootDetachAndAttach() {
		String path="https://ecommerceapiservices.herokuapp.com/v1/account"; 
		String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6IjQ5ZjAzNjBlLTk5YTAtNDMxMy05N2I4LTgyZTYyYjMwY2ZjOSIsImlhdCI6MTU3MTQxNTkzNn0.-5349B7LBW6gsWZuyuAI_At9WrsZ89dhx6hRkr2k6Uo"; 

		
		given()
			.header("Authorization", "Bearer " + token)
		.when()
			.get(path)
			
		.then()
			.root("carts[0]")
			.body("id", is("04dad335-084c-4215-890c-08cced1d945d"))
			.body("createdAt", is("2019-10-18T17:53:36.926Z"))
			
		.detachRoot("carts[0]")
		
			.root("carts[1]")
			.body("id", is("801345d7-53f3-4487-81cf-237f4f420631"))
			.body("createdAt", is("2019-10-18T17:53:26.497Z"))		
			
			.statusCode(200)
			.log()
			.all(); 
	}
	
	
	
	
	
}
