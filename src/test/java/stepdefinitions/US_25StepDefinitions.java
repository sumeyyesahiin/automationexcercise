package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_08Pages;
import pages.US_25Pages;
import utilities.Driver;

public class US_25StepDefinitions {


    US_25Pages us_25Pages = new US_25Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Scroll down page to bottom")
    public void scroll_down_page_to_bottom() throws InterruptedException {
        actions.moveToElement(us_25Pages.subscriptionText).perform();
        Thread.sleep(4000);
    }

    @Then("Verify SUBSCRIPTION is visible")
    public void verify_is_visible() {
        Assert.assertTrue(us_25Pages.subscriptionText.isDisplayed());
    }

    @Then("Click on arrow at bottom right side to move upward")
    public void click_on_arrow_at_bottom_right_side_to_move_upward() throws InterruptedException {
        us_25Pages.fafaButton.click();
        Thread.sleep(4000);
    }

    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(us_25Pages.fullFledgedText.isDisplayed());
    }

}
