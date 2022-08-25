package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn1")
    private WebElement signinElement;

    @FindBy(css = "input[ng-model='Email']")
    private WebElement emailValue;

    @FindBy(css = "input[ng-model='Password']")
    private WebElement passwordValue;

    @FindBy(id = "enterbtn")
    private WebElement enterElement;

    @FindBy(id = "errormsg")
    private WebElement errormessageElement;

    public void logInProcess(String email, String password){
        pageMethods.validateTitlePage("SignIn");
        elementMethods.fillElement(emailValue,email);
        elementMethods.fillElement(passwordValue,password);
        elementMethods.clickElement(enterElement);

        //validam un mesaj
        elementMethods.validateElementText(errormessageElement, "Invalid User Name or PassWord");

    }
}
