package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import shareData.ShareData;

import java.util.List;

public class FrameTest extends ShareData {

    @Test
    public void frameMethod(){

        WebElement skipsigninElement = driver.findElement(By.id("btn2"));
        skipsigninElement.click();

        WebElement switchtoElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(driver);
        action.moveToElement(switchtoElement).perform();

        WebElement frameElement = driver.findElement(By.xpath("//a[text()='Frames']"));
        frameElement.click();

        //navigam catre o anumita pagina
        driver.navigate().to("https://demo.automationtesting.in/Frames.html");


        List<WebElement> frameOptions = driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        frameOptions.get(0).click();
        driver.switchTo().frame("singleframe");

        WebElement checkboxElement = driver.findElement(By.cssSelector("input[type='text']"));
        String checkboxValue = "Oprea Victor";
        checkboxElement.sendKeys(checkboxValue);
        //iese din pagina
        driver.switchTo().defaultContent();


        frameOptions.get(1).click();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        WebElement checkbox1Element = driver.findElement(By.cssSelector("input[type='text']"));
        String checkbox1Value = "Oprea";
        checkbox1Element.sendKeys(checkbox1Value);






    }
}
