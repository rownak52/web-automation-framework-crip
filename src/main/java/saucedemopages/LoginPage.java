package saucedemopages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(css = "#login-button")
    private WebElement logInButton;

    public LoginPage(WebDriver driver){ PageFactory.initElements(driver, this); }
    public void enterUserName(String text){
        type(userName, text);
    }
    public void enterPassword(String text){
        type(password, text);
    }
    public void clickLogInButton(){
        click(logInButton);
    }

    public boolean checkLogInButton(){
        return checkDisplayed(logInButton);
    }
}
