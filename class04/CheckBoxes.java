package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox1.click();
       boolean selectState= checkBox1.isSelected();
       if(selectState) {
           System.out.println("the checkbox is selected");
       }else {
           System.out.println("the checkbox isn't selected");
       }
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
       for(WebElement checbox:checkboxes){
           checbox.click();
           }
       for(WebElement checkBoxAgain:checkboxes){
          String option= checkBoxAgain.getAttribute("value");
          if(option.equalsIgnoreCase("Option-3")){
              checkBoxAgain.click();
          }
       }
       }
    }

