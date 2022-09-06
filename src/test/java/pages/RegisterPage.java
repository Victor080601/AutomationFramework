package pages;
import objectData.RegisterObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends BasePage
{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement fieldNameElement;

    @FindBy (xpath = "//input[@placeholder='Last Name']")
    private WebElement fieldLastNameElement;

    @FindBy(css = "textarea[ng-model]")
    private WebElement fieldAddressElement;

    @FindBy(css = "input[ng-model='EmailAdress']")
    private WebElement fieldEmailElement;

    @FindBy(css = "input[ng-model='Phone']")
    private WebElement fieldPhoneElement;

    @FindBy(css = "input[value='FeMale']")
    private WebElement  fieldGenderElement;

    @FindBy(id = "checkbox2")
    private WebElement fieldHobbiedElement;

    @FindBy(id = "Skills")
    private WebElement fieldSkillsElement;

    @FindBy(id = "yearbox")
    private WebElement fieldDateElement;

    @FindBy(css = "select[ng-model='monthbox']")
    private WebElement fieldMonthElement;

    @FindBy(id = "daybox")
    private WebElement fieldDayElement;

    @FindBy(id = "msdd")
    private WebElement languageElement;

    @FindBy(css = ".ui-front>li>a")
    private List<WebElement> languageOptions;

    @FindBy(css = ".ui-icon")
    private WebElement fieldDelete;

    @FindBy(css = ".select2-selection")
    private WebElement fieldCountry;

    @FindBy(css = ".select2-search__field")
    private WebElement fieldCountryElement;

    @FindBy(id = "firstpassword")
    private WebElement passElement;

    @FindBy(id = "secondpassword")
    private WebElement confirmpassElement;

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement switchtoElement;

    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement  windowElement;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement frameElement;

    @FindBy(xpath = "//a[text()='Alerts']")
    private  WebElement alertsElement;

    public void registerProcess(RegisterObject registerObject)
    {
        elementMethods.fillElement(fieldNameElement,registerObject.getFirstName());
        elementMethods.fillElement(fieldLastNameElement,registerObject.getLastName());
        elementMethods.fillElement(fieldAddressElement,registerObject.getAddress());
        elementMethods.fillElement(fieldEmailElement,registerObject.getEmail());
        elementMethods.fillElement(fieldPhoneElement,registerObject.getPhone());
        elementMethods.clickElement(fieldGenderElement);
        elementMethods.clickElement(fieldHobbiedElement);
        elementMethods.selectDropDownText(fieldSkillsElement,registerObject.getSkill());
        elementMethods.selectDropDownValue(fieldDateElement, registerObject.getYear());
        elementMethods.selectDropDownText(fieldMonthElement,registerObject.getMonth());
        elementMethods.selectDropDownValue(fieldDayElement,registerObject.getDay());
        elementMethods.fillElement(passElement,registerObject.getPassword());
        elementMethods.fillElement(confirmpassElement,registerObject.getConfirmPassword());
        selectLanguage(registerObject.getLanguage());
        //elementMethod.clickElement(fieldDelete);
        elementMethods.clickElement(fieldCountry);
        enterCountryElement(registerObject.getCountry());
    }

    public void selectLanguage(String language)
    {
        elementMethods.clickElement(languageElement);

        //interactionam cu o multime de elemente
        for(int i=0;i<languageOptions.size();i++)
        {
            if(languageOptions.get(i).getText().equals(language))
            {
                elementMethods.clickElement(languageOptions.get(i));
            }
        }

        elementMethods.clickElement(fieldGenderElement);
    }

    public void enterCountryElement(String country)
    {
        elementMethods.fillElement(fieldCountryElement,country);
        fieldCountryElement.sendKeys(Keys.ENTER);
    }

    public void goToWindowPage(){
        elementMethods.hoverElement(switchtoElement);
        elementMethods.clickElement(windowElement);
        pageMethods.navigatetoURL("https://demo.automationtesting.in/Windows.html");

    }

    public void goToFrame(){
        elementMethods.hoverElement(switchtoElement);
        elementMethods.clickElement(frameElement);
        pageMethods.navigatetoURL("https://demo.automationtesting.in/Frames.html");
    }

    public void goToAlert(){
        elementMethods.hoverElement(switchtoElement);
        elementMethods.clickElement(frameElement);
        pageMethods.navigatetoURL("https://demo.automationtesting.in/Alerts.html");

    }

}