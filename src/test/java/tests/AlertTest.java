package tests;

import objectData.AlertObject;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;
import shareData.Hooks;
import shareData.ShareData;

public class AlertTest extends Hooks {

    @Test
    public void alertMethod(){
        AlertObject alertObject = new AlertObject(testData);


        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToAlert();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.alertOkProcess();
        alertPage.alertCancelProcess();
        alertPage.alertTextProcess(alertObject);
    }
}
