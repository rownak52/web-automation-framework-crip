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
    public void deleteAlbusTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        Assert.assertTrue(bankManager.checkIfDeleteButtonIsEnabled());
        LOG.info("Navigate to Customers List page successful");
        bankManager.clickDeleteButton();
        LOG.info("Delete button click success");
        LOG.info("Albus Dumbledore is deleted");
    }
}
