import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class RelativeLocatorNear {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.findElement(RelativeLocator.with(By.xpath("//a[@onclick=\"byCat('phone')\"]"))
                .near(By.id("cat"))).click();
    }
}