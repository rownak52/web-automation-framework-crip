package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DepositButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(DepositButton.class);
    @Test
    public void depositButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickDepositButton();
        LOG.info("Deposit tab click successful");
        customer.typeDepositAmount("50000");
        customer.confirmDepositAmount();
        LOG.info("Deposit successful");
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
    }

}
