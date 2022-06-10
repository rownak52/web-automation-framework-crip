package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BackButton extends CommonAPI {

    @Test
    public void backButtonTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        customer.clickTransactionsButton();
        customer.clickBackButton();
        String expectedMessage = "Welcome Hermoine Granger !!";
        Assert.assertEquals(expectedMessage, getElementText("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));


    }


}
