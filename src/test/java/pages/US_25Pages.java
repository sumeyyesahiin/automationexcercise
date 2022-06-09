package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_25Pages extends BasePage{

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscriptionText;

    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    public WebElement fafaButton;

    @FindBy(xpath = "//*[text()='Full-Fledged practice website for Automation Engineers']")
    public WebElement fullFledgedText;


}
