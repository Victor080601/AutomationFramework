package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import shareData.ShareData;

import java.util.List;

public class AlertTest extends ShareData {

    @Test
    public void alertMethod(){

        WebElement skipsigninElement = driver.findElement(By.id("btn2"));
        skipsigninElement.click();

        WebElement switchtoElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(driver);
        action.moveToElement(switchtoElement).perform();

        WebElement alertsElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();

        //navigam catre o anumita pagina
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");


        List<WebElement> alertOptions = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        alertOptions.get(0).click();

        WebElement alertOkButton = driver.findElement(By.cssSelector("#OKTab>button"));
        alertOkButton.click();
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();

        alertOptions.get(1).click();

        WebElement alertOkCancelButton = driver.findElement(By.cssSelector(".btn-primary"));
        alertOkCancelButton.click();
        Alert alertCancelOk = driver.switchTo().alert();
        alertCancelOk.dismiss();

        alertOptions.get(2).click();

        WebElement alertTextBox = driver.findElement(By.cssSelector(".btn-info"));
        alertTextBox.click();
        Alert alertText = driver.switchTo().alert();
        alertText.sendKeys("Oprea Victor");
        alertText.accept();


    }
}
