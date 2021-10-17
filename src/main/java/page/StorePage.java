package page;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends TestBase {


    @FindBy(xpath="//div[@id='__next']/div[2]/div[2]/div/div/div/button/span/div/div/div[2]/p")
    WebElement MenuBtn;

    @FindBy(xpath="//div[@id='simple-menu']/div[3]/ul/div/div[2]/div/li[3]/div[2]/span")
    WebElement LogOut;

    //Initializing the page objects here
    public StorePage() {
        PageFactory.initElements(driver, this);
    }

    public String StorePageTitle() {
        return driver.getTitle();
    }
    public SignIn menuBtnClick() {
        MenuBtn.click();
        return new SignIn();
    }

    public boolean menuBtn() {

        return MenuBtn.isDisplayed();
    }

    public boolean logoutLink() {
Actions Act=new Actions(driver);
Act.moveToElement(LogOut).perform();

        return LogOut.isDisplayed();
    }

    public SignIn logOutClick() throws InterruptedException {
        Actions Act=new Actions(driver);
        Act.moveToElement(LogOut).perform();
        LogOut.click();
        Thread.sleep(3000);
        return new SignIn();
    }



}
