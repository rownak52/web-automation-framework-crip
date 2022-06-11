package saucedemotests;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.InventoryPage;
import saucedemopages.LoginPage;

public class DropDown extends CommonAPI {

    @Test
    public void dragDownAtoZTest() {

        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.selectOptionFromDropDownWithDropDownOption("Name (A to Z)");
        String expectedDragDown = "Name (A to Z)";
        Assert.assertEquals(expectedDragDown, getElementText("//option[contains(text(),'Name (A to Z)')]"));


    }

    @Test
    public void dragDownZtoATest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.selectOptionFromDropDownWithDropDownOption("Name (Z to A)");
        String expectedDragDown = "Name (Z to A)";
        Assert.assertEquals(expectedDragDown, getElementText("//option[contains(text(),'Name (Z to A)')]"));
    }

    @Test
    public void dragDownLowtoHighTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.selectOptionFromDropDownWithDropDownOption("Price (low to high)");
        String expectedDragDown = "Price (low to high)";
        Assert.assertEquals(expectedDragDown, getElementText(" //option[contains(text(),'Price (low to high)')]"));
    }

    @Test
    public void dragDownHightoLowTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.selectOptionFromDropDownWithDropDownOption("Price (high to low)");
        String expectedDragDown = "Price (high to low)";
        Assert.assertEquals(expectedDragDown, getElementText(" //option[contains(text(),'Price (high to low)')]"));
    }
}


