package uitappages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassAttributePage extends CommonAPI {

    @FindBy(xpath = "//body/section[1]/div[1]/button[1]")
    private WebElement greenButton;

    @FindBy(xpath = "//body/section[1]/div[1]/button[2]")
    private WebElement yellowButton;

    @FindBy(xpath = "//body/section[1]/div[1]/button[3]")
    private WebElement blueButton;

    @FindBy(xpath = "//a[contains(text(),'UITAP')]")
    private WebElement logo;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

    @FindBy(xpath = "//a[contains(text(),'Resources')]")
    private WebElement resources;

    public ClassAttributePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickLogo(){ click(logo); }
    public void clickHome(){
        click(home);
    }
    public void clickResources(){
        click(resources);
    }

    public void clickGreenButton(){
        click(greenButton);
    }

    public void clickBlueButton(){
        click(blueButton);
    }

    public void clickYellowButton(){
        click(yellowButton);
    }






}
