package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetButton extends CommonAPI {

    @Test
    public void resetButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        customer.clickTransactionsButton();
        customer.clickResetButton();
        Assert.assertTrue(customer.checkResetButton());
    }

}
