package actions;

import org.openqa.selenium.By;

public class Random {
    public static By getlocator(By locator, String... args){

        By fLocator = null;
        String sLocator = locator.toString();
        String locatorType = sLocator.split(":")[0].split("\\.")[1];
        String locatorPath = sLocator.split(":")[1];
        String newlocator = String.format(locatorPath, args).trim();
        switch (locatorType){
            case "xpath" : fLocator = By.xpath(newlocator); break;
            case "cssSelector" : fLocator = By.cssSelector(newlocator); break;
            case "name" : fLocator = By.name(newlocator); break;
        }
        return fLocator;
    }
}
