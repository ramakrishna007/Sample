package page;

import actions.BrowserActions;
import actions.Random;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class Modules extends BrowserActions implements Locators{

    public Testdata testdata;
    WebDriver driver;

    public Modules(WebDriver driver){
        super(driver);
        this.driver = driver;
        testdata = new Testdata();
    }

    public void navigate(String url){
        driver.get(url);
    }

    public void search(String text){
        safeType(Random.getlocator(searchfield,testdata.searchfieldname),text);
        safeClick(Random.getlocator(searchbutton,testdata.searchbuttonname));
    }
}
