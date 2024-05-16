Feature: Products-Category


  Scenario Outline: Validate Category feature on Products page
    Given user launches the application
    And verify whether user is on home page with title as <ExpectedTitle>
    And Verify that categories are visible on left side bar
    Then user Click on 'Women' category
    And user Click on any category link under 'Women' category, for example: Dress
    Then  Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    And user Click on any category link under 'Men' category, for example: TSHIRTS
    Then Verify that category page is displayed and confirm text ' MEN - TSHIRTS PRODUCTS'
    And user Click on any category link under 'Kids' category, for example: Dress
    Then Verify that category page is displayed and confirm text '  KIDS - DRESS PRODUCTS'

    Examples:
      | ExpectedTitle         |
      | "Automation exercise" |







