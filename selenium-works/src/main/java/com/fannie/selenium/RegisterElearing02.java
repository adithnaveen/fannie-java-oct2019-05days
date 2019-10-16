package com.fannie.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterElearing02 {
	public static void main(String[] args) {

		String URL = "http://elearning.upskills.in";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"/Users/naveenkumar/Desktop/Fanni-Training-05Days/driver/chromedriver");
		driver = new ChromeDriver();

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
		
		// windows -> alt + shift + z 
		// mac -> option + cmd + z 
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

		
		String menuBarDropDown="//*[@id=\"navbar\"]/ul[2]/li[2]/a"; 
		String logoutBtn ="logout_button"; 
		
		driver.findElement(By.xpath(menuBarDropDown)).click(); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		driver.findElement(By.id(logoutBtn)).click(); 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		
		driver.quit(); 
		
		
		
		
		
		
	}
}
