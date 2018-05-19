package framework;

import pages.FacebookLoginPage;

public class Navigation {

    public static FacebookLoginPage openFacebookLoginPage() {
        BrowserManager.getBrowser().get("https://uk-ua.facebook.com/");
        return new FacebookLoginPage();
    }
}
