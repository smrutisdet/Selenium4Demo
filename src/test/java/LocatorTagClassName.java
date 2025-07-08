import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagClassName {
    public static void main(String[] args) {
        int count=0;
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        System.out.println(driver.getTitle());
       /* List<WebElement> allButtons=driver.findElements(By.tagName("button"));
        for(WebElement element:allButtons){
            System.out.println(element.getText());
            count++;
        }*/
        System.out.println("No of buttons are:"+count);
        List<WebElement> ItemDescList=driver.findElements(By.className("inventory_item_description"));
        for(WebElement element:ItemDescList){
            System.out.println(element.getText());
            count++;
        }
    }

}
