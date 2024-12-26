@US_38
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US38 Edit car info icon verification as a "driver"
    Given the user logged in as "driver"
    When hover over fleet tab and click on vehicles module
    Then verify edit car info icons are displayed




