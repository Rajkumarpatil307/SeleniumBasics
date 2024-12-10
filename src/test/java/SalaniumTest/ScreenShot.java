package SalaniumTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class ScreenShot {
    public static WebDriver driver;
    @Test
    public void TestScreenShot() throws  InterruptedException, IOException  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
        username.sendKeys("rajkumar_patil30");
        WebElement password =driver.findElement(By.xpath("//input[@aria-label='Password']"));
        password.sendKeys("Raj@123");
        WebElement login = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
        login.click();
        Thread.sleep(10000);
        WebElement notNow=driver.findElement(By.xpath("//div[@role='button']"));
        notNow.click();
        Thread.sleep(10000);
        TakesScreenshot ts=(TakesScreenshot)driver;
        File sfile=ts.getScreenshotAs(OutputType.FILE);
        File dfile=new File("C:\\Salanium\\ScreenShotsConcepts\\"+"instagram.png");
        FileHandler.copy(sfile,dfile);
        Thread.sleep(5000);
        driver.close();


    }
}
