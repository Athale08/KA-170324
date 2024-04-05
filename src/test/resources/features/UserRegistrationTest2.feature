Feature: User Registration

  Scenario Outline: Verify user registration with valid test data
    Given user launches the application
    And user click on signup or login link on homepage
    And user enters excel data "<sheetName>" and "<rowNumber>" and clicks on signup button

    Examples:
    | sheetName | rowNumber|
    | Prashanth | 0        |
    | Prashanth | 1        |
    | Kishor    | 0        |
