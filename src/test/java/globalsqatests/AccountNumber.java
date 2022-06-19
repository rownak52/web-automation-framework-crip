package globalsqatests;

import base.CommonAPI;
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
    public void selectMultipleAccountNumbersTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.selectOptionFromAccountNumberDropDown("1003");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1001 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1002");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1002 account number is selected");
        customer.selectOptionFromAccountNumberDropDown("1001");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
        LOG.info("1003 account number is selected");
    }



}
