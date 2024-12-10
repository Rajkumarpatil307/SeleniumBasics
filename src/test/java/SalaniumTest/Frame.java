package SalaniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
    public WebDriver driver;
    @Test
    public void frameTestDefault()  throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Public/FrameHandling2.html");
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("a");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("a");
        Thread.sleep(5000);

    }
    @Test
    public void frameTestParent()  throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Public/FrameHandling2.html");
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("a");
        driver.switchTo().parentFrame();
        driver.findElement(By.id("t2")).sendKeys("a");
        Thread.sleep(5000);

    }

}
