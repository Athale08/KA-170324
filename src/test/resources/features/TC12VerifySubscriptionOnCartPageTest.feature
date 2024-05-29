Feature: Subscription feature on the Cart page


  Scenario Outline: Validate the Subscription feature on the Cart page
    Given user launches the application
    When user Click Cart button
    When user Scroll down to footer
    Then Verify text "SUBSCRIPTION"
    And user Enter "<email address>" in input and click arrow button
    Then Verify success message "You have been successfully subscribed!" is visible
    Examples:
      |email address|
      |k@k.com      |








