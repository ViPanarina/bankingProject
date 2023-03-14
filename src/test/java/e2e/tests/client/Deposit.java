package e2e.tests.client;

import e2e.TestBase;
import e2e.helpers.LoginHelpersClient;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Deposit extends TestBase {

    @Test
    public void depositMoneyClient(){
        app.getLoginClient().loginLikeClient();
        app.getClientHelpers().goToDepositPage();

    }
}
