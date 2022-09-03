package tests;

import org.testng.annotations.Test;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;
import shareData.ShareData;

public class AlertTest extends ShareData {

    @Test
    public void alertMethod(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToAlert();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.alertOkProcess();
        alertPage.alertCancelProcess();
        alertPage.alertTextProcess("Oprea Victor");
    }
}
