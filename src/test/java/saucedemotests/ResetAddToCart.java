package saucedemotests;

import base.CommonAPI;
import globalsqatests.AddCustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.InventoryPage;
import saucedemopages.LoginPage;

public class ResetAddToCart extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ResetAddToCart.class);

    @Test
    public void resetAddToCartTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("performance_glitch_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        LOG.info("Password entered");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addRedTshirt();
        LOG.info("Red T-Shirt added to cart");
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("//button[@id='remove-test.allthethings()-t-shirt-(red)']"));
        inventory.menuBarButton();
        LOG.info("Menu Bar click successful");
        inventory.resetCart();
        LOG.info("Reset Cart click successful");
        refreshPage();
        LOG.info("Refreshing https://www.saucedemo.com/inventory.html");
        LOG.info("Cart is now empty");
        String expected = "ADD TO CART";
        Assert.assertEquals(expected, getElementText("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
    }

    @Test
    public void resetMultipleItemsAddToCartTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("performance_glitch_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        LOG.info("Password entered");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addRedTshirt();
        inventory.addBikeLight();
        inventory.addBoltTshirt();
        LOG.info("Red T-Shirt added to cart");
        LOG.info("Bike light added to cart");
        LOG.info("Bolt T-Shirt added to cart");
        String expectedText = "REMOVE";
        Assert.assertEquals(expectedText, getElementText("//button[@id='remove-test.allthethings()-t-shirt-(red)']"));
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-bike-light"));
        Assert.assertEquals(expectedText, getElementText("#remove-sauce-labs-bolt-t-shirt"));
        inventory.menuBarButton();
        LOG.info("Menu Bar click successful");
        inventory.resetCart();
        LOG.info("Reset Cart click successful");
        refreshPage();
        LOG.info("Refreshing https://www.saucedemo.com/inventory.html");
        LOG.info("Cart is now empty");
        String expected = "ADD TO CART";
        Assert.assertEquals(expected, getElementText("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        Assert.assertEquals(expected, getElementText("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        Assert.assertEquals(expected, getElementText("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        LOG.info("Cart is now empty");



    }

    }