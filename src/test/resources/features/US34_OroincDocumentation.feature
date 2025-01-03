@oroinc @wip @us34
Feature: Users should be able to access Oroinc Documentation

  Background: User is already on a browser page
    Given User should able to land the home page

  @access
  Scenario: Open Oroinc Documentation page in a new tab
    When  User click the question icon
    And   User navigates to the Oroinc Documentation page
    Then  Verify the Oroinc Documentation page URL and Header

