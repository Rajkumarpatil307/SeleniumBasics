package SalaniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectList {
    public WebDriver driver;

    @Test
    public void selectList()  throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:/Users/Public/SelectClassListEx.html");
        WebElement list = driver.findElement(By.id("mtr"));
        Select s = new Select(list);
        List<WebElement> options = s.getOptions();
        int size = options.size();
        for(WebElement option : options){
            s.selectByValue(option.getAttribute("value"));
        }
        Thread.sleep(5000);
        s.deselectAll();
        System.out.println("Number of elements present inside the listbox is : " + size);
        for (WebElement webElement : options) {
            String text = webElement.getText();
            System.out.println(text);
        }
        Thread.sleep(5000);
        s.selectByIndex(0);
        s.selectByValue("v");
        s.selectByVisibleText("Poori");
        System.out.println("************Print all selected options***********");
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        int size2 = allSelectedOptions.size();
        System.out.println("Number of items that is selected in the list box is : " + size2);
        System.out.println(" Selected items are printed below ");
        for (WebElement webElement : allSelectedOptions) {
            System.out.println(webElement.getText());
        }
        Thread.sleep(5000);

        System.out.println("check whether it is a multiple select listbox or not");
        boolean multiple = s.isMultiple();
        System.out.println(multiple + " yes , it is multi select");
        if (multiple) {
            WebElement firstSelectedOption = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption.getText() + " is the first selected item in the list box");
            Thread.sleep(5000);
            s.deselectByIndex(0);
            WebElement firstSelectedOption1 = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption1.getText() + " is the first selected item");
            Thread.sleep(5000);

            s.deselectByValue("v");
            WebElement firstSelectedOption2 = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption2.getText() + " is the first selected item");
            Thread.sleep(5000);

            s.deselectByVisibleText("Poori");
        }
      }

}
