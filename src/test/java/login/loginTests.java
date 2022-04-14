package login;

import Base.BaseTests;
import Pages.SecureAreaPage;
import Pages.loginpage;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class loginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin() {

        loginpage log = home.ClickOnFormLink();
        log.EnterUsername("tomsmith");
        log.EnterPass("SuperSecretPassword!");
        SecureAreaPage SECArea = log.clickLoginButton();
        String Text = SECArea.getAlertText();
        Assert.assertTrue(Text.contains("You logged into a secure area!"),"Alert text is incorrect");
    }
}
