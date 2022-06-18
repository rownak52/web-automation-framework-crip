package saucedemotests;

import base.CommonAPI;
import globalsqatests.AddCustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.InventoryPage;
import saucedemopages.LoginPage;

public class DropDown extends CommonAPI {


    private final Logger LOG = LoggerFactory.getLogger(DropDown.class);
    @Test
    public void dragDownAtoZTest() {

        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.selectOptionFromDropDownWithDropDownOption("Name (A to Z)");
        String expectedDragDown = "Name (A to Z)";
        Assert.assertEquals(expectedDragDown, getElementText("//option[contains(text(),'Name (A to Z)')]"));
        LOG.info("Name (A to Z) is selected");

    }

    @Test
    public void dragDownZtoATest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.selectOptionFromDropDownWithDropDownOption("Name (Z to A)");
        String expectedDragDown = "Name (Z to A)";
        Assert.assertEquals(expectedDragDown, getElementText("//option[contains(text(),'Name (Z to A)')]"));
        LOG.info("Name (Z to A) is selected");
    }

    @Test
    public void dragDownLowtoHighTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.selectOptionFromDropDownWithDropDownOption("Price (low to high)");
        String expectedDragDown = "Price (low to high)";
        Assert.assertEquals(expectedDragDown, getElementText(" //option[contains(text(),'Price (low to high)')]"));
        LOG.info("Price (low to high) is selected");
    }

    @Test
    public void dragDownHightoLowTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        LOG.info("Password entered");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.selectOptionFromDropDownWithDropDownOption("Price (high to low)");
        String expectedDragDown = "Price (high to low)";
        Assert.assertEquals(expectedDragDown, getElementText(" //option[contains(text(),'Price (high to low)')]"));
        LOG.info("Price (high to low) is selected");
    }
}


