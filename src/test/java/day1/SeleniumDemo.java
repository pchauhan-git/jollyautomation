package day1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tft/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.jollyhq.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
