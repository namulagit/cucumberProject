Feature: check background functionality

  Background: Background demmo
    Given user on page of the window
    When user enters valid username and pass
    And Clicks on login button down
    Then user is navigated to home page on right

  Scenario: Test1
    When user clicks on welcome link
    Then then log out is displayed

  Scenario: Test2
    When user cliks on admin
    Then admin page is displayed
