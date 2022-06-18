package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomeButton.class);
    @Test
    public void customerHomeButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickHomeButton();
        LOG.info("Home button click successful");
        Assert.assertTrue(customer.checkIfCustomerLoginIsEnabled());
        Assert.assertTrue(customer.checkIfBankManagerLoginIsEnabled());
        LOG.info("Navigate to Homepage successful");
    }

    @Test
    public void bankManagerHomeButtonTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        Assert.assertTrue(bankManager.checkIfAddCustomersButtonIsDisplayed());
        Assert.assertTrue(bankManager.checkIfOpenAccountButtonIsDisplayed());
        Assert.assertTrue(bankManager.checkIfCustomersButtonIsDisplayed());
        bankManager.clickHomeButton();
        LOG.info("Home button click successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Navigate to Homepage successful");
    }
}