Feature: 
  test to  google functionality
@smoke
  Scenario: validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hit enter
    Then user is navigated to search results
