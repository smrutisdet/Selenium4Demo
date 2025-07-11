import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotOfFullPage {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        File src=((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src,new File("./screenshots/Fullpage.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
