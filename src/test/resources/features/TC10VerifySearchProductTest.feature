Feature: To validate Search Products Feature


  Scenario Outline: Verify Search Product feature
    Given user launches the application
    And verify whether user is on home page with title as "ExpectedTitle"
    When user click on products button
    Then verify user is navigated to 'ALL PRODUCTS' page successfully
    When user enter "<Product Name>" in search input and click search button
    Then verify tshirt is visible under the 'SEARCHED PRODUCTS'
    Examples:
          |Product Name|
           |tshirt      |






# create method on products page to enter the required text > when clicked this should take you to that ite,s
  #locate the search box>
# for 10th line use th methods from home page to verify text for each products

