package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithdrawlButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(WithdrawlButton.class);
    @Test
    public void withdrawlButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickWithdrawlButton();
        LOG.info("Withdrawl tab click successful");
        customer.typeWithdrawlAmount("500");
        customer.confirmWithdrawlAmount();
        String expectedConfirmation = "Transaction successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Transaction successful')]"));
        LOG.info("Transaction successful");
    }
}
