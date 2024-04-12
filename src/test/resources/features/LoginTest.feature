Feature: To validate Login functionality of automation practice



  Scenario: Validate Login feature
    Given  user launches the application
    And verify whether user is on home page with title as "Automation exercise"
    And user is on login page
    And verify login elements
    And verify the title of sign up header as "New User Signup!"
    And user enters username and password to login
    And user click on submit button
    Then user should be able to login to the app

