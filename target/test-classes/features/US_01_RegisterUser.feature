#Test Case 1: Register User
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'New User Signup!' is visible
#6. Enter name and email address
#7. Click 'Signup' button
#8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#9. Fill details: Title, Name, Email, Password, Date of birth
#10. Select checkbox 'Sign up for our newsletter!'
#11. Select checkbox 'Receive special offers from our partners!'
#12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#13. Click 'Create Account button'
#14. Verify that 'ACCOUNT CREATED!' is visible
#15. Click 'Continue' button
#16. Verify that 'Logged in as username' is visible
#17. Click 'Delete Account' button
#18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
@US_01
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


