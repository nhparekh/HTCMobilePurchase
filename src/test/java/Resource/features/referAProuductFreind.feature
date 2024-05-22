Feature: ReferAProductFreind

  @referAProductFriend
  Scenario: As a user, i should be able to refer a product to freind
    Given I am On Home Page
    When I click on Electronics
    And I click on Camera & Photo
    And I click on Leica T Mirrorless Digital Camera
    And I click on email a friend option
    Then I enter friend email id and i enter my email id and i type text on comment box and i click on send email



