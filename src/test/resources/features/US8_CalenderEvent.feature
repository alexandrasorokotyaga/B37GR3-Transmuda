@wip
Feature: All the user types should be Create a recurring calendar event


  Scenario Outline: Verify all the user types get the same result when create a calender event
    Given the user logged in as "<userType>"
    When the user goes to activities modules
    Then the user hover to the Calender Event
    And the user clicks on the calender events
    Then the user enables the Repeat checkbox
    Then the "Repeat Every" field should display the default value "1"
    And clear the Repeat Every field
    Then an error message should be displayed saying "This value should not be blank."
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |







