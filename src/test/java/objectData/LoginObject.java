package objectData;

import java.util.HashMap;

public class LoginObject {

    private String email;
    private String password;
    private String message;

    public LoginObject(HashMap<String,String> testData){
        prepareData(testData);
    }

    public void prepareData(HashMap<String,String> testData){
        for(String key: testData.keySet()){
            switch (key){
                case "email":
                    setEmail(testData.get(key));
                    break;
                case "password":
                    setPassword(testData.get(key));
                    break;
                case "message":
                    setMessage(testData.get(key));
                    break;
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
