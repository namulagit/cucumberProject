Feature: Testing the test you login
@Imp
  Scenario: testing url with invalid cred
    When user open URL
    When EnterUSERID  PAS and click on Login button
    Then user id pass did match will display
