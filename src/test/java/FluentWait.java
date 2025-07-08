import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;


import java.time.Duration;

public class FluentWait<W extends SearchContext> {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
       Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
               .withTimeout(Duration.ofSeconds(20L)).pollingEvery(Duration.ofSeconds(5L))
               .ignoring(NoSuchElementException.class);
        WebElement inputBox=driver.findElement(By.cssSelector("input[type='text']"));
        wait.until(ExpectedConditions.elementToBeClickable(inputBox));
        inputBox.sendKeys("QA AUTOMATION CLASSES");
    }

}
