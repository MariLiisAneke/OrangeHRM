Feature: common2

  Scenario: common2 steps

    Given I am on the application homepage
    When I press on signin
    And I enter correct email address
    And i enter correct password
    When I click the signin button
    Then I should be successfully logged in
