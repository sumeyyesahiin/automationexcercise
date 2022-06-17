package stepdefinitions;

import com.beust.ah.A;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.RegisterUser_01Pages;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;

import static java.awt.SystemColor.text;

public class US_01_RegisterUser_SD {
    RegisterUser_01Pages rgpages = new RegisterUser_01Pages();
    BrowserUtilities waitFor = new BrowserUtilities();
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("the user navigate to url")
    public void theUserNavigateToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @Then("the user verifies that home page is visible successfully")
    public void theUserVerifiesThatHomePageIsVisibleSuccessfully() {

        //js.executeScript("window.scrollBy(0,9000)");//x ve ymiktarinca kaydir9000pixel asagi gonderdik
        //        BrowserUtilities.waitFor(3);
        //        js.executeScript("window.scrollBy(0,-9000)");//-9000 pixelyukari gonderdik
        Assert.assertTrue(rgpages.homeTab.isDisplayed());

    }

    @When("the user click on the signup/login button")
    public void theUserClickOnTheSignupLoginButton() {

        rgpages.signupLoginTab.click();

    }

    @Then("the user verifies {string} is visible")
    public void theUserVerifiesIsVisible(String text) {
        Assert.assertTrue(rgpages.newUsrSignpTex.isDisplayed());
        //WebElement element = Driver.getDriver().findElement(By.xpath("//a[text()='" + text + "']"));
        //   Assert.assertTrue(element.isDisplayed());


        js.executeScript("window.scrollBy(0,100)");
    }


    @And("The user Enter name and email address")
    public void theUserEnterNameAndEmailAddress() {
        js.executeScript("window.scrollBy(0,-20000)");//-9000 pixelyukari gonderdik
        BrowserUtilities.waitFor(2);
        String name = faker.name().firstName();
        rgpages.nameUser.sendKeys(name);
        BrowserUtilities.waitFor(3);
        rgpages.emailUser.sendKeys(faker.internet().emailAddress());

    }

    @When("The user Click Signup button")
    public void theUserClickSignupButton() {

        rgpages.signupButton.click();
    }

    @Then("The user Verify that ENTER ACCOUNT INFORMATION text is visible")
    public void theUserVerifyThatENTERACCOUNTINFORMATIONTextIsVisible() {
        Assert.assertTrue(rgpages.enterAccountText.isDisplayed());
    }


    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        rgpages.passwordBx.sendKeys(faker.internet().password(5, 32, true, true, true)
        );
        rgpages.mrschkTitle.click();
        rgpages.dayDateBox.sendKeys("3");
        rgpages.monthDateBox.sendKeys("march");
        rgpages.yearDateBox.sendKeys("2021");
    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        //  WebElement element = Driver.getDriver().findElement(By.xpath("//a[text()='" + text + "']"));
        // BrowserUtilities.clickWithJS(rgpages.newUsrSignpTex);
        rgpages.newschecksBox.click();

        //  WebElement element = Driver.getDriver().findElement(By.xpath("//a[text()='" + text + "']"));

    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        rgpages.receiveCheckBox.isSelected();
    }

    @Then("Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        rgpages.firstNameBox.sendKeys("Ayse");
        rgpages.lastNameBox.sendKeys("Kaya");
        rgpages.companyBox.sendKeys("Almanya");
        rgpages.addrss1box.sendKeys("ıstanbul");
        rgpages.addrss2box.sendKeys("ızmır");
        rgpages.contryBox.sendKeys("sırnak");
        rgpages.stateBox.sendKeys("gazı");
        rgpages.cityBox.sendKeys("nergıs");
        rgpages.zipCodeBox.sendKeys("1245");
        rgpages.mobilNumbrBox.sendKeys("986-45-1236");
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        rgpages.createAccountBox.click();
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertTrue(rgpages.accountTex.isDisplayed());
        System.out.println(rgpages.accountTex.getText());
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        js.executeScript("window.scrollBy(0,100)");
        rgpages.contiuneButton.click();

    }

    @And("Click Delete Account button")
    public void clickButton() {
        rgpages.deleteAccountButton.click();
    }


    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickButton(String arg0) {
        Assert.assertTrue(rgpages.deleteAccountButton.isDisplayed());
        Assert.assertTrue("Delete button is not enabled", rgpages.contiuneButton.isEnabled());

    }

}
