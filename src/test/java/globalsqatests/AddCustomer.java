package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomer extends CommonAPI {

    @Test
    public void addCustomerTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        bankManager.clickAddCustomerTab();
        bankManager.typeCustomerInformation("John", "Doe", "12345");
        bankManager.clickAddCustomerToData();
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        okAlert();
    }
}
