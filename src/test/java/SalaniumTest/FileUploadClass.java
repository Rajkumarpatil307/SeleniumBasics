package SalaniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUploadClass {
    public WebDriver driver;
    @Test
    public void FileUploadPopupUsingAutoIt() throws InterruptedException, IOException {


        driver = new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter/");
        driver.manage().window().maximize();
        Thread.sleep(1000); // Allow page to load

        // Click on the upload button to open the file upload dialog
        driver.findElement(By.xpath("//button[contains(@class,'l3tlg0-0')]")).click();


        Thread.sleep(5000);


        Runtime.getRuntime().exec("C:\\Users\\DELL\\OneDrive\\Desktop\\FileUpload.exe");


        Thread.sleep(20000);

    }
}
