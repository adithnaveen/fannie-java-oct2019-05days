package com.fannie.selenium.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utils.Util;

public class RegistratiomElearningTest {


	String URL = "http://elearning.upskills.in";
	WebDriver driver;

	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/naveenkumar/Desktop/Fanni-Training-05Days/driver/chromedriver");
		driver = new ChromeDriver();

	}
	
	@Test
	public void registerInElearningTest() {
		
		driver.get(URL);
		
		String userName="login";
		String password="password";
		String loginButton = "form-login_submitAuth";
		
		String validateUserXpath="//*[@id=\"homepage-course\"]/div/p[1]/strong";
		
		driver.findElement(By.id(userName)).clear(); 
		driver.findElement(By.id(userName)).sendKeys("naveenkumar");
		
		driver.findElement(By.id(password)).clear(); 
		driver.findElement(By.id(password)).sendKeys("testing@123");
		
		driver.findElement(By.id(loginButton)).click(); 

		String menuBarDropDown="//*[@id=\"navbar\"]/ul[2]/li[2]/a"; 
		String logoutBtn ="logout_button"; 
		
		String headingText =  
				driver.findElement(By.xpath(validateUserXpath)).getText();
		
		System.out.println(headingText);
		
		assertEquals("naveen kumar", headingText);
		
		
		driver.findElement(By.xpath(menuBarDropDown)).click(); 
		Util.sleep(1000);
		
		driver.findElement(By.id(logoutBtn)).click(); 
		
	}


	@After
	public void tearDown() {
		Util.sleep(3000);
		driver.quit(); 
	}
	

	public void registerInElearningFailTest() {
		
	}

}
