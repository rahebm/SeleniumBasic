package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){

        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            case "edge":
                driver=new EdgeDriver();
        }


        driver.get(url);
        //        maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
    }
}
    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);


    }
    public static WebDriverWait getWait(){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        return wait;
    }
    public static void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }
    public static void jsClick(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }
}

