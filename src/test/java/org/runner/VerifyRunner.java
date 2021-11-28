package org.runner;


	

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\tsmt\\eclipse\\CucumBer\\src\\test\\resources\\org\\featuress\\cucu2.feature",  
	                 glue = "org.runner",dryRun = false)
	public class VerifyRunner {
		
	}



