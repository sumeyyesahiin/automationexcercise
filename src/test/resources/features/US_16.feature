Feature: US_16 Place Order Login before Checkout
  Scenario: TC_01 Place Order Login before Checkout
    Given U Navigate to url
    Then U Verify that home page is visible successfully
    Then U Click on Signup_Login button
    And U Fill email, password and click Login button
    And U Verify Logged in as username at top
    And U Add products to cart
    Then U Click Cart button
    Then U Verify that cart page is displayed
    Then U Click Proceed To Checkout
    Then U Verify Address Details and Review Your Order
    Then U Enter description in comment text area and click Place Order
    And U Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then U Click Pay and Confirm Order button
    And U Verify success message Your order has been placed successfully!
    Then U Click Delete Account button
    And U Verify ACCOUNT DELETED! and click Continue button