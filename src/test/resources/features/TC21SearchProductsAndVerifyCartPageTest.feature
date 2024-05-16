Feature: Products - Search and Cart



  Scenario: Verify the products search and cart  after valid login
    Given  user launches the application
    And verify whether user is on home page with title as "Automation exercise"
    When user click on 'Products' button
    Then verify user is navigated to 'ALL PRODUCTS' page successfully
    When user Enter product name in search input and click search button
    Then verify that the searched products list is visible
    When user add those products to the cart and Click 'Cart' button
    Then verify that products are visible in cart
    And user click on signup or login link on homepage
    And  user enters username and password to login
    When user click on cart button
    Then Verify that those products are visible in cart after login as well








