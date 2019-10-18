@sanity @regression
Feature: login validation

  Scenario: to check the user with valid credentials
    Given the users web application is up and running
    When the user gives valid user and
    # data table 
    	| username |		password |
    	|	harry		 |	  secret   |
    	| peter		 |    hello    | 
    	| gaurav	 |    bye      |
    	| lakshmi  |    testing  | 
    And valid password
    Then take the user to home page
