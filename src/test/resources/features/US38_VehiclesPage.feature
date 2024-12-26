@US_38
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US38 Edit car info icon verification as a "driver"
    When the user logged in as "driver"
    And hover over fleet tab and click on vehicles module
    And hover over edit car info icons
    Then verify edit car info icons are displayed

    @US_38_scenarioOutline
  Scenario Outline: US38 Edit car info icon verification

    When the user logged with "<username>" and "<password>"
    And hover over fleet tab and click on vehicles module
    And hover over edit car info icons
    Then verify edit car info icons are displayed

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |
