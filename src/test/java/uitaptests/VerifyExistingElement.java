package uitaptests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uitappages.*;

import java.time.Duration;

public class VerifyExistingElement extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(VerifyExistingElement.class);

    //    @Test //T22 Verify text on loaded label after pressing "Button Triggering AJAX Request"
//    public void verifyAJAXBtn() {
//        getDriver().get("http://uitestingplayground.com/ajax");
//        AjaxPage autoPage = new AjaxPage(getDriver());
//        autoPage.clickAjaxButton();
//        LOG.info("Text AJAX button click successful");
//        waitFor(20);
//        Assert.assertTrue(autoPage.checkAjaxTxt());
//        LOG.info("Text display successfully");
//    }
//
//    @Test //T30 Verify that clicking on "Button Triggering Client Side Logic" results in a wait-time followed by new text element on screen.
//    public void verifyWaitForText(){
//        getDriver().get("http://uitestingplayground.com/clientdelay");
//        ClientDelayPage autoPage = new ClientDelayPage(getDriver());
//        autoPage.clickBtnTriggering();
//        LOG.info("'Button Triggering Client Side Logic' button click successful");
//        waitFor(20);
//        String actualTxt = getElementText("body:nth-child(2) section:nth-child(2) div.container div:nth-child(8) > p.bg-success");
//        System.out.println(actualTxt);
//        String expectedResult = "Data calculated on the client side.";
//        Assert.assertEquals(actualTxt, expectedResult);
//        LOG.info("Text match successful");
//    }
//
//    @Test //T37 Verify text element on webpage should read "Welcome UserName!"
//    public void verifyWelcomeTxt(){
//        getDriver().get("http://uitestingplayground.com/verifytext");
//        LOG.info("Redirect to VerifyText webpage successful");
//        VerifyTxtPage autoPage = new VerifyTxtPage(getDriver());
//        Assert.assertTrue(autoPage.checkTxtDisplayed());
//        LOG.info("'Welcome UserName' Text present successful");
//    }
//
//    @Test //T39 Verify "Load Delay" Header Text
//    public void verifyLoadDelHeader(){
//        getDriver().get("http://uitestingplayground.com/loaddelay");
//        LOG.info("Redirect to LoadDelays webpage successful");
//        LoadDelayPage autoPage = new LoadDelayPage(getDriver());
//        String expectedHeader = "Load Delays";
//        Assert.assertEquals(expectedHeader, getElementText("body:nth-child(2) section:nth-child(2) div.container > h3:nth-child(1)"));
//    }
//
//    @Test //T45 Verify the image of Rubiks Cube is available from source
//    public void verifyRubiksImg(){
//        HomePage autoPage = new HomePage(getDriver());
//        LOG.info("Loading Homepage successful");
//        Assert.assertTrue(autoPage.checkRubikImg());
//        LOG.info("Rubiks image verification successful");
//    }
//
    @Test //T47 Verify cell data under Name column on Dynamic Table webpage
    public void verifyTblNameCellTxt() {

    }
//
//    @Test //T48 Verify cell data under CPU column on Dynamic Table webpage
//    public void verifyTblCPUCellTxt(){
//
//    }
//
//    @Test //T49 Verify specific cell data on Dynamic Table webpage
//    public void verifyChromeMemoryCell(){
//
//    }
//
//    @Test //T50 Verify specific cell data on Dynamic Table webpage
//    public void verifyFFoxMemoryCell(){
//
//    }
//
//    @Test //T51 Verify specific cell data on Dynamic Table webpage
//    public void verifySystemMemoryCell(){
//
//    }
//
//    @Test //T52 Verify specific cell data on Dynamic Table webpage
//    public void verifyIEMemoryCell(){
//
//    }
}
