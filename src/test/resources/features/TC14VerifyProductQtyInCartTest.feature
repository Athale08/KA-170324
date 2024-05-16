Feature: Product Quantity


  Scenario Outline: Validate the Product quantity in Cart when updated
    Given user launches the application
    And verify whether user is on home page with title as <ExpectedTitle>
    When user Click on 'View Product' of any product on home page
    Then Verify product detail is opened
    When user Increase quantity to 4
    And Click 'Add to cart' button
    And Click 'View Cart' button
    Then Verify that product is displayed in cart page with exact quantity

    Examples:
      | ExpectedTitle         |
      | "Automation exercise" |










