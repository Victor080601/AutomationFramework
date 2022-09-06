package pages;

import objectData.AlertObject;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> alertOptions;

    @FindBy(css = "#OKTab>button")
    private  WebElement alertOkButton;

    @FindBy(css = ".btn-primary")
    private  WebElement alertOkCancelButton;

    @FindBy(css = ".btn-info")
    private WebElement alertTextBox;

    public void alertOkProcess(){
        elementMethods.clickElement( alertOptions.get(0));
        elementMethods.clickElement(alertOkButton);
        alertMethods.alertOkProcess();
    }

    public void alertCancelProcess(){
        elementMethods.clickElement(alertOptions.get(1));
        elementMethods.clickElement(alertOkCancelButton);
        alertMethods.alertCancelProcess();
    }

    public void alertTextProcess(AlertObject alertObject){
        elementMethods.clickElement(alertOptions.get(2));
        elementMethods.clickElement(alertTextBox);
        alertMethods.alertTextBoxProcess(alertObject.getMessage());
    }
}
