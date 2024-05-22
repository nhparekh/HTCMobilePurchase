Feature: registration
  @register
  Scenario: As User, I should be able to register successfully
    Given I am On Home Page
    And  I click On Register Button
    When I Enter Registration details
    Then I Should Be Able to register successfully
