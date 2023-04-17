@tag
Feature: Cars Search Feature
  I want to valiate the Cars Search Site and few of its functionality

  Background: 
    Given User is on CarsGuide Site

  Scenario: Validate when user clicks on Search Cars link from the Buy and Sell Dropdown then he is navigated to new and used cars page
    Then Navigate to buy_sell dropdown link
    And clicks on Search Cars Link
    Then the User is expected to land on new and used cars search page