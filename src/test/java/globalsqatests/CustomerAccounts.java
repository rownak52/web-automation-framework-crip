package globalsqatests;

import base.CommonAPI;
import globalsqapages.CustomerPage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CustomerAccounts extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CustomerAccounts.class);

    @Test
    public void CustomerDropDownOptionsVisibilityTest() {
        CustomerPage customer = new CustomerPage(getDriver());
        customer.clickCustomerLoginButton();
        LOG.info("Customer login button click successful");
        WebElement customerDropDown = getDriver().findElement(By.cssSelector("#userSelect"));
        Actions actions = new Actions(getDriver());
        actions.click(customerDropDown).build().perform();
        LOG.info("Customer dropdown click successful");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElements(customerDropDown));
        LOG.info("Visibility of Customer dropdown options is present");
    }

}
