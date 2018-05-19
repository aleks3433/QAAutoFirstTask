package framework;

import org.openqa.selenium.support.PageFactory;
import pages.FacebookLoginPage;

public class Navigation {

    public static FacebookLoginPage openFacebookLoginPage() {
        BrowserManager.getBrowser().get("https://uk-ua.facebook.com/");
        return PageFactory.initElements(BrowserManager.getBrowser(), FacebookLoginPage.class);
    }
}
