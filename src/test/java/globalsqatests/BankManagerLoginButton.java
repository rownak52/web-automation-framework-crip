package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankManagerLoginButton extends CommonAPI {


    @Test
    public void bankManagerLoginButtonTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
        Assert.assertEquals(expectedUrl, getUrlLink());
    }
}
