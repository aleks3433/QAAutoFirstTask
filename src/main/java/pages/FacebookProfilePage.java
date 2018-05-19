package pages;

import framework.BrowserManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookProfilePage {

    @FindBy(css = "._2qgu._7ql._1m6h.img")
    WebElement profileIcon;

    public boolean isProfileIconVisible() {
        PageFactory.initElements(BrowserManager.getBrowser(), FacebookProfilePage.class);
        return profileIcon.isDisplayed();
    }
}

