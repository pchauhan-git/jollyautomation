package day1.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import day1.util.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
   public static WebDriver driver;
  public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();

            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/day1/java/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public WebDriver initialization(){

       String browserName= prop.getProperty("browser");
       if(browserName.equals("chrome")){
           System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver.exe");
          driver = new ChromeDriver();
       } else if(browserName.equals("FF")){
           System.setProperty("webdriver.gecko.driver", "/Users/tft/Downloads/geckodriver");
           driver = new FirefoxDriver();
       }
        driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
       driver.get(prop.getProperty("url"));
       return driver;
    }
}

