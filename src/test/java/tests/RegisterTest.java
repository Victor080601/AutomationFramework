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
        WebElement signinElement = driver.findElement(By.id("btn1"));
        signinElement.click();
    }
}
