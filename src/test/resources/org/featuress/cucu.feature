
Feature: To validate the aldoshoes login page

Background:
Given the user should click the myaccount

@login
  Scenario Outline: To verify if the user is login with invalid mobile number 
    And the user should click the login
    When the user is filling the invalid the mobile "<number>"
    And the user is clicking the login button
    Then the user should go to the invalid login page 

Examples:
  |number|
  |9003288582|
  
  
@registration
    Scenario: to verify the register button is navigate to registration
     And the user shoud click the register
     When the user should navigate to registration field
     
