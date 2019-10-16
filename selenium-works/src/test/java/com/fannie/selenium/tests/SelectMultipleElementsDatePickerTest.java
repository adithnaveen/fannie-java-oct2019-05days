package com.fannie.selenium.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.factory.DriverFactory;
import com.fannie.generics.GenericMethods;
import com.fannie.utils.Driver;
import com.fannie.utils.ScreenShot;
import com.fannie.utils.Util;

public class SelectMultipleElementsDatePickerTest {

	private String url ="https://www.expedia.com/";  
	private WebDriver driver; 
	private ScreenShot screenShot; 
	private GenericMethods genericMethods; 
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.CHROME); 
		genericMethods = new GenericMethods(driver); 
		screenShot = new ScreenShot(driver); 
	}
	@Test
	public void datepickerTest() {
		driver.get(url); 
		
		String sourcePlace="Washington, DC (IAD-Washington Dulles Intl.)"; 
		String destPlace="Minsk, Belarus (MSQ-Minsk Intl.)"; 
		
		String sourceElementPath="flight-origin-hp-flight"; 
		String destElementPath="flight-destination-hp-flight"; 
				
		
		genericMethods.getElement("tab-flight-tab-hp", "id").click(); 
		
		genericMethods.getElement(sourceElementPath, "id").clear(); 
		genericMethods.getElement(sourceElementPath, "id").sendKeys(sourcePlace);
		
		genericMethods.getElement(destElementPath, "id").clear();
		genericMethods.getElement(destElementPath, "id").sendKeys(destPlace);
		
		// to get the date picker we need to click 
		String datePicker = "flight-departing-hp-flight"; 
		genericMethods.getElement(datePicker, "id").click(); 
		     
		
		Util.sleep(2000);
		
		
		String xpathDates =" //*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr/td/button[not(@disabled)]"; 
		
		List<WebElement> activeDateElements = genericMethods.getElementAsList(xpathDates, "xpath"); 
		
		System.out.println("Active Number of Dates in Month : " + activeDateElements.size());
		
		
//		/ this is used only for iteration 
		List<String> activeDateElementsAsString  = new ArrayList<String>(); 
		
		for(WebElement temp : activeDateElements) {
			System.out.println("Date is " + temp.getText());
			activeDateElementsAsString.add(temp.getText()); 
		}
		
		for(int i=16; i<=31; i++) {
			
			String xpathSelectionDate = 
				" //*[@id=\"flight-departing-wrapper-hp-flight\"]"
				+ "/div/div/div[2]/table/tbody/tr/td/button[@data-day="+i+"]";

			Util.sleep(1000);

			// the date picker is shown 
			genericMethods.getElement(datePicker, "id").clear();
			Util.sleep(1000);
			
			genericMethods.getElement(datePicker, "id").click();

			Util.sleep(1000);

			genericMethods.getElement(xpathSelectionDate, "xpath").click();
			Util.sleep(1000);


			
			
		}
	}
	
	@After
	public void tearDown() {
		driver.close(); 
	}

}
