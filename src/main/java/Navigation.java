public class Navigation {

    public static FacebookLoginPage openFacebookLoginPage() {
        BrowserManager.browser.get("https://uk-ua.facebook.com/");
        return new FacebookLoginPage();
    }
}
