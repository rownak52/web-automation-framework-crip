package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransactionsButton extends CommonAPI {

    @Test
    public void transactionsButton(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        customer.clickTransactionsButton();
        String expectedText = "Transaction Type";
        Assert.assertEquals(expectedText, getElementText("//thead/tr/td[3]/a[1]"));
    }
}
