package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage{


    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    List<WebElement> windowsOptions;

    @FindBy(css = "#Tabbed>a>button")
    private WebElement clickTab;

    @FindBy(css = "#Seperate>button")
    private WebElement clickWindow;

    @FindBy(css = "#Multiple>button")
    private WebElement multipleWindow;

    public void windowProcess(){

        elementMethods.clickElement(windowsOptions.get(1));
        elementMethods.clickElement(clickWindow);

        windowMethods.switchToSpecificTab(1);
        //inchidem tabul curent
        pageMethods.closeCurrentPage();
        windowMethods.switchToSpecificTab(0);

    }

    public void tabProcess(){
        elementMethods.clickElement(windowsOptions.get(0));

        elementMethods.clickElement(clickTab);

        //cate taburi gaseste deschise
        windowMethods.switchToSpecificTab(1);
        //inchidem tabul curent
        pageMethods.closeCurrentPage();
        windowMethods.switchToSpecificTab(0);
    }

    public void multipleTabProcess(){
        elementMethods.clickElement(windowsOptions.get(2));

        elementMethods.clickElement(multipleWindow);

        windowMethods.switchToSpecificTab(2);
        //inchidem tabul curent
        pageMethods.closeCurrentPage();
        windowMethods.switchToSpecificTab(1);
        pageMethods.closeCurrentPage();
        windowMethods.switchToSpecificTab(0);
    }
}
