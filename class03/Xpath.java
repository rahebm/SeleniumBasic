package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();
        //find the text box
       WebElement textBox1= driver.findElement(By.xpath("//input[@id='title']"));
        textBox1.sendKeys("batch17");
        WebElement textBox2 = driver.findElement(By.xpath("//input[@name='title']"));
        textBox2.sendKeys("Raheb");
        WebElement textBox3 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
        textBox3.sendKeys("whats the color of Sun");
        WebElement themagicalText = driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(themagicalText.getText());
        WebElement apiSetting =driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
        apiSetting.sendKeys("abracadabra");
        WebElement Email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        Email1.sendKeys("hello1@gmail.com");

        WebElement Email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        Email2.sendKeys("canicomein@gmail.com");

        WebElement Email3=driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        Email3.sendKeys("welcome@gmail.com");
       WebElement field1=driver.findElement(By.xpath("(//input[@data-detail='one' and @name='customField'])"));
       field1.sendKeys("cat");
       WebElement field2=driver.findElement(By.xpath("//input[@name='customField' and @data-detail='two']"));
       field2.sendKeys("catterpiller");
       WebElement field3=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']"));
       field3.sendKeys("Soccer");
        WebElement field4=driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        field4.sendKeys("Lion");


    }
}
