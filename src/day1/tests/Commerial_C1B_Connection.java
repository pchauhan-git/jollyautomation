package day1.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import day1.base.TestBase;
import day1.page.HomePage;
import day1.page.Login;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Commerial_C1B_Connection {
    WebDriver driver = null;
    Login loginPg = null;
    HomePage homePage = null;
    ExtentReports report;
    ExtentReports extent = new ExtentReports();


    @Test
    //TEST CASE//
    public void createConnection() throws InterruptedException {
        driver = new TestBase().initialization();
        loginPg = PageFactory.initElements(driver, Login.class);
       driver.get(TestBase.prop.getProperty("url"));
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        ExtentTest test = extent.createTest("Test to Create new C1B Type Connection");
        homePage = loginPg.login("swengp@gmail.com","Saltoris@123");
       // Assert.assertTrue(homePage.verifyHomePageLoaded());
        homePage.createNewConnectionC1B();
  driver.get(TestBase.prop.getProperty("admin_url"));
   homePage = loginPg.login("cso01@veolia.com","Cso@123");
        homePage.approveConnection("CSO");
        test.pass("Approved By CSO");
        homePage = loginPg.login("tl01@veolia.com","Tl@123");
        homePage.approveConnection("TL");
        test.pass("Approved By TL");
        homePage = loginPg.login("tl01@veolia.com","Tl@123");
        homePage.approveConnection("TLFORCOMMERCIAL");
        test.pass("Approved By CSO");
        homePage = loginPg.login("tl01@veolia.com","Tl@123");
        homePage.approveConnection("MRCOMMERCIAL");
        test.pass("Approved By MR");
        homePage = loginPg.login("tl01@veolia.com","Tl@123");
        homePage.approveConnection("TL01");
        test.pass("Approved By TL");
        homePage = loginPg.login("spm01@veolia.com","Spm@123");
        homePage.approveConnection("SPM");
        test.pass("Approved By SPM");
        homePage = loginPg.login("ne01@veolia.com","Ne@123");
        homePage.approveConnection("NE");
        test.pass("Approved By NE");
        homePage = loginPg.login("zm01@veolia.com","Zm@123");
        homePage.approveConnection("ZM");
        test.pass("Approved By ZM");
        homePage = loginPg.login("cso01@veolia.com","Cso@123");
        homePage.approveConnection("CSO");
        test.pass("Approved By CSO");
        homePage = loginPg.login("spm01@veolia.com","Spm@123");
        homePage.approveConnection("SPM");
        homePage = loginPg.login("dl01@veolia.com","Dl@123");
        homePage.approveConnection("DL");
        test.pass("Approved By DL");
        homePage = loginPg.login("eemcm@veolia.com","Ee@123");
        homePage.approveConnection("EE");
        test.pass("Approved By EE");

        driver.get(TestBase.prop.getProperty("url"));
        homePage = loginPg.login("swengp@gmail.com","Saltoris@123");
        homePage.approveConnection("aditya");
        test.pass("Payment done");
        test.pass("Approved By ne");
        homePage.approveConnection("ZM");
        homePage.approveConnection("CSO");
        homePage.approveConnection("SPM");
//        homePage = loginPg.login("adityaraghuwanshi@saltoris.com","Aditya@123");
//        homePage.approveConnection("aditya");
//        driver.get(TestBase.prop.getProperty("admin_url"));
//        homePage = loginPg.login("ne01@veolia.com","Ne@123");
//        test.pass("Approved By ne");
//         homePage.approveConnection("NE01");
//        homePage = loginPg.login("zm01@veolia.com","Zm@123");
//        homePage.approveConnection("ZM");
//        test.pass("Approved By ZM");
//        homePage = loginPg.login("cso01@veolia.com","Cso@123");
//        homePage.approveConnection("CSO");
//        test.pass("Approved By CSO");
//        homePage = loginPg.login("spm01@veolia.com","Spm@123");
//        homePage.approveConnection("SPM");
//        test.pass("Approved By SPM");
    }
}
