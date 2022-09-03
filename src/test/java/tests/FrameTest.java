package tests;

import helpMethods.ElementMethods;
import helpMethods.FrameMethods;
import helpMethods.PageMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.IndexPage;
import pages.RegisterPage;
import shareData.ShareData;

import java.util.List;

public class FrameTest extends ShareData {

    @Test
    public void frameMethod(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToFrame();

        FramePage framePage = new FramePage(driver);
        framePage.singleFrame("value");
        framePage.multipleFrame("val");
    }
}
