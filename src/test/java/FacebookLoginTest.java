import framework.BrowserManager;
import framework.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FacebookProfilePage;

public class FacebookLoginTest {

    private static final String[] LOGIN = {"", "", ""};
    private static final String[] PASSWORD = {"", "", ""};


    @BeforeMethod
    public void openBrowser() {
        BrowserManager.openBrowser();
    }

    private void testMultithreading(String login, String password) {
        FacebookProfilePage facebookProfilePage = Navigation.openFacebookLoginPage()
                .inputLogin(login)
                .inputPassword(password)
                .clickLoginButton();

        Assert.assertTrue(facebookProfilePage.isProfileIconVisible(), "Profile icon should be visible");
    }

    @Test
    public void testLogin1() {
        testMultithreading(LOGIN[0], PASSWORD[0]);
    }

    @Test
    public void testLogin2() {
        testMultithreading(LOGIN[1], PASSWORD[1]);
    }

    @Test
    public void testLogin3() {
        testMultithreading(LOGIN[2], PASSWORD[2]);
    }

    @AfterMethod
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }

}
