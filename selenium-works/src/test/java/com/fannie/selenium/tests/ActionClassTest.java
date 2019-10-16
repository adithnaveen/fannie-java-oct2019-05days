package com.fannie.selenium.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.fannie.factory.DriverFactory;
import com.fannie.generics.GenericMethods;
import com.fannie.utils.Driver;
import com.fannie.utils.Util;
import com.fannie.waits.WaitTypes;

public class ActionClassTest {


	String url = "http://tasyah.com/";
	WebDriver driver;
	WaitTypes waitTypes; 
	GenericMethods genericMethods; 
	

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.CHROME); 
		genericMethods = new GenericMethods(driver); 
		
	}

	@Test
	public void actionTest() {
		driver.get(url);
		
		String menuItemXpath="//*[@id=\"menu_category_Menu_VIfWm2LT_439\"]/a/span/span"; 
		String subMenuItem="//*[@id=\"menu_category_Menu_VIfWm2LT_439\"]/ul/li[1]/a/span"; 
		
		WebElement menuItemElement = genericMethods.getElement(menuItemXpath, "xpath"); 

		Actions actions = new Actions(driver); 
		
		actions.moveToElement(menuItemElement).perform(); 
		Util.sleep(2000);
		
		genericMethods.getElement(subMenuItem, "xpath").click(); 

		Util.sleep(4000);
		
		// hovering on the menu item for login 
		WebElement menuItemElementForLogin = genericMethods.
				getElement("//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i",
						"xpath"); 
		
		
		actions.moveToElement(menuItemElementForLogin).perform();  
		
		// click on login / register 
		genericMethods.getElement
			("//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[1]/a/span",
						"xpath").click(); 

		driver.close(); 
		
		
		
	}
	
	
	
}
