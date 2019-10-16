package com.fannie.selenium.tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		jsExecutor.executeScript("window.scroll(0, 900)"); 

		Util.sleep(4000);
		
		String selectXpath = "//*[@id=\"post-291\"]/div/div[2]/select"; 
		WebElement selectElement = genericMethods.getElement(selectXpath, "xpath");  
		
		
		Select select = new Select(selectElement); 
		
		select.selectByIndex(0); 
		Util.sleep(1000);
		select.selectByIndex(3); 
		
		Util.sleep(1000);
		select.selectByValue("Lesser");
		
		Util.sleep(1000);
		select.deselectAll(); 
		
		select.selectByVisibleText("Greater flamingo"); 
		select.selectByVisibleText("Andean flamingo");
		
		List<WebElement> selectedList = select.getAllSelectedOptions(); 
		
		System.out.println("Number of selected Items " + selectedList.size());
		
		for(WebElement temp : selectedList) {
			System.out.println(temp.getText());
		}
		
		
		
		
		
		
		
		driver.close(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
