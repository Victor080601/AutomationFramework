package tests;

import objectData.RegisterObject;
import pages.IndexPage;
import pages.RegisterPage;
import shareData.Hooks;
import shareData.ShareData;
import org.testng.annotations.Test;

public class RegisterTest extends Hooks {

    @Test
    public void registerMethod() {

        RegisterObject registerObject = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerProcess(registerObject);

    }
}