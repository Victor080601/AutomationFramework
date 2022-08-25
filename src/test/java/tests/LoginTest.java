package tests;


import org.testng.annotations.Test;
import pages.IndexPage;
import pages.LogInPage;
import shareData.ShareData;

public class LoginTest extends ShareData {

    @Test
    public void loginMethod(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.signInElement();
        LogInPage login = new LogInPage(driver);
        login.logInProcess("opreavictor59@yahoo.com","automationtesting123");





        //identific un element


        //validam o anumita pagina

        //inchidem un browser
        //driver.quit();

    }
}
