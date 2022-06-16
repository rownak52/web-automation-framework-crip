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
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsTab();
        LOG.info("Transactions tab click successful");
        customer.clickResetButton();
        LOG.info("Reset click successful");
        Assert.assertTrue(customer.checkResetButton());
        LOG.info("Customer data is reset");
    }

}
