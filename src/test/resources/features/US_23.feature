Feature: US_23 Verify address details in checkout page
  Scenario: TC_01 Verify address details in checkout page
    Given U Navigate to url
    Then U Verify that home page is visible successfully
    And U Click on Signup_Login button
    Then U Fill all details in Signup and create account
    Then U Verify ACCOUNT CREATED! and click Continue button
    Then U Verify Logged in as username at top
    Then U Add products to cart
    Then U Click Cart button
    Then U Verify that cart page is displayed
    Then U Click Proceed To Checkout
    Then U Verify that the delivery address is same address filled at the time registration of account
    Then U Verify that the billing address is same address filled at the time registration of account
    Then U Click Delete Account button
    And U Verify ACCOUNT DELETED! and click Continue button