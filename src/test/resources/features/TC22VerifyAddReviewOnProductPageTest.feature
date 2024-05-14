Feature: Products- add Review



  Scenario: Verify add review on the view products page.
    Given  user launches the application
    And verify whether user is on home page with title as "Automation exercise"
    When user click on 'Products' button
    Then verify user is navigated to 'ALL PRODUCTS' page successfully
    And the products list is visible
    When user Click on 'View Product' of first product
    And User is landed onto the product detail page
    Then Verify 'Write Your Review' is visible
    And user enter "<name>", "<email>" and "<review>"
    And user Click 'Submit' button
    Then Verify success message 'Thank you for your review.'





