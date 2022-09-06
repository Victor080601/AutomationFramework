package shareData;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import propertiesFile.PropertiesUtility;

import java.util.HashMap;

public class Hooks extends ShareData{
    public HashMap<String,String> testData;
    @BeforeMethod
    public void prepareEnvironment(){
        prepareDriver();
        String className = this.getClass().getSimpleName();
        PropertiesUtility propertiesFile = new PropertiesUtility(className);
        testData = propertiesFile.getAllKeyValue();
    }
    @AfterMethod
    public void clearEnvironment(){
        quitDriver();
    }

}
