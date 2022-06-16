package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LogoutButton.class);
    @Test
    public void logOutTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        customer.clickLoginButton();
        waitFor(3);
        LOG.info("Login successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        waitFor(3);
        LOG.info("Logout is successful");
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());

    }

}
