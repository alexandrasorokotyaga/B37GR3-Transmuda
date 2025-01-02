#@us39
#Feature: As a sales and a store manager user should be able to select any vehicle in the Vehicles page
#
#  Background: For all scenarios user is on the Vehicles page
#
#  @wip
#  Scenario Outline: All unchecked boxes verification
#    Given the user logged in as "<userType>"
#    And hover over fleet tab and click on vehicles module
#    Then the sales manager should able to see all check boxes are unchecked
#    Examples:
#      | userType      |
#      | store manager |
#      | sales manager |
#
#
#
#
##  Scenario: All cars selection verification
##    When user is on the Vehicles page
##    And user selects first checkbox
##    Then all the cars are selected
##
##  Scenario: Any car selection verification
##    When user is on the Vehicles page
##    And user selects any vehicle checkbox
##    Then selected vehicle checkox is selected

  Feature: As a user (Sales and Store manager), I should be able to select any vehicle from the Vehicles page (web table)

    @storeManager
    Scenario: As store manager I should be able to select any vehicle from the Vehicles page
      Given User logged in as Store Manager
      Then User should see all the checkboxes as unchecked.
      Then User should be able to check the first checkbox to select all the cars
      And User can select any car

      @salesManager
    Scenario: As sales manager I should be able to select any vehicle from the Vehicles page
      Given User logged in as Sales Manager
      Then User should see all the checkboxes as unchecked.
      Then User should be able to check the first checkbox to select all the cars
      And User can select any car



