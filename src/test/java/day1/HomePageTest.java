package day1;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;

public class HomePageTest extends TestBase {
    HomePage homepage1;

    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
      homepage1 = new HomePage();
    }

    //Test to validate Home Page Title
    @Test(priority=1)
    public void homePageTitleTest(){
    String title = homepage1.validateHomePageTitle();
        Assert.assertEquals(title, "Jolly | Instantly Create an Online Storefront to Sell Your Services & Skills");
    }

    //Test to validate Login Button presence
    @Test(priority=2)
    public void homePageloginbtnPresenceTest(){
       boolean flag = homepage1.loginLink();
       Assert.assertTrue(flag);
    }
    //Test to click on Login button on home page


    @Test(priority = 3)
    public void homePagefeatureLinkPresenceTest(){
        homepage1.featureLink();
    }

    @Test(priority = 4)
    public void homePagepriceLinkPresenceTest(){
        homepage1.priceLink();
    }

    @Test(priority = 5)
    public void homePageblogLinkPresenceTest(){
        homepage1.blogLink();
    }

    @Test(priority = 6)
    public void homePagefacebookBtnPresenceTest(){
        homepage1.facebookBtn();
    }

    @Test(priority = 7)
    public void homePagegoogleBtnPresenceTest(){
        homepage1.googleBtn();
    }

//    @Test(priority = 8)
//    public void homePagesignupBtnTest(){
//        homepage1.signUpBtn();
//    }
//
//
//    @Test(priority = 9)
//    public void homePageseeFeaturesBtnTest(){
//        homepage1.seeFeatures();
//    }
//
//    @Test(priority = 10)
//    public void homePageseePricingBtnTest(){
//        homepage1.seePricing();
//    }
//
//
//    @Test(priority = 11)
//    public void homePagepopularConsultantTest() throws InterruptedException {
//        homepage1.popularConsultant();
////        Thread.sleep(300);
//    }

    @Test(priority =8)
    public void homePagepopularConsultantLinkTest(){

        homepage1.popularConsultantList();
    }

@AfterMethod
    public void tearDown(){
        driver.quit();
}


}
