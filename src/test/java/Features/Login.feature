Feature: Login functionality

  Scenario: User should see home page after login
    Given user open the application
    When user enters the username and password
    Then user should login successfully