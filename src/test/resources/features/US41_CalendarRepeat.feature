@US41TC01AC01, @wip
Feature: Repeat Every input box validation

  As a user,
  I should see error messages when I enter an invalid integer number
  into the calendar "Repeat Every" input box

  Scenario Outline: Invalid values in "Repeat Every" input box
    Given the user logs in with username "<username>" and password "<password>"
    When the user goes to Activities modules
    And the user hovers over the Activities button
    And the user clicks on the Calendar Events button
    And the user clicks on the Create Calendar Event button
    And the user selects the Repeat checkbox
    Then the user goes to Repeat Every input box
    When the user enters "<integer number>" into the "<inputBoxName>" input box
    Then an error message "<expectedMessage>" should be displayed

    Examples:
      | username        | password     | integer number | inputBoxName   | expectedMessage
      | user2           | UserUser123  | 0          | Repeat Every   | The value have not to be less than 1.
      | storemanager53  | UserUser123  | 100        | Repeat Every   | The value have not to be more than 99.
      | salesmanager123 | UserUser123  | -5         | Repeat Every   | The value have not to be less than 1.