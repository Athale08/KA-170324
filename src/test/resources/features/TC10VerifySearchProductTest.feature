Feature: To validate Search Products Feature


  Scenario Outline: Verify Search Product feature
    Given user launches the application
    When user click on the Products button
    Then verify user is navigated to the "All Products" page successfully
    And the products list is visible
    When user enter "<Product Name>" in search input and click search button
    Then verify "Searched Products" as title of page
    And  "<Product Name>" is visible in the search results
    Examples:
          |Product Name|
           |Full      |
           | Sleeves       |






# create method on products page to enter the required text > when clicked this should take you to that ite,s
  #locate the search box>
# for 10th line use th methods from home page to verify text for each products

