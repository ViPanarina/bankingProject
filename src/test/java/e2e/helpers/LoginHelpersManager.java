package e2e.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginHelpersManager extends CommonHelpers{

    public LoginHelpersManager(WebDriver driver) {
        super(driver);
    }

    public void loginLikeManager(){
        Assert.assertTrue(isElementPresent(By.className("ng-scope")));
        driver.findElement(By.xpath("//button[@ng-click=\"manager()\"]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class=\"center\"]")));
    }
}
