Feature: Editting a existing tax profile
  Background:
    Given the user is on the login page
    And   the user enters the valid credentials


  Scenario Outline: Users should be able to edit an existing Tax profile
    When Navigate to Tax profile module
    And  Click the edit button
    When Edit the  "<Description>"
    Then Click to save as a template button
    And Verify that "<Description>" is editted

    Examples:
     |Description|
     |FSS Main Method Tax ***QA**|