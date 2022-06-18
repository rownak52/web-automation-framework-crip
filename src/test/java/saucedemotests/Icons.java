package saucedemotests;

import base.CommonAPI;
import globalsqatests.AddCustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import saucedemopages.InventoryPage;
import saucedemopages.LoginPage;


public class Icons extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Icons.class);

    @Test
    public void twitterIconTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("performance_glitch_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        LOG.info("Password entered");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.clickTwitterIcon();
        LOG.info("Twitter icon click successful");
        LOG.info("Redirected to https://twitter.com/saucelabs");

    }

    @Test
    public void facebookIconTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("performance_glitch_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        LOG.info("Password entered");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.clickFacebookIcon();
        LOG.info("Facebook icon click successful");
        LOG.info("Redirected to https://facebook.com/saucelabs");
    }

    @Test
    public void linkedInIconTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("performance_glitch_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        LOG.info("Password entered");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.clickLinkedInIcon();
        LOG.info("LinkedIn icon click successful");
        LOG.info("Redirected to https://www.linkedin.com/company/sauce-labs/");
    }

}