package com.fannie.rest.tests;

import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

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
	
	
	

	
	// @Test
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
	
	


//	@Test
	public void testPhotosResponse() {
		String path="https://jsonplaceholder.typicode.com/photos/1"; 
		
		
		Response response = when().get(path).then().extract().response(); 
		
		String url =response.path("url"); 
		String thumbNail = response.path("thumbnailUrl"); 
		
		System.out.println("Response Url -> " + url);
		System.out.println("Response Thumbnail -> " + thumbNail);
		System.out.println("Response Status Code -> " + response.getStatusCode());
		System.out.println("Response Content Type -> " + response.contentType());
		
		
		// need to check if the url of thumb nail or URL is valid 
		
		get(url).then().statusCode(200); 
		get(thumbNail).then().statusCode(200); 
		
		
		
		
	}
	
	

//	@Test
	public void getHeaderInformation() {
		Response response = get("https://jsonplaceholder.typicode.com/photos/1"); 
		String expires = response.getHeader("expires"); 
		String contentType =response.getHeader("content-type"); 
		
		System.out.println("Expires : " + expires);
		System.out.println("Content Type : " + contentType);
		
		System.out.println("All Header information goes here ");
		System.out.println("------------------------------------");
		
		for(Header header : response.getHeaders()) {
			System.out.println("Name : " + header.getName() +"\t, Value : " + header.getValue());
		}
	}
	
//	@Test
	public void getCookieInformation() {
		Response response = get("https://jsonplaceholder.typicode.com/photos/1"); 
		Cookie cookie = response.getDetailedCookie("__cfduid"); 
		
		System.out.println("API Has Expiry Date : " +cookie.hasExpiryDate());
		System.out.println("API Expiry is : " + cookie.getExpiryDate());
		System.out.println("Cookie Value : " +cookie.getValue());
		System.out.println("Cookie Max Age : " + cookie.getMaxAge());
	}
	
	@Test
	public void testTestExtractStringAndJson() {
		String jsonString = 
				when().get("https://jsonplaceholder.typicode.com/albums/").then().extract().asString();  
		
		System.out.println(jsonString);
		System.out.println("Lenght " + jsonString.length());
		
		JsonPath json = new JsonPath(jsonString); 
		// you can get in json way 
		List<String> titles = json.get("title"); 
		
		System.out.println("Title Size is : " +titles.size());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
}
