package day1.page;

import day1.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    //Define Page Factory or Object Repo
    @FindBy(xpath = "//div[@id='__next']/div[2]/div/div/div[2]/a/span")
    WebElement loginBtn;

    @FindBy(xpath = "//img[@class='jss58']")
    WebElement jollyLogo;

    @FindBy(xpath = "//div[@id='__next']/div[2]/div/div/div[2]/button[2]/span")
    WebElement featuresLink;

    @FindBy(xpath = "//span[contains(.,'Pricing')]")
    WebElement pricingLink;

    @FindBy(xpath = "//div/button[@class='MuiButtonBase-root MuiButton-root MuiButton-text jss60'][4]")
    WebElement aboutUs;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-align-items-xs-center']/button[5]/span")
    WebElement blog;

    @FindBy(xpath = "//div[@class='MuiGrid-root jss10 jss54 MuiGrid-container MuiGrid-direction-xs-column']//a[2]")
    WebElement googleBtn;

    @FindBy(xpath = "//div[@class='MuiGrid-root jss10 jss54 MuiGrid-container MuiGrid-direction-xs-column']//a[1]")
    WebElement fbBtn;

    @FindBy(xpath = "//a[contains(@href, '/sign-up')]")
    WebElement signupBtn;

    @FindBy(xpath = "//a[@class='MuiButtonBase-root MuiButton-root ReviewsGrid_btn__136pl MuiButton-text']//span[1]")
    WebElement seeFeaturesBtn;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-align-items-xs-center MuiGrid-justify-content-xs-space-around']//a[2]")
    WebElement seePricingBtn;

    @FindBy(xpath = "//*[@id='__next']/div[2]/div[4]/button/span[1]/p")
    WebElement popularConsultantLink;

    @FindBy(xpath = "//*[@id='__next']/div[2]/div[4]/div/div[1]/a/p[1]")
    WebElement popularConsultantList;




    //Initializing the page objects here
    public HomePage() {
        PageFactory.initElements(driver, this);

    }

    //Actions here
    public String validateHomePageTitle() {
        return driver.getTitle();
    }

    public boolean loginLink() {
        return loginBtn.isDisplayed();
    }

    public boolean featureLink() {
        return featuresLink.isDisplayed();
    }

    public boolean priceLink() {
        return pricingLink.isDisplayed();
    }

    public boolean blogLink() {
        return blog.isDisplayed();
    }

    public boolean facebookBtn() {
      return fbBtn.isDisplayed();
    }

    public boolean googleBtn() {
        return googleBtn.isDisplayed();
    }

    public boolean signUpBtn() {
        return signupBtn.isDisplayed();
    }

    public SignIn loginClick() {
        loginBtn.click();
        return new SignIn();

    }

    public boolean seeFeatures() {
        return seeFeaturesBtn.isDisplayed();

    }

    public boolean seePricing() {
        return seePricingBtn.isDisplayed();

    }

    public void popularConsultant() throws InterruptedException{
        Thread.sleep(500);
        popularConsultantLink.isDisplayed();
        popularConsultantLink.click();

    }

    public void popularConsultantList() throws InterruptedException {
    //    popularConsultantLink.click();
        Thread.sleep(500);
        popularConsultantList.isDisplayed();

    }








}