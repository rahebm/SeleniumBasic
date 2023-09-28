package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("abracadabra");
        Thread.sleep(2000);
        username.clear();
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();
        WebElement welcomeText=driver.findElement(By.linkText("Welcome Admin"));
      String msg = welcomeText.getText();
        System.out.println("the message is: "+msg);




    }
}
