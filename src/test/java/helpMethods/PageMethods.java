package helpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;

public class PageMethods {

    public WebDriver driver;

    public PageMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void navigatetoURL(String url){
        driver.navigate().to(url);
    }

    public void validateTitlePage(String value){
        String actualPage = driver.getTitle();
        Assert.assertEquals(actualPage,value);
    }
    public void closeCurrentPage(){
        driver.close();
    }
}
