
Feature: Users should be able to login
  Background:
    Given the user is on the login page

  Scenario: Login with valid credentials
    When the user enters the valid credentials
    Then Homepage should be displayed.

  Scenario: Login with invalid credentials
    When the user enters invalid "user_name12" and "password123"
    Then Alert error is seen

  Scenario:  Users with blank username should not be able to login
    When the user enters invalid "" and "Wm29625912."
    Then  Blank alert error is seen

  Scenario:  Users with blank password should not be able to login
    When the user enters invalid "IntQA05" and ""
    Then  Blank password alert error is seen

