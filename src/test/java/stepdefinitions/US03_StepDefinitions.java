package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import pages.US_03Pages;
import utilities.ConfigReader;
import utilities.Driver;
public class US03_StepDefinitions {
    US_03Pages us03Page = new US_03Pages();
    @Given("U Navigate to url")
    public void navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("U_automation_url"));
    }
    @Given("U Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(us03Page.automationExerciseImg.isDisplayed());
    }
    @And("U Click on Signup_Login button")
    public void clickOnSignup_LoginButton() {
        us03Page.signUpButton.click();
    }
    @Given("U Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(us03Page.loginToYourAccount.isDisplayed());
    }
    @Given("U Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        us03Page.emailBox.sendKeys(ConfigReader.getProperty("U_incorrectEmail"));
        us03Page.password.sendKeys(ConfigReader.getProperty("U_incorrectPassword"));
    }
    @Given("U Click login button")
    public void click_login_button() {
        us03Page.loginButton.click();
    }
    @Then("U Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {
        Assert.assertTrue(us03Page.incorrectMessage.isDisplayed());
    }
}