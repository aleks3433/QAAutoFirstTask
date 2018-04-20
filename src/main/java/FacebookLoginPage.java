import org.openqa.selenium.By;

public class FacebookLoginPage {

    private static final String LOGIN = "aleks3433@mail.ru";
    private static final String PASSWORD = "0938942957нфдгидгвкгяуш";

    public static FacebookLoginPage inputLogin(){
        BrowserManager.browser.findElement(By.xpath("//input[@id='email']")).sendKeys(LOGIN);
        return new FacebookLoginPage();
    }

    public static FacebookLoginPage inputPassword(){
        BrowserManager.browser.findElement(By.xpath("//input[@id='pass']")).sendKeys(PASSWORD);
        return new FacebookLoginPage();
    }

    public static FacebookProfilePage clickLoginButton(){
        BrowserManager.browser.findElement(By.cssSelector(".uiButton.uiButtonConfirm")).click();
        return new FacebookProfilePage();
    }
}
