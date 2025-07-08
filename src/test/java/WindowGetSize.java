import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowGetSize {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("Maximized screen size is"+driver.manage().window().getSize());
        driver.manage().window().minimize();
        System.out.println("Minimized screen size is"+driver.manage().window().getSize());
        driver.manage().window().fullscreen();
        System.out.println("Full screen size is"+driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(1024,738));
        System.out.println("Specific screen size is"+driver.manage().window().getSize());
    }
}
