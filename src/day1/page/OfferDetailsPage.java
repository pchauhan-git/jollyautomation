package day1.page;

import day1.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferDetailsPage extends TestBase {

    @FindBy(xpath = "//*[@id='__next']/div[3]/div[1]/div/div[1]/div[1]/a/h1")
    WebElement offerTitle;

    @FindBy(xpath = "//*[@id='__next']/div[3]/div[1]/div/div[1]/div[2]/img")
    WebElement shareLnk;

    @FindBy(xpath = "//span[contains(.,'Log in')]")
    WebElement LoginBtn;

    @FindBy(xpath = "//*[@id='float-hire-button']/div/p")
    WebElement subscribeBtn;

    @FindBy(xpath = "//*[@id='__next']/div[3]/div[1]/div/div[2]/div[1]/img")
    WebElement offerImage;

    @FindBy(xpath = "//*[@id='id-offer-recommendations']/div[2]/div[1]")
    WebElement recommendationCard;

    @FindBy(xpath = "//*[@id='id-offer-about']/div/div/div[1]/div[1]/div")
    WebElement aboutUserTitle;

    @FindBy(xpath = "//*[@id='id-offer-contact-to']/div/p")
    WebElement contactBtn;

    @FindBy(xpath = "//*[@id='id-offer-about']/div/div/div[2]/div[1]/div[2]/div[2]")
    WebElement showmoreLnk;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root jss450']/span")
    WebElement closeBtnonShareModal;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root jss451']/span[1]")
    WebElement closeBtnonBuyModal;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root jss269']/span[1]")
    WebElement closeBtnonContactModal;


    //Initializing the page objects here
    public OfferDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    public String offerDetailsPageTitle() {
        return driver.getTitle();
    }

    public boolean verifyOfferTitleTest() {
        return offerTitle.isDisplayed();
    }

    public void verifyShareLinkTest() throws InterruptedException {
        shareLnk.click();
        Thread.sleep(3000);
        closeBtnonShareModal.click();
        Thread.sleep(2000);
    }

    public void verifyBuyBtnTest() throws InterruptedException {
        subscribeBtn.click();
        Thread.sleep(3000);
        closeBtnonBuyModal.click();
        Thread.sleep(2000);
    }

    public boolean verifyOfferImageTest() {
        return offerImage.isDisplayed();
    }

    public boolean verifyAboutOfferTitleTest() {
        return aboutUserTitle.isDisplayed();
    }

    public boolean verifyShowMoreTest() {
        return showmoreLnk.isDisplayed();
    }

    public boolean verifyContactButtonTest() throws InterruptedException {
        contactBtn.click();
        Thread.sleep(3000);
        closeBtnonContactModal.click();
        return contactBtn.isEnabled();

    }

}
