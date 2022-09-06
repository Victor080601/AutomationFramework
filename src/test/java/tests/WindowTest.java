package tests;

import org.testng.annotations.Test;
import pages.IndexPage;
import pages.RegisterPage;
import pages.WindowPage;
import shareData.Hooks;
import shareData.ShareData;

public class WindowTest extends Hooks {

    @Test
    public void windowMethod(){
        IndexPage indexPage = new IndexPage(this.driver);
        indexPage.clickSkipSignIn();
        RegisterPage registerPage = new RegisterPage(this.driver);
        registerPage.goToWindowPage();
        WindowPage windowPage = new WindowPage(this.driver);
        windowPage.tabProcess();
       // windowPage.windowProcess();
       // windowPage.multipleTabProcess();
    }
}
