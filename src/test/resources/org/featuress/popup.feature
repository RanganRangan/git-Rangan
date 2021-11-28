
Feature: To validate the popup in aldoshoe

  Scenario: To verify thet the user is getting the popup message or not  
    Given the user should open the aldoshoe
    When the user is in the aldoshoe page  
    And the user should get the popup message after ten seconds 
    Then the user should handle the popup  



