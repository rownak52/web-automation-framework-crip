package saucedemotests;

import base.CommonAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemopages.InventoryPage;
import saucedemopages.LoginPage;
import saucedemopages.SauceLabsPage;

import java.time.Duration;

public class HyperLink extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HyperLink.class);

//    @Test
//    public void clickVisualTestingTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("Menu Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickVisualTesting();
//        LOG.info("Visual Testing click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/platform/visual-testing"));
//        String expectedUrlLink2 = "https://saucelabs.com/platform/visual-testing";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/platform/visual-testing");
//    }



//    @Test
//    public void clickErrorReportingTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickErrorReporting();
//        LOG.info("Error Reporting click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/platform/error-reporting"));
//        String expectedUrlLink2 = "https://saucelabs.com/platform/error-reporting";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/platform/error-reporting");
//    }
//
//    @Test
//    public void clickTestAutomationTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickTestAutomation();
//        LOG.info("Test Automation click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/platform/automation-tools"));
//        String expectedUrlLink2 = "https://saucelabs.com/platform/automation-tools";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/platform/automation-tools");
//    }
//
//    @Test
//    public void clickTermsOfServiceTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickTermsOfService();
//        LOG.info("Terms of Service click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/terms-of-service"));
//        String expectedUrlLink2 = "https://saucelabs.com/terms-of-service";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/terms-of-service");
//    }
//
//    @Test
//    public void clickPrivacyTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickPrivacy();
//        LOG.info("Privacy click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/privacy-policy"));
//        String expectedUrlLink2 = "https://saucelabs.com/privacy-policy";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/privacy-policy");
//    }
//
//    @Test
//    public void clickEEATest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickEEA();
//        LOG.info("EEA click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/eea"));
//        String expectedUrlLink2 = "https://saucelabs.com/eea";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/eea");
//    }
//
//
//    @Test
//    public void clickCCPATest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickCCPA();
//        LOG.info("CCPA click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/ccpa"));
//        String expectedUrlLink2 = "https://saucelabs.com/ccpa";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/ccpa");
//    }
//
//    @Test
//    public void clickCookiesSettingAndConfirmTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickCookiesSetting();
//        LOG.info("Cookies Setting click successful");
//        sauceLabs.clickConfirmChoices();
//        LOG.info("Confirm choices for click successful");

//    }


    @Test
    public void clickTryItFreeTest() {
        LoginPage logIn = new LoginPage(getDriver());
        logIn.enterUserName("performance_glitch_user");
        LOG.info("UserName entered");
        logIn.enterPassword("secret_sauce");
        LOG.info("Password entered");
        logIn.clickLogInButton();
        LOG.info("Login successful");
        InventoryPage inventory = new InventoryPage(getDriver());
        inventory.menuBarButton();
        LOG.info("Menu Bar click successful");
        inventory.aboutSideBar();
        LOG.info("About Side Bar click successful");
        String expectedUrlLink = "https://saucelabs.com/";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirected to https://saucelabs.com/");
        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
        sauceLabs.clickTryItFree();
        LOG.info("Try it free click successful");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/sign-up"));
        String expectedUrlLink2 = "https://saucelabs.com/sign-up";
        Assert.assertEquals(expectedUrlLink2, getUrlLink());
        LOG.info("Redirected to https://saucelabs.com/sign-up");

    }

//    @Test
//    public void clickSignUpTermsAndConditionsTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickTryItFree();
//        LOG.info("Try it free click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/sign-up"));
//        String expectedUrlLink2 = "https://saucelabs.com/sign-up";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        sauceLabs.clickTermsAndConditions();
//        LOG.info("Terms and Conditions click successful");
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/terms-of-service"));
//        String expectedUrlLink3 = "https://saucelabs.com/terms-of-service";
//        Assert.assertEquals(expectedUrlLink3, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/terms-of-service");
//    }
//
//    @Test
//    public void clickSignUpPrivacyPolicyTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickTryItFree();
//        LOG.info("Try it free click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/sign-up"));
//        String expectedUrlLink2 = "https://saucelabs.com/sign-up";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/sign-up");
//        sauceLabs.clickPrivacy();
//        LOG.info("Privacy click successful");
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/privacy-policy"));
//        String expectedUrlLink3 = "https://saucelabs.com/privacy-policy";
//        Assert.assertEquals(expectedUrlLink3, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/privacy-policy");
//
//    }
//
//    @Test
//    public void clickSignUpWithEmailTest() {
//        LoginPage logIn = new LoginPage(getDriver());
//        logIn.enterUserName("performance_glitch_user");
//        LOG.info("UserName entered");
//        logIn.enterPassword("secret_sauce");
//        LOG.info("Password entered");
//        logIn.clickLogInButton();
//        LOG.info("Login successful");
//        InventoryPage inventory = new InventoryPage(getDriver());
//        inventory.menuBarButton();
//        LOG.info("Menu Bar click successful");
//        inventory.aboutSideBar();
//        LOG.info("About Side Bar click successful");
//        String expectedUrlLink = "https://saucelabs.com/";
//        Assert.assertEquals(expectedUrlLink, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/");
//        SauceLabsPage sauceLabs = new SauceLabsPage(getDriver());
//        sauceLabs.clickTryItFree();
//        LOG.info("Try it free click successful");
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/sign-up"));
//        String expectedUrlLink2 = "https://saucelabs.com/sign-up";
//        Assert.assertEquals(expectedUrlLink2, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/sign-up");
//        sauceLabs.clickSignUpWithEmail();
//        LOG.info("Sign up with email click successful");
//        wait.until(ExpectedConditions.urlToBe("https://saucelabs.com/register"));
//        String expectedUrlLink3 = "https://saucelabs.com/register";
//        Assert.assertEquals(expectedUrlLink3, getUrlLink());
//        LOG.info("Redirected to https://saucelabs.com/register");
//
//    }

}
