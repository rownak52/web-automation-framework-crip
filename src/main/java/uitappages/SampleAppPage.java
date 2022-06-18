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

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[2]/div[1]/input[1]")
    private WebElement userNameField;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[3]/div[1]/input[1]")
    private WebElement password;

    @FindBy(css = "#login")
    private WebElement logBtn;

    public SampleAppPage(WebDriver driver) {
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

    public void typeUserName(String userName) {
        type(userNameField, userName);
    }

    public void typePassword(String passWord) {
        type(password, passWord);
    }

    public void clickLogBtn() {
        click(logBtn);
    }
}
