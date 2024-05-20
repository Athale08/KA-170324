Feature: Validation of Contact Us Form

  Scenario Outline: Validate the Contact Us Form
    Given user launches the application
    And verify whether user is on home page with title as "Automation Exercise"
    And user click on contactus button
    And Verify "Get In Touch" is visible
    And user enters the "<name>" and "<email>" and "<subject>" and "<message>"
    And user click on the submit button
    When user click on cancel button
    Then verify user stays on the same page and "Get In Touch" is visible

    Examples:
    |name | |email| |subject| |message|
    |     | |     | |Good Morning|   |       |
    |     | |     | |Good Afternoon| |       |
    |     | |     | |Good Evening|   |       |





 