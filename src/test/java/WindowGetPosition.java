import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowGetPosition {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("Maximized screen position is"+driver.manage().window().getPosition());
        driver.manage().window().minimize();
        System.out.println("Minimized screen position is"+driver.manage().window().getPosition());
        driver.manage().window().fullscreen();
        System.out.println("Full screen position is"+driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(4,4));
        System.out.println("Specific screen position is"+driver.manage().window().getPosition());
    }
}
