package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCustomer extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchCustomer.class);
    @Test
    public void searchHarryPotterTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        bankManager.searchCustomer("Harry");
        LOG.info("'Harry' was typed into Search Customer field");
        String expectedData = "Harry";
        Assert.assertEquals(expectedData, getElementText("//td[contains(text(),'Harry')]"));
        LOG.info("Harry data is visibile");
    }

    @Test
    public void searchHermoineGrangerTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        bankManager.searchCustomer("Hermoine");
        LOG.info("'Hermoine' was typed into Search Customer field");
        String expectedData = "Hermoine";
        Assert.assertEquals(expectedData, getElementText("//td[contains(text(),'Hermoine')]"));
        LOG.info("Hermoine data is visibile");

    }

    @Test
    public void searchNevilleLongbottomTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        bankManager.searchCustomer("Neville");
        LOG.info("'Neville' was typed into Search Customer field");
        String expectedData = "Neville";
        Assert.assertEquals(expectedData, getElementText("//td[contains(text(),'Neville')]"));
        LOG.info("Neville data is visibile");
    }



}
