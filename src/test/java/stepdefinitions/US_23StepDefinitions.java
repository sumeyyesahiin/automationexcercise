package stepdefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_23Pages;
import utilities.ConfigReader;
import utilities.Driver;
public class US_23StepDefinitions {
    US_23Pages us23Page = new US_23Pages();
    @Then("U Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        us23Page.signupName.sendKeys(ConfigReader.getProperty("U_signupName"));
        us23Page.signupEmail.sendKeys(ConfigReader.getProperty("U_signupEmail"));
        us23Page.signupButton.click();
        us23Page.radioButton.click();
        us23Page.passwordBox.sendKeys(ConfigReader.getProperty("U_passwordBox"));
        Select selectDay = new Select(us23Page.day);
        selectDay.selectByIndex(2);
        Select selectMonth = new Select(us23Page.month);
        selectMonth.selectByIndex(2);
        Select selectYear = new Select(us23Page.year);
        selectYear.selectByIndex(20);
        us23Page.checkbox1.click();
        us23Page.checkbox2.click();
        us23Page.firstName.sendKeys(ConfigReader.getProperty("U_firstName"));
        us23Page.lastName.sendKeys(ConfigReader.getProperty("U_lastName"));
        us23Page.company.sendKeys(ConfigReader.getProperty("U_company"));
        us23Page.address.sendKeys(ConfigReader.getProperty("U_address"));
        us23Page.address2.sendKeys(ConfigReader.getProperty("U_address2"));
        Select selectCountry = new Select(us23Page.country);
        selectCountry.selectByVisibleText("United States");
        us23Page.state.sendKeys(ConfigReader.getProperty("U_state"));
        us23Page.city.sendKeys(ConfigReader.getProperty("U_city"));
        us23Page.zipcode.sendKeys(ConfigReader.getProperty("U_zipcode"));
        us23Page.mobileNumber.sendKeys(ConfigReader.getProperty("U_mobileNumber"));
        us23Page.createAccountButton.click();
    }
    @Then("U Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        Assert.assertTrue(us23Page.accountCreated.isDisplayed());
        us23Page.continueButton.click();
    }
    @Then("U Verify that the delivery address is same address filled at the time registration of account")
    public void verify_that_the_delivery_address_is_same_address_filled_at_the_time_registration_of_account() {
        String filledAddress =ConfigReader.getProperty("U_address");
        String deliveryAddress = us23Page.deliveryAddressInfo.getText();
        Assert.assertEquals(filledAddress,deliveryAddress);
    }
    @Then("U Verify that the billing address is same address filled at the time registration of account")
    public void verify_that_the_billing_address_is_same_address_filled_at_the_time_registration_of_account() {
        String filledAddress = ConfigReader.getProperty("U_address");
        String billingAddress = us23Page.billingAddressInfo.getText();
        Assert.assertEquals(filledAddress,billingAddress);
    }
}