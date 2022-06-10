package globalsqapages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CustomerPage extends CommonAPI {



    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    private WebElement customerLoginButton;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    private WebElement logoutButton;
    @FindBy(xpath = "//button[contains(text(),'Back')]")
    private WebElement backButton;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    private WebElement withdrawlTextBox;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    private WebElement confirmWithdrawButton;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    private WebElement depositTextBox;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    private WebElement confirmDepositButton;

    @FindBy(css = "#accountSelect")
    private WebElement accountNumberDropDownOptions;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    private WebElement bankManagerLoginButton;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
    private WebElement transactionsButton;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[2]")
    private WebElement depositButton;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]")
    private WebElement withdrawlButton;

    @FindBy(xpath = "//strong[contains(text(),'1003')]")
    private WebElement expectedAccountNumber;
    @FindBy(css = "#userSelect")
    private WebElement customerDropDownOptions;

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    private WebElement homeButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")
    private WebElement loginButton;
    @FindBy(xpath = "//button[contains(text(),'Reset')]")
    private WebElement resetButton;

    public CustomerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void selectOptionFromCustomerDropDown(String option) {
        Select select = new Select(customerDropDownOptions);
        try {
            select.selectByVisibleText(option);
        }catch(Exception e){
            select.selectByValue(option);
        }
    }

    public void selectOptionFromAccountNumberDropDown(String option) {
        Select select = new Select(accountNumberDropDownOptions);
        try {
            select.selectByVisibleText(option);
        }catch(Exception e){
            select.selectByValue(option);
        }
    }
    public void clickCustomerLoginButton(){
        click(customerLoginButton);
    }

    public void clickLoginButton(){
        click(loginButton);
    }

    public void clickHomeButton(){
        click(homeButton);
    }

    public void clickLogoutButton(){
        click(logoutButton);
    }

    public void clickTransactionsButton(){
        click(transactionsButton);
    }

    public void clickDepositButton(){
        click(depositButton);
    }

    public void clickWithdrawlButton(){
        click(withdrawlButton);
    }

    public void clickBackButton(){
        click(backButton);
    }

    public void typeDepositAmount(String amount){
        type(depositTextBox, amount);
    }

    public void confirmDepositAmount(){
        click(confirmDepositButton);
    }

    public void typeWithdrawlAmount(String amount){
        type(withdrawlTextBox, amount);
    }

    public void confirmWithdrawlAmount(){
        click(confirmWithdrawButton);
    }

    public boolean checkIfLogoutIsEnabled(){
        return checkEnabled(logoutButton);
    }

    public boolean checkIfCustomerLoginIsEnabled(){
        return checkEnabled(customerLoginButton);
    }

    public boolean checkIfBankManagerLoginIsEnabled(){
        return checkEnabled(bankManagerLoginButton);
    }

    public boolean checkIfAccountNumberIsSelected(){ return checkDisplayed(expectedAccountNumber); }

    public void clickResetButton(){
        click(resetButton);
    }

    public boolean checkResetButton(){
        return checkEnabled(resetButton);
    }
}
