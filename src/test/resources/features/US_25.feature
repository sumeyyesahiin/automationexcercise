@smoke
Feature:

  Scenario:
    Given Launch browser
    And Navigate to url 'url'
    Then Verify that home page is visible successfully
    And Scroll down page to bottom
    And Verify SUBSCRIPTION is visible
    And Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen