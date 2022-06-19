package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Logout.class);
    @Test
    public void nevilleLongbottomLogoutTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        LOG.info("Neville Longbottom account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Logout successful and navigate to Customer Login page successful");

    }

    @Test
    public void harryPotterLogoutTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Navigate to Customer Login page successful");
    }

    @Test
    public void hermoineGrangerLogoutTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Navigate to Customer Login page successful");
    }
    @Test
    public void ronWeaslyLogoutTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Ron Weasly");
        LOG.info("Ron Weasly account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Navigate to Customer Login page successful");
    }

    @Test
    public void albusDumbledoreLogoutTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Albus Dumbledore");
        LOG.info("ALbus Dumbledore account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Navigate to Customer Login page successful");
    }

}
