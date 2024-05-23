# @Test1 - give this annotation if you want to run specific feature files in the runner.
Feature: To validate Products Page



  Scenario: Verify All Products and product detail page
    Given  user launches the application
    And verify whether user is on home page with title as "Automation Exercise"
    When user click on the "Products" button
    Then verify user is navigated to the "ALL Products" page successfully
    And the products list is visible
    When user Click on 'View Product' of first product
    And User is landed onto the product detail page
    Then Verify that detail is visible: product name, category, price, availability, condition, brand





# identify the elements on home page for 'Products' button and create a method on home page to click on this button
  # create a productsPage in appPages, locate the element All Products and create a method to verify the title as all products.
  # copy the method and locators from Homepage in the products page under a new method to verifyall list
 # Then create a method to click on 1st product and locate this element
  #create method to verifyproductdetail page
  #create method for verifydetails and locate these elements
 # action first and then verification