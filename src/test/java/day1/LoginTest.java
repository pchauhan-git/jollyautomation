package day1;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.SignIn;
import page.StorePage;

public class LoginTest extends TestBase {
    SignIn SignPage1;
    StorePage Storepage1;
    HomePage homepage1;


//add constructor and super keyword
    public LoginTest(){

        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
      SignPage1 = new SignIn();
        homepage1 = new HomePage();
    }



    //Test to validate login  Page Title
//@Test()
//    public void LoginTestTitle() throws InterruptedException {
//        driver.get("https://www.jollyhq.com/sign-in");
//        Thread.sleep(8000);
//    String title = SignPage1.signInPageTitle();
//     Assert.assertEquals(title, "Sign In | Jolly");
//    Storepage1= SignPage1.login(prop.getProperty("username"), prop.getProperty("password"));
//    Thread.sleep(5000);
//    }

    @Test()
    public void LoginTest() throws InterruptedException {
        driver.get("https://www.jollyhq.com/sign-in");
        Thread.sleep(3000);
        SignPage1.loginBtnTest();
        String title = SignPage1.signInPageTitle();
        Assert.assertEquals(title, "Sign In | Jolly");
        Storepage1= SignPage1.login(prop.getProperty("username"), prop.getProperty("password"));
        Thread.sleep(3000);
        Storepage1.menuBtn();
        Storepage1.menuBtnClick();
        Thread.sleep(3000);
        Storepage1.logoutLink();
        Storepage1.logOutClick();
        Thread.sleep(3000);

    }

@AfterMethod
    public void tearDown(){
        driver.quit();
}


}
