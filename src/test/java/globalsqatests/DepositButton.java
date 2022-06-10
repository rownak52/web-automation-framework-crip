package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DepositButton extends CommonAPI {

    @Test
    public void depositButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        customer.clickLoginButton();
        customer.clickDepositButton();
        customer.typeDepositAmount("50000");
        customer.confirmDepositAmount();
        String expectedConfirmation = "Deposit Successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Deposit Successful')]"));
    }

}
