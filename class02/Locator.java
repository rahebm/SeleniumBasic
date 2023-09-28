package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();
        // locate the web element
       WebElement firstName=driver.findElement(By.id("first_name"));
       firstName.sendKeys("Raheb");
       // locate the web element last name
       WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("moh");
        WebElement emailAdd=driver.findElement(By.className("form-control-01"));
        emailAdd.sendKeys("moh.raheb@gmail.com");
        WebElement button=driver.findElement(By.tagName("button"));
        button.click();
        WebElement clickHere=driver.findElement(By.linkText("Link"));
        clickHere.click();
        WebElement clickH=driver.findElement(By.partialLinkText("Here."));
        clickH.click();

    }
}
