package com.fannie.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest01 {
	public static void main(String[] args) {

		String URL = "https://www.google.com/";
		WebDriver driver;

		// 1. load the driver
		System.setProperty("webdriver.chrome.driver",
				"/Users/naveenkumar/Desktop/Fanni-Training-05Days/driver/chromedriver");
		driver = new ChromeDriver();

		// 2. open the browser
		driver.get(URL);

		// 3. perform the operation
		String title = driver.getTitle();

		System.out.println("Title -> " + title);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		// 4. close the browser
		driver.close();
	}
}
