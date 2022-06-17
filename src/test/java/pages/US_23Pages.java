package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US_23Pages {

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement signupName;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signupEmail;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;
    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement radioButton;
    @FindBy(xpath = "//input[@data-qa='password']")
    public WebElement passwordBox;
    @FindBy(id="days")
    public WebElement day;
    @FindBy(id="months")
    public WebElement month;
    @FindBy(id="years")
    public WebElement year;
    @FindBy(xpath = "(//input[@value='1'])[1]")
    public WebElement checkbox1;
    @FindBy(xpath = "(//input[@value='1'])[2]")
    public WebElement checkbox2;
    @FindBy(xpath = "//input[@data-qa='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@data-qa='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@data-qa='company']")
    public WebElement company;
    @FindBy(xpath = "//input[@data-qa='address']")
    public WebElement address;
    @FindBy(xpath = "//input[@data-qa='address2']")
    public WebElement address2;
    @FindBy(xpath = "//select[@data-qa='country']")
    public WebElement country;
    @FindBy(xpath = "//input[@data-qa='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@data-qa='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@data-qa='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobileNumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreated;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;
    @FindBy(xpath = "(//li[@class='address_address1 address_address2'])[2]")
    public WebElement deliveryAddressInfo;
    @FindBy(xpath = "(//li[@class='address_address1 address_address2'])[5]")
    public WebElement billingAddressInfo;
}
