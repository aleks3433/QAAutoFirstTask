import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FacebookProfilePage {

    public static void findProfileIcon() {
        WebElement findProfileIcon = BrowserManager.browser.findElement(By.cssSelector("._2qgu._7ql._1m6h.img"));
        Assert.assertTrue(findProfileIcon.isDisplayed());
    }
}
