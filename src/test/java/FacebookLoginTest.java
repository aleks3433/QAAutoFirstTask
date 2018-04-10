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

        FacebookLoginPage.inputLogin()
                .inputPassword()
                .clickLoginButton();

        FacebookProfilePage.findProfileIcon();
    }

    @AfterTest
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }

}
