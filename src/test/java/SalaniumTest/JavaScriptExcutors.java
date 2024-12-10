package SalaniumTest;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class JavaScriptExcutors {
  public  WebDriver driver;
    @Test
    public void EnterTextIntoDisabledBox() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("file:///C:/Users/Public/Index1.html");
        driver.manage().window().maximize();
        Thread.sleep(200);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('t1').value='admin'");

        Thread.sleep(5000);
        js.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(5000);
        js.executeScript("document.getElementById('t2').value='manager'");
        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public void ScrollUpAndDown() throws InterruptedException {
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
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
//scroll down on the webpage
            scroll.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) {
//scroll up on the webpage
            scroll.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
  }

}

}

