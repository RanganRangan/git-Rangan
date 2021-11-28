package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = 
           "C:\\Users\\tsmt\\eclipse\\CucumBer\\src\\test\\resources\\org\\featuress\\popup.feature"
                  ,glue = "org.stepdefinition",dryRun = false)
public class PopupRunner {

}
