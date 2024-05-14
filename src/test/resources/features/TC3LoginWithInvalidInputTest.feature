Feature: To validate Login functionality of automation practice

  Scenario: Validate Login feature with invalid input
    Given user launches the application
    And user is on login page
    And user enters invalid username and invalid password to login
    And user click on login button
    Then user should be not be able to login to the app and show "Your email or password is incorrect!"