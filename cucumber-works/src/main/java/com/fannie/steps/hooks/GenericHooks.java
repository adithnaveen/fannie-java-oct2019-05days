package com.fannie.steps.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

// these methods will work for all the feature files 
public class GenericHooks {
	
	@Before
	public void setUp() {
		System.out.println("i'm before all... ");
	}
	@After
	public void tearDown() {
		System.out.println("Hey i'm after all... ");
	}
}
