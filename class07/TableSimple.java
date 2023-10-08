package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class TableSimple extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/table-data-download-demo.php";
        String browser="edge";
        openBrowserAndLaunchApplication(url,browser);
        WebElement allTable = driver.findElement(By.xpath("//table[@id='example']"));
        String tableContent = allTable.getText();
        //System.out.println(tableContent);

        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for(WebElement row:rows){
            String text =row.getText();
            if(text.contains("Software Engineer")){
           // System.out.println(text);
        }
    }
       List<WebElement> columns= driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        for (WebElement column:columns){
            String text=column.getText();
           // System.out.println(text);
        }

        List<WebElement> positionCol= driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
        int i=0;
        for(WebElement position:positionCol){
            String text= position.getText();
            if(text.equals("Software Engineer")){
                System.out.println("the row that contains software engineer "+i);
               WebElement row= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+(i+1)+"]"));
                System.out.println(row.getText());
            }
            i=i+1;
        }



}}
