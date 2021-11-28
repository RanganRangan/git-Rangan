package org.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class VerifyNumberBox extends Baseclass{
	
	@Given("the user is in the number box")
	public void the_user_is_in_the_number_box() {
		Browserlauncher("chrome");
		launchurl("https://www.aldoshoes.in/login?login_with=telephone");  
	}

	@When("the user is trying to enter the {string}")
	public void the_user_is_trying_to_enter_the(String string) {
	    WebElement findElement = driver.findElement(By.id("input-mobile"));
	    findElement.sendKeys(string);
	}

	@Then("the user is not getting any letters in number box")
	public void the_user_is_not_getting_any_letters_in_number_box() {
	    WebElement findElement = driver.findElement(By.id("input-mobile"));
         String text = findElement.getText();
         String text2="";
         if(text.equals(text2)) {
        	 System.out.println("the user is entering the invalid syntax");
         }
	}


}
