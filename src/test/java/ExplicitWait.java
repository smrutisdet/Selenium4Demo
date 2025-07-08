import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement inputBox=driver.findElement(By.cssSelector("input[type='text']"));
        wait.until(ExpectedConditions.elementToBeClickable(inputBox));
        inputBox.sendKeys("QA AUTOMATION CLASSES");
    }

}
