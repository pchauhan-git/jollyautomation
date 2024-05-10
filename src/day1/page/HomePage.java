package day1.page;

import day1.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    //Define Page Factory or Object Repo


    @FindBy(xpath = "//div[@class='additional-menu']//div[3]//div")
    WebElement logOutBtn;

    @FindBy(xpath = "//div[@id='__next']/div[2]/div/div/div[2]/button[2]/span")
    WebElement featuresLink;

    @FindBy(xpath = "//a[contains(@href, '/sign-up')]")
    WebElement signupBtn;

    @FindBy(xpath="//input[@name='username']")
    WebElement username;

    @FindBy(xpath="//input[@name='password']")
    WebElement password;

    @FindBy(xpath="//div[@class='display-flex justify-space-between']//button[@type='button'][1]")
    WebElement LoginBtn;


    //Initializing the page objects here
    public HomePage() {
        PageFactory.initElements(driver, this);

    }
    //Actions here

    public boolean featureLink() {
        return featuresLink.isDisplayed();
    }

    public void loginLogout(String un, String pwd) throws InterruptedException {
        username.sendKeys(un);
        Thread.sleep(5000);
        password.sendKeys(pwd);
        LoginBtn.click();
        Thread.sleep(5000);
        logOutBtn.click();
        Thread.sleep(3000);
        //  return new StorePage();
    }


}