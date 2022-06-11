package saucedemotests;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.InventoryPage;
import saucedemopages.LoginPage;

public class MenuBar extends CommonAPI {

    @Test
    public void menuBarAllItemsTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.menuBarButton();
        inventory.allItemsSideBar();
        String expectedUrlLink = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void menuBarAboutTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.menuBarButton();
        inventory.aboutSideBar();
        String expectedUrlLink = "https://saucelabs.com/";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void menuBarLogoutTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.menuBarButton();
        inventory.logOutSideBar();
        String expectedUrlLink = "https://www.saucedemo.com/";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

}
