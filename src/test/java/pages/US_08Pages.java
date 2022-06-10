package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_08Pages extends BasePage {

    @FindBy(xpath = "(//*[text()='Automation'])[1]")
    public WebElement automationText;

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//div[@class='features_items']")
    public WebElement allproductsText;

    @FindBy(xpath = "(//h4[@class='panel-title'])[1]")
    public WebElement womenButton;

    @FindBy(xpath = "(//h4[@class='panel-title'])[2]")
    public WebElement menButton;

    @FindBy(xpath = "(//h4[@class='panel-title'])[3]")
    public WebElement kidsButton;

    @FindBy(xpath = "(//*[text()='View Product'])[1]")
    public WebElement firstUrunView;

    @FindBy(xpath = "//*[text()='Rs. 500']")
    public WebElement firstUrunFiyat;

    @FindBy(xpath = "//*[text()='Category: Women > Tops']")
    public WebElement categoryText;

    @FindBy(xpath = "//*[text()=' Polo']")
    public WebElement brandText;

    @FindBy(xpath = "//*[text()=' New']")
    public WebElement conditionText;

    @FindBy(xpath = "//*[text()='Blue Top']")
    public WebElement productName;

    @FindBy(xpath = "//*[text()='Write Your Review']")
    public WebElement reviewText;

}
