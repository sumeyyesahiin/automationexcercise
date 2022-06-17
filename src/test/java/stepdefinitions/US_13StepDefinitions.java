package stepdefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_13Pages;
public class US_13StepDefinitions {
    US_13Pages us13Page = new US_13Pages();
    @Then("U Click View Product for any product on home page")
    public void click_view_product_for_any_product_on_home_page() {
        us13Page.viewProduct1.click();
    }
    @Then("U Verify product detail is opened")
    public void verify_product_detail_is_opened() {
        Assert.assertTrue(us13Page.availability.isDisplayed());
    }
    @Then("U increase quantity to four")
    public void increaseQuantityToFour() {
        us13Page.quantity.sendKeys("4");
    }
    @Then("U Click Add to cart button")
    public void click_add_to_cart_button() {
        us13Page.addToChart.click();
    }
    @Then("U Click View Cart button")
    public void click_view_cart_button() {
        us13Page.viewChart.click();
    }
    @Then("U Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        Assert.assertTrue(us13Page.exactQuantity.getText().contains("4"));
    }
}