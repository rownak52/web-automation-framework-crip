package uitappages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicIDPage extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'UITAP')]")
    private WebElement logo;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;

    @FindBy(xpath = "//a[contains(text(),'Resources')]")
    private WebElement resources;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/button[1]")
    private WebElement dynamicIDBtn;

    public DynamicIDPage(WebDriver driver) {
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

    public void clickDynIDBtn() {
        click(dynamicIDBtn);
    }

    public boolean checkBtnClickable() {
        return checkEnabled(dynamicIDBtn);
    }
}
