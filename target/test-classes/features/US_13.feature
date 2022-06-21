@smoke
Feature: US_13 Verify Product quantity in Cart
  Scenario: TC_01 Verify Product quantity in Cart

    Given U Navigate to url
    Then U Verify that home page is visible successfully
    Then U Click View Product for any product on home page
    Then U Verify product detail is opened
    Then U increase quantity to four
    Then U Click Add to cart button
    Then U Click View Cart button
    And U Verify that product is displayed in cart page with exact quantity
