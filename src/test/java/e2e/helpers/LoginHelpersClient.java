package e2e.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginHelpersClient extends CommonHelpers{
    public LoginHelpersClient(WebDriver driver) {super(driver);}

    public void loginLikeClient(){
        Assert.assertTrue(isElementPresent(By.className("ng-scope")));
        driver.findElement(By.xpath("//button[@ng-click=\"customer()\"]")).click();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class=\"ng-scope\"]//form")));
        driver.findElement(By.xpath("//div[@class=\"ng-scope\"]//form//select")).click();
        driver.findElement(By.xpath("//form//select//option[@value=\"1\"]")).click();
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
       Assert.assertTrue(isElementPresent(By.xpath("//div//span")));
    }

}
