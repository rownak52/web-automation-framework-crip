package saucedemotests;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.InventoryPage;
import saucedemopages.LoginPage;

public class AddItemsToCart extends CommonAPI {


    @Test
    public void addBackPackToCart() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addBackPack();
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-backpack"));
    }

    @Test
    public void addBikeLightToCart() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addBikeLight();
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-bike-light"));
    }

    @Test
    public void addBoltShirtToCart() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addBoltTshirt();
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-bolt-t-shirt"));
    }

    @Test
    public void addFleeceJacketToCart() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addFleeceJacket();
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-fleece-jacket"));
    }

    @Test
    public void addOnesieToCart() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addOnesie();
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-onesie"));
    }

    @Test
    public void addRedShirtToCart() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addRedTshirt();
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("//button[@id='remove-test.allthethings()-t-shirt-(red)']"));
    }

    @Test
    public void addMultipleItemsToCartTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addRedTshirt();
        inventory.addBikeLight();
        inventory.addBoltTshirt();
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("//button[@id='remove-test.allthethings()-t-shirt-(red)']"));
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-bike-light"));
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-bolt-t-shirt"));
    }

}