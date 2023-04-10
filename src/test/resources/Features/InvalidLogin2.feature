@ignore
Feature: Login functionality

  Scenario: Wrong username with correct password should return correct error message

    Given I get on the homepage
    And I press the sign in button
    When I enter wrong username
    And I enter correct password
    When I click the button to login
    Then I should get the right error message