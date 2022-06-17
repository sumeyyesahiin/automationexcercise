package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_03Pages extends BasePage{

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement automationExerciseImg;
    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpButton;
    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccount;
    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement incorrectMessage;
}