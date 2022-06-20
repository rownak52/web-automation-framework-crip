package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCustomer extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchCustomer.class);

    @Test
    public void searchTwoCustomersTest(){
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
        bankManager.clearSearch();
        LOG.info("Search text field is cleared");
        bankManager.searchCustomer("Hermoine");
        LOG.info("'Hermoine' was typed into Search Customer field");
        String expectedData2 = "Hermoine";
        Assert.assertEquals(expectedData2, getElementText("//td[contains(text(),'Hermoine')]"));
        LOG.info("Hermoine data is visibile");

    }

    @Test
    public void searchMultipleCustomersTest(){
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
        bankManager.clearSearch();
        LOG.info("Search text field is cleared");
        bankManager.searchCustomer("Hermoine");
        LOG.info("'Hermoine' was typed into Search Customer field");
        String expectedData2 = "Hermoine";
        Assert.assertEquals(expectedData2, getElementText("//td[contains(text(),'Hermoine')]"));
        LOG.info("Hermoine data is visibile");
        bankManager.clearSearch();
        LOG.info("Search text field is cleared");
        bankManager.searchCustomer("Neville");
        LOG.info("'Neville' was typed into Search Customer field");
        String expectedData3 = "Neville";
        Assert.assertEquals(expectedData3, getElementText("//td[contains(text(),'Neville')]"));
        LOG.info("Neville data is visibile");

    }

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
    @Test
    public void searchAlbusDumbledoreTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        bankManager.searchCustomer("Albus");
        LOG.info("'Albus' was typed into Search Customer field");
        String expectedData = "Albus";
        Assert.assertEquals(expectedData, getElementText("//td[contains(text(),'Albus')]"));
        LOG.info("Albus data is visibile");
    }

    @Test
    public void searchRonWeaslyTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        bankManager.searchCustomer("Ron");
        LOG.info("'Ron' was typed into Search Customer field");
        String expectedData = "Ron";
        Assert.assertEquals(expectedData, getElementText("//td[contains(text(),'Ron')]"));
        LOG.info("Ron data is visibile");
    }

    @Test
    public void createAccountAndSearchRownakTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickAddCustomerButton();
        LOG.info("Add Customer button click successful");
        LOG.info("Navigate to Add Customer page successful");
        bankManager.typeCustomerInformation("Rownak", "Choudhury", "52795");
        LOG.info("Customer information entered");
        bankManager.clickAddCustomerToData();
        LOG.info("Add Customer click successful");
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Customer added successfully with customer id :6");
        okAlert();
        LOG.info("Alert accepted");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        bankManager.searchCustomer("Rownak");
        LOG.info("'Rownak' was typed into Search Customer field");
        String expectedData = "Rownak";
        Assert.assertEquals(expectedData, getElementText("//td[contains(text(),'Rownak')]"));
        LOG.info("Rownak data is visibile");
    }

    @Test
    public void createAccountAndSearchFaieqTest() {
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickAddCustomerButton();
        LOG.info("Add Customer button click successful");
        LOG.info("Navigate to Add Customer page successful");
        bankManager.typeCustomerInformation("Faieq", "Laskar", "11373");
        LOG.info("Customer information entered");
        bankManager.clickAddCustomerToData();
        LOG.info("Add Customer click successful");
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Customer added successfully with customer id :6");
        okAlert();
        LOG.info("Alert accepted");
        bankManager.clickCustomersButton();
        LOG.info("Customers button click successful");
        LOG.info("Navigate to Customers List page successful");
        bankManager.searchCustomer("Faieq");
        LOG.info("'Faieq' was typed into Search Customer field");
        String expectedData = "Faieq";
        Assert.assertEquals(expectedData, getElementText("//td[contains(text(),'Faieq')]"));
        LOG.info("Faieq data is visibile");

    }

}
