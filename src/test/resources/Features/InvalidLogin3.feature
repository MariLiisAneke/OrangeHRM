Feature: Login Functionality

  Background:
    Given I am on the app homepage
    And I click on signin

  Scenario Outline: invalid username or password should return correct error message

    #Given I land on the homepage
    #And I press the sign in link
    When I type "<Username>"
    And I input "<Password>"
    When i click the login
    Then I should get the correct "<error>"

    Examples:
    | Username                | Password           | error                            |
    | lanre_april@gmail.com   | test               | Invalid password.                |
    | lanreapril@gmail.com    | testing            | Authentication failed.           |
    |                         |                    | An email address required.       |
