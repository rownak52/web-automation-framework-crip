package uitappages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyTxtPage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'UITAP')]")
    private WebElement logo;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

    @FindBy(xpath = "//a[contains(text(),'Resources')]")
    private WebElement resources;

    @FindBy (css = "body:nth-child(2) section:nth-child(2) div.container div.bg-primary:nth-child(12) > span.badge-secondary")
    private WebElement welcomeUsrTxt;

    public VerifyTxtPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void clickLogo(){ click(logo); }
    public void clickHome(){
        click(home);
    }
    public void clickResources(){
        click(resources);
    }
    public boolean checkTxtDisplayed(){
        return checkDisplayed(welcomeUsrTxt);
    }
}
