package uitaptests;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uitappages.DynamicIDPage;
import uitappages.HomePage;
import uitappages.ScrollbarsPage;
import uitappages.VisibilityPage;

public class PageButtons extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(PageButtons.class);

    @Test //T21 Verify the recording of "Button with Dynamic ID" being clicked
    public void verifyDynamicIDButton() {
        getDriver().get("http://uitestingplayground.com/dynamicid");
        LOG.info("Redirect to Dynamic ID successful");
        DynamicIDPage autoPage = new DynamicIDPage(getDriver());
        autoPage.clickDynIDBtn();
        LOG.info("Button click was successful");
        Assert.assertTrue(autoPage.checkBtnClickable());
    }

    @Test //T23 Verify "Hiding Button" is clickable
    public void verifyHidingClick() {
        getDriver().get("http://uitestingplayground.com/scrollbars");
        LOG.info("Redirect to Scrollbars webpage successful");
        ScrollbarsPage autoPage = new ScrollbarsPage(getDriver());
        autoPage.clickHidingBtn();
        LOG.info("Hiding Button click was successful");
        Assert.assertTrue(autoPage.checkBtnClickable());
    }

    @Test //T24 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableRemovedButton() {
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        LOG.info("Visibility click successful");
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
    public void ClickableZeroWidthButton() {
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        LOG.info("Visibility click successful");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickZeroWidthButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkZeroWidClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T61 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableOverlapButton() {
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        LOG.info("Visibility click successful");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickOverlapButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkOverlapClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T62 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableTransparentButton() {
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        LOG.info("Visibility click successful");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickTransparentButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkTransparentClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T63 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableInvisibleButton() {
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        LOG.info("Visibility click successful");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickInvisibleButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkVisibilHiddenClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T64 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableNotDisplayButton() {
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        LOG.info("Visibility click successful");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickNotDisplayedButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkDisplayNonClickable());
        LOG.info("Button clickable successful");
    }

    @Test //T65 Verify eight different button web elements are clickable, with "Hide" button being last
    public void ClickableOffScreenButton() {
        HomePage home = new HomePage(getDriver());
        home.clickVisibility();
        LOG.info("Visibility click successful");
        LOG.info("Redirect to Visibility webpage successful");
        VisibilityPage autoPage = new VisibilityPage(getDriver());
        autoPage.clickOffScreenButton();
        LOG.info("Button click successful");
        Assert.assertTrue(autoPage.checkOffscreenClickable());
        LOG.info("Button clickable successful");
    }

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

//    @Test //26 Verify the text boxes inside Playground scroll-window is clickable
//    public void verifyTxtBxClickable() {
//        LOG.info("TextBox click successful");
//    }
//
//    @Test //28 Verify the three buttons on webpage are clickable
//    public void verifyThreeBtns() {
//        LOG.info("Button click successful");
//    }
//
//    @Test //T35 Verify that user is able to click a second time on "Button" button
//    public void verifySecondClick() {
//        LOG.info("Button click successful");
//    }
//
//    @Test //T36 Verify that user is able to click on a button that reads "Button That Ignores DOM Click Event"
//    public void verifyDOMButton() {
//        LOG.info("Button click successful");
//    }
//
//    @Test //T41 Verify Start button on Progress Bar Webpage is displayed and clickable
//    public void verifyStartButton() {
//        LOG.info("Button click successful");
//    }
//
//    @Test //T42 Verify Stop button on Progress Bar Webpage is displayed and clickable
//    public void verifyStopButton() {
//        LOG.info("Button click successful");
//    }
//
//    @Test //T44 Verify button on Non-Breaking Space Webpage is displayed and clickable
//    public void verifyMyButton() {
//        LOG.info("Button click successful");
//    }
//
//    @Test //T60 Verify "Button Appearing After Delay" is clickable
//    public void verifyBtnAfterDelay() {
//        LOG.info("Button click successful");
//    }
//}