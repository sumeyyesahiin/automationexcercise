@smoke
Feature:
  Scenario:
    Given Launch browser
    And Navigate to url 'url'
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Click on View Product of first product
    And Verify Write Your Review is visible
    And Enter name, email and review
    And Click Submit button
    Then Verify success message Thank you for your review.
