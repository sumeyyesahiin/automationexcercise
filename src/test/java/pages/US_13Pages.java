package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_13Pages extends BasePage {

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProduct1;
    @FindBy(xpath = "//*[text()='Availability:']")
    public WebElement availability;
    @FindBy(xpath = "//input[@type='number']")
    public WebElement quantity;
    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement addToChart;
    @FindBy(xpath = "(//a[@href='/view_cart'])[2]")
    public WebElement viewChart;
    @FindBy(xpath = "//button[@class='disabled']")
    public WebElement exactQuantity;
}
