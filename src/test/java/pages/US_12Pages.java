package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_12Pages extends BasePage{

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement firstProductAddToCartButton;

    @FindBy(xpath = "(//a[@data-product-id='2'])[1]")
    public WebElement secondProductAddToCartButton;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//tr[@class='cart_menu']")
    public WebElement cartMenu;

    @FindBy(xpath = "//tr[@id='product-1']")
    public WebElement product1;

    @FindBy(xpath = "//tr[@id='product-2']")
    public WebElement product2;

    @FindBy(xpath = "//td[@class='price']")
    public WebElement productPrice;

    @FindBy(xpath = "//td[@class='quantity']")
    public WebElement productQuantity;

    @FindBy(xpath = "//td[@class='total']")
    public WebElement productTotal;

}
