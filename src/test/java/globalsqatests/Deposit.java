package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Deposit extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Deposit.class);

    @Test
    public void depositNevilleTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        LOG.info("Neville Longbottom account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickDepositButton();
        LOG.info("Deposit button click successful");
        LOG.info("Navigate to Deposit page successful");
        customer.typeDepositAmount("50000");
        LOG.info("50000 Deposit amount entered");
        customer.confirmDepositAmount();
        LOG.info("Confirm deposit click successful ");
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
        LOG.info("Deposit function successful");
    }

    @Test
    public void depositHarryTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickDepositButton();
        LOG.info("Deposit button click successful");
        LOG.info("Navigate to Deposit page successful");
        customer.typeDepositAmount("1000");
        LOG.info("1000 Deposit amount entered");
        customer.confirmDepositAmount();
        LOG.info("Confirm deposit click successful ");
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
        LOG.info("1,000 Deposit successful");
    }

    @Test
    public void depositRonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Ron Weasly");
        LOG.info("Ron Weasly account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickDepositButton();
        LOG.info("Deposit button click successful");
        LOG.info("Navigate to Deposit page successful");
        customer.typeDepositAmount("30000");
        LOG.info("30000 Deposit amount entered");
        customer.confirmDepositAmount();
        LOG.info("Confirm deposit click successful ");
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
        LOG.info("30,000 Deposit successful");
    }

    @Test
    public void depositHermoineTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickDepositButton();
        LOG.info("Deposit button click successful");
        LOG.info("Navigate to Deposit page successful");
        customer.typeDepositAmount("5");
        LOG.info("5 Deposit amount entered");
        customer.confirmDepositAmount();
        LOG.info("Confirm deposit click successful ");
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
        LOG.info("5 Deposit successful");
    }

    @Test
    public void depositAlbusTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Albus Dumbledore");
        LOG.info("Albus Dumbledore account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickDepositButton();
        LOG.info("Deposit button click successful");
        LOG.info("Navigate to Deposit page successful");
        customer.typeDepositAmount("5");
        LOG.info("5 Deposit amount entered");
        customer.confirmDepositAmount();
        LOG.info("Confirm deposit click successful ");
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
        LOG.info("5 Deposit successful");
    }

    @Test
    public void newAccountDepositTest(){
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
        LOG.info("Login successful");
        customer.clickDepositButton();
        LOG.info("Deposit button click successful");
        LOG.info("Navigate to Deposit page successful");
        customer.typeDepositAmount("10000");
        LOG.info("10000 Deposit amount entered");
        customer.confirmDepositAmount();
        LOG.info("Confirm deposit click successful ");
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
        LOG.info("10,000 Deposit successful");
    }

    @Test
    public void differentAccountDepositTest() {
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
            customer.clickDepositButton();
            LOG.info("Deposit button click successful");
            LOG.info("Navigate to Deposit page successful");
            customer.typeDepositAmount("10000");
            LOG.info("10000 Deposit amount entered");
            customer.confirmDepositAmount();
            LOG.info("Confirm deposit click successful ");
            String expectedConfirmation = "Deposit Successful";
            Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
            LOG.info("10,000 Deposit successful");
            customer.selectOptionFromAccountNumberDropDown("1002");
            Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
            customer.typeDepositAmount("10000");
            LOG.info("10000 Deposit amount entered");
            customer.confirmDepositAmount();
            LOG.info("Confirm deposit click successful ");
            String expectedConfirmation2 = "Deposit Successful";
            Assert.assertEquals(expectedConfirmation2, getElementText("//span[contains(text(),'Deposit Successful')]"));
            LOG.info("10,000 Deposit successful");
            LOG.info("Multiple account deposit successful");
        }




    }

