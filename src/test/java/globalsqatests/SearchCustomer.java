package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCustomer extends CommonAPI {

    @Test
    public void searchCustomerTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        bankManager.clickCustomersTab();
        bankManager.searchCustomer("Ha");
        Assert.assertTrue(bankManager.checkIfSearchCustomerIsDisplayed());
    }



}
