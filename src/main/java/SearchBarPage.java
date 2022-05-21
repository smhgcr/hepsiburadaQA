import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBarPage extends BasePage{

    By searchBarLocator = By.className("desktopOldAutosuggestTheme-input");
    By searchButtonLocator = By.className("SearchBoxOld-buttonContainer");

    public SearchBarPage(WebDriver driver) {
        super(driver);
    }

    public void search(String productName){
        waitFor(searchBarLocator);
        type(searchBarLocator, productName);
        click(searchButtonLocator);
    }


}
