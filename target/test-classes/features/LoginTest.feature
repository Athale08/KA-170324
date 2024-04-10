Feature: To validate Login functionality of automation practice



  Scenario Outline: Validate Login feature
    Given  user launches the application
    And user is on login page
    And user enters login data from excel sheet "<sheetName>" and "<rowNumber>"
    And user click on submit button
    Then user should be able to login to the app

    Examples:
    |sheetName| rowNumber|
    |LoginTest| 0        |



