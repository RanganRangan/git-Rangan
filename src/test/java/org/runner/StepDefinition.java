package org.runner;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition extends Baseclass {
	@Given("the user should click the myaccount")
	public void the_user_should_click_the_myaccount() {
		Browserlauncher("chrome");
		launchurl("https://www.aldoshoes.in/");}
	@And("the user should click the login")
	public void the_user_should_click_the_login() throws AWTException {
		click("xpath", "//span[contains(text(),' My Account')]");  
		Robot(1, 1);		}
	@When("the user is filling the invalid the mobile {string}")
	public void the_user_is_filling_the_invalid_the_mobile(String string) {
      sendkeys("id", "input-mobile", string);}
	@And("the user is clicking the login button")
	public void the_user_is_clicking_the_login_button() {
	  click("id", "btton-otp");}
	@Then("the user should go to the invalid login page")
	public void the_user_should_go_to_the_invalid_login_page() {
		WebElement findElement = driver.findElement(By.xpath("//button[@class='close']"));
	    boolean displayed = findElement.isDisplayed();
	   System.out.println("the user is in invalid login page ");}
//@registration
	@Given("the user shoud click the register")
	public void the_user_shoud_click_the_register() throws AWTException {
		click("xpath", "//span[contains(text(),' My Account')]");  
		Robot(0, 1);}
	@When("the user should navigate to registration field")
	public void the_user_should_navigate_to_registration_field() {
      String currentUrl = driver.getCurrentUrl();
	  boolean contains = currentUrl.contains("register");
	 if(contains==true) {
		 System.out.println("the user is in the registration page");
	 }
	}


}
