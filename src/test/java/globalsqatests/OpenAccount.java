package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccount extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(OpenAccount.class);
    @Test
    public void openAccountTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager Login click successful");
        bankManager.clickOpenAccountTab();
        LOG.info("Open Account tab click successful");
        bankManager.selectOptionFromCustomerDropDown("Albus Dumbledore");
        bankManager.selectOptionFromCurrencyDropDown("Dollar");
        bankManager.clickProcess();
        LOG.info("Proccess click successful");
        String expectedAlert = "Account created successfully with account Number :1016";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Account created successfully with account number :1016");
        okAlert();
        LOG.info("Alert accepted");

    }
}
