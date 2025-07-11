import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotOfVisibleArea {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src,new File("./screenshots/HomePage.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
