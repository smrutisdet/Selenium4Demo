import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RectangleDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Rectangle rectangle=driver.findElement(By.cssSelector("#user-name")).getRect();
        System.out.println("Dimension is:"+rectangle.getDimension());
        System.out.println("Height is:"+rectangle.getHeight());
        System.out.println("Width is:"+rectangle.getWidth());
        System.out.println("point is:"+rectangle.getPoint());
        System.out.println("x coordinate  is:"+rectangle.getX());
        System.out.println("y coordinate is:"+rectangle.getY());


    }
}
