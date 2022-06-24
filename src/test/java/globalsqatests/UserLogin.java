package globalsqatests;

import base.CommonAPI;
import globalsqapages.BankManagerPage;
import globalsqapages.CustomerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExcelReader;

import java.util.List;

public class UserLogin extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(UserLogin.class);

    @Test
    public void loginWithExcelTest() {

        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        ExcelReader excelReader = new ExcelReader(currentDir + "/data/CustomerAccounts.xlsx");
        List<String> accounts = excelReader.getEntireColumnForGivenHeader("Sheet1", "Customer Accounts");
        for (String account : accounts) {
            customer.selectOptionFromCustomerDropDown(account);
            if (account.equalsIgnoreCase("")) {
                break;
            } else {
                LOG.info(account + " account is selected");
                customer.clickLoginButton();
                LOG.info("Login button click successful");
                String expectedMessage = "Welcome " + account + " !!";
                Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
                LOG.info(account + " login successful");
                customer.clickLogoutButton();
                LOG.info("Logout click successful");
                LOG.info("Logout successful");
                String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
                Assert.assertEquals(expectedLogoutUrl, getUrlLink());
                LOG.info("Navigate to Customer Login page successful");
            }
        }

    }

    @Test
    public void harryPotterLoginTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        String expectedMessage = "Welcome Harry Potter !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Harry Potter login successful");
    }

    @Test
    public void ronWeaslyLoginTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Ron Weasly");
        LOG.info("Ron Weasly account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        String expectedMessage = "Welcome Ron Weasly !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Ron Weasly login successful");
    }

    @Test
    public void hermoineGrangerLoginTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        String expectedMessage = "Welcome Hermoine Granger !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Hermoine Granger login successful");
    }


    @Test
    public void albusDumbledoreLoginTest(){
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Albus Dumbledore");
        LOG.info("Albus Dumbledore account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        String expectedMessage = "Welcome Albus Dumbledore !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Albus Dumbledore login successful");
    }

    @Test
    public void createAccountAndLoginWithFaieqTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickAddCustomerButton();
        LOG.info("Add Customer button click successful");
        LOG.info("Navigate to Add Customer page successful");
        bankManager.typeCustomerInformation("Faieq", "Laskar", "11378");
        LOG.info("Customer information entered");
        bankManager.clickAddCustomerToData();
        LOG.info("Add Customer click successful");
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Customer added successfully with customer id :6");
        okAlert();
        LOG.info("Alert accepted");
        bankManager.clickHomeButton();
        LOG.info("Home button click successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Navigate to Homepage successful");
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Faieq Laskar");
        LOG.info("Faieq Laskar account is selected");
        customer.clickLoginButton();
        String expectedMessage = "Welcome Faieq Laskar !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Faieq Laskar login successful");
    }

    @Test
    public void createAccountAndLoginWithJoeTest(){
        BankManagerPage bankManager = new BankManagerPage(getDriver());
        bankManager.clickBankManagerLoginButton();
        LOG.info("Bank Manager login button click successful");
        LOG.info("Login successful");
        bankManager.clickAddCustomerButton();
        LOG.info("Add Customer button click successful");
        LOG.info("Navigate to Add Customer page successful");
        bankManager.typeCustomerInformation("Joe", "Biden", "66666");
        LOG.info("Customer information entered");
        bankManager.clickAddCustomerToData();
        LOG.info("Add Customer click successful");
        String expectedAlert = "Customer added successfully with customer id :6";
        Assert.assertEquals(expectedAlert, alertMessage());
        LOG.info("Customer added successfully with customer id :6");
        okAlert();
        LOG.info("Alert accepted");
        bankManager.clickHomeButton();
        LOG.info("Home button click successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Navigate to Homepage successful");
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Joe Biden");
        LOG.info("Joe Biden account is selected");
        customer.clickLoginButton();
        String expectedMessage = "Welcome Joe Biden !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Joe Biden login successful");
    }

    @Test
    public void createAccountAndLoginWithRownakTest(){
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
        bankManager.clickOpenAccountButton();
        LOG.info("Open Account button click successful");
        LOG.info("Navigate to Open Account page successful");
        bankManager.selectOptionFromCustomerDropDown("Rownak Choudhury");
        LOG.info("Rownak Choudhury account is selected");
        bankManager.selectOptionFromCurrencyDropDown("Dollar");
        LOG.info("Dollar currency is selected");
        bankManager.clickProcess();
        LOG.info("Proccess click successful");
        String expectedAlert2 = "Account created successfully with account Number :1016";
        Assert.assertEquals(expectedAlert2, alertMessage());
        LOG.info("Account created successfully with account number :1016");
        okAlert();
        LOG.info("Alert accepted");
        bankManager.clickHomeButton();
        LOG.info("Home button click successful");
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Navigate to Homepage successful");
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Rownak Choudhury");
        LOG.info("Rownak Choudhury account is selected");
        customer.clickLoginButton();
        String expectedMessage = "Welcome Rownak Choudhury !!";
        Assert.assertEquals(expectedMessage, getElementText("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]"));
        LOG.info("Rownak Choudhury login successful");
    }

    @Test
        public void loginAllCustomersTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Neville Longbottom");
        LOG.info("Neville Longbottom account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        waitFor(3);
        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Logout successful and navigate to Customer Login page successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        waitFor(3);
        String expectedUrl2 = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl, getUrlLink());
        LOG.info("Login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl2 = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl2, getUrlLink());
        LOG.info("Logout successful and navigate to Customer Login page successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login button click successful");
        waitFor(3);
        String expectedUrl3 = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        Assert.assertEquals(expectedUrl3, getUrlLink());
        LOG.info("Login successful");
        customer.clickLogoutButton();
        LOG.info("Logout click successful");
        LOG.info("Logout successful");
        waitFor(3);
        String expectedLogoutUrl3 = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer";
        Assert.assertEquals(expectedLogoutUrl, getUrlLink());
        LOG.info("Logout successful and navigate to Customer Login page successful");



    }
}