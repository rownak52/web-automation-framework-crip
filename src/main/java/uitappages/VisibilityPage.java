package uitappages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisibilityPage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    private WebElement removedHidden;

    @FindBy(xpath = "//a[contains(text(),'UITAP')]")
    private WebElement logo;

    @FindBy(xpath = "//a[contains(text(),'Resources')]")
    private WebElement resources;

    @FindBy(css = "#hideButton")
    private WebElement hideButton;

    @FindBy(css = "#removedButton")
    private WebElement removedButton;

    @FindBy(css = "#zeroWidthButton")
    private WebElement zeroWidthButton;

    @FindBy(css = "#overlappedButton")
    private WebElement overlappedButton;

    @FindBy(css = "#transparentButton")
    private WebElement opacity0Btn;

    @FindBy(css = "#invisibleButton")
    private WebElement visibilHiddenBtn;

    @FindBy(css = "#notdisplayedButton")
    private WebElement displayNonBtn;

    @FindBy(css = "#offscreenButton")
    private WebElement offScreenButton;

    public VisibilityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLogo() {
        click(logo);
    }

    public void clickHome() {
        click(home);
    }

    public void clickResources() {
        click(resources);
    }

    public void clickHideButton() {
        click(hideButton);
    }

    public boolean checkHideClickable() {
        return checkEnabled(hideButton);
    }

    public void clickRemoveButton() {
        click(removedButton);
    }

    public boolean checkRemovedClickable() {
        return checkEnabled(removedButton);
    }

    public void clickZeroWidthButton() {
        click(zeroWidthButton);
    }

    public boolean checkZeroWidClickable() {
        return checkEnabled(zeroWidthButton);
    }

    public void clickTransparentButton() {
        click(opacity0Btn);
    }

    public boolean checkTransparentClickable() {
        return checkEnabled(opacity0Btn);
    }

    public void clickInvisibleButton() {
        click(visibilHiddenBtn);
    }

    public boolean checkVisibilHiddenClickable() {
        return checkEnabled(visibilHiddenBtn);
    }

    public void clickNotDisplayedButton() {
        click(displayNonBtn);
    }

    public boolean checkDisplayNonClickable() {
        return checkEnabled(displayNonBtn);
    }

    public void clickOffScreenButton() {
        click(offScreenButton);
    }

    public boolean checkOffscreenClickable() {
        return checkEnabled(offScreenButton);
    }

    public void clickOverlapButton() {
        click(overlappedButton);
    }

    public boolean checkOverlapClickable() {
        return checkEnabled(overlappedButton);
    }




}
