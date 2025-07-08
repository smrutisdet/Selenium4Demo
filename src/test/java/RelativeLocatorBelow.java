import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorBelow {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
//        driver.findElement(RelativeLocator.with(By.id("password")).
//                above(By.xpath("//button[@class='radius']"))).sendKeys("abcdefgh");
        driver.findElement(RelativeLocator.with(By.tagName("input")).
                below(By.cssSelector("input#username"))).sendKeys("abcdefgh");
    }
}
