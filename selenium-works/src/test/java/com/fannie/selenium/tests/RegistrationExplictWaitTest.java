package com.fannie.selenium.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utils.Util;
import com.fannie.waits.WaitTypes;

public class RegistrationExplictWaitTest {
	String URL = "http://elearning.upskills.in";
	WebDriver driver;
	WaitTypes waitTypes; 

	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/naveenkumar/Desktop/Fanni-Training-05Days/driver/chromedriver");
		driver = new ChromeDriver();
		waitTypes = new WaitTypes(driver); 
	}
	
	@Test
	public void registerInElearningTest() {
		
		driver.get(URL);
		
		String userName="login";
		String password="password";
		String loginButton = "form-login_submitAuth";
		
		waitTypes.waitForElementToBeVisible(By.id(userName), 10).sendKeys("naveenkumar");
		waitTypes.waitForElementToBeVisible(By.id(password), 10).sendKeys("testing@123");
		waitTypes.waitForElementToBeClickable(By.id(loginButton), 10).click(); 

		Util.sleep(5000);
		
	}


	@After
	public void tearDown() {
		Util.sleep(3000);
		driver.quit(); 
	}

}
