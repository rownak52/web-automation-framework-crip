package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankManagerLoginButton extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(BankManagerLoginButton.class);
    @Test
    public void bankManagerLoginButtonTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        waitFor(3);
        LOG.info("Bank Manager Login click successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager";
        Assert.assertEquals(expectedUrl, getUrlLink());
    }
}
