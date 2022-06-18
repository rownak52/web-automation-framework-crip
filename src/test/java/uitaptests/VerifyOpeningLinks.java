package uitaptests;

import base.CommonAPI;
import globalsqatests.AccountNumberDropDown;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uitappages.HomePage;

import java.util.ArrayList;
import java.util.List;

public class VerifyOpeningLinks extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(VerifyOpeningLinks.class);

    @Test //T1 Verify the "Resources" link is usable
    public void clickResourcesTabTest() {
        HomePage home = new HomePage(getDriver());
        home.clickResources();
        String expectedUrlLink = "http://uitestingplayground.com/resources";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }


    @Test //T2 Verify the logo link is usable
    public void clickLogoTest() {
        HomePage home = new HomePage(getDriver());
        home.clickLogo();
        String expectedUrlLink = "http://uitestingplayground.com/";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T3 Verify the "Home" link is usable
    public void clickHomeTabTest() {
        HomePage home = new HomePage(getDriver());
        home.clickHome();
        String expectedUrlLink = "http://uitestingplayground.com/home";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T4 Verify the "Scrollbars" link is usable
    public void clickScrollBarsLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickScrollBars();
        String expectedUrlLink = "http://uitestingplayground.com/scrollbars";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T5 Verify the "Dynamic ID" link is usable
    public void dynamicIdLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickDynamicId();
        String expectedUrlLink = "http://uitestingplayground.com/dynamicid";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T6 Verify the "AJAX Data" link is usable
    public void clickAjaxDataLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickAjaxData();
        String expectedUrlLink = "http://uitestingplayground.com/ajax";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T7 Verify the "Visibility" link is usable
    public void clickVisibilityLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        String expectedUrlLink = "http://uitestingplayground.com/visibility";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T8 Verify the "Overlapped Element" link is usable
    public void clickOverlappedLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickOverlappedElement();
        String expectedUrlLink = "http://uitestingplayground.com/overlapped";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T9 Verify the "Class Attribute" link is usable
    public void clickClassAttributeLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickClassAttribute();
        String expectedUrlLink = "http://uitestingplayground.com/classattr";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T10 Verify the "Client Side Delay" link is usable
    public void clickClientSideDelayLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickClientSideDelay();
        String expectedUrlLink = "http://uitestingplayground.com/clientdelay";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T11 Verify the "Dynamic Table" link is usable
    public void clickDynamicTableLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickDynamicTable();
        String expectedUrlLink = "http://uitestingplayground.com/dynamictable";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T12 Verify the "Sample App" link is usable
    public void clickSampleAppLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickSampleApp();
        String expectedUrlLink = "http://uitestingplayground.com/sampleapp";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T13 Verify the "Hidden Layers" link is usable
    public void clickHiddenLayerLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickHiddenLayers();
        String expectedUrlLink = "http://uitestingplayground.com/hiddenlayers";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T14 Verify the "Click" link is usable
    public void clickLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickLink();
        String expectedUrlLink = "http://uitestingplayground.com/click";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T15 Verify the "Verify Text" link is usable
    public void clickVerifyTextLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickVerifyText();
        String expectedUrlLink = "http://uitestingplayground.com/verifytext";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T16 Verify the "Mouse Over" link is usable
    public void clickMouseOverLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickMouseOver();
        String expectedUrlLink = "http://uitestingplayground.com/mouseover";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T17 Verify that "Load Delay" webpage is able to load after a delay
    public void clickLoadDelayLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickLoadDelay();
        String expectedUrlLink = "http://uitestingplayground.com/loaddelay";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T18 Verify the "Text Input" link is usable
    public void clickTextInputLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickTextInput();
        String expectedUrlLink = "http://uitestingplayground.com/textinput";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T19 Verify the "Progress Bar" link is usable
    public void clickNonBreakingSpaceLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickNonBreakingSpace();
        String expectedUrlLink = "http://uitestingplayground.com/nbsp";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T20 Verify the "Non-Breaking Space" link is usable
    public void clickProgressBarLinkTest() {
        HomePage home = new HomePage(getDriver());
        home.clickProgressBar();
        String expectedUrlLink = "http://uitestingplayground.com/progressbar";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
        LOG.info("Redirect to new page successful");
    }

    @Test //T53 Verify "Star" link is usable
    public void verifyStarLinkExterLink() {
        HomePage home = new HomePage(getDriver());
        home.clickStarLink();
        LOG.info("Star link click successful");
        List<String> newTabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTabs.get(1));
        getDriver().switchTo().window(newTabs.get(0));
        getDriver().close();
        getDriver().switchTo().window(newTabs.get(1));
        String expectedURL = "https://github.com/inflectra/ui-test-automation-playground";
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedURL);
        LOG.info("Redirect to new page successful");
    }

    @Test //T54 Verify "Fork the Website on Github" link is usable
    public void verifyForkGitExterLink() {
        HomePage home = new HomePage(getDriver());
        home.clickForkWebsite();
        LOG.info("'Fork the Website on Github' link click successful");
        String expectedURL = "https://github.com/inflectra/ui-test-automation-playground";
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedURL);
        LOG.info("Redirect to new page successful");
    }

    @Test //T56 Verify "Rapise" external link is usable
    public void verifyRapiseExterLink() {
        HomePage home = new HomePage(getDriver());
        home.clickRapise();
        LOG.info("'Rapise' link click successful");
        String expectedURL = "https://www.inflectra.com/Rapise/";
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedURL);
        LOG.info("Redirect to new page successful");
    }

    @Test //T57 Verify "Inflectra Corporation" external link is usable
    public void verifyInflectraExterLink() {
        HomePage home = new HomePage(getDriver());
        home.clickInflectraCorp();
        LOG.info("'Inflectra Corporation' link click successful");
        String expectedURL = "https://www.inflectra.com/";
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedURL);
        LOG.info("Redirect to Inflectra homepage successful");
    }

    @Test //T58 Verify "CC 4.0 BY-NC" external link is usable
    public void verifyCC4ExterLink() {
        HomePage home = new HomePage(getDriver());
        home.clickCC4Link();
        LOG.info("'CC 4.0 BY-NC' link click successful");
        String expectedURL = "https://creativecommons.org/licenses/by-nc/4.0/";
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedURL);
        LOG.info("Redirect to Creative Commons webpage successful");
    }

    @Test //T59 Verify "Apache License 2.0" external link is usable
    public void verifyApacheLicExterLink() {
        HomePage home = new HomePage(getDriver());
        home.clickApacheLicense();
        LOG.info("'Apache License 2.0' link click successful");
        String expectedURL = "https://www.apache.org/licenses/LICENSE-2.0";
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedURL);
        LOG.info("Redirect to Apache webpage successful");
    }
}
