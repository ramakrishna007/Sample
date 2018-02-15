package testsuite;

import base.BaseSetup;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Modules;
import page.Testdata;

public class testcase extends BaseSetup{

    public Modules module;
    public Testdata testdata;

    @BeforeMethod
    public void initiateApp(){
        module = new Modules(getdriver());
        testdata = new Testdata();
    }

    @Test
    public void test(){
        module.navigate(testdata.url);
        module.search(testdata.searchtest+ Keys.ESCAPE);
    }

    @AfterMethod
    public void close(){
        getdriver().close();
    }

}
