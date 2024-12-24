@oroinc
Feature: Users should be able to access Oroinc Documentation

  Background: User is already on a browser page
    Given the user has a browser open

  @access
  Scenario: Open Oroinc Documentation page in a new tab
    When the user opens a new browser tab
    And navigates to the Oroinc Documentation page
    Then the user should see the header contains "Documentation"