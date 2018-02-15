package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseSetup {
    public ChromeDriver driver;

    @BeforeSuite
    public void initiateDriver(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public WebDriver getdriver(){
        return driver;
    }
}
