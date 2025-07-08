import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIntoduction {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
//      WebElement searchBar = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
//       System.out.println("is search bar displayed? "+searchBar.isDisplayed());
        System.out.println("is search bar displayed? "+driver.findElement(By.xpath("//textarea[@id='APjFqb']")).isDisplayed());
        driver.quit();
    }
}
