
Feature:

  Scenario:
    Given Launch browser
    And Navigate to url 'url'
    Then Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on View Product of first product
    And User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand