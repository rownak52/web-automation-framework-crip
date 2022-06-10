package uitaptests;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import uitappages.HomePage;

public class VerifyOpeningLinks extends CommonAPI {

    @Test
    public void clickLogoTest() {
        HomePage home = new HomePage(getDriver());
        home.clickLogo();
        String expectedUrlLink = "http://uitestingplayground.com/";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickResourcesTabTest() {
        HomePage home = new HomePage(getDriver());
        home.clickResources();
        String expectedUrlLink = "http://uitestingplayground.com/resources";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickHomeTabTest(){
        HomePage home = new HomePage(getDriver());
        home.clickHome();
        String expectedUrlLink = "http://uitestingplayground.com/home";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickScrollBarsLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickScrollBars();
        String expectedUrlLink = "http://uitestingplayground.com/scrollbars";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void dynamicIdLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickDynamicId();
        String expectedUrlLink = "http://uitestingplayground.com/dynamicid";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }


    @Test
    public void clickAjaxDataLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickAjaxData();
        String expectedUrlLink = "http://uitestingplayground.com/ajax";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickVisibilityLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        String expectedUrlLink = "http://uitestingplayground.com/visibility";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickOverlappedLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickOverlappedElement();
        String expectedUrlLink = "http://uitestingplayground.com/overlapped";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickClassAttributeLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickClassAttribute();
        String expectedUrlLink = "http://uitestingplayground.com/classattr";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickClientSideDelayLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickClientSideDelay();
        String expectedUrlLink = "http://uitestingplayground.com/clientdelay";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickDynamicTableLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickDynamicTable();
        String expectedUrlLink = "http://uitestingplayground.com/dynamictable";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickSampleAppLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickSampleApp();
        String expectedUrlLink = "http://uitestingplayground.com/sampleapp";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickHiddenLayerLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickHiddenLayers();
        String expectedUrlLink = "http://uitestingplayground.com/hiddenlayers";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickLink();
        String expectedUrlLink = "http://uitestingplayground.com/click";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickVerifyTextLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickVerifyText();
        String expectedUrlLink = "http://uitestingplayground.com/verifytext";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickMouseOverLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickMouseOver();
        String expectedUrlLink = "http://uitestingplayground.com/mouseover";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickLoadDelayLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickLoadDelay();
        String expectedUrlLink = "http://uitestingplayground.com/loaddelay";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickTextInputLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickTextInput();
        String expectedUrlLink = "http://uitestingplayground.com/textinput";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickNonBreakingSpaceLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickNonBreakingSpace();
        String expectedUrlLink = "http://uitestingplayground.com/nbsp";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

    @Test
    public void clickProgressBarLinkTest(){
        HomePage home = new HomePage(getDriver());
        home.clickProgressBar();
        String expectedUrlLink = "http://uitestingplayground.com/progressbar";
        Assert.assertEquals(expectedUrlLink, getUrlLink());
    }

}
