package e2e;

import com.google.common.io.Files;
import e2e.helpers.ClientHelpers;
import e2e.helpers.LoginHelpersClient;
import e2e.helpers.LoginHelpersManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    LoginHelpersClient loginClient;
    LoginHelpersManager loginManager;
    ClientHelpers clientHelpers;
    public LoginHelpersClient getLoginClient(){return loginClient;}
    public LoginHelpersManager getLoginManager(){return loginManager;}
    public ClientHelpers getClientHelpers(){return clientHelpers;}
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginClient = new LoginHelpersClient(driver);
        loginManager = new LoginHelpersManager(driver);
        clientHelpers = new ClientHelpers(driver);
    }

    public void stop(){driver.quit();}

    public String takeScreenshot() throws IOException {
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshot = new File("reference/screen" + System.currentTimeMillis() + ".png");

        Files.copy(tmp, screenshot);
        return screenshot.getAbsolutePath();
    }
}
