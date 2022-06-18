package saucedemopages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class InventoryPage extends CommonAPI {

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    private WebElement sortDropDown;

    @FindBy(xpath = "//a[contains(text(),'Twitter')]")
    private WebElement twitter;

    @FindBy(xpath = "//a[contains(text(),'Facebook')]")
    private WebElement facebook;

    @FindBy(xpath = "//a[contains(text(),'LinkedIn')]")
    private WebElement linkedIn;

    @FindBy(css = "#react-burger-menu-btn")
    private WebElement menuBar;

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    private WebElement cart;

    @FindBy(css = "#inventory_sidebar_link")
    private WebElement allItems;

    @FindBy(css = "#about_sidebar_link")
    private WebElement about;

    @FindBy(css = "#logout_sidebar_link")
    private WebElement logOut;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement backPack;

    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    private WebElement bikeLight;

    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement boltTshirt;

    @FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
    private WebElement fleeceJacket;

    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    private WebElement onesie;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement redTshirt;

    @FindBy(css = "#reset_sidebar_link")
    private WebElement resetAppState;

    @FindBy(css = "div.page_wrapper div.header_container:nth-child(1) div.header_secondary_container div.right_component span.select_container > select.product_sort_container")
    private List<WebElement> sortDropDownOptions;
    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addBackPack() {
        click(backPack);
    }

    public void addBikeLight() {
        click(bikeLight);
    }

    public void addBoltTshirt() {
        click(boltTshirt);
    }

    public void addFleeceJacket() {
        click(fleeceJacket);
    }

    public void addOnesie() {
        click(onesie);
    }

    public void addRedTshirt(){
        click(redTshirt);
    }



    public void selectSortDropDown(String text) {
        selectFromDropdown(sortDropDown, text);
    }

    public List<String> getSortDropDownOptions() {
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(sortDropDown);
        for (WebElement element : elements) {
            options.add(element.getText());
        }
        return options;
    }

    public void selectOptionFromDropDownWithDropDownOption(String option){
        List<WebElement> ele = sortDropDownOptions;
        for (WebElement element : ele) {
            if (element.getText().equalsIgnoreCase(option)){
                element.click();
            }
        }
    }
    public void menuBarButton(){
        click(menuBar);
    }
    public void allItemsSideBar(){
        click(allItems);
    }
    public void aboutSideBar(){
        click(about);
    }
    public void logOutSideBar(){
        click(logOut);
    }
    public void goToCart(){
        click(cart);
    }

    public void resetCart(){
        click(resetAppState);
    }

    public void clickTwitterIcon(){
        click(twitter);
    }

    public void clickFacebookIcon(){
        click(facebook);
    }

    public void clickLinkedInIcon(){
        click(linkedIn);
    }



}
