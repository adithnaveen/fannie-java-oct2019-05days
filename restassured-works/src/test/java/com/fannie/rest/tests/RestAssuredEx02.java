package com.fannie.rest.tests;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*; 


import static io.restassured.RestAssured.*;

public class RestAssuredEx02 {


	
	@Before
	public void setUp() {
//		proxy("zsproxy.fanniemae.com", 10479);
		
		baseURI="https://ecommerceapiservices.herokuapp.com/"; 
	}
	
	@Test
	public void testCreateCartForTheValidUser() {
		String uri="/v1/carts"; 
		String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6IjQ5ZjAzNjBlLTk5YTAtNDMxMy05N2I4LTgyZTYyYjMwY2ZjOSIsImlhdCI6MTU3MTQxNTkzNn0.-5349B7LBW6gsWZuyuAI_At9WrsZ89dhx6hRkr2k6Uo"; 

		given()
			.header("Authorization", "Bearer " +token)
		.when()
			.post(uri) 
		.then()
			.statusCode(201); 
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
