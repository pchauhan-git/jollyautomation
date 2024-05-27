package day1.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {

  public static long PAGE_LOAD_TIMEOUT=30;
   public static long IMPLICIT_WAIT=20;

   public static long EXTERNAL_WAIT = 40;

   public static void waitUntilClickable(WebDriver driver, WebElement ele) {
       WebDriverWait wait = new WebDriverWait(driver, EXTERNAL_WAIT);
       wait.until(ExpectedConditions.elementToBeClickable(ele));
   }

   public static void waitUntilElementNotPresent(WebDriver driver, WebElement ele) {
       WebDriverWait wait = new WebDriverWait(driver, EXTERNAL_WAIT);
       wait.until(ExpectedConditions.invisibilityOf(ele));
   }

   public static void waitForFiveSeconds() throws InterruptedException {
       Thread.sleep(5000);
   }
    public static void waitForTwoSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void waitForOneSeconds() throws InterruptedException {
        Thread.sleep(1000);
    }

}
