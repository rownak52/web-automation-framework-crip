package saucedemotests;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.LoginPage;

public class Login extends CommonAPI {

    @Test
    public void logInTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        String expectedUrlLink = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void invalidLogInTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce!");
        logIn.clickLogInButton();
        String expectedError = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(expectedError, getElementText("h3"));
    }

    @Test
    public void validateLogInButton() {
        LoginPage logIn = new LoginPage(getDriver());
        Assert.assertTrue(logIn.checkLogInButton());
    }


}

