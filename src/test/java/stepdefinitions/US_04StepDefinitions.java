package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_04Pages;

public class US_04StepDefinitions {

    US_04Pages us_04Pages = new US_04Pages();


    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
        us_04Pages.signUpButton.click();
    }

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(us_04Pages.loginText.isDisplayed());
    }

    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        us_04Pages.emailButton.sendKeys("aloha@gmail.com");
        us_04Pages.passwordButton.sendKeys("42864286");
    }

    @Then("Click login button")
    public void click_login_button() {
        us_04Pages.loginButton.click();
    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(us_04Pages.loggedInAsText.isDisplayed());
    }

    @Then("Click Logout button")
    public void click_logout_button() {
        us_04Pages.LogoutText.click();
    }

    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertTrue(us_04Pages.loginText.isDisplayed());
    }


}
