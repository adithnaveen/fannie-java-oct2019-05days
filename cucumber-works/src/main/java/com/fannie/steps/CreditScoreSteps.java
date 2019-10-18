package com.fannie.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditScoreSteps {
	
	

	@Given("^hey before all the statements$")
	public void hey_before_all_the_statements() {
		System.out.println("hey i'm before all the statements.......");
	}
	
	
	
	
	@Given("^Employee has a credit score$")
	public void employee_has_a_credit_score() {
		// TODO
		System.out.println("Employee has a credit score>>>>");

	}

	@And("^the score is more than \"(\\d{1,})\"$")
	public void the_score_is_more_than_condition(int creditScore) {
		System.out.println("the score is more than "+creditScore+">>>>");
	}

	@When("^the employee is \"([a-zA-Z]{1,})\" time working$")
	public void the_employee_is_full_time_working(String workTime) {
		System.out.println("the employee is "+workTime+" time working>>>>>>");
	}

	@And("^in \"([a-zA-Z]{1,})\" office$")
	public void in_govt_office(String officeType) {
		System.out.println("in "+officeType+" office>>>>");
	}

	@Then("^saction loan$")
	public void saction_loan() {
		System.out.println("sanction loan>>>> ");
//		throw new PendingException("Sorry this is un implemented");
	}

	@But("^should repay with in \"([0-9]{1,})\" years$")
	public void should_repay_with_in_years(int years) {
		System.out.println("should repay with in " +years+" years>>>>");
	}

}
