package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountNumber extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AccountNumber.class);

    @Test
    public void selectAccountNumberTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.selectOptionFromAccountNumberDropDown("1003");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1003 account number is selected");
    }

    @Test
    public void selectMultipleAccountsForHermoineTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.selectOptionFromAccountNumberDropDown("1003");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1003 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1002");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1002 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1001");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1001 account number is selected");
    }

    @Test
    public void selectMultipleAccountsForHarryTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.selectOptionFromAccountNumberDropDown("1004");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1004 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1005");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1005 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1006");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1006 account number is selected");
    }

    @Test
    public void selectMultipleAccountsForNevilleTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        LOG.info("Neville Longbottom account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.selectOptionFromAccountNumberDropDown("1013");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1013 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1014");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1014 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1015");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1015 account number is selected");
    }

    @Test
    public void selectMultipleAccountsForRonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Ron Weasly");
        LOG.info("Ron Weasly account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.selectOptionFromAccountNumberDropDown("1007");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1007 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1008");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1008 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1009");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1009 account number is selected");
    }

    @Test
    public void selectMultipleAccountsForAlbusTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Albus Dumbledore");
        LOG.info("Albus Dumbledore account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.selectOptionFromAccountNumberDropDown("1010");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1010 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1011");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1011 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1012");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1012 account number is selected");
    }

    @Test
    public void createAccountAndVerifyAccountNumberTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickAddCustomerButton();
        LOG.info("Add Customer button click successful");
        LOG.info("Navigate to Add Customer page successful");
        bankManager.typeCustomerInformation("Rownak", "Choudhury", "52795");
        LOG.info("Customer information entered");
        bankManager.clickAddCustomerToData();
        LOG.info("Add Customer click successful");
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Customer added successfully with customer id :6");
        okAlert();
        LOG.info("Alert accepted");
        bankManager.clickOpenAccountButton();
        LOG.info("Open Account button click successful");
        LOG.info("Navigate to Open Account page successful");
        bankManager.selectOptionFromCustomerDropDown("Rownak Choudhury");
        LOG.info("Rownak Choudhury account is selected");
        bankManager.selectOptionFromCurrencyDropDown("Dollar");
        LOG.info("Dollar currency is selected");
        bankManager.clickProcess();
        LOG.info("Proccess click successful");
        String expectedAlert2 = "Account created successfully with account Number :1016";
        Assert.assertEquals(expectedAlert2, alertMessage());
        LOG.info("Account created successfully with account number :1016");
        okAlert();
        LOG.info("Alert accepted");
        bankManager.clickHomeButton();
        LOG.info("Home button click successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Navigate to Homepage successful");
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Rownak Choudhury");
        LOG.info("Rownak Choudhury account is selected");
        customer.clickLoginButton();
        String expectedMessage = "Welcome Rownak Choudhury !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Rownak Choudhury login successful");
        customer.selectOptionFromAccountNumberDropDown("1016");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1016 account number is selected");
    }


}
