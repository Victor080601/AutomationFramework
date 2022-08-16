package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
    public WebDriver driver;

    @Test
    public void registerMethod() {
        //setez driverul de chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //deschid un browser de chrome
        driver = new ChromeDriver();
        //accesez un anumit URL
        driver.get("https://demo.automationtesting.in/Index.html");

        //facem browser-ul maximaze
        driver.manage().window().maximize();

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

    }
}
