package login;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage LoginPage = homePage.FormAuthenticationLink();
                LoginPage.UserNameField("tomsmith");
        LoginPage.PasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = LoginPage.LoginButton();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");    }

}
