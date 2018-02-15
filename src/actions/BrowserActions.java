package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class BrowserActions {

    public Logger log;
    WebDriver driver;

    public BrowserActions(WebDriver driver){
        this.driver = driver;
        log = Logger.getLogger("BrowserActions");
    }


    public void safeClick(By locator){
        driver.findElement(locator).click();
        log.info("clicked on "+locator.toString());
    }

    public void safeType(By locator, String text){
        driver.findElement(locator).sendKeys(text);
        log.info("entered text "+text+" into "+locator);
    }
}
