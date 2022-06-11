package saucedemotests;


import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.*;

public class CheckOut extends CommonAPI {


    @Test
    public void singleItemCheckOutTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addRedTshirt();
        inventory.goToCart();
        CartPage cart = new CartPage(getDriver());
        cart.checkOutButton();
        CheckOutStepOnePage checkOutStep1 = new CheckOutStepOnePage(getDriver());
        checkOutStep1.enterContactInfo("John", "Doe", "12345");
        checkOutStep1.continueButton();
        CheckOutStepTwoPage checkOutStep2 = new CheckOutStepTwoPage(getDriver());
        checkOutStep2.finishButton();
        String expectedUrlLink = "https://www.saucedemo.com/checkout-complete.html";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }



    @Test
    public void mulipleItemsCheckOutTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("standard_user");
        logIn.enterPassword("secret_sauce");
        logIn.clickLogInButton();
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.addRedTshirt();
        inventory.addBikeLight();
        inventory.addBoltTshirt();
        inventory.goToCart();
        CartPage cart = new CartPage(getDriver());
        cart.checkOutButton();
        CheckOutStepOnePage checkOutStep1 = new CheckOutStepOnePage(getDriver());
        checkOutStep1.enterContactInfo("John", "Doe", "12345");
        checkOutStep1.continueButton();
        CheckOutStepTwoPage checkOutStep2 = new CheckOutStepTwoPage(getDriver());
        checkOutStep2.finishButton();
        String expectedUrlLink = "https://www.saucedemo.com/checkout-complete.html";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

}