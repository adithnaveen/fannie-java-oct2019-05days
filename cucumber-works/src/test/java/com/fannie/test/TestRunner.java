package com.fannie.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/main/resources/com/fannie/features"}, 
			glue = {"com.fannie.steps", "com.fannie.steps.hooks"}, 
			plugin = {"pretty", "html:target/html-reports", "json:target/json-report"}, 
			monochrome = true, 
			tags = {"@smoke"}
		)
public class TestRunner {
}
