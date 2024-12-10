package SalaniumTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class AlertPop_up {
    WebDriver driver;
    @Test
    public void alertPopUp()  throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        WebElement alert1 = driver.findElement(By.id("alertButton"));
        alert1.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);

        alert.accept();
        Thread.sleep(5000);

    }
    @Test
    public void alertPopUpTimer()  throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,900)");
        Thread.sleep(2000);
        WebElement alert1 = driver.findElement(By.id("timerAlertButton"));
        alert1.click();
        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();
        Thread.sleep(8000);
        alert.accept();
        Thread.sleep(5000);

    }
    @Test
    public void alertPopUpConfirm()  throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,900)");
        Thread.sleep(2000);
        WebElement alert1 = driver.findElement(By.id("confirmButton"));
        alert1.click();
        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();
        Thread.sleep(8000);
        alert.accept();
        Thread.sleep(5000);
        driver.close();

    }
    @Test
    public void alertPopUpTPromt()  throws InterruptedException,AWTException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,900)");
        Thread.sleep(2000);
        WebElement alert1 = driver.findElement(By.id("promtButton"));
        alert1.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Rajkumar Patil");
        Thread.sleep(5000);
        alert.accept();
        Thread.sleep(5000);

    }
    @Test
    public void alertPopUpHidden()  throws InterruptedException,AWTException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(9000);

        WebElement dateSelector = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
        dateSelector.click();
        Thread.sleep(2000);
        WebElement date=driver.findElement(By.linkText("18"));
        date.click();
        Thread.sleep(5000);





    }
}
