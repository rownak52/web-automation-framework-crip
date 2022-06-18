package saucedemotests;


import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.*;

public class CheckOut extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CheckOut.class);

    @Test
    public void singleItemCheckOutTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        LOG.info("Password entered");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addRedTshirt();
        LOG.info("Red T-Shirt added to cart");
        inventory.goToCart();
        LOG.info("Redirected to https://www.saucedemo.com/cart.html");
        CartPage cart = new CartPage(getDriver());
        cart.checkOutButton();
        LOG.info("Checkout Button click successful");
        LOG.info("Redirected to https://www.saucedemo.com/checkout-step-one.html");
        CheckOutStepOnePage checkOutStep1 = new CheckOutStepOnePage(getDriver());
        checkOutStep1.enterContactInfo("John", "Doe", "12345");
        LOG.info("Contact information entered");
        checkOutStep1.continueButton();
        LOG.info("Continue button click successful");
        LOG.info("Redirected to https://www.saucedemo.com/checkout-step-two.html");
        CheckOutStepTwoPage checkOutStep2 = new CheckOutStepTwoPage(getDriver());
        checkOutStep2.finishButton();
        LOG.info("Finish button click successful");
        String expectedUrlLink = "https://www.saucedemo.com/checkout-complete.html";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirected to https://www.saucedemo.com/checkout-complete.html");

    }



    @Test
    public void mulipleItemsCheckOutTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
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
        inventory.goToCart();
        LOG.info("Cart icon click successful");
        LOG.info("Redirected to https://www.saucedemo.com/cart.html");
        CartPage cart = new CartPage(getDriver());
        cart.checkOutButton();
        LOG.info("Checkout button click successful");
        LOG.info("Redirected to https://www.saucedemo.com/checkout-step-one.html");
        CheckOutStepOnePage checkOutStep1 = new CheckOutStepOnePage(getDriver());
        LOG.info("Enter contact information");
        checkOutStep1.enterContactInfo("John", "Doe", "12345");
        LOG.info("Contact information entered successfully");
        checkOutStep1.continueButton();
        LOG.info("Continue button click successful");
        LOG.info("Redirected to https://www.saucedemo.com/checkout-step-two.html");
        CheckOutStepTwoPage checkOutStep2 = new CheckOutStepTwoPage(getDriver());
        checkOutStep2.finishButton();
        LOG.info("Finish button click successful");
        String expectedUrlLink = "https://www.saucedemo.com/checkout-complete.html";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirected to https://www.saucedemo.com/checkout-complete.html");
    }

}