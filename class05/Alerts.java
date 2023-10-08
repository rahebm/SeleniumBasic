package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.TreeMap;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(3000);
       Alert alert=driver.switchTo().alert();
       alert.accept();
       Thread.sleep(2000);
      WebElement alert3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
       alert3.click();
        alert.sendKeys("I am human");
        Thread.sleep(2000);
        alert.accept();
Thread.sleep(2000);
        WebElement alert2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        alert.dismiss();


    }
}
