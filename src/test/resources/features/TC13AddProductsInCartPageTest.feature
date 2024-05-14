Feature: Add Products in Cart


  Scenario Outline: Validate the Add Products in Cart feature
    Given user launches the application
    And verify whether user is on home page with title as <ExpectedTitle>
    When user click on 'Products' button
    And user Hover over first product and click 'Add to cart'
    And user Click 'Continue Shopping' button
    And user Hover over second product and click 'Add to cart'
    And user Click 'View Cart' button
    Then Verify both products are added to Cart
    And Verify their prices, quantity and total price

    Examples:
      | ExpectedTitle         |
      | "Automation exercise" |









