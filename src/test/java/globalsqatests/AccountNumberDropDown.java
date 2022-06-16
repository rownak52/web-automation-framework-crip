package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountNumberDropDown extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AccountNumberDropDown.class);

    @Test
    public void accountNumberDropDownTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.selectOptionFromAccountNumberDropDown("1003");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
    }



}
