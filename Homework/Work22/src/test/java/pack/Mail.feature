Feature: Test login page

  Scenario: Test Mail.ru
    Given I am on main application page
    When I login as correct user
    When I move messages to spam
    When I mark messages as not spam
    When I am sending a message
    When I mark messages with flags