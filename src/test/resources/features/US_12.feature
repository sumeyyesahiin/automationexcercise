@smoke
Feature:

  Scenario: US12 Add Products in Cart
    Given zey Lunch browser
    And zey Negate to 'url'
    Then zey Verify that home page is visible successfully
    And zey Click Products button
    And zey Hover over first product and click Add to cart
    And zey Click Continue Shopping button
    And zey Hover over second product and click Add to cart
    And zey Click View Cart button
    And zey Verify both products are added to Cart
    And zey Verify their prices, quantity and total price
    And zey Closed pages