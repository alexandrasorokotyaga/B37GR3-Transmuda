Feature: User should be able to see columns on vehicles model page

  Background: User is already in the log in page
    Given the user is on the login page

@t1
  Scenario: Store manager can see 10 columns on the Vehicles Model page.
    Given the user logged in as "store manager"
    When Hover over to Fleet
    And Click Vehicles model
    Then User can see ten columns

  Scenario: Sales manager can see 10 columns on the Vehicles Model page.
    Given  the user logged in as "sales manager"
    When Hover over to Fleet
    And Click Vehicles model
    Then User can see ten columns

  Scenario: Driver can't access to the vehicle model page
    Given the user is logged in as "driver"
    When Hover over to Fleet
    And Click Vehicles model
    Then User can see error message "You do not have permission to perform this action."



