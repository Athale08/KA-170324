Feature: To validate SignUp functionality of automation practice



  Scenario Outline: Validate signup feature with already registered email address
    Given  user launches the application
    And verify whether user is on home page with title as "Automation exercise"
    And user is on login page
    And verify login elements
    And verify the title of sign up header as "New User Signup!"
    And user click on signup or login link on homepage
    And user enters already registered "<username1>" and "<emailId1>" and clicks on signup button
    Then Verify error 'Email Address already exist!' is visible
    Examples:
      | username1 | emailId1 |
      | Kishor   | k@k.com |





