package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_12Pages;
import utilities.Driver;

public class US_12StepDefinitions {

    US_12Pages us_12Pages = new US_12Pages();

    @Then("zey Click Products button")
    public void zey_click_products_button(){
        us_12Pages.productsButton.click();
        Driver.waitFor(3);
    }

    @Then("zey Hover over first product and click Add to cart")
    public void zey_hover_over_first_product_and_click_add_to_cart(){
        us_12Pages.firstProductAddToCartButton.click();
        Driver.waitFor(2);
    }

    @Then("zey Click Continue Shopping button")
    public void zey_click_continue_shopping_button(){
        us_12Pages.continueShoppingButton.click();
        Driver.waitFor(2);
    }

    @Then("zey Hover over second product and click Add to cart")
    public void zey_hover_over_second_product_and_click_add_to_cart() {
        us_12Pages.secondProductAddToCartButton.click();
        Driver.waitFor(2);
    }

    @Then("zey Click View Cart button")
    public void zey_click_view_cart_button() {
        us_12Pages.viewCartButton.click();
        Driver.waitFor(3);
    }

    @Then("zey Verify both products are added to Cart")
    public void zey_verify_both_products_are_added_to_cart() {
        Assert.assertTrue(us_12Pages.cartMenu.isDisplayed());
        Driver.waitFor(2);
    }

    @Then("zey Verify their prices, quantity and total price")
    public void zey_verify_their_prices_quantity_and_total_price() {
        Assert.assertTrue(us_12Pages.productPrice.isDisplayed());
        Driver.waitFor(2);
        Assert.assertTrue(us_12Pages.productQuantity.isDisplayed());
        Driver.waitFor(2);
        Assert.assertTrue(us_12Pages.productTotal.isDisplayed());
    }
}
