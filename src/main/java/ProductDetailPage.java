import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductDetailPage extends BasePage{

    By addToCartLocator = By.id("addToCart");
    By specialBannerLocator = By.className("special-campaign-banner");
    By checkOutLocator = By.className("checkoutui-ProductOnBasketHeader-22Wrk");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(){
        waitFor(specialBannerLocator);
        navigateTab(1);
        click(addToCartLocator);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();
        navigateTab(0);
    }

}
