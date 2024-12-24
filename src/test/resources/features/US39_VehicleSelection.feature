
@us39 @wip
Feature: As a sales and a store manager user should be able to select any vehicle in the Vehicles page

  Background: For all scenarios user is on the Vehicles page


    Scenario: Unchecked boxes verification
      Given the user is on the login page
      When user is on the Vehicles page
      Then user should able to see all check boxes are unchecked

      Scenario: All cars selection verification
        When user is on the Vehicles page
        And user selects first checkbox
        Then all the cars are selected

        Scenario: Any car selection verification
          When user is on the Vehicles page
          And user selects any vehicle checkbox
          Then selected vehicle checkox is selected



