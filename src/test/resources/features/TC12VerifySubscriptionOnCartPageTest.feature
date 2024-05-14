Feature: Subscription feature on the Cart page


  Scenario Outline: Validate the Subscription feature on the Cart page
    Given user launches the application
    And verify whether user is on home page with title as <ExpectedTitle>
    When user Click 'Cart' button and Scroll down to the footer
    Then Verify text 'SUBSCRIPTION'
    And user Enter "<email address>" in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible
    Examples:
      | ExpectedTitle         |email address|
      | "Automation exercise" |k@k.com      |








