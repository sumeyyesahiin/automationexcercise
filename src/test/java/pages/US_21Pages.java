package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_21Pages extends BasePage{

    @FindBy(id = "name")
    public WebElement nameButton;

    @FindBy(id = "email")
    public WebElement emailButton;

    @FindBy(id = "review")
    public WebElement reviewButton;

    @FindBy(id = "button-review")
    public WebElement submitButton;

    @FindBy(id = "review-section")
    public WebElement alert;



}
