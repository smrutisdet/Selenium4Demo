import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
       /* driver.findElement(By.cssSelector("div#checkbox>input")).click();
        System.out.println("If checkbox is clicked: "+driver.findElement(By.cssSelector("div#checkbox>input")).isEnabled());
        driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
        System.out.println("Clicked on Remove button");
        System.out.println("is Success message displayed:"+driver.findElement(By.cssSelector("p#message")).isDisplayed());*/
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("QA AUTOMATION CLASSES");
    }

}
