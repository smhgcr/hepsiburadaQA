import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {

    By accountButtonLocator = By.id("myAccount");
    By loginButtonLocator = By.id("login");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void accountClick() {
        Actions action = new Actions(driver);
        WebElement accountHoverAction = find(accountButtonLocator);
        action.moveToElement(accountHoverAction).perform();
        waitFor(loginButtonLocator);
        click(loginButtonLocator);
    }

   /* public void search(String text) {
        type(searchBoxLocator, text);
        find(searchBoxLocator).sendKeys(Keys.ENTER);
    }
    */
}
