import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("div#checkbox>input")).click();
        System.out.println("If checkbox is clicked: "+driver.findElement(By.cssSelector("div#checkbox>input")).isEnabled());
        driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
        System.out.println("Clicked on Remove button");
        Thread.sleep(3000);
        System.out.println("is Success message displayed:"+driver.findElement(By.cssSelector("p#message")).isDisplayed());

    }

}
