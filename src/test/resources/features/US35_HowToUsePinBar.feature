Feature: How to use the pinbar

  User Story:
  As a user, I want to learn how to use the pinbar.

  Background: User is already in the log in page
    Given the user is on the login page

  @truckDriver
  Scenario: Login as Truck Driver
    When user enters truck driver username
    And user enters truck driver password
    And user clicks to login button
   Then user clicks "Learn how to use this space"
    And user sees "How To Use Pinbar"
    And user sees description "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Then user should see an image on the page


  @storeManager
  Scenario:Login as Store Manager
    When user enters Store Manager username
    And user enters Store Manager password
    And user clicks to login button
    Then user clicks "Learn how to use this space"
    And user sees "How To Use Pinbar"
    And user sees description "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Then user should see an image on the page

  @salesManager
  Scenario:Login as Sales Manager
    When user enters Sales Manager username
    And user enters Sales Manager password
    And user clicks to login button
    Then user clicks "Learn how to use this space"
    And user sees "How To Use Pinbar"
    And user sees description "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Then user should see an image on the page

  @DriverStoreAndSalesManager
  Scenario Outline:How to use the pinbar
    When user enters correct username "<username>"
    And user enters correct password "<password>"
    And user clicks to login button
    Then user clicks "Learn how to use this space"
    And user sees "How To Use Pinbar"
    And user sees description "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    Then user should see an image on the page

    Examples:
      | username        | password    |
      | user49          | UserUser123 |
      | storemanager59  | UserUser123 |
      | salesmanager259 | UserUser123 |
    
