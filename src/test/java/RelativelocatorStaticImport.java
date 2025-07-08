import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativelocatorStaticImport {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();
        driver.findElement(with(By.cssSelector("table#table1>tbody>tr:first-of-type>td:nth-of-type(6)>a[href='#edit']"))
                .toLeftOf(By.cssSelector("table#table1>tbody>tr:first-of-type>td:nth-of-type(6)>a[href='#delete']"))
                        .toRightOf(By.cssSelector("table#table1>tbody>tr:first-of-type>td:nth-of-type(5)"))).click();
    }
}
