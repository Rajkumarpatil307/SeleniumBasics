package SalaniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementsINSTA {
    public WebDriver driver;

    @Test
    public void testLogin()  throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("rajkumar_patil30");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Raj@123");
        WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
        login.click();
        Thread.sleep(8000);
        driver.close();
    }
    @Test
    public void testSearchProfileByXpath() throws InterruptedException {
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

        WebElement search=driver.findElement(By.xpath("(//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'])[12]"));
        search.click();

       Thread.sleep(15000);
       WebElement searchbox=driver.findElement(By.xpath("//input[@aria-label='Search input']"));
       searchbox.sendKeys("sudhir_pawar7");









    }
    @Test
    public void testForgotPasswordXpath() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        WebElement username = driver.findElement(By.xpath("//span[@style='----base-line-clamp-line-height: 18px; --lineHeight: 18px;']"));
       username.click();
       Thread.sleep(1000);
       WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
       email.sendKeys("rajkumarpatil0501784@gmail.com");
       WebElement password = driver.findElement(By.xpath("//div[@role='button']"));
       password.click();
       Thread.sleep(8000);
       driver.close();

    }
    @Test
    public void  testMessage() throws InterruptedException {
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
        WebElement message=driver.findElement(By.xpath("//span[contains(text(),'Messages')]"));
        message.click();
        Thread.sleep(10000);
        WebElement notNow=driver.findElement(By.xpath("//button[@class='_a9-- _ap36 _a9_1']"));
        notNow.click();
        WebElement sendMessage=driver.findElement(By.xpath("//div[text()='Send message']"));
        sendMessage.click();
        Thread.sleep(10000);
        WebElement searchForPerson=driver.findElement(By.xpath("//input[@autocomplete='off']"));
        searchForPerson.sendKeys("sudhir_pawar7");
        Thread.sleep(15000);
        WebElement clickProfile=driver.findElement(By.xpath("//input[@aria-label='Toggle selection'][@dir='ltr']"));
        clickProfile.click();
        Thread.sleep(10000);
        WebElement chat=driver.findElement(By.xpath("//div[contains(text(),'Chat')]"));
        chat.click();
        WebElement messageSend=driver.findElement(By.xpath("//p[@class='xat24cr xdj266r']"));
        messageSend.sendKeys("hi ,This message was send by Automation");
        Thread.sleep(5000);
        WebElement sendmessage=driver.findElement(By.xpath("//div[text()='Send']"));
        sendmessage.click();



    }
    @Test
    public void testBioUpdate() throws InterruptedException {
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
        WebElement profile=driver.findElement(By.xpath("(//img[@alt=\"rajkumar_patil30's profile picture\"])[2]"));
        profile.click();
        Thread.sleep(5000);
        WebElement editProfile=driver.findElement(By.xpath("//a[text()='Edit profile']"));
        editProfile.click();
        Thread.sleep(5000);
        WebElement bioPlace=driver.findElement(By.id("pepBio"));
        bioPlace.sendKeys("Automation");
        WebElement submitProfile=driver.findElement(By.xpath("//div[text()='Submit']"));
        submitProfile.click();





    }
    @Test
    public void testViewStory() throws InterruptedException {
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
        WebElement viewStory=driver.findElement(By.xpath("(//img[@class=\"xpdipgo x972fbf xcfux6l x1qhh985 xm0m39n xk390pu x5yr21d xdj266r x11i5rnm xat24cr x1mh8g0r xl1xv1r xexx8yu x4uap5 x18d9i69 xkhd6sd x11njtxf xh8yej3\"])[1]"));
        viewStory.click();
        Thread.sleep(5000);

        WebElement rightSideViewStory=driver.findElement(By.xpath("//div[@role='button']"));
        rightSideViewStory.click();


    }






}
