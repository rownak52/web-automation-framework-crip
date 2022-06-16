package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransactionsButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(TransactionsButton.class);
    @Test
    public void transactionsButton(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsTab();
        LOG.info("Transactions tab click successful");
        String expectedText = "Transaction Type";
        Assert.assertEquals(expectedText, getElementText("//thead/tr/td[3]/a[1]"));
    }
}
