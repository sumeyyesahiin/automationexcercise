package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US_20Pages extends BasePage{

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProductBox;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchedProductsTitle;

    @FindBy(xpath = "(//div[@class='container'])[3]")
    public WebElement allProducts;

    @FindBy(xpath = "(//a[@data-product-id='2'])[1]")
    public WebElement product1;

    @FindBy(xpath = "(//a[@data-product-id='28'])[1]")
    public WebElement product2;

    @FindBy(xpath = "(//a[@data-product-id='29'])[1]")
    public WebElement product3;

    @FindBy(xpath = "(//a[@data-product-id='30'])[1]")
    public WebElement product4;

    @FindBy(xpath = "(//a[@data-product-id='31'])[1]")
    public WebElement product5;

    @FindBy(xpath = "(//a[@data-product-id='43'])[1]")
    public WebElement product6;

    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//tr[@class='cart_menu']")
    public WebElement cartMenu;

    @FindBy(xpath = "//tr[@id='product-2']")
    public WebElement product1inCart;

    @FindBy(xpath = "//tr[@id='product-28']")
    public WebElement product2inCart;

    @FindBy(xpath = "//tr[@id='product-29']")
    public WebElement product3inCart;

    @FindBy(xpath = "//tr[@id='product-30']")
    public WebElement product4inCart;

    @FindBy(xpath = "//tr[@id='product-31']")
    public WebElement product5inCart;

    @FindBy(xpath = "//tr[@id='product-43']")
    public WebElement product6inCart;

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signupButton;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButton;
}
