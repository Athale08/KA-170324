Feature: Products-Brands


  Scenario Outline: Validate Brands feature on Products page
    Given user launches the application
    And verify whether user is on home page with title as <ExpectedTitle>
    When user click on 'Products' button
    Then Verify that Brands are visible on left side bar
    And user Click on any brand name
    Then Verify that user is navigated to brand page and brand products are displayed
    And user click on any other brand link On left side bar
    Then Verify that user is navigated to that brand page and can see products

    Examples:
      | ExpectedTitle         |
      | "Automation exercise" |






