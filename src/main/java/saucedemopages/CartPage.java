package saucedemopages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends CommonAPI {

    @FindBy(css = "#checkout")
    private WebElement checkOutButton;

    @FindBy(css = "#continue-shopping")
    private WebElement continueShoppingButton;

    public CartPage(WebDriver driver) { PageFactory.initElements(driver, this); }
    public void checkOutButton(){
        click(checkOutButton);
    }
    public void continueShoppingButton(){
        click(continueShoppingButton);
    }

}