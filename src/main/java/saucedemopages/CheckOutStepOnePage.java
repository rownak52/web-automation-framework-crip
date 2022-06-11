package saucedemopages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepOnePage extends CommonAPI {

    @FindBy(css = "#continue")
    private WebElement continueButton;

    @FindBy(css = "#first-name")
    private WebElement firstName;

    @FindBy(css = "#last-name")
    private WebElement lastName;

    @FindBy(css = "#postal-code")
    private WebElement postalCode;

    @FindBy(css = "#cancel")
    private WebElement cancelButton;

    public CheckOutStepOnePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void continueButton(){
        click(continueButton);
    }

    public void enterContactInfo(String enterFirstName, String enterLastName, String enterPostalCode) {
        type(firstName, enterFirstName);
        type(lastName, enterLastName);
        type(postalCode, enterPostalCode);
    }

    public void cancelButton(){
        click(cancelButton);
    }

}