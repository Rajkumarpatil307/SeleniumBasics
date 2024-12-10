package SalaniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementFB {
    public WebDriver driver;

    @Test
    public void testlogin() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("8431252665");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Rajupatil@1234");
        WebElement login = driver.findElement(By.name("login"));
        login.click();

    }

  @Test
    public void testCreateAccount() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createAccount = driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Rajkumar");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Patil");
        WebElement date =driver.findElement(By.name("birthday_day"));
        date.sendKeys("30");
        WebElement month = driver.findElement(By.name("birthday_month"));
        month.sendKeys("July");
        WebElement year = driver.findElement(By.name("birthday_year"));
        year.sendKeys("2001");
        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("rajupatil@gmail.com");
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("Rajupatil@1234");
        WebElement signup= driver.findElement(By.name("websubmit"));
        signup.click();

        Thread.sleep(9000);
        driver.close();


  }
  @Test
    public void testForgotPassword() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement forgotPassword = driver.findElement(By.linkText("Forgotten password?"));
        forgotPassword.click();
        WebElement email = driver.findElement(By.id("identify_email"));
        email.sendKeys("rajupatil@gmail.com");
        WebElement search = driver.findElement(By.name("did_submit"));
        search.click();
        Thread.sleep(9000);

        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("Rajupatil@1234");
        WebElement login = driver.findElement(By.name("login"));
        login.click();


        Thread.sleep(9000);
        driver.close();

  }
  @Test
  public void testloginXpath() throws InterruptedException {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
      email.sendKeys("8431252665");
      WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
      password.sendKeys("Rajupatil@1234");
      WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
      login.click();

  }



}
