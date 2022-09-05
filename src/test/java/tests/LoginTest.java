package tests;


import objectData.LoginObject;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LogInPage;
import shareData.Hooks;

public class LoginTest extends Hooks {

    @Test
    public void loginMethod(){

        LoginObject loginTest = new LoginObject(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.signInElement();

        LogInPage login = new LogInPage(driver);
        login.logInProcess(loginTest);





        //identific un element

        //inchidem un browser
        //driver.quit();

    }
}
