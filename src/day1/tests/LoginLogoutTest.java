package day1.tests;


import day1.base.TestBase;
import day1.page.HomePage;
import day1.page.Login;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginLogoutTest {
    WebDriver driver = null;
    Login loginPg = null;
    HomePage homePage = null;




    @Test
    public void createConnection() throws InterruptedException {
          driver = new TestBase().initialization();
        loginPg = PageFactory.initElements(driver, Login.class);
       driver.get(TestBase.prop.getProperty("url"));
  homePage = loginPg.login("adityaraghuwanshi@saltoris.com","Aditya@123");
 Assert.assertTrue(homePage.verifyHomePageLoaded());
homePage.Logout();

    }
}
