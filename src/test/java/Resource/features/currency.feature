Feature: Currency
  @currency
  Scenario Outline:As a user,i should be able to choose currency form homepage
    Given I am On Home Page
    When I am select "<currency>"
    Then each product contain "<currencySymbol>"
    Examples:
    |currency|currencySymbol|
    |Euro    |€             |
    |US Dollar|$               |
