package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLogin extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(UserLogin.class);
    @Test
    public void harryPotterLoginTest(){

        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        customer.clickLoginButton();
        String expectedMessage = "Welcome Harry Potter !!";
        Assert.assertEquals(expectedMessage, getElementText("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Login successful");
    }

    @Test
    public void ronWeaslyLoginTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer Login Button click successful");
        customer.selectOptionFromCustomerDropDown("Ron Weasly");
        customer.clickLoginButton();
        String expectedMessage = "Welcome Ron Weasly !!";
        Assert.assertEquals(expectedMessage, getElementText("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Login successful");
    }
}
