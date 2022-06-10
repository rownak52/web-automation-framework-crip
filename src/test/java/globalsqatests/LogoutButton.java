package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutButton extends CommonAPI {

    @Test
    public void logOutTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        customer.clickLoginButton();
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        customer.clickLogoutButton();
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
    }

}
