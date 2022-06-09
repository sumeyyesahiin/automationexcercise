package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_04Pages extends BasePage {


    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginText;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAsText;

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement LogoutText;

}
