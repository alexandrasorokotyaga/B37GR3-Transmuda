@vehiclesContracts
Feature: User is able to access to Vehicle Contracts page

  Background: User is already in the log in page
    Given the user is on the login page

    @US36AC1TC1
  Scenario: user access to Vehicle Contracts page as store manager
    Given the user logged in as "store manager"
    When hover over fleet tab and click on Vehicle Contracts page
    Then verify the title as expected

  @US36AC1TC2
  Scenario: user access to Vehicle Contracts page as sales manager
    Given the user logged in as "sales manager"
    When hover over fleet tab and click on Vehicle Contracts page
    Then verify the title as expected

  @US36AC2TC1
  Scenario: user can NOT access to Vehicle Contracts page as driver
    Given the user logged in as "driver"
    When hover over fleet tab and click on Vehicle Contracts page as driver
    Then verify error message is displayed "You do not have permission to perform this action."