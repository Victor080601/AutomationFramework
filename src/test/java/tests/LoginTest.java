package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import shareData.ShareData;

public class LoginTest extends ShareData {

    @Test
    public void loginMethod(){

        //identific un element
        WebElement signinElement = driver.findElement(By.id("btn1"));
        signinElement.click();

        //validam o anumita pagina
        String actualPage = driver.getTitle();
        String expectedPage = "SignIn";
        Assert.assertEquals(actualPage,expectedPage);

        WebElement emailElement = driver.findElement(By.cssSelector("input[ng-model='Email']"));
        String emailValue = "codEmail@yahoo.com";
        emailElement.sendKeys(emailValue);

        WebElement passwordElement = driver.findElement(By.cssSelector("input[ng-model='Password']"));
        String passwordValue = "Parola123";
        passwordElement.sendKeys(passwordValue);

        WebElement enterElement = driver.findElement(By.id("enterbtn"));
        enterElement.click();

        //validam un mesaj
        WebElement errormessageElement = driver.findElement(By.id("errormsg"));
        String actualError = errormessageElement.getText();
        String expectedError = "Invalid User Name or PassWord";
        Assert.assertEquals(actualError,expectedError);

        //inchidem un browser
        //driver.quit();

    }
}
