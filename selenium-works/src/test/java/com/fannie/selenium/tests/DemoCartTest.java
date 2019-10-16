package com.fannie.selenium.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utils.Util;

public class DemoCartTest {

	WebDriver driver;
	String URL="https://demostore.x-cart.com/"; 
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/naveenkumar/Desktop/Fanni-Training-05Days/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.manage().window().maximize(); 

	}
	@After
	public void tearDown() {
		Util.sleep(3000);
		driver.quit(); 
	}
	
	
	@Test
	public void demoCartTest() {
		driver.get(URL);
		
		driver.findElement(By.linkText("Shipping")).click();
		
		Util.sleep(2000);
		
		driver.findElement(By.partialLinkText("Contact")).click(); 
		Util.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Naveen");
		driver.findElement(By.id("email")).sendKeys("adith.naveen@gmail.com");
		driver.findElement(By.id("subject")).sendKeys("Testing"); 
		driver.findElement(By.id("message")).sendKeys("Some Message");

		// will not work because of dynamic id of the button 
//		driver.findElement(By.xpath("//*[@id=\"form-1571165077745\"]/div[2]/div[2]/div/button")).click(); 
									  //*[@id="form-1571232472113"]/div[2]/div[2]/div/button/span
		
		driver.findElement(By.xpath("//*[contains(text(),'Send')]")).click(); 
		
		Util.sleep(3000);
		
	}
	

}























