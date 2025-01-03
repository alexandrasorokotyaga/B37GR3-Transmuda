@login
Feature: Users should be able to access the Vehicle Odometer page

  Background: User is already in the log in page
    Given the user is on the login page

  @Driver
  Scenario: Verify login with different user types
    Given the user logged in as "driver"
    When the user hover over on the Fleet tab
    And the user click on Vehicle Odometer
   Then the user see the default page

  @DefaultDropdown
  Scenario: Driver should access Vehicle Odometer page and view records
    Given the user logged in as "driver"
   When the user hover over on the Fleet tab
    And the user click on Vehicle Odometer
    Then the user can view per page accepted result by default

  @Fleet
  Scenario: Sales Manager should access Vehicle Odometer page and handle errors
    Given the user logged in as "sales manager"
    When the user navigates to the Vehicle Odometer page
    And the user should see an error message for restricted access

@Odometer
Scenario:Store Manager should access Vehicle Odometer page and handle errors
  Given the user logged in as "store manager"
  When the user navigates to the Vehicle Odometer page
  And the user should see an error message for restricted access


