package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeButton extends CommonAPI {


    @Test
    public void customerHomeButtonTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        customer.clickLoginButton();
        customer.clickHomeButton();
        Assert.assertTrue(customer.checkIfCustomerLoginIsEnabled());
        Assert.assertTrue(customer.checkIfBankManagerLoginIsEnabled());
    }

    @Test
    public void bankManagerHomeButtonTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        Assert.assertTrue(bankManager.checkIfAddCustomersTabIsDisplayed());
        Assert.assertTrue(bankManager.checkIfOpenAccountTabIsDisplayed());
        Assert.assertTrue(bankManager.checkIfCustomersTabIsDisplayed());
        bankManager.clickHomeButton();
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        Assert.assertEquals(expectedUrl, getUrlLink());


    }
}