package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_08Pages;
import pages.US_21Pages;

public class US_21StepDefinitions {
    //Faker faker = new Faker();
    US_21Pages us_21Pages = new US_21Pages();
    US_08Pages us_08Pages = new US_08Pages();

    @Then("Verify Write Your Review is visible")
    public void verify_write_your_review_is_visible() {
        Assert.assertTrue(us_08Pages.reviewText.isDisplayed());
    }

    @Then("Enter name, email and review")
    public void enter_name_email_and_review() {
        us_21Pages.nameButton.sendKeys("aloha");
        us_21Pages.emailButton.sendKeys("aloha@gmail.com");
        us_21Pages.reviewButton.sendKeys("urun kalitesi iyi degil.");
    }

    @Then("Click Submit button")
    public void click_submit_button() {
        us_21Pages.submitButton.click();
    }

    @Then("Verify success message Thank you for your review.")
    public void verify_success_message_thank_you_for_your_review() {
        Assert.assertTrue(us_21Pages.alert.isDisplayed());
    }


}
