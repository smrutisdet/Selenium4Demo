import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IFrameDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.switchTo().frame("mce_0_ifr");
        System.out.println(driver.findElement(By.cssSelector("body[id='tinymce']>p")).getText());
        //driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.cssSelector("div.example>h3")).getText());
    }
}
