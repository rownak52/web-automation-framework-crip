package globalsqapages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BankManagerPage extends CommonAPI {

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement addCustomerButton;
    @FindBy(xpath = "//td[contains(text(),'Harry')]")
    private WebElement harryInformation;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")
    private WebElement openAccountButton;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[3]")
    private WebElement customersButton;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    private WebElement firstName;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    private WebElement lastName;
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    private WebElement homeButton;
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    private WebElement bankManagerLoginButton;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    private WebElement postCode;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
    private WebElement searchCustomer;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    private WebElement addCustomerInfoButton;
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    private WebElement processButton;

    @FindBy(xpath = "//tbody/tr[4]")
    private WebElement albusDataInfo;

    @FindBy(xpath = "//tbody/tr[4]/td[5]/button[1]")
    private WebElement deleteAlbusDumbledore;
    @FindBy(css = "#userSelect")
    private WebElement customerDropDownOptions;
    @FindBy(css = "#currency")
    private WebElement currencyDropDownOptions;

    public BankManagerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickAddCustomerTab() {
        click(addCustomerButton);
    }

    public void clickOpenAccountTab() {
        click(openAccountButton);
    }

    public void clickCustomersTab() {
        click(customersButton);
    }

    public void typeCustomerInformation(String fName, String lName, String pCode) {
        type(firstName, fName);
        type(lastName, lName);
        type(postCode, pCode);
    }

    public void clickAddCustomerToData() {
        click(addCustomerInfoButton);
    }

    public void selectOptionFromCustomerDropDown(String option) {
        Select select = new Select(customerDropDownOptions);
        try {
            select.selectByVisibleText(option);
        }catch(Exception e){
            select.selectByValue(option);
        }

    }

    public void selectOptionFromCurrencyDropDown(String option) {
        Select select = new Select(currencyDropDownOptions);
        try {
            select.selectByVisibleText(option);
        }catch(Exception e){
            select.selectByValue(option);
        }

    }

    public void clickProcess() {
        click(processButton);
    }

    public void searchCustomer(String text){
        type(searchCustomer, text);
    }

    public void clickBankManagerLoginButton(){
        click(bankManagerLoginButton);
    }

    public boolean checkIfSearchCustomerIsDisplayed(){
        return checkDisplayed(harryInformation);
    }

    public boolean checkIfAddCustomersTabIsDisplayed(){
        return checkDisplayed(addCustomerButton);
    }

    public boolean checkIfOpenAccountTabIsDisplayed(){
        return checkDisplayed(openAccountButton);
    }

    public boolean checkIfCustomersTabIsDisplayed(){
        return checkDisplayed(customersButton);
    }

    public void clickHomeButton(){
        click(homeButton);
    }

    public void clickDeleteButton(){
        click(deleteAlbusDumbledore);
    }

    public boolean checkIfDeleteButtonIsEnabled(){
        return checkEnabled(deleteAlbusDumbledore);
    }
}