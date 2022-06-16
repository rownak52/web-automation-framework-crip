package uitappages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleAppPage extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'UITAP')]")
    private WebElement logo;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

    @FindBy(xpath = "//a[contains(text(),'Resources')]")
    private WebElement resources;

    @FindBy(xpath = "//input[@id='2c90d07a-7269-fbd0-6925-75d5b1224996']")
    private WebElement userName;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[3]/div[1]/input[1]")
    private WebElement password;

    public SampleAppPage(WebDriver driver){
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

    public void typeUserName(String text){
        type(userName,text);
    }

    public void typePassword(String text){
        type(password,text);
    }

}
