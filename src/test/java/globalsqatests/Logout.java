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

    @Test
    public void createAnAccountAndLogoutWithFaieqTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickAddCustomerButton();
        LOG.info("Add Customer button click successful");
        LOG.info("Navigate to Add Customer page successful");
        bankManager.typeCustomerInformation("Faieq", "Laskar", "11378");
        LOG.info("Customer information entered");
        bankManager.clickAddCustomerToData();
        LOG.info("Add Customer click successful");
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Customer added successfully with customer id :6");
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
        customer.selectOptionFromCustomerDropDown("Faieq Laskar");
        LOG.info("Faieq Laskar account is selected");
        customer.clickLoginButton();
        String expectedMessage = "Welcome Faieq Laskar !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Faieq Laskar login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Navigate to Customer Login page successful");
    }

    @Test
    public void createAnAccountAndLogoutWithJoeTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickAddCustomerButton();
        LOG.info("Add Customer button click successful");
        LOG.info("Navigate to Add Customer page successful");
        bankManager.typeCustomerInformation("Joe", "Biden", "66666");
        LOG.info("Customer information entered");
        bankManager.clickAddCustomerToData();
        LOG.info("Add Customer click successful");
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Customer added successfully with customer id :6");
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
        customer.selectOptionFromCustomerDropDown("Joe Biden");
        LOG.info("Joe Biden account is selected");
        customer.clickLoginButton();
        String expectedMessage = "Welcome Joe Biden !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Joe Biden login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Navigate to Customer Login page successful");
    }
}
