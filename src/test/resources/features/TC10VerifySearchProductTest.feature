Feature: To validate Search Products Feature


  Scenario Outline: Verify Search Product feature
    Given user launches the application
    And verify whether user is on home page with title as <ExpectedTitle>
    When user click on 'Products' button
    Then verify user is navigated to 'ALL PRODUCTS' page successfully
    When user enter "<Product Name>" in search input and click search button
    Then verify 'SEARCHED PRODUCTS' is visible
    Examples:
          | ExpectedTitle         |Product Name|
          | "Automation exercise" |tshirt      |









