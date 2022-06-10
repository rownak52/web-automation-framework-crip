package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerLoginButton extends CommonAPI {

    @Test
    public void customerLoginButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedUrl, getUrlLink());
    }

}
