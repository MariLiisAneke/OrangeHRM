@ignore
Feature: Login Functionality

  Scenario: Login with invalid credentials should return the error message

    Given I am on the landing page
    When I select the sign in link
    And I enter Correct Username
    And I enter incorrect password
    When i click the login button
    Then I should get correct error message