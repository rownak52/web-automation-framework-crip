package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithdrawlButton extends CommonAPI {

    @Test
    public void withdrawlButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        customer.clickLoginButton();
        customer.clickWithdrawlButton();
        customer.typeWithdrawlAmount("500");
        customer.confirmWithdrawlAmount();
        String expectedConfirmation = "Transaction successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Transaction successful')]"));
    }
}
