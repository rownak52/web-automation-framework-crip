package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomer extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AddCustomer.class);
    @Test
    public void addCustomerTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager Login click successful");
        bankManager.clickAddCustomerTab();
        LOG.info("Add Customer tab click successful");
        bankManager.typeCustomerInformation("John", "Doe", "12345");
        LOG.info("Customer information is filled in");
        bankManager.clickAddCustomerToData();
        LOG.info("Add Customer click successful");
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Customer added successfully with customer id :6");
        okAlert();
        LOG.info("Alert accepted");
    }
}
