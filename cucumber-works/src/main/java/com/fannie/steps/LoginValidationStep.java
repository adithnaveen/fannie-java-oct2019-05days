package com.fannie.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginValidationStep {

	@Given("^the users web application is up and running$")
	public void the_users_web_application_is_up_and_running() throws Throwable {
		System.out.println("::::::the users web application is up and running::::::");
	}

	@When("^the user gives valid user and$")
	// get the data from excel file 
	public void the_user_gives_valid_user_and(DataTable dataTable) throws Throwable {
		
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class); 
		
		for(Map<String,String> temp  : dataList) {
		System.out.println("UserName " + temp.get("username") 
			+ ", password " + temp.get("password")); 
		}
			
		
	}

	@When("^valid password$")
	public void valid_password() throws Throwable {
		System.out.println(":::::valid password:::::");
	}

	@Then("^take the user to home page$")
	public void take_the_user_to_home_page() throws Throwable {
		System.out.println("::::take the user to home page::::::");
		
	}
}
