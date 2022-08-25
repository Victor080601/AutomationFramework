package tests;

import pages.IndexPage;
import pages.RegisterPage;
import shareData.ShareData;
import org.testng.annotations.Test;

public class RegisterTest extends ShareData {

    @Test
    public void registerMethod() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerProcess("Oprea","Victor","Str Teilor Nr 34","cod@email.com", "0756784512", "Java",
                "2001","January","8","parola","parola","Australia","English");

    }
}