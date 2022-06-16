package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCustomer extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchCustomer.class);
    @Test
    public void searchCustomerTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager Login click successful");
        bankManager.clickCustomersTab();
        LOG.info("Customers Tab click successful");
        bankManager.searchCustomer("Ha");
        Assert.assertTrue(bankManager.checkIfSearchCustomerIsDisplayed());
        LOG.info("Customer data is present");

    }



}
