package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(BankManagerPage.class);
    @Test
    public void deleteCustomerTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager Login click successful");
        bankManager.clickCustomersTab();
        LOG.info("Customers tab click successful");
        Assert.assertTrue(bankManager.checkIfDeleteButtonIsEnabled());
        bankManager.clickDeleteButton();
        LOG.info("Delete button click success");
        LOG.info("Albus Dumbledore is deleted");
    }
}
