package ReviewClass2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        driver.switchTo().alert().accept();
    }
}
