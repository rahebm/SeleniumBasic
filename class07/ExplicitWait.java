package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class ExplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/synchronization-explicit-wait.php";
        String browser="edge";
        openBrowserAndLaunchApplication(url,browser);
        WebElement enableBtnBtn = driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableBtnBtn.click();
//        as the button takes some time to be clickable
//        i will wait until it is clickable using explicit wait

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

//        wait is over then the following lines will be executed

        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Button']"));
        enableBtn.click();

        WebElement alertBtn = driver.findElement(By.xpath("//button[@if='show_alert']"));
        alertBtn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
