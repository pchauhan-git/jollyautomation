package day1.page;
import day1.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login extends TestBase {

    @FindBy(xpath="//input[@name='username']")
    WebElement username;

    @FindBy(xpath="//input[@name='password']")
    WebElement password;

    @FindBy(xpath="//button/span[text()='Login']")
    WebElement LoginBtn;

    @FindBy(xpath="//*[@id='__next']/div[2]/div/div/p[2]")
    WebElement InvalidLoginMsg;


    //Initializing the page objects here
    public Login() {
        PageFactory.initElements(driver, this);
    }

    public String signInPageTitle() {
        return driver.getTitle();
    }

    public HomePage login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        LoginBtn.click();
        return PageFactory.initElements(driver, HomePage.class);
    }

//    public StorePage invalidlogin(String un, String pwd) {
//        username.sendKeys(un);
//        password.sendKeys(pwd);
//        LoginBtn.click();
//        return new StorePage();
//    }

    public boolean loginBtnTest() {

        return LoginBtn.isDisplayed();
    }

    public void InvalidLoginMsg() {
        String LoginMsg= InvalidLoginMsg.getText();
        Assert.assertEquals(LoginMsg, "The email or password entered is incorrect");

    }





}
