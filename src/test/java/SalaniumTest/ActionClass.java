package SalaniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {

    public WebDriver driver;
    @Test
    public  void UsingContestClickMethod() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement pass =driver.findElement(By.cssSelector("[type=\"password\"]"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.contextClick(pass).perform();
        Thread.sleep(5000);
     //  driver.close();

    }
    @Test
    public void UsingMoveElemntMethod() throws InterruptedException {

        driver= new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        WebElement jobs=driver.findElement(By.xpath("//span[text()='Jobs']"));
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(jobs).perform();
        Thread.sleep(5000);
    }
    @Test
    public void UsingDragDown() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        WebElement dragElement=driver.findElement(By.id("draggable"));
        WebElement downElement=driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement, downElement).perform();
        Thread.sleep(5000);

    }
    @Test
    public void UsingDoubleClickMethod() throws InterruptedException {

        driver= new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        WebElement jobs=driver.findElement(By.xpath("//span[text()='Jobs']"));
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.doubleClick(jobs).perform();
        Thread.sleep(5000);
    }
}
