Feature: User should be able to see columns on vehicles model page

  Background: User is already in the log in page

  Scenario: Store manager can see 10 columns on the
  Vehicles Model page.
    When  User is logged in as Store maneger
    And Hover over to Fleet
    And Click Vehicles model
    Then User can see 10 columns

  Scenario: Sales manager can see 10 columns on the
  Vehicles Model page.
    When  User is logged in as Sales maneger
    And Hover over to Fleet
    And Click Vehicles model
    Then User can see 10 columns

  Scenario: Driver can't access to the vehicle model page
    When User is logged in as Driver
    And Hover over to Fleet
    And Click Vehicles model
    Then User can see error message "You do not have permission to perform this action."




