Feature: As a Amazon user I should be able to login with valid credentials

  Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL "https://www.amazon.in/"
    Then I click on sign in button and wait for sign in page
    Then I should see Sign In Page
    When I enter username as " "
    And I Click on Continue button
    And I enter password as " "
    And click on login button
    Then I am logged in