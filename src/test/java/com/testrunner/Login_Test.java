package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//feature//OpenGoogle.feature", 
glue = "com.stepdefinition",
dryRun = false,
strict = true,
monochrome = true,
plugin = {"html:Report/Html_Report",
		"pretty",
		"json:Report/Json_Report.json",
		"junit:Report/Xml_Report.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent_Report.html"
		
}
)
public class Login_Test {
	
	

}
