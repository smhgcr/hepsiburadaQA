import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator, String text){
        find(locator).sendKeys(text);
    }

    public void waitFor(By locator){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void navigateTab(int tabNum){
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(tabNum));
    }

}
