
Feature: To validate the number box

  Scenario Outline: To verify if the user is entering text instead of number
    Given the user is in the number box
    When  the user is trying to enter the "<text>"
    Then  the user is not getting any letters in number box
    

Examples:
  |text|
  |rangan|
