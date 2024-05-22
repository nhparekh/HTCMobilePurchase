Feature: newReleaseComment
  @newReleaseComment
  Scenario: As user,I should be able to add comment and it should display at last
    Given I am On Home Page
    When I click on Details
    And I enter Comment Details and verify new comment msg display
    Then verify new comment is added at last