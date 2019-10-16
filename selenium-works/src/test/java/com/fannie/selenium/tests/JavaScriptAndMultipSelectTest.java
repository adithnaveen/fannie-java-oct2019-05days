package com.fannie.selenium.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.fannie.factory.DriverFactory;
import com.fannie.generics.GenericMethods;
import com.fannie.utils.Driver;
import com.fannie.utils.Util;
import com.fannie.waits.WaitTypes;

public class JavaScriptAndMultipSelectTest {

	
	


	String url = "https://html.com/attributes/select-multiple/";
	WebDriver driver;
	WaitTypes waitTypes; 
	GenericMethods genericMethods; 
	

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.CHROME); 
		genericMethods = new GenericMethods(driver); 
		
	}
	
	
	@Test
	public void testScrollAndSelectMultipleTest() {
		driver.get(url);
		
		// scroll 
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		// 1 Arg - X-Axis 
		// 2 Arg - Y-Axis 
		jsExecutor.executeScript("window.scroll(0, 600)"); 

		Util.sleep(4000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
