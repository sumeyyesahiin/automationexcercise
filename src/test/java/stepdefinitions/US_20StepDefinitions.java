package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.US_20Pages;
import utilities.Driver;

public class US_20StepDefinitions {

    US_20Pages us_20Pages = new US_20Pages();

    @Given("zey Verify user is navigated to ALL PRODUCTS page successfully")
    public void zey_verify_user_is_navigated_to_all_products_page_successfully() {
        String productTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(productTitle.contains("Automation Exercise - All Products"));
        Driver.waitFor(3);
    }

    @Given("zey Enter product name in search input and click search button")
    public void zey_enter_product_name_in_search_input_and_click_search_button() {
        us_20Pages.searchProductBox.sendKeys("tshirt");
        Driver.waitFor(3);
        us_20Pages.searchButton.click();
        Driver.waitFor(3);
    }

    @Given("zey Verify SEARCHED PRODUCTS is visible")
    public void zey_verify_searched_products_is_visible() {
        Assert.assertTrue(us_20Pages.searchedProductsTitle.isDisplayed());
    }

    @Given("zey Verify all the products related to search are visible")
    public void zey_verify_all_the_products_related_to_search_are_visible() {
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.allProducts.isDisplayed());
    }

    @Given("zey Add those products to cart")
    public void zey_add_those_products_to_cart() {
        Driver.waitFor(3);
        us_20Pages.product1.click();
        us_20Pages.continueShoppingButton.click();
        Driver.waitFor(3);
        us_20Pages.product2.click();
        us_20Pages.continueShoppingButton.click();
        Driver.waitFor(3);
        us_20Pages.product3.click();
        us_20Pages.continueShoppingButton.click();
        Driver.waitFor(3);
        us_20Pages.product4.click();
        us_20Pages.continueShoppingButton.click();
        Driver.waitFor(3);
        us_20Pages.product5.click();
        us_20Pages.continueShoppingButton.click();
        Driver.waitFor(3);
        us_20Pages.product6.click();
        us_20Pages.continueShoppingButton.click();
        Driver.waitFor(3);
    }

    @Given("zey Click Cart button and verify that products are visible in cart")
    public void zey_click_cart_button_and_verify_that_products_are_visible_in_cart() {
        us_20Pages.cartButton.click();
        Assert.assertTrue(us_20Pages.cartMenu.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product1inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product2inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product3inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product4inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product5inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product6inCart.isDisplayed());
    }

    @Given("zey Click Signup \\/ Login button and submit login details")
    public void zey_click_signup_login_button_and_submit_login_details() {
        Driver.waitFor(3);
        us_20Pages.signupButton.click();
        Driver.waitFor(3);
        us_20Pages.emailBox.sendKeys("askask@gmail.com");
        us_20Pages.passwordBox.sendKeys("123456789");
        Driver.waitFor(3);
        us_20Pages.loginButton.click();
        Driver.waitFor(3);
    }

    @Given("zey Again, go to Cart page")
    public void zey_again_go_to_cart_page() {
        us_20Pages.cartButton.click();
        Driver.waitFor(3);
    }

    @Given("zey Verify that those products are visible in cart after login as well")
    public void zey_verify_that_those_products_are_visible_in_cart_after_login_as_well() {
        Assert.assertTrue(us_20Pages.cartMenu.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product1inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product2inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product3inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product4inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product5inCart.isDisplayed());
        Driver.waitFor(3);
        Assert.assertTrue(us_20Pages.product6inCart.isDisplayed());
    }
}
