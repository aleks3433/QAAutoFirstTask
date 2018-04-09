import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static WebDriver browser;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:/Webdrivers/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        browser.quit();
    }
}
