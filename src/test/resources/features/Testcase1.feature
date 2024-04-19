Feature: To validate Testcase1



  Scenario: Validate Scenario 1
    Given  user launches the application
    And verify whether user is on home page with title as "Automation exercise"
    And user is on login page
    And verify login elements
    And verify the title of sign up header as "New User Signup!"
    And user click on signup or login link on homepage
    And user enters "<username>" and "<emailId>" and clicks on signup button
    And user enters "<title>" and "<password>" and "<day>" and "<month>" and "<year>"
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox for 'Receive special offers from our partners!'
    And user enters "<firstname>" and "<lastname>" and "<address1>" and "<address2>"
    And "<country>" and "<state>" and "<city>" and "<zipcode>" and "<mobilenumber>"
    And user click on  create account button
    Then user should be able to view the account creation confirmation as "ACCOUNT CREATED!"
    And user click on continue button
    Then user will be logged in as "<aaaaa>"
    And user can delete account
    Then user should see the account deletion confirmation








