package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private WebDriver driver;

    private By UserNameField = By.id("username");
    private By PasswordField = By.id("password");
    private By LoginButton = By.cssSelector("i[class='fa fa-2x fa-sign-in']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void UserNameField(String username){
        driver.findElement(UserNameField).sendKeys("tomsmith");
    }
    public void PasswordField(String password){
        driver.findElement(PasswordField).sendKeys("SuperSecretPassword!");
    }
    public SecureAreaPage LoginButton(){
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver);
    }
}
