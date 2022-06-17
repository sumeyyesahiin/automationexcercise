package stepdefinitions;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import pages.US_16Pages;
import utilities.ConfigReader;
public class US_16StepDefinitions {
    US_16Pages us16Page = new US_16Pages();
    @Then("U Fill email, password and click Login button")
    public void fill_email_password_and_click_login_button() {
        us16Page.loginEmail.sendKeys(ConfigReader.getProperty("U_email"));
        us16Page.loginPassword.sendKeys(ConfigReader.getProperty("U_password"));
        us16Page.loginButton.click();
    }
    @Then("U Verify Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {
        Assert.assertTrue(us16Page.loggedInAsUsername.isDisplayed());
    }
    @Then("U Add products to cart")
    public void add_products_to_cart() {
        us16Page.viewProduct1.click();
        us16Page.addToChart.click();
        us16Page.continueShopping.click();
    }
    @Then("U Click Cart button")
    public void click_cart_button() {
        us16Page.cartButton.click();
    }
    @Then("U Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        Assert.assertTrue(us16Page.shoppingCart.isDisplayed());
    }
    @Then("U Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        us16Page.proceedToCheckout.click();
    }
    @Then("U Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {
        Assert.assertTrue(us16Page.addressDetails.isDisplayed());
        Assert.assertTrue(us16Page.reviewYourOrder.isDisplayed());
    }
    @Then("U Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        us16Page.commentTextArea.sendKeys(ConfigReader.getProperty("U_comment"));
        us16Page.placeOrder.click();
    }
    @Then("U Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        us16Page.nameOnCard.sendKeys(ConfigReader.getProperty("U_nameOnCard"));
        us16Page.cardNumber.sendKeys(ConfigReader.getProperty("U_cardNumber"));
        us16Page.cvc.sendKeys(ConfigReader.getProperty("U_cvc"));
        us16Page.expirationMonth.sendKeys(ConfigReader.getProperty("U_expirationMonth"));
        us16Page.expirationYear.sendKeys(ConfigReader.getProperty("U_expirationYear"));
    }
    @Then("U Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() {
        us16Page.payAndConfirmOrder.click();
    }
    @Then("U Verify success message Your order has been placed successfully!")
    public void verify_success_message_your_order_has_been_placed_successfully() {
        Assert.assertTrue(us16Page.successMessage.isDisplayed());
    }
    @Then("U Click Delete Account button")
    public void click_delete_account_button() {
        us16Page.deleteAccount.click();
    }
    @Then("U Verify ACCOUNT DELETED! and click Continue button")
    public void verify_account_deleted_and_click_continue_button() {
    }
}