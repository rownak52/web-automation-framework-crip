package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Withdraw extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(Withdraw.class);
    @Test
    public void withdrawFunctionTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Hermoine Granger");
        LOG.info("Hermoine Granger account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickWithdrawlButton();
        LOG.info("Withdrawl button click successful");
        LOG.info("Navigate to Withdrawl page successful");
        customer.typeWithdrawlAmount("500");
        LOG.info("500 Withdrawl amount entered");
        customer.confirmWithdrawlAmount();
        LOG.info("Confirm withdrawl click successful");
        WebElement transSuccessful = getDriver().findElement(By.xpath("//span[contains(text(),'Transaction successful')]"));
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElements(transSuccessful));
        String expectedConfirmation = "Transaction successful";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Transaction successful')]"));
        LOG.info("Transaction successful");
    }

    @Test
    public void withdrawNegativeTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        customer.selectOptionFromCustomerDropDown("Harry Potter");
        LOG.info("Harry Potter account is selected");
        customer.clickLoginButton();
        LOG.info("Login successful");
        customer.clickWithdrawlButton();
        LOG.info("Withdrawl button click successful");
        LOG.info("Navigate to Withdrawl page successful");
        customer.typeWithdrawlAmount("1000");
        LOG.info("1000 Withdrawl amount entered");
        customer.confirmWithdrawlAmount();
        LOG.info("Confirm withdrawl click successful");
        String expectedConfirmation = "Transaction Failed. You can not withdraw amount more than the balance.";
        Assert.assertEquals(expectedConfirmation, getElementText("//span[contains(text(),'Transaction Failed. You can not withdraw amount mo')]"));
        LOG.info("Invalid Transaction successful");
    }
}
