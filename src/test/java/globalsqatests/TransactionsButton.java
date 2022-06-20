package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransactionsButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TransactionsButton.class);

    @Test
    public void hermoineTransactionsButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        String expectedText = "Transaction Type";
        Assert.assertEquals(expectedText, getElementText("//thead/tr/td[3]/a[1]"));
        LOG.info("Navigate to Transactions page successful");
    }

    @Test
    public void harryTransactionsButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        String expectedText = "Transaction Type";
        Assert.assertEquals(expectedText, getElementText("//thead/tr/td[3]/a[1]"));
        LOG.info("Navigate to Transactions page successful");
    }

    @Test
    public void ronTransactionsButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Ron Weasly");
        LOG.info("Ron Weasly account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        String expectedText = "Transaction Type";
        Assert.assertEquals(expectedText, getElementText("//thead/tr/td[3]/a[1]"));
        LOG.info("Navigate to Transactions page successful");
    }

    @Test
    public void nevilleTransactionsButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        LOG.info("Neville Longbottom account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        String expectedText = "Transaction Type";
        Assert.assertEquals(expectedText, getElementText("//thead/tr/td[3]/a[1]"));
        LOG.info("Navigate to Transactions page successful");
    }

    @Test
    public void albusTransactionsButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Albus Dumbledore");
        LOG.info("Albus Dumbledore account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        String expectedText = "Transaction Type";
        Assert.assertEquals(expectedText, getElementText("//thead/tr/td[3]/a[1]"));
        LOG.info("Navigate to Transactions page successful");
    }

    @Test
    public void newCustomerTransactionsButtonTest() {
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
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        String expectedText = "Transaction Type";
        Assert.assertEquals(expectedText, getElementText("//thead/tr/td[3]/a[1]"));
        LOG.info("Navigate to Transactions page successful");
    }



}
