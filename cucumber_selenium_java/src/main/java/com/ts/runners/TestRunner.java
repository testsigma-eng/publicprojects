package com.ts.runners;


import java.io.*;
import org.junit.runner.RunWith;

import com.ts.stepdefinitions.OnewayTicketBookingSteps;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/TravelBooking.feature"
		,glue={"com.ts.stepdefinitions"}
		//,plugin = { "pretty", "html:target/cucumber-reports",
		//		    "json:target/cucumber-reports/Cucumber.json",
		//		    "junit:target/cucumber-reports/Cucumber.xml",
		//}
		,plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		,monochrome = true
		)
public class TestRunner  {
		@AfterClass
	public static void writeExtentReport() {
				if(OnewayTicketBookingSteps.driver != null) {
					OnewayTicketBookingSteps.driver.close();
				}
			
			Reporter.loadXMLConfig(new File("/Users/rajesh/config.xml"));
		 	Reporter.setSystemInfo("User Name", "Testsigma");
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("os", "Mac OSX");		 
		    Reporter.setSystemInfo("Selenium", "3.141.59");
		    Reporter.setSystemInfo("Maven", "4.0.0");
		    Reporter.setSystemInfo("Java Version", "1.8");
		
		
	}
}
