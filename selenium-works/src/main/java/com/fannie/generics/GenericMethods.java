package com.fannie.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {
	
	private WebDriver driver; 
	
	public GenericMethods(WebDriver webDriver) {
		this.driver = webDriver; 
	}
	
	public WebElement getElement(String locator, String type) {
		
		WebElement element = null; 
		
		if(type.equals("id")) {
			element = this.driver.findElement(By.id(locator));
		}else if(type.equals("name")) {
			element = this.driver.findElement(By.className(locator)); 
		}else if(type.equals("css")) {
			element = this.driver.findElement(By.cssSelector(locator)); 
		}else if(type.equals("linktext")) {
			element = this.driver.findElement(By.linkText(locator)); 
		}else if(type.equals("xpath")) {
			element = this.driver.findElement(By.xpath(locator)); 
		}
		
		if(checkSingleEntry(locator, type)) {
			System.out.println("Locator has single Entry");
		}else {
			System.out.println("Sorry locator does not have entry or more entry");
		}
		
		return element; 
	}
	
	
	public List<WebElement> getElementAsList(String locator, String type){
		
		
		if(type.equals("id")) {
			return this.driver.findElements(By.id(locator)); 
		}else if(type.equals("name")) {
			return this.driver.findElements(By.className(locator)); 
		}else if(type.equals("css")) {
			return this.driver.findElements(By.cssSelector(locator)); 
		}else if(type.equals("linktext")) {
			return this.driver.findElements(By.linkText(locator)); 
			
		}else if(type.equals("xpath")) {
			return this.driver.findElements(By.xpath(locator)); 
		}
		
		System.out.println("Sorry locator not found ");
		
		return null; 
	}
	
	
	public boolean checkSingleEntry(String locator, String type) {
		return this.getElementAsList(locator, type).size() == 1; 
	}
	
	
	
	
	
	
	
	
	
}
