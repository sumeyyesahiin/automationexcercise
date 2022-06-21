@smoke
Feature:

  Scenario: US11 Verify Subscription in Cart page
    Given zey Lunch browser
    And zey Negate to 'url'
    Then zey Verify that home page is visible successfully
    And zey Click Cart button
    And zey Scroll down to footer
    And zey Verify text Subscription
    And zey Enter email address in input and click arrow button
    And zey Verify success message You have been successfully subscribed is visible
    And zey Closed pages