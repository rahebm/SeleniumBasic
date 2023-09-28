package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String currentUrl=driver.getCurrentUrl();    //get the url of the website
        System.out.println("the current url is: "+currentUrl);
       String title= driver.getTitle();
        System.out.println("the title of the page is: "+title);
        Thread.sleep(2000);
        driver.quit();

    }
}
