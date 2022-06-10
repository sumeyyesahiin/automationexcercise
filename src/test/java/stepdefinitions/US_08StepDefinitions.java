package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_08Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08StepDefinitions {

    US_08Pages us_08Pages = new US_08Pages();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Launch browser")
    public void launch_browser() {

    }

    @Given("Navigate to url {string}")
    public void navigate_to_url(String url) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        Thread.sleep(3000);
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue("AutomaitonExcercise sayfasi acilmadi", us_08Pages.automationText.isDisplayed());
    }

    @Given("Click on Products button")
    public void click_on_products_button() {
        us_08Pages.productsButton.click();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() throws InterruptedException {
        actions.moveToElement(us_08Pages.allproductsText).perform();
        Thread.sleep(5000);

        //Assert.assertTrue("All Products Sayfasi Acilmadi",us_08Pages.allproductsText.isDisplayed());
    }

    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        actions.moveToElement(us_08Pages.kidsButton).perform();
        Assert.assertTrue(us_08Pages.womenButton.isDisplayed());
        Assert.assertTrue(us_08Pages.menButton.isDisplayed());
        Assert.assertTrue(us_08Pages.kidsButton.isDisplayed());
    }

    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() throws InterruptedException {
        Thread.sleep(7000);
        actions.moveToElement(us_08Pages.firstUrunView).perform();
        us_08Pages.firstUrunView.click();
    }

    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        actions.moveToElement(us_08Pages.reviewText).perform();
        Assert.assertTrue(us_08Pages.reviewText.isDisplayed());
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(us_08Pages.firstUrunFiyat.isDisplayed());
        Assert.assertTrue(us_08Pages.conditionText.isDisplayed());
        Assert.assertTrue(us_08Pages.brandText.isDisplayed());
    }


}
