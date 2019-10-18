@sanity @smoke 
Feature: To sanction loans for the customer

Background: 
	Given hey before all the statements

# this is my comment 

Scenario Outline: To issue the loan for the customer who is fulltime employee in govt sector

# one after another 
Given Employee has a credit score 
And the score is more than "<creditScore>" 
When the employee is "<workTime>" time working
And in "<officeType>" office 
Then saction loan 
But should repay with in "<noOfYears>" years 


Examples: 
| 	creditScore 	|		workTime		|			officeType		|		noOfYears			|
|		666						| 	full				| 		govt					|			6						|
|		765						| 	parttime		|			private				|			12					|
|		675						|		full				|			consulting		|			11					|
