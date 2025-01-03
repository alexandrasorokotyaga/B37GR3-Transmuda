@wip42
Feature: Functionality of Description field on the Calendar events
  Agile story: As a user, I want to write the “Description” when I create a calendar event.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Verification that users can type in to Description field
    When user hover over Activities button he clicks to Calendar Page
    And user clicks the button Create Calendar Event
    When user write message in Description
    Then the message should be displayed
