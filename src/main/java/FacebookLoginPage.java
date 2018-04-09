import org.openqa.selenium.By;

public class FacebookLoginPage {

    private static final String LOGIN = "";
    private static final String PASSWORD = "";

    public void inputLogin(){
        BrowserManager.browser.findElement(By.xpath("//input[@id='email']")).sendKeys(LOGIN);
    }

    public void inputPassword(){
        BrowserManager.browser.findElement(By.xpath("//input[@id='pass']")).sendKeys(PASSWORD);
    }

    public FacebookProfilePage clickLoginButton(){
        BrowserManager.browser.findElement(By.cssSelector(".uiButton.uiButtonConfirm")).click();
        return new FacebookProfilePage();
    }
}
