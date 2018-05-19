package pages;

import framework.BrowserManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

    @FindBy(xpath = "//input[@id='email']")
    WebElement loginInput;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement passwordInput;

    @FindBy(css = ".uiButton.uiButtonConfirm")
    WebElement buttonConfirm;

    public FacebookLoginPage inputLogin(String login) {
        PageFactory.initElements(BrowserManager.getBrowser(), FacebookLoginPage.class);
        loginInput.sendKeys(login);
        return new FacebookLoginPage();
    }

    public FacebookLoginPage inputPassword(String password) {
        PageFactory.initElements(BrowserManager.getBrowser(), FacebookLoginPage.class);
        passwordInput.sendKeys(password);
        return new FacebookLoginPage();
    }

    public FacebookProfilePage clickLoginButton() {
        PageFactory.initElements(BrowserManager.getBrowser(), FacebookLoginPage.class);
        buttonConfirm.click();
        return new FacebookProfilePage();
    }
}
