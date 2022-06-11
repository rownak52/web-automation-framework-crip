package saucedemopages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwoPage extends CommonAPI {

    @FindBy(css = "#finish")
    private WebElement finishButton;

    @FindBy(css = "#cancel")
    private WebElement cancelButton;

    public CheckOutStepTwoPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void finishButton(){
        click(finishButton);
    }
    public void cancelButton(){
        click(cancelButton);
    }

}