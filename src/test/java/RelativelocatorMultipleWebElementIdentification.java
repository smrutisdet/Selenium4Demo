import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativelocatorMultipleWebElementIdentification {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();
        List<WebElement> hyperLinks=driver.findElements(with(By.cssSelector("table#table1>tbody>tr:first-of-type>td:nth-of-type(6)>a"))
                        .toRightOf(By.cssSelector("table#table1>tbody>tr:first-of-type>td:nth-of-type(5)")));
        for(WebElement wb:hyperLinks){
            System.out.println(wb.getText());
        }
    }
}
