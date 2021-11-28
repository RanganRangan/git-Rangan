package org.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.runner.Baseclass;
import io.cucumber.java.en.*;
public class PopupMessage extends Baseclass {	
	@Given("the user should open the aldoshoe")
	public void the_user_should_open_the_aldoshoe() {
		Browserlauncher("chrome");
		launchurl("https://www.aldoshoes.in/");}
	@When("the user is in the aldoshoe page")
	public void the_user_is_in_the_aldoshoe_page() {
	     String currentUrl = driver.getCurrentUrl();
	     String url="https://www.aldoshoes.in/";
	     if(currentUrl.equals(url)) {
	    	 System.out.println("the user is in the correct location");}
	     else {System.out.println("false");}     	}
	@When("the user should get the popup message after ten seconds")
	public void the_user_should_get_the_popup_message_after_ten_seconds() throws InterruptedException {
	   Thread.sleep(15000); }
	@Then("the user should handle the popup")
	public void the_user_should_handle_the_popup() {
		  WebElement findElement = driver.findElement(By.xpath("//img[@class='default-icon']"));
		   boolean displayed = findElement.isDisplayed();
		   if(displayed=true) {
			   WebElement findElement2 = driver.findElement(By.xpath("//button[contains(text(),'Later')]"));
		       findElement2.click();}}}
