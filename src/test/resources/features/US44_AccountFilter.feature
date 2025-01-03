@US44
Feature: How to filter customers’ info on the Accounts page.

  User Story:
  As a user, I want to learn how to use the filter customers’ info on the Accounts page.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify that users see 8 filter items on the Accounts page
    Given the user logged in as "<userType>"
    When the user goes to Customers modules
    Then the user hover to the Accounts
    And the user clicks on the Accounts
    Then  the user clicks on the filter icon
    Then verify the users see below filters under Manage filters items on the Accounts page
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |
    Examples:
      | userType      |
      | sales manager |
      | store manager |

