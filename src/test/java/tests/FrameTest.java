package tests;

import objectData.FrameObject;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.IndexPage;
import pages.RegisterPage;
import shareData.Hooks;

public class FrameTest extends Hooks {

    @Test
    public void frameMethod(){
        FrameObject frameObject = new FrameObject(testData);
        frameObject.prepareData(testData);


        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToFrame();

        FramePage framePage = new FramePage(driver);
        framePage.singleFrame(frameObject);
        framePage.multipleFrame(frameObject);
    }
}
