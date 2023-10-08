package ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AYZoVhcoFxt0T2tr0byVff-SlDuuIXBDlFd3LW8c4gr15mNkATYo5bByS8kRVgsKMQpFIRc-5Pfmog&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1878817334%3A1696468175460822&theme=glif");
        driver.manage().window().maximize();

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));

//        click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
//        click on the terms button
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));

        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();

//        get the main page handle
        String  mainPageHandle=driver.getWindowHandle();


//       get all handles
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")){
                break;
            }

        }

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}
