package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerTable extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CustomerTable.class);

    @Test
    public void customerTableVisibilityTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        Assert.assertTrue(bankManager.checkIfFirstNameDisplayed());
        Assert.assertTrue(bankManager.checkIfLastNameDisplayed());
        Assert.assertTrue(bankManager.checkIfPostalCodeDisplayed());
        Assert.assertTrue(bankManager.checkIfAccountNumberDisplayed());
        Assert.assertTrue(bankManager.checkIfDeleteDisplayed());
        LOG.info("Customer table is visible");
    }

    @Test
    public void firstNameVisibilityTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        Assert.assertTrue(bankManager.checkIfFirstNameDisplayed());
        LOG.info("Customer first name is visible in the table");
    }

    @Test
    public void lastNameVisibilityTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        Assert.assertTrue(bankManager.checkIfLastNameDisplayed());
        LOG.info("Customer last name is visible in the table");
    }

    @Test
    public void postalCodeVisibilityTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");;
        Assert.assertTrue(bankManager.checkIfPostalCodeDisplayed());
        LOG.info("Customer postal code is visible in the table");
    }

    @Test
    public void accountNumberVisibilityTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        Assert.assertTrue(bankManager.checkIfAccountNumberDisplayed());
        LOG.info("Customer account number is visible in the table");
    }

    @Test
    public void customerDeleteVisibilityTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        Assert.assertTrue(bankManager.checkIfAccountNumberDisplayed());
        LOG.info("Delete Customer is visible in the table");
    }

}