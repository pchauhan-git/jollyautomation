package day1.tests;


import day1.base.TestBase;
import day1.page.HomePage;
import day1.page.Login;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RI_Slum_Hut_Connection {
    WebDriver driver = null;
    Login loginPg = null;
    HomePage homePage = null;



@Test
    public void createConnection() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver = new TestBase().initialization();
        loginPg = PageFactory.initElements(driver, Login.class);
      driver.get(TestBase.prop.getProperty("url"));
        homePage = loginPg.login("swengp@gmail.com","Saltoris@123");
        //Assert.assertTrue(homePage.verifyHomePageLoaded());
        homePage.createNewConnectionR1SlumHut();
        driver.get(TestBase.prop.getProperty("admin_url"));
        homePage = loginPg.login("cso01@veolia.com","Cso@123");
        homePage.approveConnection("CSO");
        homePage = loginPg.login("tl01@veolia.com","Tl@123");
        homePage.approveConnection("TL");
        homePage = loginPg.login("mr01c@veolia.com","Mr@123");
        homePage.approveConnection("MR");
        homePage = loginPg.login("tl01@veolia.com","Tl@123");
        homePage.approveConnection("TL01");
        homePage = loginPg.login("spm01@veolia.com","Spm@123");
        homePage.approveConnection("SPM");
        homePage = loginPg.login("ne01@veolia.com","Ne@123");
        homePage.approveConnection("NE");
        homePage = loginPg.login("zm01@veolia.com","Zm@123");
        homePage.approveConnection("ZM");
        homePage = loginPg.login("cso01@veolia.com","Cso@123");
        homePage.approveConnection("CSO");
        homePage = loginPg.login("spm01@veolia.com","Spm@123");
        homePage.approveConnection("SPM");
        homePage = loginPg.login("dl01@veolia.com","Dl@123");
        homePage.approveConnection("DL");
        driver.get(TestBase.prop.getProperty("url"));
        homePage = loginPg.login("swengp@gmail.com","Saltoris@123");
            driver.get(TestBase.prop.getProperty("admin_url"));
        homePage = loginPg.login("ne01@veolia.com","Ne@123");
         homePage.approveConnection("NE01");
        homePage = loginPg.login("zm01@veolia.com","Zm@123");
        homePage.approveConnection("ZM");
        homePage = loginPg.login("cso01@veolia.com","Cso@123");
        homePage.approveConnection("CSO");
        homePage = loginPg.login("spm01@veolia.com","Spm@123");
        homePage.approveConnection("SPM");
    }
}
