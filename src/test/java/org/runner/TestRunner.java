package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\tsmt\\eclipse\\CucumBer\\src\\test\\resources\\org\\featuress\\cucu.feature",  
                 glue = "org.runner",dryRun = false,tags = {"not @login"})
public class TestRunner {

}
