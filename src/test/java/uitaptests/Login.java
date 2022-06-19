package uitaptests;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uitappages.HomePage;
import uitappages.SampleAppPage;

public class Login extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Login.class);

    @Test //T32 Verify that user is able to log in using valid credentials
    public void verifyValidLogin() {
        HomePage home = new HomePage(getDriver());
        home.clickSampleApp();
        LOG.info("Sample App click successful");
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
        HomePage home = new HomePage(getDriver());
        home.clickSampleApp();
        LOG.info("Sample App click successful");
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
        HomePage home = new HomePage(getDriver());
        home.clickSampleApp();
        LOG.info("Sample App click successful");
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
        HomePage home = new HomePage(getDriver());
        home.clickSampleApp();
        LOG.info("Sample App click successful");
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
