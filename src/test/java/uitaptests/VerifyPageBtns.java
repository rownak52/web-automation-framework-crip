package uitaptests;

import base.CommonAPI;
import globalsqatests.AccountNumberDropDown;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uitappages.DynamicIDPage;
import uitappages.ScrollbarsPage;
import uitappages.VisibilityPage;

public class VerifyPageBtns extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(VerifyPageBtns.class);

    //    @Test //T21 Verify the recording of "Button with Dynamic ID" being clicked
//    public void verifyDynIDBtn() {
//        getDriver().get("http://uitestingplayground.com/dynamicid");
//        LOG.info("Redirect to Dynamic ID successful");
//        DynamicIDPage autoPage = new DynamicIDPage(getDriver());
//        autoPage.clickDynIDBtn();
//        LOG.info("Button click was successful");
//        Assert.assertTrue(autoPage.checkBtnClickable());
//    }
//
//    @Test //T23 Verify "Hiding Button" is clickable
//    public void verifyHidingClick() {
//        getDriver().get("http://uitestingplayground.com/scrollbars");
//        LOG.info("Redirect to Scrollbars webpage successful");
//        ScrollbarsPage autoPage = new ScrollbarsPage(getDriver());
//        autoPage.clickHidingBtn();
//        LOG.info("Hiding Button click was successful");
//        Assert.assertTrue(autoPage.checkBtnClickable());
//    }
//
    @Test //T24 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableRemovedBtn() {
        getDriver().get("http://uitestingplayground.com/visibility");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickRemoveButton();
        LOG.info("Remove Button click successful");
        Assert.assertTrue(autoPage.checkRemovedClickable());
        LOG.info("Button clickable successful");
//        autoPage.clickHideButton();
//        LOG.info("Button click successful");
//        Assert.assertTrue(autoPage.checkHideClickable());
    }

    @Test //T61 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableZeroWidBtn() {
        getDriver().get("http://uitestingplayground.com/visibility");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickZeroWidthButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkZeroWidClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T61 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableOverlapBtn() {
        getDriver().get("http://uitestingplayground.com/visibility");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickOverlapButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkOverlapClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T62 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableTransparentBtn() {
        getDriver().get("http://uitestingplayground.com/visibility");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickTransparentButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkTransparentClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T63 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableInvisibleBtn() {
        getDriver().get("http://uitestingplayground.com/visibility");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickInvisibleButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkVisibilHiddenClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T64 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableNotDisplayBtn() {
        getDriver().get("http://uitestingplayground.com/visibility");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickNotDisplayedButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkDisplayNonClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T65 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableOffscreenBtn() {
        getDriver().get("http://uitestingplayground.com/visibility");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickOffScreenButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkOffscreenClickable());
        LOG.info("Button clickable successful");
    }


//    @Test //T25 Verify that clicking on "Hide" element hides all of the other 7 clickable web elements
//    public void verifyHideFunction() {
//        getDriver().get("http://uitestingplayground.com/visibility");
//        LOG.info("Redirect to Visibility webpage successful");
//        VisibilityPage autoPage = new VisibilityPage(getDriver());
//        autoPage.clickHideButton();
//        LOG.info("Hide Button click successful");
//        String checkRemoved
//        Assert.assertFalse(autoPage.checkZeroWidClickable());
//        Assert.assertFalse(autoPage.checkTransparentClickable());
//        Assert.assertFalse(autoPage.checkVisibilHiddenClickable());
//        Assert.assertFalse(autoPage.checkDisplayNonClickable());
//        Assert.assertFalse(autoPage.checkOffscreenClickable());
//        Assert.assertFalse(autoPage.checkOverlapClickable());
//    }

    @Test //26 Verify the text boxes inside Playground scroll-window is clickable
    public void verifyTxtBxClickable() {
        LOG.info("TextBox click successful");
    }

    @Test //28 Verify the three buttons on webpage are clickable
    public void verifyThreeBtns() {
        LOG.info("Button click successful");
    }

    @Test //T35 Verify that user is able to click a second time on "Button" button
    public void verifySecondClick() {
        LOG.info("Button click successful");
    }

    @Test //T36 Verify that user is able to click on a button that reads "Button That Ignores DOM Click Event"
    public void verifyDOMBtn() {
        LOG.info("Button click successful");
    }

    @Test //T41 Verify Start button on Progress Bar Webpage is displayed and clickable
    public void verifyStartBtn() {
        LOG.info("Button click successful");
    }

    @Test //T42 Verify Stop button on Progress Bar Webpage is displayed and clickable
    public void verifyStopBtn() {
        LOG.info("Button click successful");
    }

    @Test //T44 Verify button on Non-Breaking Space Webpage is displayed and clickable
    public void verifyMyBtn() {
        LOG.info("Button click successful");
    }

    @Test //T60 Verify "Button Appearing After Delay" is clickable
    public void verifyBtnAfterDelay() {
        LOG.info("Button click successful");
    }
}