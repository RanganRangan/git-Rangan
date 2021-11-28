package org.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = 
      "C:\\Users\\tsmt\\eclipse\\CucumBer\\src\\test\\resources\\org\\featuress\\menus.feature",  
       glue = "org.menutest",dryRun = false)
public class MenuRunner{}
