package uitaptests;

import base.CommonAPI;
import globalsqatests.AccountNumberDropDown;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uitappages.SampleAppPage;

public class VerifyLoginFunctionality extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(VerifyLoginFunctionality.class);

    @Test //T32 Verify that user is able to log in using valid credentials
    public void verifyValidLogin() {
        getDriver().get("http://uitestingplayground.com/sampleapp");
        LOG.info("Redirect to Sample App successful");
        SampleAppPage autoPage = new SampleAppPage(getDriver());
        autoPage.typeUserName("user");
        LOG.info("Username input successful");
        autoPage.typePassword("pwd");
        LOG.info("Password input successful");
        autoPage.clickLogBtn();
        LOG.info("Login click successful");
        String expectedStatus = "Welcome, user!";
        String actualStatus = getElementText("#loginstatus");
        Assert.assertEquals(expectedStatus, actualStatus);
    }

    @Test //T33 Verify that user is able to log out after logging in with valid credentials
    public void verifyValidLogout() {
        getDriver().get("http://uitestingplayground.com/sampleapp");
        LOG.info("Redirect to Sample App successful");
        SampleAppPage autoPage = new SampleAppPage(getDriver());
        autoPage.typeUserName("user");
        LOG.info("Username input successful");
        autoPage.typePassword("pwd");
        LOG.info("Password input successful");
        autoPage.clickLogBtn();
        LOG.info("Login click successful");
        autoPage.clickLogBtn();
        LOG.info("Log Out click successful");
        String expectedStatus = "User logged out.";
        String actualStatus = getElementText("#loginstatus");
        Assert.assertEquals(expectedStatus, actualStatus);
    }

    @Test //T34 Verify that user is unable to log in using invalid credentials
    public void verifyInvalidLoginFail() {
        getDriver().get("http://uitestingplayground.com/sampleapp");
        LOG.info("Redirect to Sample App successful");
        SampleAppPage autoPage = new SampleAppPage(getDriver());
        autoPage.typeUserName("user");
        LOG.info("Username input successful");
        autoPage.typePassword("wrongpassword");
        LOG.info("Password input successful");
        autoPage.clickLogBtn();
        LOG.info("Login click successful");
        String expectedStatus = "Invalid username/password";
        String actualStatus = getElementText("#loginstatus");
        Assert.assertEquals(expectedStatus, actualStatus);
    }

    @Test //T55 Verify invalid login with empty fields
    public void verifyEmptyLoginFail() {
        getDriver().get("http://uitestingplayground.com/sampleapp");
        LOG.info("Redirect to Sample App successful");
        SampleAppPage autoPage = new SampleAppPage(getDriver());
        autoPage.clickLogBtn();
        LOG.info("Login click successful");
        String expectedStatus = "Invalid username/password";
        String actualStatus = getElementText("#loginstatus");
        Assert.assertEquals(expectedStatus, actualStatus);
        LOG.info("Failure to log in with empty fields successful");
    }


}
