Feature: To validate Products Page



  Scenario: Verify All Products and product detail page
    Given  user launches the application
    And verify whether user is on home page with title as "Automation exercise"
    When user click on 'Products' button
    Then verify user is navigated to 'ALL PRODUCTS' page successfully
    And the products list is visible
    When user Click on 'View Product' of first product
    And User is landed onto the product detail page
    Then Verify that detail is visible: product name, category, price, availability, condition, brand





