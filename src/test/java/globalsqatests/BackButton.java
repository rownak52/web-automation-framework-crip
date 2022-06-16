package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BackButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(BackButton.class);

    @Test
    public void backButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickTransactionsTab();
        LOG.info("Transactions tab click successful");
        customer.clickBackButton();
        LOG.info("Back button click successful");
        String expectedMessage = "Welcome Hermoine Granger !!";
        Assert.assertEquals(expectedMessage, getElementText("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));

    }


}
