package saucedemopages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsPage extends CommonAPI {

    @FindBy(xpath = "//body[1]/header[1]/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[3]/div[1]/div[1]/a[1]/span[1]")
    private WebElement pricing;

    @FindBy(xpath = "//span[contains(text(),'Terms of Service')]")
    private WebElement termsOfService;

    @FindBy(xpath = "//body/div[@id='template__page']/div[1]/section[2]/div[1]/div[2]/div[7]/a[1]")
    private WebElement visualTesting;

    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
    private WebElement EEA;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/figure[1]/lite-youtube[1]")
    private WebElement startVideo;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[4]/form[1]/button[1]/i[1]/*[1]")
    private WebElement searchButton;

    @FindBy(xpath = "//h2[contains(text(),'Test Automation')]")
    private WebElement testAutomation;

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    private WebElement signIn;

    @FindBy(xpath = "//p[contains(text(),'Cross Browser Testing, Selenium Testing, Mobile Te')]")
    private WebElement searchSauceLink;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[4]/a[1]")
    private WebElement errorReporting;

    @FindBy(xpath = "//span[contains(text(),'Privacy')]")
    private WebElement privacy;

    @FindBy(xpath = "//a[contains(text(),'Cookies Settings')]")
    private WebElement cookiesSetting;

    @FindBy(xpath = "//body/div[@id='template__page']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")
    private WebElement videoLink;
    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[4]/form[1]/div[1]/input[1]")
    private WebElement searchBar;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[1]/div[1]/div[1]/a[1]")
    private WebElement solutions;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[2]/div[1]/div[1]/a[1]")
    private WebElement platform;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[4]/div[1]/div[1]/a[1]")
    private WebElement resources;

    @FindBy(xpath = "//button[contains(text(),'Confirm My Choices')]")
    private WebElement confirmChoices;

    @FindBy(xpath = "//span[contains(text(),'CCPA')]")
    private WebElement CCPA;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[5]/div[1]/div[1]/a[1]")
    private WebElement company;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/ul[2]/li[6]/div[1]/div[1]/a[1]")
    private WebElement contact;

    @FindBy(xpath = "//a[contains(text(),'Terms and Conditions')]")
    private WebElement TermsAndConditions;

    @FindBy(xpath = "//header/nav[1]/a[1]/icon[1]/*[1]")
    private WebElement linkedInLogo;

    @FindBy(xpath = "//span[contains(text(),'Sign up with email')]")
    private WebElement SignUpWithEmail;

    @FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
    private WebElement TryItFree;



    public SauceLabsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickSignIn(){
        click(signIn);
    }

    public void clickSearchButton(){
        click(searchButton);
    }

    public void typeAndEnterSearchBar(String text){
        typeAndEnter(searchBar, text);

    }
    public void clickVisualTesting(){
        click(visualTesting);
    }

    public void clickErrorReporting(){
        click(errorReporting);
    }


    public void clickTestAutomation() {
        click(testAutomation);
    }

    public void clickTermsOfService(){
        click(termsOfService);
    }

    public void clickPrivacy(){
        click(privacy);
    }

    public void clickEEA(){
        click(EEA);
    }

    public void clickCCPA(){
        click(CCPA);
    }

    public void clickCookiesSetting(){
        click(cookiesSetting);

    }

    public void clickConfirmChoices(){
        click(confirmChoices);

    }

    public void clickTryItFree(){
        click(TryItFree);
    }

    public void clickTermsAndConditions(){
        click(TermsAndConditions);
    }

    public void clickSignUpWithEmail(){
        click(SignUpWithEmail);}

    public void clickSauceLink(){
        click(searchSauceLink);}

}
