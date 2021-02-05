Feature: test login page

  Scenario Outline: Check login is successfull with valid credentials
    Given browser open
    And user is on login page
    When user enter <username> and <password>
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | test1    |    12345 |
      | test2    |    12345 |
      | test3    |    12345 |
      | test4    |    12345 |
