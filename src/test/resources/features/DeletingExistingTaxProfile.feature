Feature: Deleting an existing tax profile
  Background:
    Given the user is on the login page
    And   the user enters the valid credentials

  Scenario: Users should be able to edit an existing Tax profile
    When Navigate to Tax profile module
    And  Select a Tax profile
    Then Click to delete button
    And Verify that selected tax profile deleted

