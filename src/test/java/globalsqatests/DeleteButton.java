package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteButton extends CommonAPI {

    @Test
    public void deleteCustomerTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        bankManager.clickCustomersTab();
        Assert.assertTrue(bankManager.checkIfDeleteButtonIsEnabled());
        bankManager.clickDeleteButton();
    }
}
