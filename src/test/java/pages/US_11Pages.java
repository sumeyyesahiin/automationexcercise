package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_11Pages extends BasePage{

    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cardButton;

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscriptionTitle;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement arrowButton;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    public WebElement successAlert;

}
