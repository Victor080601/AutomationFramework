package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.Test;
import shareData.ShareData;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends ShareData {

    @Test
    public void windowMethod(){

        WebElement skipsigninElement = driver.findElement(By.id("btn2"));
        skipsigninElement.click();

        WebElement switchtoElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(driver);
        action.moveToElement(switchtoElement).perform();

        WebElement windowElement = driver.findElement(By.xpath("//a[text()='Windows']"));
        windowElement.click();

        //navigam catre o anumita pagina
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsOptions = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        windowsOptions.get(0).click();

        //#id

        WebElement clickTab = driver.findElement(By.cssSelector("#Tabbed>a>button"));
        clickTab.click();

        //cate taburi gaseste deschise
        System.out.println(driver.getTitle());
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getTitle());
        //inchidem tabul curent
        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getTitle());

        windowsOptions.get(1).click();
        WebElement clickWindow = driver.findElement(By.cssSelector("#Seperate>button"));
        clickWindow.click();
        System.out.println(driver.getTitle());
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        System.out.println(driver.getTitle());
        //inchidem tabul curent
        driver.close();
        driver.switchTo().window(windows.get(0));
        System.out.println(driver.getTitle());

        windowsOptions.get(2).click();
        WebElement multipleWindow = driver.findElement(By.cssSelector("#Multiple>button"));
        multipleWindow.click();
        System.out.println(driver.getTitle());
        ArrayList<String> multipleWindows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(multipleWindows.get(2));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(multipleWindows.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(multipleWindows.get(0));







    }
}
