Feature: searchByBrandName
  @searchByBrandName
  Scenario Outline: As a user ,i should be able to search any product by brand name
   Given I am On Home Page
    When  I enter "<brand_name>" in search Box
    And I click on Search button
    Then I should be able to see all the product by "<given brand name>"
    And I should verify navigated url contain searched "<word>"
    Examples:
      | brand_name|given brand name|word|
      |apple      |Apple   |apple |
