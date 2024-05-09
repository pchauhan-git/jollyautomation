package test.java.day1;

import day1.base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import day1.page.HomePage;

public class LoginLogout extends TestBase {
    HomePage homepage1;

    public LoginLogout(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
      homepage1 = new HomePage();
    }

    //Test to validate Home Page Title
//    @Test(priority=1)
//    public void homePageTitleTest(){
//    String title = homepage1.validateHomePageTitle();
//        Assert.assertEquals(title, "Jolly | Instantly Create an Online Storefront to Sell Your Services & Skills");
//    }
//
//    //Test to validate Login Button presence
//    @Test(priority=2)
//    public void homePageloginbtnPresenceTest(){
//       boolean flag = homepage1.loginLink();
//       Assert.assertTrue(flag);
//    }
//    //Test to click on Login button on home page
//
//
//    @Test(priority = 3)
//    public void homePagefeatureLinkPresenceTest(){
//        homepage1.featureLink();
//    }
//
//    @Test(priority = 4)
//    public void homePagepriceLinkPresenceTest(){
//        homepage1.priceLink();
//    }
//
//    @Test(priority = 5)
//    public void homePageblogLinkPresenceTest(){
//        homepage1.blogLink();
//    }
//
//    @Test(priority = 6)
//    public void homePagefacebookBtnPresenceTest(){
//        homepage1.facebookBtn();
//    }
//
//    @Test(priority = 7)
//    public void homePagegoogleBtnPresenceTest(){
//        homepage1.googleBtn();
//    }
//
//    @Test(priority = 8)
//    public void homePagesignupBtnTest(){
//        homepage1.signUpBtn();
//    }
//
//
//    @Test(priority = 8)
//    public void homePageseeFeaturesBtnTest(){
//        homepage1.seeFeatures();
//    }
//
//    @Test(priority = 9)
//    public void homePageseePricingBtnTest(){
//        homepage1.seePricing();
//    }

//
//    @Test(priority = 10)
//    public void homePagepopularConsultantTest() throws InterruptedException {
//        homepage1.popularConsultant();
//
//    }

    @Test(priority =11)
    public void homePagepopularConsultantLinkTest() throws InterruptedException {
        homepage1.popularConsultant();
        Thread.sleep(3000);
        homepage1.popularConsultantList();
    }

@AfterMethod
    public void tearDown(){
        driver.quit();
}


}
