Feature: Add new address

  Background:
    Given I am on the application homepage
    When I press on signin
    And I enter correct email address
    And i enter correct password
    When I click the signin button
    Then I should be successfully logged in

  Scenario: Add new address in My addresses
    When I click on My addresses
    And I click Add a new address
    And I fill all required fields
    Then I click Save button and new address should be added