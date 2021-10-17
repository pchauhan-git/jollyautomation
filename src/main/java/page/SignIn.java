package page;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends TestBase {

    @FindBy(xpath="//input[@id='email']")
    WebElement username;

    @FindBy(xpath="//input[@id='password']")
    WebElement password;

    @FindBy(xpath="//div[@id='__next']/div[2]/div/div/div[3]/button/span")
    WebElement LoginBtn;

    //Initializing the page objects here
    public SignIn() {
        PageFactory.initElements(driver, this);
    }

    public String signInPageTitle() {
        return driver.getTitle();
    }

    public StorePage login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        LoginBtn.click();
        return new StorePage();
    }

    public boolean loginBtnTest() {

        return LoginBtn.isDisplayed();
    }





}
