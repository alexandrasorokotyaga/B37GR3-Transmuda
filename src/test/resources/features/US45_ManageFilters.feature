@US45
Feature: As a user, (Store and Sales managers) I want to manage filters on the Vehicle Costs page. (Web table and checkbox)

  @storeManager
  Scenario: As a Store Manager I want to manage filters on the Vehicle Costs page.
    Given User logged in as a Store Manager
    When User goes to Vehicle cost page should be able to see
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    And User verifies that can check the first checkbox to select All Vehicle Costs

    @US45StoreAndSalesManager
  Scenario Outline: Verify the users manage the filters on the Vehicle Costs page
    Given the user logged in as "<userType>"
    #Given User logged in as a Store Manager
    When User goes to Vehicle cost page should be able to see
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |
    And User verifies that can check the first checkbox to select All Vehicle Costs

    Examples:
      | userType      |
      | sales manager |
      | store manager |