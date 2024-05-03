Feature: To validate Logout functionality of automation practice



  Scenario: Validate Logout feature with valid input
    Given  user launches the application
    And verify whether user is on home page with title as "Automation exercise"
    And user is on login page
    And verify login elements
    And verify the title of login header as "Login to your account"
    And user enters username and password to login
    And user click on login button
    Then user should be logged in the app
    And user click on logout button
    And user is on login page





