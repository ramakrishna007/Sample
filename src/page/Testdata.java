package page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Testdata {
    public FileInputStream fis;
    public Properties prop;


    public String url = get("url");
    public String searchtest = get("searchtest");
    public String searchfieldname = get("searchfieldname");
    public String searchbuttonname = get("searchbuttonname");

    public void loadProperties(){
        prop = new Properties();
        try {
            fis = new FileInputStream("Data/data.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("test data file is not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String get(String key){
        loadProperties();
        return prop.getProperty(key);
    }
}
