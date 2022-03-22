Feature: Search funtionality test

  Scenario: User should able to search items using Search Box in home page
    Given user is on macys home page
    When user enters items in search box
    And user press enter
    Then user is navigated to search result
