import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductsPage extends BasePage {

    By productNameLocator = By.className("moria-ProductCard-exfLof");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getAllProducts() {
        return findAll(productNameLocator);
    }

    public void selectProduct(int i){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getAllProducts().get(i).click();

    }
}
