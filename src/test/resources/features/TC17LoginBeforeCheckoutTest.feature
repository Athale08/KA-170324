Feature: Login Before checkout


  Scenario: Validate Login Before Checkout
    Given user launches the application
    And verify whether user is on home page with title as 'Automation Exercise'
    And user click on signup or login link on homepage
    And user is on login page
    And verify login elements
    And verify the title of login header as "Login to your account"
    And user enters username and password to login
    And user click on login button
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











