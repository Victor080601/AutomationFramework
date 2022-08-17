package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import shareData.ShareData;

import java.util.ArrayList;
import java.util.List;

public class RegisterTest extends ShareData {

    @Test
    public void registerMethod() {

        //identific un element
        WebElement skipsigninElement = driver.findElement(By.id("btn2"));
        skipsigninElement.click();

        WebElement fieldNameElement = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        String nameValue = "Oprea";
        fieldNameElement.sendKeys(nameValue);

        WebElement fieldLastNameElement = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        String lastnameValue = "Victor";
        fieldLastNameElement.sendKeys(lastnameValue);

        WebElement fieldAddressElement = driver.findElement(By.cssSelector("textarea[ng-model]"));
        String addressValue = "Strada Mea Nr 432";
        fieldAddressElement.sendKeys(addressValue);

        WebElement fieldEmailElement = driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        String emailValue = "cod@yahoo.com";
        fieldEmailElement.sendKeys(emailValue);

        WebElement fieldPhoneElement = driver.findElement(By.cssSelector("input[ng-model='Phone']"));
        String phoneValue = "0723456789";
        fieldPhoneElement.sendKeys(phoneValue);

        WebElement fieldGenderElement = driver.findElement(By.cssSelector("input[value='Male']"));
        fieldGenderElement.click();

        WebElement fieldHobbiedElement = driver.findElement(By.id("checkbox1"));
        fieldHobbiedElement.click();

        //dropdown(select)
        WebElement fieldSkillsElement = driver.findElement(By.id("Skills"));
        Select skillsSelect = new Select(fieldSkillsElement);
        skillsSelect.selectByVisibleText("Java");

        //Date of birth
        WebElement fieldDateElement = driver.findElement(By.id("yearbox"));
        Select dateSelect = new Select(fieldDateElement);
        dateSelect.selectByValue("2001");

        WebElement fieldMonthElement = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
        Select monthSelect = new Select(fieldMonthElement);
        monthSelect.selectByVisibleText("January");

        WebElement fieldDayElement = driver.findElement(By.id("daybox"));
        Select daySelect = new Select(fieldDayElement);
        daySelect.selectByValue("8");

        WebElement languageElement = driver.findElement(By.id("msdd"));
        languageElement.click();

        //interactionam cu o multime de elemente
        List<WebElement> languageOptions = driver.findElements(By.cssSelector(".ui-front>li>a"));
        for(int i=0;i<languageOptions.size();i++)
        {
            if(languageOptions.get(i).getText().equals("English"))
            {
                languageOptions.get(i).click();
            }
        }

        WebElement fieldDelete = driver.findElement(By.cssSelector(".ui-icon"));
        fieldDelete.click();

        fieldGenderElement.click();


        WebElement fieldCountry = driver.findElement(By.cssSelector(".select2-selection"));
        fieldCountry.click();

        WebElement fieldCountryElement = driver.findElement(By.cssSelector(".select2-search__field"));
        String countryValue = "Australia";
        fieldCountryElement.sendKeys(countryValue);
        fieldCountryElement.sendKeys(Keys.ENTER);

        WebElement passElement = driver.findElement(By.id("firstpassword"));
        String passValue = "123";
        passElement.sendKeys(passValue);

        WebElement confirmpassElement = driver.findElement(By.id("secondpassword"));
        String confirmpassValue = "123";
        confirmpassElement.sendKeys(confirmpassValue);

    }
}
