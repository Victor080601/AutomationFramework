package pages;

import objectData.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    //@FindBy(id = "btn1")
    //private WebElement signinElement;

    @FindBy(css = "input[ng-model='Email']")
    private WebElement emailValue;

    @FindBy(css = "input[ng-model='Password']")
    private WebElement passwordValue;

    @FindBy(id = "enterbtn")
    private WebElement enterElement;

    @FindBy(id = "errormsg")
    private WebElement errormessageElement;

    public void logInProcess(LoginObject loginObject){
        //validam o anumita pagina
        pageMethods.validateTitlePage("SignIn");
        elementMethods.fillElement(emailValue,loginObject.getEmail());
        elementMethods.fillElement(passwordValue,loginObject.getPassword());
        elementMethods.clickElement(enterElement);

        //validam un mesaj
        elementMethods.validateElementText(errormessageElement, loginObject.getMessage());

    }
}
