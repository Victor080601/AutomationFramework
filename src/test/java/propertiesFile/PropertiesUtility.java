package propertiesFile;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesUtility {

    private Properties properties;
    private FileInputStream fileInputStream;

    public PropertiesUtility(String testName) {
       loadFile(testName);
    }
    public void loadFile(String testName){
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src/test/resources/TestData/"+ testName +".properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public HashMap<String,String> getAllKeyValue(){
        HashMap<String,String> keyValue = new HashMap<>();
        for(Object key: properties.keySet()){
            keyValue.put(key.toString(),properties.getProperty(key.toString()));
        }
        return keyValue;
    }
}
