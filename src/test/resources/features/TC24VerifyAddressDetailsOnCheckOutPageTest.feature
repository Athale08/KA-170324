Feature: Address Details


  Scenario Outline: Validate address details on checkout match the ones entered during registration.
    Given  user launches the application
    And verify whether user is on home page with title as "Automation Exercise"
    And user is on login page
    And verify login elements
    And verify the title of sign up header as "New User Signup!"
    And user click on signup or login link on homepage
    And user enters "<username>" and "<emailId>" and clicks on signup button
    And user enters "<title>" and "<password>" and "<day>" and "<month>" and "<year>"
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox for 'Receive special offers from our partners!'
    And user enters "<firstname>" and "<lastname>" and "<address1>" and "<address2>"
    And "<country>" and "<state>" and "<city>" and "<zipcode>" and "<mobilenumber>"
    And user click on  create account button
    Then user should be able to view the account creation confirmation as "Congratulations! Your new account has been successfully created!"
    And user click on continue button
    Then user should be logged in the app
    When user click on 'Products' button
    And user Hover over first product and click 'Add to cart'
    And user click on view cart
    Then Verify that the cart page is displayed
    When user click 'Proceed to Checkout' button
    Then Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    And user can delete account
    Then user should see the account deletion confirmation

    Examples:
      | username | emailId | title | password   | day | month    | year | firstname | lastname | address1 | address2 | country       | state | city   | zipcode | mobilenumber |
      |          |         | Mr    | Zetan123#$ | 10  | January  | 1990 |           |          | Flat 105 | London   | United States | Texas | Austin | 98501   |              |
      |          |         | Mrs   | Zetan123#$ | 15  | February | 1995 |           |          | Flat 105 | London   | Israel        | Texas | Austin | 98501   |              |
      |          |         | Mr    | Zetan123#$ | 31  | March    | 1997 |           |          | Flat 105 | London   | Canada        | Texas | Austin | 98501   |              |







