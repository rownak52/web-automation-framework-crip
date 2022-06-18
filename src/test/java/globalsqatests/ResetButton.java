package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ResetButton.class);
    @Test
    public void resetButtonTest(){
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
        customer.clickResetButton();
        LOG.info("Reset button click successful");
        Assert.assertTrue(customer.checkResetButton());
        LOG.info("Customer data is reset");
    }

}
