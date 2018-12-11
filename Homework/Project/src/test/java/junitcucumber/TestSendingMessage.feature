Feature: Test MainPage and MessagePage

  Scenario: Test sending message
    Given I login as correct user
    When I will send a message to any user
    Then I close the site

