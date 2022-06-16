package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_11Pages;
import utilities.Driver;

public class US_11StepDefinitions {

    US_11Pages us_11Pages = new US_11Pages();

    @Then("zey Click Cart button")
    public void zey_click_cart_button() {
        us_11Pages.cardButton.click();
        Driver.waitFor(3);
    }

    @Then("zey Scroll down to footer")
    public void zey_scroll_down_to_footer() {

    }

    @Then("zey Verify text Subscription")
    public void zey_verify_text_subscription() {
        Assert.assertTrue("Subscription basligi yok",us_11Pages.subscriptionTitle.isDisplayed());
        Driver.waitFor(3);
    }

    @Then("zey Enter email address in input and click arrow button")
    public void zey_enter_email_address_in_input_and_click_arrow_button() {
        us_11Pages.emailBox.sendKeys("askask@gmail.com");
        Driver.waitFor(3);
        us_11Pages.arrowButton.click();
    }

    @Then("zey Verify success message You have been successfully subscribed is visible")
    public void zey_verify_success_message_you_have_been_successfully_subscribed_is_visible() {
        Assert.assertTrue("basari mesaji alinamadi",us_11Pages.successAlert.isDisplayed());
    }
}
