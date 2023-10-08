package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dd = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(dd);

        sel.selectByVisibleText("Texas");
        sel.selectByValue("Florida");
        Thread.sleep(3000);
        sel.deselectByVisibleText("Texas");
        System.out.println(sel.isMultiple());







    }
}
