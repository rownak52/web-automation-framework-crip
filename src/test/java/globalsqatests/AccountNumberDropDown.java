package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountNumberDropDown extends CommonAPI {

    @Test
    public void accountNumberDropDownTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        customer.selectOptionFromAccountNumberDropDown("1003");
        Assert.assertTrue(customer.checkIfAccountNumberIsSelected());
    }



}
