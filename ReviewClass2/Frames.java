package ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();
        driver.switchTo().frame("textfieldIframe");
        WebElement findCheckBox=driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(findCheckBox);
        WebElement checkBox =driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkBox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
//        create an object of select class
        Select sel =new Select(animals);
        sel.selectByVisibleText("Baby Cat");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("textfieldIframe");
        driver.findElement(By.name("Topic")).sendKeys("abcdef");







    }
}
