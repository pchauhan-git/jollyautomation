package page;

import base.TestBase;
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

    @FindBy(xpath = "//a[contains(text(),'Pricing')]")
    WebElement pricingLink;

    @FindBy(xpath = "//div/button[@class='MuiButtonBase-root MuiButton-root MuiButton-text jss60'][4]")
    WebElement aboutUs;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-align-items-xs-center']/button[5]/span")
    WebElement blog;

    @FindBy(xpath = "//div[@class='MuiGrid-root jss10 jss54 MuiGrid-container MuiGrid-direction-xs-column']//a[2]")
    WebElement googleBtn;

    @FindBy(xpath = "//div[@class='MuiGrid-root jss10 jss54 MuiGrid-container MuiGrid-direction-xs-column']//a[1]")
    WebElement fbBtn;

    @FindBy(xpath = "//div[@class='MuiGrid-root jss10 jss54 MuiGrid-container MuiGrid-direction-xs-column']//a[3]")
    WebElement signupBtn;

    @FindBy(xpath = "//a[@class='MuiButtonBase-root MuiButton-root ReviewsGrid_btn__136pl MuiButton-text']//span[1]")
    WebElement seeFeaturesBtn;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-align-items-xs-center MuiGrid-justify-content-xs-space-around']//a[2]")
    WebElement seePricingBtn;

    @FindBy(xpath = "//span[@class='MuiButton-label']//p[@class='MuiTypography-root jss68 MuiTypography-body1']")
    WebElement popularConsultantLink;

    @FindBy(xpath = "//div[@class='MuiGrid-root jss77 MuiGrid-item MuiGrid-grid-xs-4']")
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

    public void popularConsultant() {
        popularConsultantLink.isDisplayed();
        popularConsultantLink.click();

    }

    public void popularConsultantList() {
        popularConsultantList.isDisplayed();

    }








}