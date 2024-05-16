Feature: Registration Before checkout


  Scenario Outline: Validate Registration Before Checkout after placing an order
    Given user launches the application
    And verify whether user is on home page with title as 'Automation Exercise'
    And user click on signup or login link on homepage
    And user enters "<username>" and "<emailId>" and clicks on signup button
    And user enters "<title>" and "<password>" and "<day>" and "<month>" and "<year>"
    And user enters "<firstname>" and "<lastname>" and "<address1>" and "<address2>"
    And "<country>" and "<state>" and "<city>" and "<zipcode>" and "<mobilenumber>"
    And user click on  create account button
    Then user should be able to view the account creation confirmation as "ACCOUNT CREATED!"
    And user click on continue button
    Then user should be logged in the app
    When user Add products to cart and Click 'Cart' button
    Then Verify that cart page is displayed
    And user Click 'Proceed To Checkout' button
    Then Verify Address Details and Review Your Order
    And Enter description in comment text area and click 'Place Order'
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click 'Pay and Confirm Order' button
    Then Verify success message 'Your order has been placed successfully!'
    And user can delete account
    Then user should see the account deletion confirmation and click continue button


    Examples:

      | username | emailId | title | password | day | month | year | firstname | lastname | address1 | address2 | country | state | city | zipcode | mobilenumber |
      |   |  | Mr | Zetan123#$ | 10 | January | 1990 |  |  | Flat 105 | London | United States | Texas | Austin | 98501 | |
      |   |  | Mrs | Zetan123#$ | 15 | February | 1995 |  |  | Flat 105 | London | Israel | Texas | Austin | 98501 | |
      |   |  | Mr | Zetan123#$ | 31  | March | 1997 |  |  | Flat 105 | London | Canada | Texas | Austin | 98501 | |











