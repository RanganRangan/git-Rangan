package org.menutest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.runner.Baseclass;
import io.cucumber.java.en.*;
public class MenuIsDropdown extends Baseclass {
@Given("the user should open the aldoshoe")
public void the_user_should_open_the_aldoshoe() {
	Browserlauncher("chrome");
	launchurl("https://www.aldoshoes.in/");}
@When("the user should move the cursor to the women menu")
public void the_user_should_move_the_cursor_to_the_women_menu() {
       MoveToElement("xpath", "//strong[contains(text(),'Women')]");}
@When("the user should get the women dropdown")
public void the_user_should_get_the_women_dropdown() {
     driver.findElement(By.xpath("//a[@class='theparent']")).isDisplayed();
     System.out.println("user is in the womens dropdown");}
@When("the user shouuld move the cursor to the handbags menu")
public void the_user_shouuld_move_the_cursor_to_the_handbags_menu() {
	  MoveToElement("xpath", "//strong[contains(text(),'Handbags')]");}
@When("the user should get the handbags dropdown")
public void the_user_should_get_the_handbags_dropdown() {
	 driver.findElement(By.xpath("//a[@class='theparent']")).isDisplayed();
     System.out.println("user is in the Handbag dropdown");}
@When("the user shouuld move the cursor to the men menu")
public void the_user_shouuld_move_the_cursor_to_the_men_menu() {
	 MoveToElement("xpath", "//strong[contains(text(),'Men')]");}
@When("the user should get the men dropdown")
public void the_user_should_get_the_men_dropdown() {
	driver.findElement(By.xpath("//a[@class='theparent']")).isDisplayed();
    System.out.println("user is in the men dropdown");}
@When("the user shouuld move the cursor to the sale menu")
public void the_user_shouuld_move_the_cursor_to_the_sale_menu() {
    MoveToElement("xpath", "//strong[contains(text(),'Sale')]");   }
@When("the user should get the sale dropdown")
public void the_user_should_get_the_sale_dropdown() {
	driver.findElement(By.xpath("//a[@class='theparent']")).isDisplayed();
    System.out.println("user is in the sale dropdown");}
@When("the user shouuld move the cursor to the call it spring menu")
public void the_user_shouuld_move_the_cursor_to_the_call_it_spring_menu() {
	 MoveToElement("xpath", "//strong[contains(text(),'Call it Spring')]");}
@When("the user should get the call is spring dropdown")
public void the_user_should_get_the_call_is_spring_dropdown() {
	driver.findElement(By.xpath("//a[@class='theparent']")).isDisplayed();
    System.out.println("user is in the call it spring dropdown");

}
}
