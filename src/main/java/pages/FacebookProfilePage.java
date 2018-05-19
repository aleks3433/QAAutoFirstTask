package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookProfilePage {

    @FindBy(css = "._2qgu._7ql._1m6h.img")
    WebElement profileIcon;

    public boolean isProfileIconVisible() {
        return profileIcon.isDisplayed();
    }
}

