package uitappages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'UITAP')]")
    private WebElement logo;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

    @FindBy(xpath = "//a[contains(text(),'Resources')]")
    private WebElement resources;

    @FindBy(xpath = "//a[contains(text(),'Dynamic ID')]")
    private WebElement dynamicId;

    @FindBy(xpath = "//a[contains(text(),'Class Attribute')]")
    private WebElement classAttribute;

    @FindBy(xpath = "//a[contains(text(),'Hidden Layers')]")
    private WebElement hiddenLayers;

    @FindBy(xpath = "//a[contains(text(),'Load Delay')]")
    private WebElement loadDelay;

    @FindBy(xpath = "//a[contains(text(),'AJAX Data')]")
    private WebElement ajaxData;

    @FindBy(xpath = "//a[contains(text(),'Client Side Delay')]")
    private WebElement clientSideDelay;

    @FindBy(xpath = "//a[contains(text(),'Click')]")
    private WebElement click;

    @FindBy(xpath = "//a[contains(text(),'Text Input')]")
    private WebElement textInput;

    @FindBy(xpath = "//a[contains(text(),'Scrollbars')]")
    private WebElement scrollBars;

    @FindBy(xpath = "//a[contains(text(),'Dynamic Table')]")
    private WebElement dynamicTable;

    @FindBy(xpath = "//a[contains(text(),'Verify Text')]")
    private WebElement verifyText;

    @FindBy(xpath = "//a[contains(text(),'Progress Bar')]")
    private WebElement progressBar;

    @FindBy(xpath = "//a[contains(text(),'Visibility')]")
    private WebElement visibility;

    @FindBy(xpath = "//a[contains(text(),'Sample App')]")
    private WebElement sampleApp;

    @FindBy(xpath = "//a[contains(text(),'Mouse Over')]")
    private WebElement mouseOver;

    @FindBy(xpath = "//a[contains(text(),'Non-Breaking Space')]")
    private WebElement nonBreakingSpace;

    @FindBy(xpath = "//a[contains(text(),'Overlapped Element')]")
    private WebElement overlappedElement;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
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
    public void clickDynamicId(){
        click(dynamicId);
    }
    public void clickClassAttribute(){
        click(classAttribute);
    }
    public void clickHiddenLayers(){
        click(hiddenLayers);
    }
    public void clickLoadDelay(){
        click(loadDelay);
    }
    public void clickAjaxData(){
        click(ajaxData);
    }
    public void clickClientSideDelay(){
        click(clientSideDelay);
    }
    public void clickLink(){
        click(click);
    }
    public void clickTextInput(){
        click(textInput);
    }
    public void clickScrollBars(){
        click(scrollBars);
    }
    public void clickDynamicTable(){
        click(dynamicTable);
    }
    public void clickVerifyText(){
        click(verifyText);
    }
    public void clickProgressBar(){
        click(progressBar);
    }
    public void clickVisibility(){
        click(visibility);
    }
    public void clickSampleApp(){
        click(sampleApp);
    }
    public void clickMouseOver(){
        click(mouseOver);
    }
    public void clickNonBreakingSpace(){
        click(nonBreakingSpace);
    }
    public void clickOverlappedElement(){
        click(overlappedElement);
    }
}