package com.fannie.selenium.pom.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.factory.DriverFactory;
import com.fannie.pom.RegistrationPOM;
import com.fannie.pom.RegistrationPOM1;
import com.fannie.utils.Driver;
import com.fannie.utils.ScreenShot;
import com.fannie.utils.Util;

public class RegistrationPOMTest {

	private WebDriver driver; 
	private RegistrationPOM regPOM; 
	private RegistrationPOM1 regPOM1; 
	private ScreenShot screenShot; 
	
	private String url ="http://naveenks.com/selenium/RegForm.html";
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.CHROME); 
		regPOM = new RegistrationPOM(driver); 
		regPOM1 = new RegistrationPOM1(driver); 
		screenShot = new ScreenShot(driver); 
	}
	
	@After
	public void tearDown() {
		Util.sleep(3000);
		driver.close();
	}
	
	@Test
	public void registrationTest() {
		
		driver.get(url);
		
		regPOM.sendEmail("naveen@fannie.com"); 
		regPOM.sendPassword("testing@123");
		regPOM.sendConfirmPassword("testing@123");
		regPOM.sendFirstName("Naveen");
		regPOM.sendLastName("Kumar");
		
		screenShot.captureScreenShot();
	}


	@Test
	public void registrationTest1() {
		driver.get(url);
		regPOM1.sendEmail("william@fannie.com");
		regPOM1.sendPassword("Hello@123");
		regPOM1.sendConfirmPassword("Hello@123"); 
		regPOM1.sendFirstName("Willam"); 
		regPOM1.sendLastName("Peter");
		
		screenShot.captureScreenShot(); 
	}
	
	
	
	
}
