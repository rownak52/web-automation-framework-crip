package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uitappages.HomePage;

public class HomeButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomeButton.class);
    @Test
    public void customerHomeButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickHomeButton();
        LOG.info("Home button click successful");
        Assert.assertTrue(customer.checkIfCustomerLoginIsEnabled());
        Assert.assertTrue(customer.checkIfBankManagerLoginIsEnabled());
        LOG.info("Redirected to Home page");
    }

    @Test
    public void bankManagerHomeButtonTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager Login click successful");
        Assert.assertTrue(bankManager.checkIfAddCustomersTabIsDisplayed());
        Assert.assertTrue(bankManager.checkIfOpenAccountTabIsDisplayed());
        Assert.assertTrue(bankManager.checkIfCustomersTabIsDisplayed());
        bankManager.clickHomeButton();
        LOG.info("Home button click successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Redirected to Home page");
    }
}