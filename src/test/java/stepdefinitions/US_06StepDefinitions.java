package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_06Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class US_06StepDefinitions {

    US_06Pages us_06Pages = new US_06Pages();
    Faker faker=new Faker();

    @Given("zey Lunch browser")
    public void zey_lunch_browser() {

    }

    @Given("zey Negate to {string}")
    public void zey_negate_to(String url){
        Driver.getDriver().get(ConfigReader.getProperty(url));
        Driver.waitFor(3);
    }

    @Then("zey Verify that home page is visible successfully")
    public void zey_verify_that_home_page_is_visible_successfully() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue("Anasayfa goruntulenemedi",title.contains("Automation Exercise"));
        Driver.waitFor(3);
    }

    @Then("zey Click on Contact Us button")
    public void zey_click_on_contact_us_button(){
        Assert.assertTrue("Contact us butonu yok",us_06Pages.contactUsbutton.isDisplayed());
        Driver.waitFor(3);
        us_06Pages.contactUsbutton.click();
    }

    @Then("zey Verify Get In Touch is visible")
    public void zey_verify_get_in_touch_is_visible(){
        Assert.assertTrue("Get in touch basligi yok",us_06Pages.getInTouchTitle.isDisplayed());
        Driver.waitFor(3);
    }

    @Then("zey Enter name, email, subject and message")
    public void zey_enter_name_email_subject_and_message(){
        us_06Pages.nameBox.sendKeys(faker.name().fullName());
        Driver.waitFor(3);
        us_06Pages.emailBox.sendKeys("askask@gmail.com");
        Driver.waitFor(3);
        us_06Pages.subjectBox.sendKeys(faker.expression("Subject"));
        Driver.waitFor(3);
        us_06Pages.messageBox.sendKeys(faker.letterify("Message"));
        Driver.waitFor(3);
    }

    @Then("zey Upload file")
    public void zey_upload_file() {
        //us_06Pages.uploadFileButton.click();
        //C:\Users\zynpk\OneDrive\Masaüstü
        //"C:\Users\zynpk\Downloads\35682.jpg"
        String dosyaYolu=System.getProperty("user.home")+"C:\\Users\\sumsu\\Pictures\\Screenshots";
        us_06Pages.uploadFileButton.sendKeys(dosyaYolu);

    }



    @Then("zey Click Submit button")
    public void zey_click_submit_button() {
        us_06Pages.submitButton.click();
        Driver.waitFor(3);
    }

    @Then("zey Click Ok button")
    public void zey_click_ok_button() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("zey Verify succes messsage Success Your details have been submitted succesfully is visible")
    public void zey_verify_succes_messsage_success_your_details_have_been_submitted_succesfully_is_visible() {
        Driver.waitFor(3);
        Assert.assertTrue("Basari mesaji goruntulenemedi",us_06Pages.successMessage.isDisplayed());
    }

    @Then("zey Click Home button and verify that landed to home page successfull")
    public void zey_click_home_button_and_verify_that_landed_to_home_page_successfull(){
        us_06Pages.homeButton.click();
        Driver.waitFor(3);
        Assert.assertTrue(us_06Pages.automationExerciesTitle.isDisplayed());
    }

    @And("zey Closed pages")
    public void zeyClosedPages() {
        Driver.closeDriver();
    }
}
