package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class Calendar extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="edge";
        openBrowserAndLaunchApplication(url, browser);
        WebElement usrName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        usrName.sendKeys("Admin");
//        find the password
        WebElement paswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        paswrd.sendKeys("Hum@nhrm123");

//        find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
        leave.click();
        WebElement calendar=driver.findElement(By.xpath("//input[@id='calFromDate']"));
        calendar.click();
        WebElement month =driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(month);
        sel.selectByVisibleText("Aug");

        WebElement year =driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1=new Select(year);
        sel1.selectByVisibleText("1935");
        //get all the dates
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date:dates){
            String text=date.getText();
            if(text.equals("4")){
                date.click();
                break;

            }
        }





    }
}
