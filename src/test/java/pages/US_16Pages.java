package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_16Pages extends BasePage {

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAsUsername;
    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProduct1;
    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement addToChart;
    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShopping;
    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement cartButton;
    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCart;
    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement addressDetails;
    @FindBy(xpath = "//*[text()='Review Your Order']")
    public WebElement reviewYourOrder;
    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement commentTextArea;
    @FindBy(xpath = "//a[@href='/payment']")
    public WebElement placeOrder;
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement nameOnCard;
    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;
    @FindBy(xpath = "//input[@class='form-control card-expiry-month']")
    public WebElement expirationMonth;
    @FindBy(xpath = "//input[@data-qa='expiry-year']")
    public WebElement expirationYear;
    @FindBy(xpath = "//button[@data-qa='pay-button']")
    public WebElement payAndConfirmOrder;
    @FindBy(xpath = "//*[text()='Order Placed!']")
    public WebElement successMessage;
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccount;
}