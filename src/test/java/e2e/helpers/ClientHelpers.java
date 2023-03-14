package e2e.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xml.sax.Locator;

public class ClientHelpers extends CommonHelpers{
    public ClientHelpers(WebDriver driver) {
        super(driver);
    }

    public void goToDepositPage(){
        clickOnVisibleElement(By.xpath("//button[@ng-click=\"deposit()\"]"));
    };

}
