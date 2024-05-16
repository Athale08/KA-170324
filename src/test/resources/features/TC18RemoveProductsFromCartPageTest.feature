Feature: Remove Products From Cart


  Scenario Outline: Validate Products removal from the Cart feature
    Given user launches the application
    And verify whether user is on home page with title as <ExpectedTitle>
    When user click on 'Products' button
    And user Hover over first product and click 'Add to cart'
    And user Click 'Continue Shopping' button
    And user Hover over second product and click 'Add to cart'
    And user Click 'View Cart' button
    Then Verify both products are added to Cart
    And user Click 'X' button corresponding to particular product
    Then Verify that product is removed from the cart

    Examples:
      | ExpectedTitle         |
      | "Automation exercise" |







