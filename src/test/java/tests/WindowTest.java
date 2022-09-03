package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.RegisterPage;
import pages.WindowPage;
import shareData.ShareData;

public class WindowTest extends ShareData {

    @Test
    public void windowMethod(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToWindowPage();

        WindowPage windowPage = new WindowPage(driver);
        windowPage.tabProcess();
        windowPage.windowProcess();
        windowPage.multipleTabProcess();
    }
}
