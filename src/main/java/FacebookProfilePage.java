import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookProfilePage {

    @FindBy(css = "._2qgu._7ql._1m6h.img")
    static WebElement profileIcon;

    public static boolean isProfileIconVisible() {
        PageFactory.initElements(BrowserManager.browser, FacebookProfilePage.class);
        return profileIcon.isDisplayed();
    }
}

