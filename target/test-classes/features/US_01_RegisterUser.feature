Feature:Register User

  Scenario:TC01
    Given the user navigate to url
    Then the user verifies that home page is visible successfully
    #When the user click on the signup/login button
    And Click on Signup Login button
    Then the user verifies "New User Signup!" is visible
    And The user Enter name and email address
    When The user Click Signup button
    Then The user Verify that ENTER ACCOUNT INFORMATION text is visible
    Then Fill details: Title, Name, Email, Password, Date of birth
     #   | tıtle | Name | Email | Password | Day | Month | Year |
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    Then Verify that Logged in as username is visible
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button


