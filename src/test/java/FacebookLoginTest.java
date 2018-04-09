import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginTest {

    @BeforeTest
    public void openBrowser() {
        BrowserManager.openBrowser();
    }

    @Test
    public void testLogin() {

        Navigation.openFacebookLoginPage();

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage();
        facebookLoginPage.inputLogin();
        facebookLoginPage.inputPassword();
        facebookLoginPage.clickLoginButton();

        FacebookProfilePage facebookProfilePage = new FacebookProfilePage();
        facebookProfilePage.findProfileIcon();
    }

    @AfterTest
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }

}
