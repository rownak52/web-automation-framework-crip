package uitappages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisibilityPage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

    @FindBy(xpath = "//a[contains(text(),'UITAP')]")
    private WebElement logo;

    @FindBy(xpath = "//a[contains(text(),'Resources')]")
    private WebElement resources;

    @FindBy(css = "#zeroWidthButton")
    private WebElement zeroWidthButton;

    @FindBy(css = "#removedButton")
    private WebElement removedButton;
    @FindBy(css = "#hideButton")
    private WebElement hideButton;

    @FindBy(css = "#overlappedButton")
    private WebElement overlappedButton;

    @FindBy(css = "#transparentButton")
    private WebElement transparentButton;

    @FindBy(css = "#invisibleButton")
    private WebElement invisibleButton;

    @FindBy(css = "#notdisplayedButton")
    private WebElement notDisplayedButton;

    @FindBy(css = "#offscreenButton")
    private WebElement offScreenButton;

    public VisibilityPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickLogo(){
        click(logo);
    }
    public void clickHome(){
        click(home);
    }
    public void clickResources(){
        click(resources);
    }

    public void clickHideButton(){ click(hideButton); }

    public void clickRemoveButton(){ click(removedButton); }

    public void clickZeroWidthButton(){ click(zeroWidthButton); }

    public void clickTransparentButton(){ click(transparentButton); }

    public void clickInvisibleButton(){ click(invisibleButton); }

    public void clickNotDisplayedButton(){ click(notDisplayedButton);}

    public void clickOffScreenButton(){ click(offScreenButton); }



}
