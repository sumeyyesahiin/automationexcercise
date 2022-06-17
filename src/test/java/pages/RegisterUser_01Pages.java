package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUser_01Pages extends BasePage{

    @FindBy(xpath = "//*[text()=' Signup / Login']/..")
    public WebElement signupLoginTab;

    @FindBy(xpath = "//a[contains(text(),' Home')]")
    public WebElement homeTab;

    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    public WebElement newUsrSignpTex;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameUser;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailUser;
    //button[@data-qa='signup-button']
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement signupButton;

    //button[@data-qa='signup-button
    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    public WebElement enterAccountText;


    @FindBy(css = "#id_gender1")
    public WebElement mrchkTitle;

    @FindBy(css = "#id_gender2")
    public WebElement mrschkTitle;

    @FindBy(css= "#name")
    public WebElement nameBx;

    @FindBy(xpath= "//input[@id='email']")
    public WebElement emailBx;

    @FindBy(css="#password")
    public WebElement passwordBx;

    @FindBy(xpath= "//select[@id='days']")
    public WebElement dayDateBox;

    @FindBy(xpath= "//select[@id='months']")
    public WebElement monthDateBox;

    @FindBy(xpath= "//select[@id='years']")
    public WebElement yearDateBox;

    @FindBy(css= " #newsletter")
    public WebElement newschecksBox;

    @FindBy(xpath= "//input[@id='optin']")
    public WebElement  receiveCheckBox;

    @FindBy(xpath= "//input[@id='first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath= "//input[@id='last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath= "//input[@id='company']")
    public WebElement companyBox;

    @FindBy(xpath= "//input[@id='address1']")
    public WebElement addrss1box;

    @FindBy(xpath= "//input[@id='address2']")
    public WebElement addrss2box;

    @FindBy(xpath= "//select[@id='country']")
    public WebElement contryBox ;

    @FindBy(xpath= "//input[@id='state']")
    public WebElement stateBox;

    @FindBy(xpath= "//input[@id='city']")
    public WebElement cityBox;

    @FindBy(xpath= "//input[@id='zipcode']")
    public WebElement zipCodeBox;

    @FindBy(xpath= "//input[@id='mobile_number']")
    public WebElement mobilNumbrBox;

    @FindBy(xpath= "//button[contains(text(),'Create Account')]")
    public WebElement createAccountBox;

    @FindBy(xpath= "//b[contains(text(),'Account Created!')]")
    public WebElement accountTex;

    @FindBy(xpath= "//a[contains(text(),'Continue')]")
    public WebElement contiuneButton;


   @FindBy(partialLinkText = "Logged in")
   public WebElement loggedUser;

    @FindBy(xpath= "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

//.fa.fa-angle-up



}
