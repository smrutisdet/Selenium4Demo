import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class TakeScreenShotOfAWebElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
       File emailAddressScreenShot =driver.findElement(By.cssSelector("input#Form_submitForm_action_request"))
               .getScreenshotAs(OutputType.FILE);
       File bookADemoScreenshot=driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/div[2]/ul/li[1]/a")).
               getScreenshotAs(OutputType.FILE);
        File contactSalesScreenshot=driver.findElement(By.xpath("//div[@id='navbarSupportedContent']/div[2]/ul/li[2]/a")).
                getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(emailAddressScreenShot,new File("./screenshots/email.jpg"));
            FileUtils.copyFile(bookADemoScreenshot,new File("./screenshots/bookADemo.jpg"));
            FileUtils.copyFile(contactSalesScreenshot,new File("./screenshots/contactSales.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
