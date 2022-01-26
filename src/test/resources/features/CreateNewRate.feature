 Feature: Creating new Rate
   Background:
    Given the user is on the login page
     And   the user enters the valid credentials
     When Navigate to Tax profile module


   Scenario Outline: Users should be able to create new Rate
     When Navigate to Rates module
     And  Enter the uniq "<code>"  "<DateFrom>"  "<DateTo>" "<RangeFrom>" "<RangeTo>"
     And Enter "<TaxRate>" "<Subtract>"
     Then Click to save button
     And Verify "<code>" to new rate added
     Examples:
       |code | DateFrom |DateTo |RangeFrom |RangeTo |TaxRate|Subtract|
       |QA19 |01/01/2020|31/12/2021|9000   |14500   |15    |5 |