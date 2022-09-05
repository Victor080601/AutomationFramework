package pages;

import objectData.FrameObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-tabs>li>a")
    private List<WebElement> frameOptions;

    @FindBy(css = "input[type='text']")
    private WebElement checkboxElement;

    public void singleFrame(FrameObject frameObject){
        elementMethods.clickElement(frameOptions.get(0));
        frameMethods.switchIFrame("singleframe");

        elementMethods.fillElement(checkboxElement,frameObject.getSingleFrameValue());
        //iese din pagina
        frameMethods.switchDefault();

    }

    public void multipleFrame(FrameObject frameObject){
        elementMethods.clickElement(frameOptions.get(1));
        frameMethods.switchIFrame(By.cssSelector("iframe[src='MultipleFrames.html']"));
        frameMethods.switchIFrame(By.cssSelector("iframe[src='SingleFrame.html']"));
        elementMethods.fillElement(checkboxElement,frameObject.getMultipleFrameValue());

    }
}
