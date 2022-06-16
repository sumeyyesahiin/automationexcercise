@US20
Feature:

  Scenario: US20 Search Products and Verify Cart After Login
    Given zey Lunch browser
    And zey Negate to 'url'
    And zey Click Products button
    And zey Verify user is navigated to ALL PRODUCTS page successfully
    And zey Enter product name in search input and click search button
    And zey Verify SEARCHED PRODUCTS is visible
    And zey Verify all the products related to search are visible
    And zey Add those products to cart
    And zey Click Cart button and verify that products are visible in cart
    And zey Click Signup / Login button and submit login details
    And zey Again, go to Cart page
    And zey Verify that those products are visible in cart after login as well
    And zey Closed pages