package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerLoginButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CustomerLoginButton.class);
    @Test
    public void customerLoginButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        waitFor(3);
        LOG.info("Customer Login Button click successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedUrl, getUrlLink());
    }

}
