package com.fannie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM1 {
	public RegistrationPOM1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "inputEmail")
	private WebElement email; 
	
	@FindBy(id="inputPassword")
	private WebElement password;
	
	@FindBy(id="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	public void sendEmail(String email) {
		this.email.clear(); 
		this.email.sendKeys(email);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password);
	}
	
	public void sendConfirmPassword(String confirmPassword) {
		this.confirmPassword.clear(); 
		this.confirmPassword.sendKeys(confirmPassword);
	}
	
	public void sendFirstName(String firstName) {
		this.confirmPassword.clear(); 
		this.firstName.sendKeys(firstName);
		
	}
	
	public void sendLastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName);
	}
	
	
}
