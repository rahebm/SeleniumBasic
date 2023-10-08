package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.xpath("//Select[@id='select-demo']"));
        Select sel = new Select(dropDown);
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
        sel.selectByValue("Tuesday");
        Thread.sleep(3000);
        sel.selectByIndex(2);

    }
}
