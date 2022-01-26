Feature: Adding new Tax profile
  Background:
    Given the user is on the login page
    And   the user enters the valid credentials

  Scenario Outline: Users should be able to add new Tax profile
    When Navigate to Tax profile module
    And  Click to Add icon
    When Enter the "<Tax profile>"  "<Description>"  "<FSSstatus>" and "<TaxonAnnual>"
    Then Click to save as a template button and verify new "<Tax profile>" added


    Examples:
      |Tax profile |Description|FSSstatus|TaxonAnnual|
      |M16 single    |FSS Main Method Single Tax Bands|FSS Main|Y|

