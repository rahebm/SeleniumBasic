package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AYZoVhcoFxt0T2tr0byVff-SlDuuIXBDlFd3LW8c4gr15mNkATYo5bByS8kRVgsKMQpFIRc-5Pfmog&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1878817334%3A1696468175460822&theme=glif");
        driver.manage().window().maximize();
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));

//        click on privacy
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        helpBtn.click();
        privacyBtn.click();

//        Task1:
//        get the window handle of the mainpage i.e gmail.com and print it out on console
//         as our webdriver is curently focused on gmail page
//        we can use driver.getwindowshandle() to get the handle of the current page i.e gmail.com
        String gmailHandle = driver.getWindowHandle();
        System.out.println(gmailHandle);
//        Task2:
//        switch the focus of your webdriver to the privacy window
//        get all the handles and find the desired one
        Set<String> allHandles = driver.getWindowHandles();
//        loop through all the handles and find the one that is desired
        for(String handle:allHandles){
//            switch to the first handle in list
            driver.switchTo().window(handle);
//            get the title of the window on which the focus is
            String title = driver.getTitle();
//            check if the title matches ur desired title , if yes break the loop, if no repeat the process
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
            }
        }

