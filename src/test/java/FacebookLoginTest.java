import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginTest {

    private static final String LOGIN = "";
    private static final String PASSWORD = "";


    @BeforeTest
    public void openBrowser() {
        BrowserManager.openBrowser();
    }

    @Test
    public void testLogin() {
        Navigation.openFacebookLoginPage();

        FacebookLoginPage.inputLogin(LOGIN)
                .inputPassword(PASSWORD)
                .clickLoginButton();

        Assert.assertTrue(FacebookProfilePage.isProfileIconVisible());
    }

    @AfterTest
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }

}
