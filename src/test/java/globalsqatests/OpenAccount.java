package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccount extends CommonAPI {


    @Test
    public void openAccountTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        bankManager.clickOpenAccountTab();
        bankManager.selectOptionFromCustomerDropDown("Albus Dumbledore");
        bankManager.selectOptionFromCurrencyDropDown("Dollar");
        bankManager.clickProcess();
        String expectedAlert = "Account created successfully with account Number :1016";
        Assert.assertEquals(expectedAlert, alertMessage());
        okAlert();
    }
}
