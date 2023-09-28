package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.nio.charset.MalformedInputException;

public class CSS {public static void main(String[] args) {
    WebDriver driver = new EdgeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();
    WebElement profileID=driver.findElement(By.cssSelector("input[id='profileID']"));
    profileID.sendKeys("MohammadRaheb");
    WebElement profile=driver.findElement(By.cssSelector("input#profileBox"));
    profile.sendKeys("M.Raheb");
    WebElement feedbackJenny=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
    feedbackJenny.sendKeys("abcdef");
    WebElement feedbackRaj=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));//css shortcut and in the value we have a space between
    // the word control and feedback but we should put a dot instead
    feedbackRaj.sendKeys("xyz");
    WebElement course=driver.findElement(By.cssSelector("input[name*='contentInput']"));
    course.sendKeys("Software Testing");
    WebElement introAdvCSS=driver.findElement(By.cssSelector("input[name^='Intro']"));
    introAdvCSS.sendKeys("CSS shortcuts");
    WebElement conclusionCSS=driver.findElement(By.cssSelector("input[name$='Input']")); //starts with CSS
    conclusionCSS.sendKeys("because"); //ends with CSS
}}
