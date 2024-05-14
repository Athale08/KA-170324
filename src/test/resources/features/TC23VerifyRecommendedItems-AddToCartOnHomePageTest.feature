Feature: Recommended items-add to cart


  Scenario Outline: Validate Add to cart from Recommended items on the home page.
    Given user launches the application
    And verify whether user is on home page with title as <ExpectedTitle>
    When user Scroll down to footer
    Then Verify text 'RECOMMENDED ITEMS'is visible
    When user Click on 'Add To Cart' on Recommended product
    And Click on 'View Cart' button
    Then Verify that product is displayed in cart page
    Examples:
      | ExpectedTitle         |
      | "Automation exercise" |






