package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BackButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(BackButton.class);

    @Test
    public void hermoineGrangerBackButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        LOG.info("Navigate to Transactions page successful");
        customer.clickBackButton();
        LOG.info("Back button click successful");
        String expectedMessage = "Welcome Hermoine Granger !!";
        Assert.assertEquals(expectedMessage, getElementText("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Navigate to Account page successful");

    }

    @Test
    public void harryPotterBackButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        LOG.info("Navigate to Transactions page successful");
        customer.clickBackButton();
        LOG.info("Back button click successful");
        String expectedMessage = "Welcome Harry Potter !!";
        Assert.assertEquals(expectedMessage, getElementText("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Navigate to Account page successful");

    }

    @Test
    public void nevilleLongbottomBackButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        LOG.info("Neville Longbottom account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        LOG.info("Navigate to Transactions page successful");
        customer.clickBackButton();
        LOG.info("Back button click successful");
        String expectedMessage = "Welcome Neville Longbottom !!";
        Assert.assertEquals(expectedMessage, getElementText("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Navigate to Account page successful");

    }

    @Test
    public void ronWeaslyButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Ron Weasly");
        LOG.info("Ron Weasly account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsButton();
        LOG.info("Transactions button click successful");
        LOG.info("Navigate to Transactions page successful");
        customer.clickBackButton();
        LOG.info("Back button click successful");
        String expectedMessage = "Welcome Ron Weasly !!";
        Assert.assertEquals(expectedMessage, getElementText("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Navigate to Account page successful");

    }

}
