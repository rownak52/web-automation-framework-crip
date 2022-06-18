package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Deposit extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Deposit.class);
    @Test
    public void depositFunctionTest(){
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
    public void depositAmount1000Test(){
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
    public void depositAmount30000Test(){
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
    public void depositAmount5Test(){
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
        customer.typeDepositAmount("5");
        LOG.info("5 Deposit amount entered");
        customer.confirmDepositAmount();
        LOG.info("Confirm deposit click successful ");
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
        LOG.info("5 Deposit successful");
    }

}
