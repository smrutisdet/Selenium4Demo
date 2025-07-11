import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        System.out.println(driver.findElement(By.xpath("//html/body")).getText());
        driver.switchTo().parentFrame();
        System.out.println("Switched to parent frame");
        driver.switchTo().frame(1);
        System.out.println("Switching to middle frame by index");
        System.out.println(driver.findElement(By.xpath("//html/body")).getText());
    }
}
