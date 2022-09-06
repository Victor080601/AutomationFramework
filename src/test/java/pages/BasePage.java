package pages;

import helpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;

    public AlertMethods alertMethods;
    public ElementMethods elementMethods;
    public FrameMethods frameMethods;
    public PageMethods pageMethods;
    public WindowMethods windowMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        alertMethods = new AlertMethods(driver);
        elementMethods = new ElementMethods(driver);
        frameMethods = new FrameMethods(driver);
        pageMethods = new PageMethods(driver);
        windowMethods = new WindowMethods(driver);
    }

}
