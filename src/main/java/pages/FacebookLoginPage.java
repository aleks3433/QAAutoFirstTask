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
        loginInput.sendKeys(login);
        return PageFactory.initElements(BrowserManager.getBrowser(), FacebookLoginPage.class);
    }

    public FacebookLoginPage inputPassword(String password) {
        passwordInput.sendKeys(password);
        return PageFactory.initElements(BrowserManager.getBrowser(), FacebookLoginPage.class);
    }

    public FacebookProfilePage clickLoginButton() {
        buttonConfirm.click();
        return PageFactory.initElements(BrowserManager.getBrowser(), FacebookProfilePage.class);
    }
}
