import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

    @FindBy(xpath = "//input[@id='email']")
    static WebElement loginInput;

    @FindBy(xpath = "//input[@id='pass']")
    static WebElement passwordInput;

    @FindBy(css = ".uiButton.uiButtonConfirm")
    static WebElement buttonConfirm;

    public static FacebookLoginPage inputLogin(String LOGIN) {
        PageFactory.initElements(BrowserManager.browser, FacebookLoginPage.class);
        loginInput.sendKeys(LOGIN);
        return new FacebookLoginPage();
    }

    public static FacebookLoginPage inputPassword(String PASSWORD) {
        PageFactory.initElements(BrowserManager.browser, FacebookLoginPage.class);
        passwordInput.sendKeys(PASSWORD);
        return new FacebookLoginPage();
    }

    public static FacebookProfilePage clickLoginButton() {
        PageFactory.initElements(BrowserManager.browser, FacebookLoginPage.class);
        buttonConfirm.click();
        return new FacebookProfilePage();
    }
}
