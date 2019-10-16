package com.fannie.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// this will be a generic class 
public class WaitTypes {
	
	private WebDriver driver ; 
	
	// is passed from selenium script 
	public WaitTypes(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	public WebElement waitForElementToBeVisible(By locator, int maxTimeOut) {
		try {
			// will take the time unit in seconds 
			WebDriverWait wait =  new WebDriverWait(driver, maxTimeOut); 
			WebElement element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(locator)
			);
			
			return element;
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		return null; 
	}
	
	// to check the element is clicked 
	public WebElement waitForElementToBeClickable(By locator, int maxTimeOut) {
		try {
			WebDriverWait wait =  new WebDriverWait(driver, maxTimeOut); 
			WebElement element = wait.until
						(ExpectedConditions.elementToBeClickable(locator)); 
			
			return element;  
		}catch(Exception e) {
			e.printStackTrace(); 
		}
	return null; 
	}
	
	
	
}







